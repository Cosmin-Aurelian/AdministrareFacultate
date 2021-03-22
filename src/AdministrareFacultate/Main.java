package AdministrareFacultate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Profesor mihai = new Profesor(1,"Mihai",1300);
        Profesor andrei = new Profesor(2,"Andrei",1500);
        Profesor maria = new Profesor(3,"Maria",1400);
        Profesor robert = new Profesor(4,"Robert",800);


        List<Profesor> listaProfesor = new ArrayList<>();
        listaProfesor.add(mihai);
        listaProfesor.add(andrei);
        listaProfesor.add(maria);
        listaProfesor.add(robert);



        Student alex = new Student(1,"Alex",13);
        Student mircea = new Student(2,"Mircea",13);
        Student bianca = new Student(3,"Bianca",14);
        Student ana = new Student(4,"Ana",13);
        Student camelia = new Student(5,"Camelia",15);
        Student ionut = new Student(6,"Ionut",13);

        List<Student> listaStudent = new ArrayList<>();
        listaStudent.add(alex);
        listaStudent.add(bianca);
        listaStudent.add(mircea);
        listaStudent.add(ana);
        listaStudent.add(camelia);
        listaStudent.add(ionut);

        Facultate administrare = new Facultate(listaProfesor,listaStudent);


        System.out.println("\n#1 Ziua de plata a taxelor de catre studenti $"+mircea.arataTaxeTotale()+" de persoana\n");
        alex.platesteTaxele(5000);
        mircea.platesteTaxele(6000);
        bianca.platesteTaxele(3000);
        ana.platesteTaxele(2000);
        camelia.platesteTaxele(8000);
        ionut.platesteTaxele(8000);

        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Alex a platit pana in prezent $"+alex.arataTaxePlatite()+" si mai are de achitat $"+alex.arataTaxeRamase());
        System.out.println("Mircea a platit pana in prezent $"+mircea.arataTaxePlatite()+" si mai are de achitat $"+mircea.arataTaxeRamase());
        System.out.println("Bianca a platit pana in prezent $"+bianca.arataTaxePlatite()+" si mai are de achitat $"+bianca.arataTaxeRamase());
        System.out.println("Camelia a platit pana in prezent $"+camelia.arataTaxePlatite()+" si mai are de achitat $"+camelia.arataTaxeRamase());
        System.out.println("Ionut a platit pana in prezent $"+ionut.arataTaxePlatite()+" si mai are de achitat $"+ionut.arataTaxeRamase());
        System.out.println("Ana a platit pana in prezent $"+ana.arataTaxePlatite()+" si mai are de achitat $"+ana.arataTaxeRamase());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");

        System.out.println("#2 Administratia facultatii a incasat $"+ administrare.arataTotiBaniiPrimitiDeAdministratie()+" in urma achitarii taxelor de catre studenti");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");

        System.out.print("#3 Anul anterior studentul cu ID-ul: "+mircea.arataId()+" Numele: "+mircea.arataNume()+" a fost transferat de la clasa: "+mircea.arataClasa());
        mircea.setazaClasa(14);
        System.out.println(" la clasa "+mircea.arataClasa()+" datorita rezultatelor excelenta la invatatura");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("#4 Arata salariile profesorilor: ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");

        System.out.println("ID:"+mihai.arataId()+" Nume: "+mihai.arataNume()+ " are salariul de $"+ mihai.arataSalariu());
            Facultate.scadeLaBaniiPrimitiDeAdministratie(mihai.arataSalariu());
        System.out.println("ID:"+andrei.arataId()+" Nume: "+andrei.arataNume()+ " are salariul de $"+ andrei.arataSalariu());
            Facultate.scadeLaBaniiPrimitiDeAdministratie(andrei.arataSalariu());
        System.out.println("ID:"+maria.arataId()+" Nume: "+maria.arataNume()+ " are salariul de $"+ maria.arataSalariu());
            Facultate.scadeLaBaniiPrimitiDeAdministratie(maria.arataSalariu());
        System.out.println("ID:"+robert.arataId()+" Nume: "+robert.arataNume()+ " are salariul de $"+ robert.arataSalariu());
            Facultate.scadeLaBaniiPrimitiDeAdministratie(robert.arataSalariu());

        System.out.println("-------------------------------------------------------------------------------------------------------------------------");

        System.out.print("#5 "+mihai.arataNume()+" are o vechime de peste 5 ani si primeste o marire de salariu, acesta de la $"+mihai.arataSalariu()+" ajungand la");
        mihai.marireDeSalariu(1800);
        System.out.println(" $"+mihai.arataSalariu());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");


        System.out.println("#6 Administratia a cheltuit pe salariile profesorilor suma de $"+administrare.arataTotiBaniiCheltuitiDeAdministratie());
        System.out.println("#7 La final Administratia a ramas cu suma de $"+administrare.arataTotiBaniiPrimitiDeAdministratie());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");







    }
}
