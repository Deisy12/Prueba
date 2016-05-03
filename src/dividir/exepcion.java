/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dividir;


public class exepcion extends RuntimeException {
    public exepcion(){
       super("no se puede dividir para cero");
        
    }
        public exepcion(String mensaje){
        super("no se puede divirdir");
    }
}
