package AdministrareFacultate;
import java.util.List;

public class Facultate {

    private List<Profesor> profesori;
    private List<Student> studenti;
    private static int  baniPrimitiDeAdministratie;
    private static int baniCheltuitiDeAdministratie;


    public Facultate(List<Profesor> profesori, List<Student> studenti) {
        this.profesori = profesori;
        this.studenti = studenti;
        baniPrimitiDeAdministratie=0;
        baniCheltuitiDeAdministratie=0;
    }



    public int arataTotiBaniiPrimitiDeAdministratie() {
        return baniPrimitiDeAdministratie;
    }


    public static void adaugaLaBaniiPrimitiDeAdministratie(int baniPrimiti) {
        baniPrimitiDeAdministratie += baniPrimiti;
    }

    public int arataTotiBaniiCheltuitiDeAdministratie() {
        return baniCheltuitiDeAdministratie;
    }


    public static void scadeLaBaniiPrimitiDeAdministratie(int baniCheltuiti) {
        baniPrimitiDeAdministratie-=baniCheltuiti;
        baniCheltuitiDeAdministratie+=baniCheltuiti;
    }
}
