import java.util.ArrayList;
import java.util.List;

public class main {

    static void main(String []args) {


        ExportConfig config = new ExportConfig();
        List<Person> Lista = new ArrayList<>();
        Lista.add(new Person("Mihai", "Andrei"));
        Lista.add(new Person("Dumitrescu", "Florin"));
        Exporter E1 = new Exporter(new ExportConfig("fisier1.txt", "header1"));
        Lista.add(new Person("Costin", "Pandele"));
        Exporter E2 = new Exporter(new ExportConfig("fisier2.txt", "header2"));
        E1.Export(Lista);
        E2.Export(Lista);


    }
}
