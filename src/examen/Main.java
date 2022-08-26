package examen;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> alumnos =new ArrayList<>();

        alumnos.add("Elizabeth");
        alumnos.add("Luis");
        alumnos.add("Santiago");
        alumnos.add("Samuel");

        for (int i =0; i<alumnos.size(); i++){
            System.out.println(alumnos.get(i));
        }

        System.out.println("lista 2");
        List<String> lista2 = List.of("Elizabeth","Luis","Santiago","Samuel");

        for (String nombre:lista2){
            System.out.println(nombre);
        }
    }
}
