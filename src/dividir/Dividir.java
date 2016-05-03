/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dividir;

/**
 *
 * @author Usuario
 */
public class Dividir {
    public static void division(int a,int b) throws exepcion{
        if(b==1){
            throw new exepcion();
        }else{
            System.out.println(a/b);
        }
    }
       public static void multiplicar (int a, int b)throws exepcion {
           System.out.println(a*b);
       }
    

    
    public static void main(String[] args) {
        try{
            division(10,1);  
        }catch(exepcion ex){
            System.out.println("no se puede dividir para uno");
        }
      try{
          multiplicar(5,1);
         
      }catch(exepcion ex){
          System.out.println(ex.getMessage());
          
          
      }
    }
    
}
