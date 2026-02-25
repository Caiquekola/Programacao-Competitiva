import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarObjeto {
    public static void main(String[] args) {
        List<Pais> paises = new ArrayList<>();
        paises.add(new Pais("Brasil", 10, 30));
        paises.add(new Pais("Italia", 5, 5));
        paises.add(new Pais("China", 10, 20));
        paises.add(new Pais("Austria", 3, 3));
        
        Comparator<Pais> comp = Comparator
            .comparing(Pais::getHabitantes)
            // .thenComparing(Pais::getHabitantes)
            .thenComparing(Pais::getArea);
        paises.sort(comp);

        for (Pais pais : paises) {
            System.out.println(pais);
        }
    }

}

class Pais {
    String nome;
    int habitantes;
    int area;

    public Pais(String nome, int habitantes, int area) {
        this.nome = nome;
        this.habitantes = habitantes;
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "{'nome':"+this.nome+",'habitantes:'"+this.habitantes+",'area':"+this.area+"}";
    }
}