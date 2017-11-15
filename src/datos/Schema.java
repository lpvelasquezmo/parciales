/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author PROFESOR
 */
public class Schema {
  private String name;
  private ArrayList<Table> tables;

    public Schema() {
         this.tables = new ArrayList<>();
    }

  
    public Schema(String name) {
        this.name = name;
        this.tables = new ArrayList<>();
    }
        
    public void addTable(String name){
       Table table = new Table(name);
       this.tables.add(table);
    }
  
    public Table getTable(String name){
        for (Table table : tables) {
            if(table.getName().equals(name))
                return table;
        }
        return null;
    }
        
    public ArrayList<Column> listColumns(){
        ArrayList<Column> columns = new ArrayList<>();
        for (Table table : tables) {
          columns.addAll(table.getColumns()); 
        }
       return columns;
    }
    
    public HashMap<String, String> listTables(){
        HashMap<String, String> result = new 
            HashMap();
        
        for (Table table : tables) {
            for (ForeignKey foreignKey : table.getForeignKeys()) {
               result.put(table.getName(), foreignKey.getTable().getName());
            }
        }
        return result;
    }
}
