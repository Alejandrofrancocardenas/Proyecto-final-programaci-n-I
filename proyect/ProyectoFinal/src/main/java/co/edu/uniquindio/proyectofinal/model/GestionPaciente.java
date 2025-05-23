package co.edu.uniquindio.proyectofinal.model;

import java.util.LinkedList;

public class GestionPaciente {

    private LinkedList<Paciente> listpacientes;

    public GestionPaciente() {
        listpacientes = new LinkedList<>();
    }

    public LinkedList<Paciente> getListpacientes() {
        return listpacientes;
    }

    public void setListpacientes(LinkedList<Paciente> listpacientes) {
        this.listpacientes = listpacientes;
    }

    public boolean registrarPaciente(Paciente paciente) {
        for (Paciente p : listpacientes) {
            if (p != null && p.getNombre().equals(paciente.getNombre())) {
                return false;
            }


        }
        listpacientes.add(paciente);
        return true;
    }
    public boolean actualizarPaciente(Paciente paciente, String nombre,String cedula, Sexo sexo, int edad, String nombreUsuario, String contrasena, TipoUsuario tipoUsuario, String numeroSeguroSocial, HistorialMedico historialMedico ) {
        for (Paciente p : listpacientes) {
            if(p!=null&&p.getCedula().equals(paciente.getCedula())) {
                p.setNombre(nombre);
                p.setSexo(sexo);
                p.setEdad(edad);
                p.setNombreUsuario(nombreUsuario);
                p.setContrasena(contrasena);
                p.setTipoUsuario(tipoUsuario);
                p.setNumeroSeguroSocial(numeroSeguroSocial);
                return true;
            }
        }
        return false;
    }


}