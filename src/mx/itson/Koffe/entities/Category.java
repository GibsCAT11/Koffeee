/*
 * Este archivo pertenece al paquete mx.itson.Koffe.entities.
 * Define la clase Category que representa una categoría en un sistema.
 */

package mx.itson.Koffe.entities;

/**
 * La clase Category modela una categoría en el sistema.
 * Contiene un atributo para el nombre de la categoría.
 * 
 * @author GibsCat11
 */
public class Category {
    
    // Atributo que almacena el nombre de la categoría
    private String name;

    /**
     * Obtiene el nombre de la categoría.
     * 
     * @return El nombre de la categoría.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre de la categoría.
     * 
     * @param name El nuevo nombre de la categoría.
     */
    public void setName(String name) {
        this.name = name;
    }
}

