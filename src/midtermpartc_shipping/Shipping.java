
package midtermpartc_shipping;

import java.util.Scanner;

/**
 * This class takes in information about a package (orderInfo)
 * that needs to be shipped and then validates that
 * the package weight does not require extra postage.
 * If a package is too heavy, the extra postage cost is displayed.
 * @author Liz Dancy, 2021
 */
public class Shipping {

    /**
     * A class that takes in the shipping weight and 
     * validates if the customer must pay extra above standard shipping
     */
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Welcome, please enter your package info");
       System.out.println("Weight in kg: ");
       float weight = sc.nextFloat();
       System.out.println("height in cm: ");
       int height = sc.nextInt();
       System.out.println("width in cm: ");
       int width = sc.nextInt();
       OrderInfo order = new OrderInfo(width, height, weight);
       
       if(weight>5.0 || height*width >120)
       {
           System.out.println("Extra postage required! Check back after midterm to see how much!");
       }
    }

}
