import java.util.ArrayList;
import java.util.List;

public class Main {
    //    Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
//    In questa classe avere i metodi pubblici per ottenere le informazioni.
//    Creare un ArrayList con n elementi e stamparlo in console.
//    Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
    public static void main(String[] args) {

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Aldo", 15));
        studentsList.add(new Student("Giovanni", 16));
        studentsList.add(new Student("Giacomo", 15));
        System.out.println(studentsList);
        studentsList.add(new Student("Mario", 15));
        studentsList.add(new Student("Paolo", 15));
        studentsList.add(new Student("Piero", 15));
        studentsList.add(new Student("Gilberto", 15));
        System.out.println(studentsList);


    }
}