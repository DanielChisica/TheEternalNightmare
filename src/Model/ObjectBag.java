/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author EAN
 */
public class ObjectBag {

    private String nombre;//Es el nombre del elemento.

    private String descripcion;// Es la descrpcion del elemento.

    private int restore;
    
    private int type;

    public ObjectBag(String nombre, String descripcion, int restore, int type) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.restore = restore;
        this.type = type;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getRestore() {
        return restore;
    }

    public int getType() {
        return type;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setRestore(int restore) {
        this.restore = restore;
    }

    public void setType(int type) {
        this.type = type;
    }

    
    
}