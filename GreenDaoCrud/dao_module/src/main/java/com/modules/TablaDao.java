package com.modules;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.modules.Tabla;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table TABLA.
*/
public class TablaDao extends AbstractDao<Tabla, Long> {

    public static final String TABLENAME = "TABLA";

    /**
     * Properties of entity Tabla.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Fila1 = new Property(1, String.class, "fila1", false, "FILA1");
        public final static Property Fila2 = new Property(2, String.class, "fila2", false, "FILA2");
        public final static Property Fila3 = new Property(3, String.class, "fila3", false, "FILA3");
    };


    public TablaDao(DaoConfig config) {
        super(config);
    }
    
    public TablaDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'TABLA' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'FILA1' TEXT," + // 1: fila1
                "'FILA2' TEXT," + // 2: fila2
                "'FILA3' TEXT);"); // 3: fila3
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'TABLA'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Tabla entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String fila1 = entity.getFila1();
        if (fila1 != null) {
            stmt.bindString(2, fila1);
        }
 
        String fila2 = entity.getFila2();
        if (fila2 != null) {
            stmt.bindString(3, fila2);
        }
 
        String fila3 = entity.getFila3();
        if (fila3 != null) {
            stmt.bindString(4, fila3);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Tabla readEntity(Cursor cursor, int offset) {
        Tabla entity = new Tabla( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // fila1
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // fila2
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // fila3
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Tabla entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFila1(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setFila2(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setFila3(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Tabla entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Tabla entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
