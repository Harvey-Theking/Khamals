/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CustomersDebtors;

import java.util.Calendar;
import java.util.Formatter;

/**
 *
 * @author blissmen
 */
public class Inventory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar dateTime = Calendar.getInstance();
        Formatter nn = new Formatter();
        Formatter p = nn.format("%tF", dateTime);
        System.out.println(p.toString().substring(0, 10));
     System.out.println( p.toString());  
        
    }
    
}