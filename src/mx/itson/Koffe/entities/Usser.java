/*
 * Este archivo pertenece al paquete mx.itson.Koffe.entities.
 * Define la clase Usser que representa a un usuario en el sistema.
 */

package mx.itson.Koffe.entities;

/**
 * La clase Usser modela a un usuario en el sistema.
 * Contiene atributos para el nombre, correo electrónico y contraseña del usuario.
 * 
 * @author GibsCAT11
 */
public class Usser {
    
    // Atributos que almacenan información sobre el usuario
    private String name;
    private String email;
    private String password;

    /**
     * Obtiene el nombre del usuario.
     * 
     * @return El nombre del usuario.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del usuario.
     * 
     * @param name El nuevo nombre del usuario.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     * 
     * @return El correo electrónico del usuario.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electrónico del usuario.
     * 
     * @param email El nuevo correo electrónico del usuario.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene la contraseña del usuario.
     * 
     * @return La contraseña del usuario.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Establece la contraseña del usuario.
     * 
     * @param password La nueva contraseña del usuario.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
