/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author PROFESOR
 */
public class ForeignKey extends Column{
    private Table table;

    public ForeignKey(String name, String dataType, Table table) {
        super(name, dataType);
        this.table = table;
    }
    
    
    public ForeignKey(String name, String dataType) {
        super(name, dataType);
    }
    

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }
    
    
    
}
