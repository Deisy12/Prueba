
package borjadeisy;

public class Lista {
  Nodo inicio;
  Nodo fin;
  
 public void ingreso(int b) {
        if(inicio==null){
            inicio=new Nodo(b);
            fin=inicio;
        }else{
               Nodo temp=new Nodo(b);
               fin.sig=temp;
               temp.ant=fin;
               fin=temp;
        }
    }

   public boolean listaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }        
    }
    void mostrarAdelante(){
        Nodo aux=inicio;
        while(aux!=null){
            System.out.println(aux.info);
            aux=aux.sig;
        }
    }

    public int total(){
      int y=0;
      Nodo reco=inicio;
      while(reco!=null){
          y++;
          reco=reco.sig;
          
      }
      return y;
  }
    

    public void Imprime(){
      Nodo nuevo=inicio;
      if(inicio!=null){
          do{
              System.out.println(nuevo.info);
              nuevo=nuevo.sig;
          }while(nuevo!=null);
      }
    }
   
//    void mostrarAtras(){
//        Nodo aux=fin;
//        while(aux!=null){
//            System.out.println(aux.info);
//            aux=aux.ant;
//                    
//        }
//    }
   public void encontrarRepetidos(){
       Nodo aux=inicio;
       int num=0;
       System.out.println("este metodo alla repetidos");
       do{
           if(num==1){
               Nodo reco1=inicio;
           for(int i=0;i<total();i++){
               reco1=reco1.sig;
               
           }
           Nodo reco2=inicio;
           for(int i=0;i<total()-2;i++){
               reco2=reco2.sig;
           }
           }
          
           } while(aux!=null);
          
           
               System.out.println(aux.info);
               
               }
  void Repetidos() {
     
        Nodo reco = inicio;
        int num = 0;
        for (int i = 1; i <= total(); i++) {
            if (reco.info == num) {
                num++;
            }
            reco = reco.sig;
        }
        if (num != 0) {
          
            System.out.println(" [" + num + "]: " + num);

        } else {
            System.out.println("Elemento NO existe");
        }

    }
    
       }
   
   
  

 

