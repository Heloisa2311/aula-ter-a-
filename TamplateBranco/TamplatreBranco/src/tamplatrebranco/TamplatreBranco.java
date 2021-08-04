// Programa atividade 1

package tamplatrebranco;

/**
 *
 * @author heloisa.schneider
 */
public class TamplatreBranco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strl = "Atividade 1";
        int a = 1;
        int b = 2; 
        int c = 3;
        int d = 4;           
       
        int a1 = a + a;
        int b1 = a + b;
        int c1 = a + c;
        int d1 = a + d;
               
        int a2 = b + b;
        int b2 = b + c;
        int c2 = b + d;
        
        int a3 = c + c;
        int b3 = c + d;
                
        int a4 = d + d;
        
        System.out.println(strl);
        System.out.println("1+1 = " + a1);
        System.out.println("1+2 = " + b1);
        System.out.println("1+3 = " + c1);
        System.out.println("1+4 = " + d1);
        
       System.out.println("2+2 = " + a2);
       System.out.println("2+3 = " + b2);
       System.out.println("2+4 = " + c2);
       
       System.out.println("3+3 = " + a3);
       System.out.println("3+4 = " + b3);
       
       System.out.println("4+4 = " + a4);
       
       
       
       
       
    }
    
}
