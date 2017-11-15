/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.Schema;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author PROFESOR
 */
public class SchemaLogic {
    private Schema schema;

    public SchemaLogic() {
      this.schema = new Schema();
    }
    
    
    //Leer un archivo
    public void loadFile(String path) throws FileNotFoundException {
      File read = new File(path);
      Scanner flow = new Scanner(read);
      flow.useDelimiter(",");
      String type = null;
      while (flow.hasNext()) {              
         type = flow.next().trim();
         //Procesar y Crear Objetos
          System.out.println(type);
       }
    }
    
}
