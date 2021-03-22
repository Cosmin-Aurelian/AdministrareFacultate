package AdministrareFacultate;

public class Profesor {

    private int id;
    private String nume;
    private int salariu;
    private int salariuPrimit;


    public Profesor(int id, String nume, int salariu){
        this.id=id;
        this.nume=nume;
        this.salariu=salariu;
        this.salariuPrimit=0;
    }


    public int arataId(){
        return id;
    }


    public String arataNume(){
        return nume;
    }


    public int arataSalariu(){
        return  salariu;
    }

    public void marireDeSalariu(int salariu){
        this.salariu=salariu;
    }


    public void salariuPrimit(int salariu){
        salariuPrimit+=salariu;
        Facultate.scadeLaBaniiPrimitiDeAdministratie(salariu);

    }

    @Override
    public String toString() {
        return "Numele profesorului " + nume
                +"Total salariu primit pana acum $"
                + salariuPrimit;
    }
}
