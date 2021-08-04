/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variavel;

/**
 *
 * @author heloisa.schneider
 */
public class Variavel {
    int a = 1;
    int b = 2;
    int c = 3;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Variavel Val = new Variavel();
        
        int[] ListNum = {1, 2, 3, 4, 6, 8, 10};
        int resp = 11;
        
        System.out.printf("Soma de variaveis a, b e c  = %d \n", (Val.a + Val.b + Val.c));
            if(Val.a + Val.b + Val.c == resp){
                    System.out.print ("resposta correta  " + (ListNum[6] - ListNum[0]));
            }
            else {
                System.out.print ("resposta incorreta");
                                     
            }
        
       
       
    }
    
}
