package controller;

import entity.Ingredient;
import model.RecipeCarbs;
import org.apache.catalina.User;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@RestController
@RequestMapping("/api/recipes")
public class RecipesController {
    Logger logger = (Logger) LoggerFactory.getLogger(RecipesController.class);

    @RequestMapping(method = RequestMethod.POST)
    public Ingredient addNewIngredient(@RequestBody Ingredient ingredient) {
        logger.debug("calling test");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RECIPE_MAKER");
        EntityManager em = emf.createEntityManager();

//        ingredient = em.find(Ingredient.class,"Thon");

        em.getTransaction().begin();
        em.persist(ingredient);
        em.getTransaction().commit();

        return ingredient;
    }
}
