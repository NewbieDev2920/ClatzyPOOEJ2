/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import java.util.ArrayList;

/**
 *
 * @author cande
 */
public class Cliente extends Persona {

    private ArrayList<PlanCliente> planes;
    private ArrayList<ProductoCliente> productos;

    public Cliente(String nombre, String cedula, String telefono, String email) {
        super(nombre, cedula, telefono, email);
        this.planes = new ArrayList<>();
        this.productos = new ArrayList<>();
    }

    public PlanCliente getPlan(int index) {
        return this.planes.get(index);
    }

    public boolean addPlan(PlanCliente pc) {
        if (!this.planes.contains(pc)) {
            this.planes.add(pc);
            return true;
        }
        return false;
    }

    public ArrayList<PlanCliente> getPlanes() {
        return planes;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public boolean addProductoCliente(ProductoCliente pc){
        if(!this.productos.contains(pc)){
            this.productos.add(pc);
            return true;
        }
        return false;
    }
    

}
