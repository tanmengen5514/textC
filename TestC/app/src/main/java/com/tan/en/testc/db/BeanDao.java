package com.tan.en.testc.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.tan.en.testc.bean.Bean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BEAN".
*/
public class BeanDao extends AbstractDao<Bean, Long> {

    public static final String TABLENAME = "BEAN";

    /**
     * Properties of entity Bean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Pass = new Property(2, String.class, "pass", false, "PASS");
        public final static Property ImagePath = new Property(3, String.class, "imagePath", false, "IMAGE_PATH");
    }


    public BeanDao(DaoConfig config) {
        super(config);
    }
    
    public BeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"NAME\" TEXT," + // 1: name
                "\"PASS\" TEXT," + // 2: pass
                "\"IMAGE_PATH\" TEXT);"); // 3: imagePath
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Bean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String pass = entity.getPass();
        if (pass != null) {
            stmt.bindString(3, pass);
        }
 
        String imagePath = entity.getImagePath();
        if (imagePath != null) {
            stmt.bindString(4, imagePath);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Bean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String pass = entity.getPass();
        if (pass != null) {
            stmt.bindString(3, pass);
        }
 
        String imagePath = entity.getImagePath();
        if (imagePath != null) {
            stmt.bindString(4, imagePath);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Bean readEntity(Cursor cursor, int offset) {
        Bean entity = new Bean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // pass
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // imagePath
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Bean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPass(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setImagePath(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Bean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Bean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Bean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
