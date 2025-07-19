import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

public class clienteCalculadora {
    public static void main(String[] args) throws IOException {
        double num1;
        double num2;
        int operacao = 0;
        char opr;
        
        Socket cliente = new Socket("127.0.0.1", 10200);
        System.out.println("O cliente conectou ao servidor");

        ObjectOutputStream dados = new ObjectOutputStream(cliente.getOutputStream());
        ObjectInputStream resultado = new ObjectInputStream(cliente.getInputStream());

        do {
            operacao = 0;
            while (operacao < 1 || operacao > 3) {
                operacao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Qual operação desejada?\n 1. Adição ( + )\n 2. Subtração ( - )\n 3. SAIR ( X )"));
                if (operacao < 1 || operacao > 3) {
                    JOptionPane.showMessageDialog(null, "Você digitou uma operação inválida.");
                }
            }

            dados.writeInt(operacao);
            dados.flush();

            if (operacao != 3) {
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));

                dados.writeDouble(num1);
                dados.writeDouble(num2);
                dados.flush();

                double total = resultado.readDouble();
                opr = resultado.readChar();
                String resposta = "Total de " + num1 + " " + opr + " " + num2 + " = " + total;

                JOptionPane.showMessageDialog(null, resposta, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Encerrando cliente.");
                break;
            }

        } while (true);

        resultado.close();
        dados.close();
        cliente.close();
    }
}
