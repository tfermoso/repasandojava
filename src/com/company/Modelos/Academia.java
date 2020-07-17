package com.company.Modelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Academia {
    private List<Alumno> alumnoList;

    public Academia() {
        alumnoList = new ArrayList<>();
    }

    public void addAlumno(String nombre, String apellido, Date fechaNac, String DNI) {
        this.alumnoList.add(new Alumno(nombre, apellido, fechaNac, DNI));
    }

    public String showAllAlumnos() {
        String texto = "";
        for (int i = 0; i < alumnoList.size(); i++) {
            texto += alumnoList.get(i).toString();
        }
        return texto;
    }

    public String buscarPorDNI(String dni) {
        for (int i = 0; i <alumnoList.size() ; i++) {
            if(alumnoList.get(i).getDni().equals(dni)){
                return alumnoList.get(i).toString();
            }

        }
        return  "El alumno no esta matriculado";
    }


}


