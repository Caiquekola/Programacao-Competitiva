import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class servidorCalculadora {
    public static void main(String[] args) throws IOException, UnknownHostException {

        ServerSocket servidor = new ServerSocket(10200);
        System.out.println("Porta 10200 aberta!");
        System.out.print("Aguardando conexão do cliente...");
        int qntClientes = 0;
        while (true) {
            Socket cliente = servidor.accept();
            System.out.println(
                    "Nova conexao com o cliente " + ++qntClientes + " " + cliente.getInetAddress().getHostAddress());
            Calcular calcular = new Calcular(cliente);
            new Thread(calcular).start();
        }
        //servidor.close(); Servidor não para

    }
}

class Calcular implements Runnable {

    private Socket clienteSocket;

    public Calcular(Socket socket) {
        this.clienteSocket = socket;
    }

    @Override
    public void run(){
        try (
                ObjectOutputStream resultado = new ObjectOutputStream(clienteSocket.getOutputStream());
                ObjectInputStream dados = new ObjectInputStream(clienteSocket.getInputStream())) {
            int operacao = -1;

            while (true) {
                double num1, num2, total = 0.0;
                char opr = '\n';

                operacao = dados.readInt();

                if (operacao == 3) {
                    System.out.println("Cliente " + clienteSocket.getInetAddress().getHostAddress() + " desconectou.");
                    break;
                }

                num1 = dados.readDouble();
                num2 = dados.readDouble();

                if (operacao == 1) {
                    opr = '+';
                    total = (num1 + num2);
                } else if (operacao == 2) {
                    opr = '-';
                    total = (num1 - num2);
                }

                resultado.writeDouble(total);
                resultado.writeChar(opr);
                resultado.flush();
            }

            resultado.close();
            dados.close();
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                clienteSocket.close();
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
            }
                
        }
    }
}