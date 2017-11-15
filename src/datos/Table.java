/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author PROFESOR
 */
public class Table {
    private String name;
    private ArrayList<Column> columns;
    private ArrayList<Key> keys;
    private ArrayList<ForeignKey> foreignKeys;

    public Table(String name) {
        this.name = name;
        this.columns = new ArrayList<>();
        this.keys = new ArrayList<>();
        this.foreignKeys = new ArrayList<>();
    }
     
    
    public void addColumn(String name, String dataType){
      Column column = new Column(name, dataType);
      this.columns.add(column);
    }
        
    public void addKey(String name, String dataType){
      Key column = new Key(name, dataType);
      this.keys.add(column);
    }
    
    public void addForeignKey(String name, String dataType, Table table){
      ForeignKey foreignKey = new ForeignKey(name, dataType);
      foreignKey.setTable(table);
      this.foreignKeys.add(foreignKey);
     
    }

    public ArrayList<Column> getColumns() {
        return columns;
    }


    public ArrayList<Key> getKeys() {
        return keys;
    }


    public ArrayList<ForeignKey> getForeignKeys() {
        return foreignKeys;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
