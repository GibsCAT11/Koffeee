/*
 * Este archivo pertenece al paquete mx.itson.Koffe.entities.
 * Define la clase Post que representa una publicación en un sistema.
 */

package mx.itson.Koffe.entities;

/**
 * La clase Post modela una publicación en el sistema.
 * Contiene atributos para el título, descripción, usuario, cantidad de "me gusta" y "no me gusta",
 * comentarios, fecha, categoría y otros detalles relacionados con la publicación.
 * 
 * @author GibsCAT11
 */
public class Post {
    
    // Atributos que almacenan información sobre la publicación
    private String title;
    private String description;
    private Usser user;
    private int like;
    private int dislike;
    private String comments;
    private String date;
    private Category category;

    /**
     * Obtiene el título de la publicación.
     * 
     * @return El título de la publicación.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Establece el título de la publicación.
     * 
     * @param title El nuevo título de la publicación.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Obtiene la descripción de la publicación.
     * 
     * @return La descripción de la publicación.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Establece la descripción de la publicación.
     * 
     * @param description La nueva descripción de la publicación.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Obtiene el usuario que hizo la publicación.
     * 
     * @return El usuario de la publicación.
     */
    public Usser getUser() {
        return user;
    }

    /**
     * Establece el usuario de la publicación.
     * 
     * @param user El nuevo usuario de la publicación.
     */
    public void setUser(Usser user) {
        this.user = user;
    }

    /**
     * Obtiene la cantidad de "me gusta" de la publicación.
     * 
     * @return La cantidad de "me gusta".
     */
    public int getLike() {
        return like;
    }

    /**
     * Establece la cantidad de "me gusta" de la publicación.
     * 
     * @param like La nueva cantidad de "me gusta".
     */
    public void setLike(int like) {
        this.like = like;
    }

    /**
     * Obtiene la cantidad de "no me gusta" de la publicación.
     * 
     * @return La cantidad de "no me gusta".
     */
    public int getDislike() {
        return dislike;
    }

    /**
     * Establece la cantidad de "no me gusta" de la publicación.
     * 
     * @param dislike La nueva cantidad de "no me gusta".
     */
    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    /**
     * Obtiene los comentarios de la publicación.
     * 
     * @return Los comentarios de la publicación.
     */
    public String getComments() {
        return comments;
    }

    /**
     * Establece los comentarios de la publicación.
     * 
     * @param comments Los nuevos comentarios de la publicación.
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * Obtiene la fecha de la publicación.
     * 
     * @return La fecha de la publicación.
     */
    public String getDate() {
        return date;
    }

    /**
     * Establece la fecha de la publicación.
     * 
     * @param date La nueva fecha de la publicación.
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Obtiene la categoría de la publicación.
     * 
     * @return La categoría de la publicación.
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Establece la categoría de la publicación.
     * 
     * @param category La nueva categoría de la publicación.
     */
    public void setCategory(Category category) {
        this.category = category;
    }
}
