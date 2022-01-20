package com.tchermnykh.coffeetown.field;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonPropertyOrder({"name", "str"})
public enum SweetField {

        NAME("Name", "name"),
        PRICE("Price", "price");
        private final String str;

        @JsonIgnore
        private final String dbProperty;

        SweetField(String str, String dbProperty) {
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

        public static List<SweetField> getTableFields() { return List.of(values());}
}
