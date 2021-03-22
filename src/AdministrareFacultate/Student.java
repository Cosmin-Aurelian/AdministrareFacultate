package AdministrareFacultate;


public class Student {

    private int id;
    private String nume;
    private int clasa;
    private int taxePlatite;
    private int taxeTotale;


    public Student(int id, String nume,int clasa){
        this.taxePlatite=0;
        this.taxeTotale=30000;
        this.id=id;
        this.nume=nume;
        this.clasa=clasa;

    }

    public void setazaClasa(int clasa){
        this.clasa=clasa;
    }


    public void platesteTaxele(int taxe){
        taxePlatite+=taxe;
        Facultate.adaugaLaBaniiPrimitiDeAdministratie(taxePlatite);
    }


    public int arataId() {
        return id;
    }

    public String arataNume() {
        return nume;
    }


    public int arataClasa() {
        return clasa;
    }

    public int arataTaxePlatite() {
        return taxePlatite;
    }


    public int arataTaxeTotale() {
        return taxeTotale;
    }


    public int arataTaxeRamase(){
        return taxeTotale-taxePlatite;
    }

    @Override
    public String toString() {
        return "Numele studentului: "+nume+
                " Suma totala platita pana acum $"+ taxePlatite;
    }
}
