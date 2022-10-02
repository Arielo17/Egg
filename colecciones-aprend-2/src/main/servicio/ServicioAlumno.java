package main.servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import main.entidad.Alumno;

public class ServicioAlumno {
    
    Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public ArrayList<Alumno> crearAlumno(){
        ArrayList<Alumno> totalAlumnos = new ArrayList();
        String opc;
        do {
            Alumno alumno = new Alumno();
            System.out.print("Ingrese el nombre del alumno: ");
            alumno.setNombre(scanner.next());
            System.out.println("Ingrese las 3 notas del alumno seguido de Enter: ");
            ArrayList<Integer> notas = new ArrayList();
            notas.add((Integer)scanner.nextInt());
            notas.add((Integer)scanner.nextInt());
            notas.add((Integer)scanner.nextInt());
            alumno.setNotas(notas);
            
            do {
                System.out.println("\nDesea ingresar otro alumno? (s/n): ");
                opc = scanner.next();
            } while (!(opc.equalsIgnoreCase("s") || opc.equalsIgnoreCase("n")));
            totalAlumnos.add(alumno);
        } while (opc.equalsIgnoreCase("s"));
        return totalAlumnos;
    }
    
    public double notaFinal(Alumno alumno){
        ArrayList<Integer> notas = alumno.getNotas();
        Iterator itNotas = notas.iterator();
        int suma = 0;
        while(itNotas.hasNext()){
            suma = suma + (int)itNotas.next();
        }
        return (double)suma/alumno.getNotas().size();
    }
    
}
