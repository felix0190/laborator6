import java.util.List;

class Exporter {

    ExportConfig config;

    public Exporter(ExportConfig config){
        this.config = config;
    }

    void Export(List<Person> Lista){

        System.out.println(config.path);
        System.out.println(config.header);
        for (Person P : Lista){
            System.out.println(P.firstName + " " + P.lastName);
        }
    }
}
