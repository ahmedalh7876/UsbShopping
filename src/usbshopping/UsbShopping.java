/*
 * Author: Ahmed A.
 * Last edit: 3rd of October, 2018
 * The program calculates the volume of water used to manufacture the computer components of the user.
 */

package usbshopping;

//Import keypress scanner to detect keystrokes within console, and decimal format storage variable
import java.util.Scanner;
import java.text.DecimalFormat;

public class UsbShopping {

    public static void main(String[] args) {
        
        //Variable declaration and initialization
        final double KBPRICE = 49.99, MSPRICE = 25.99, USBPRICE = 19.99, taxRate = .13;
        double kBoard, cMouse, usbDevice, subTotal, grandTotal, taxedPrice;
        
        //Initializing a monetary decimal format and keypress scanner
        DecimalFormat monetary = new DecimalFormat ("$#,##0.00");
        Scanner keyPress = new Scanner(System.in);
        
        //Displays text within the console that asks user to input infomation
        System.out.println("Please enter the number of keyboards purchased: ");
        //Initializes user input into a variable 
        kBoard = keyPress.nextInt();
        
        System.out.println("Enter the number of mice purchased: ");
        cMouse = keyPress.nextInt();
        
        System.out.println("Please enter the number of USB devices purchased: ");
        usbDevice = keyPress.nextInt();
        
        //Initialize these variables after gathering input from the user
        subTotal = kBoard + cMouse + usbDevice;
        taxedPrice = taxRate * subTotal;
        grandTotal = subTotal + taxedPrice;
        
        //Output subtotal, HST tax, and the grand total within the console window
        System.out.println("*********************\nSubtotal:\t" + monetary.format(subTotal));
        System.out.println("HST:\t\t" + monetary.format(taxedPrice));
        System.out.println("Grand Total:\t" + monetary.format(grandTotal) + "\n*********************");
    }
    
}
