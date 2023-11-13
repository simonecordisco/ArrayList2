//Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con 12 elementi e stamparlo in console.
//mettere in ordine la collezione e stampare il risultato

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("marco",16);
        Student student2 = new Student("francesca",15);
        Student student3 = new Student("paolo",16);
        Student student4 = new Student("vittorio",17);
        Student student5 = new Student("silvia",16);
        Student student6 = new Student("marta",16);
        Student student7 = new Student("stefano",16);
        Student student8 = new Student("francesco",15);
        Student student9 = new Student("mario",16);
        Student student10 = new Student("giulio",17);
        Student student11= new Student("elena",16);
        Student student12 = new Student("martina",16);
        List<Student> lista1 =  Arrays.asList(student1,student2,student3,student4,student5,student6,student7,
                student8,student9,student10,student11,student12);
        System.out.println(lista1);

            lista1.sort(Comparator.comparing(Student::getName));
        System.out.println(lista1);


    }
}