
package tareamatrices;

/**
 * @author Alvaro
 */
public class CalculadoraDeMatrices {

   
    public static void main(String[] args) {
        int matriz1 [][] = new int [3][3];
        int matriz2 [][] = new int [3][3];
        int matriz_final [][] = new int [3][3];
     //llenado de primer matríz 
  
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = (int) (Math.random() * 8);        
            }
        }
      for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[i][j] = (int) (Math.random() * 8);        
            }
        }   
      //suma 

 
       
    }
            
 
       
}
    

