package model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RecipeCarbs {
    private String proteine;
    private String lipide;
    private String glucide;
}
