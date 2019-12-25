/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalityprinter;

/**
 *
 * @author User
 */
public class EqualityPrinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }
    
    public static void printEqual (int x, int y, int z){
        if ((x < 0) || (y < 0) || (z < 0)){
            System.out.println("Invalid Value");
        }
        else if ((x == y) && (x == z) && (z == y)){
            System.out.println("All numbers are equal");
        }
        else if ((x != y) && (x != z) && (z != y)){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }
    }
}
