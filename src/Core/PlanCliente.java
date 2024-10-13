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
public class PlanCliente extends Producto {
    private Cliente cliente;
    private Plan plan;

    public PlanCliente(int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoActivo, float valor, Cliente cliente, Plan plan) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, valor);
        this.cliente = cliente;
        this.cliente.addPlan(this);
        this.plan = plan;
        this.plan.addPlanCliente(this);
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }
    
    
    
    
    
    
    

    
    
    
   
}
