package entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.management.ConstructorParameters;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@Table(name = "food_o_ingredients_macro", schema = "food")
public class Ingredient implements Serializable {

    @Id
    @Column(name = "name")
    private String foodName;

    @Column(name = "brand")
    private String brand;

    @Column(name = "format")
    private String format;

    @Column(name = "prot")
    private String prot;

    @Column(name = "fat")
    private String fat;

    @Column(name = "carb")
    private String carb;

    @Column(name = "macro_type")
    private String macro_type;

    @Column(name = "kcal")
    private String kcal;

}
