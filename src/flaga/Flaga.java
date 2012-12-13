/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flaga;

/**
 *
 * @author student
 */


///hehehehedsfdsfdsf
public class Flaga {
    
    private static  int[] sortuj(int[] tab)
    {
        int i = 0, j = 0, k = tab.length-1; 
        
        while(true)
        {
             
            while( tab[j] == 1 )
            {
                j++;
            }
            if( tab[j] == 0 )
            {
                tab[i] += tab[j]; 
                tab[j] = tab[i] - tab[j];
                tab[i] = tab[i] - tab[j];
                i++;
                j++;
            }
            else if(tab[j] == 2)
            {
                tab[k] += tab[j]; 
                tab[j] = tab[k] - tab[j];
                tab[k] = tab[k] - tab[j]; 
                k--;
                j--;
            }
            System.err.print("wskaźniki: " + i + " " + j + " " + k + "\n");        
            for(int w : tab)
            {
                System.err.print(w); 
            }
            System.err.print("\n");
            
            
            if(k<j)
            {
                break;
            }
        }
        return tab;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] a = new int[] {0,1,2,0,1,2,2,1,2,1,0,1,2,1,0,0,1,2};
        a = sortuj(a);
        
        for(int i : a)
        {
           System.err.print(i); 
        }
        
        
    }
}