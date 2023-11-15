/*
 * Este archivo es parte del paquete mx.itson.Koffe.ui.
 * La clase Koffe_Post es la clase principal que contiene el método main para ejecutar la aplicación.
 */

package mx.itson.Koffe.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.Koffe.entities.Category;
import mx.itson.Koffe.entities.Post;
import mx.itson.Koffe.entities.Usser;

/**
 * La clase Koffe_Post es la clase principal que demuestra el uso de las clases Usser, Category y Post.
 * Crea instancias de usuarios, categorías y publicaciones, y muestra información detallada sobre una publicación específica.
 * 
 * @author GibsCAT11
 */
public class Koffe_Post {

    public static void main(String[] args) {
        // Creación de instancias de usuarios
        Usser user = new Usser();
        user.setName("Jesús Montoya A.");
        user.setEmail("gibran_montoya@hotmail.com");
        user.setPassword("gatocaotico22");

        Usser user2 = new Usser();
        user2.setName("Sebastian Montoya");
        user2.setEmail("sebaswowi1612@gmail.com");
        user2.setPassword("perrobailador10");

        // Creación de instancia de categoría
        Category category = new Category();
        category.setName("Tecnología");

        // Creación de una lista de usuarios y agregando usuarios a la lista
        List<Usser> users = new ArrayList();
        users.add(user);
        users.add(user2);

        // Creación de instancia de publicación y asignación de valores a sus atributos
        Post post = new Post();
        post.setTitle("La adopción en la nube");
        post.setDescription("La computación en la nube ha transformado la forma en que se desarrolla y se despliega el software \nPermite a los desarrolladores acceder a recursos escalables y flexibles, lo que facilita la creación y la\ngestión de aplicaciones. La nube también ha permitido la aparición de servicios de software como servicio (SaaS), \ndonde los usuarios pueden acceder a aplicaciones directamente a través de Internet sin necesidad de instalarlas en \nsus dispositivos.");
        post.setComments(user2.getName() + ": Muy interesante esa información amistad.");
        post.setLike(25);
        post.setDislike(18);
        post.setDate("18 de octubre del 2023");
        post.setUser(user);
        post.setCategory(category);

        // Mostrar información detallada sobre la publicación
        System.out.println("-------------" + post.getTitle().toUpperCase() + "-------------");
        System.out.println("DESCRIPCIÓN: " + post.getDescription());
        System.out.println("                                      " + "BY: " + user.getName());
        System.out.println("LIKES " + post.getLike() + "      DISLIKES " + post.getDislike());
        System.out.println("FECHA: " + post.getDate() + "    " + "CATEGORÍA: " + post.getCategory().getName());
        System.out.println(" ");
        System.out.println(post.getComments());
        System.out.println("------------------------------------------------------------");

    }

}
