package com.tchermnykh.coffeetown.field;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonPropertyOrder({"name", "str"})
public enum IngredientField {

    INGREDIENT_NAME("Ingredient name", "ingredientName"),
    INGREDIENT_Price("Ingredient price", "ingredientPrice");

    private final String str;

    @JsonIgnore
    private final String dbProperty;

    IngredientField(String str, String dbProperty) {
        this.str = str;
        this.dbProperty = dbProperty;
    }
    public String getName() {
        return this.name();
    }

    public String getStr() {
        return str;
    }

    public String getDbProperty() {
        return dbProperty;
    }

    public static List<IngredientField> getTableFields() { return List.of(values());}
}
