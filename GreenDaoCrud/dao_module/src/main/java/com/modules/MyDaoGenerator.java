package com.modules;
import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * Created by Miguel on 2/16/16.
 */
public class MyDaoGenerator {
    public static void main(String args[]) throws Exception{
        Schema schema = new Schema(1, "com.modules");

        Entity magazine = schema.addEntity("Tabla");
        magazine.addIdProperty();
        magazine.addStringProperty("fila1");
        magazine.addStringProperty("fila2");
        magazine.addStringProperty("fila3");

        new DaoGenerator().generateAll(schema, "../dao_module/src/main/java/");

    }
}
