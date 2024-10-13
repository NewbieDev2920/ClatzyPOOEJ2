/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author cande
 */
public class Plan extends Producto {
    private float valorMaximoCurso;
    private ArrayList<PlanCliente> planes;

    public Plan(int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoActivo, float valor, float valorMaximoCurso) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, valor);
        this.valorMaximoCurso = valorMaximoCurso;
        this.planes = new ArrayList<>();
    }
    
     public boolean addPlanCliente(PlanCliente pc) {
        if (!this.planes.contains(pc)) {
            this.planes.add(pc);
            return true;
        }
        return false;
    }

    public float getValorMaximoCurso() {
        return valorMaximoCurso;
    }

    public ArrayList<PlanCliente> getPlanes() {
        return planes;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public float getValor() {
        return valor;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }
    
    
    
    
}
