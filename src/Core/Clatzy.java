/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author cande
 */
public class Clatzy {

    private ArrayList<Cliente> clientes;
    private ArrayList<Instructor> instructores;
    private ArrayList<Curso> cursos;
    private ArrayList<Plan> planes;

    public Clatzy() {
        this.clientes = new ArrayList<>();
        this.instructores = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.planes = new ArrayList<>();
    }

    public boolean addInstructor(String nombre, String cedula, String telefono, String email) {
        this.instructores.add(new Instructor(nombre, cedula, telefono, email));
        return true;
    }

    public Instructor getInstructor(int index) {
        return this.instructores.get(index);
    }

    public boolean addCurso(int id, String nombre, LocalDate fechaInicio, float valor, Instructor instructor) {
        this.cursos.add(new Curso(id, nombre, fechaInicio, null, true, valor, instructor));
        return true;
    }

    public boolean addPlan(String nombre, LocalDate fechaInicio, float valor, float valorMaximo) {
        this.planes.add(new Plan(0, nombre, fechaInicio, null, false, valor, valorMaximo));
        return true;
    }

    public boolean addCliente(String nombre, String cedula, String telefono, String email) {
        this.clientes.add(new Cliente(nombre, cedula, telefono, email));
        return true;
    }

    public Plan getPlan(int index){
        return this.planes.get(index);
    }
    

    public Cliente getCliente(int index) {
        return this.clientes.get(index);
    }

    public boolean comprarPlan(Cliente cliente, Plan plan, LocalDate fechaInicio) {
        
        boolean tieneEstadosActivos = false;
        for (PlanCliente p : cliente.getPlanes()) {
            if(p.isEstadoActivo()){
                tieneEstadosActivos = true;
                break;
            }
        }
        
        PlanCliente newPC = new PlanCliente(plan.getId(), plan.getNombre(), plan.getFechaInicio(), plan.getFechaFin(), true, plan.getValor(), cliente, plan);
        plan.setEstadoActivo(true);
        
        if(tieneEstadosActivos){
            //no puedes comprar plan
             System.out.println("El cliente " + cliente.getNombre() + " ya tiene un plan activo");
        }else{
            System.out.println("El cliente " + cliente.getNombre() + " compro exitosamente un plan "+ plan.getNombre());
            cliente.addPlan(newPC);
            return true;
        }
        
       
        return false;

    }

}
