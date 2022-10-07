/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package character;

/**
 *
 * @author affrin
 */
public class Character {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s="successes";
        int n=0;
        char c1[]=s.toCharArray();
        int a=c1.length;
        int i;
            for(char w:c1)
        {
            //System.out.println(c);
            for(i=0;i<a;i++)
            {
            if(w==c1[i])
            {
                n=n+1;
            }
            }
            if (n==2)
            {
                System.out.println(w);
                break;
            }
            n=0;
           
        }

        
    }
    
}
