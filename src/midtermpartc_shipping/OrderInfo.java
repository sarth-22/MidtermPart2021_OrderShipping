
package midtermpartc_shipping;

import java.util.Scanner;

/**
 * This class tracks the order. Keeps track of the
 * name, and dimensions of an order.
 * @author Liz Dancy, 2021
 */
public class OrderInfo 
{
    private String name;//keeps track of the customer name
    public int width;//cm
    public int height;//cm
    public float weight;//kg

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    /**
     * Creates a new order and sets the name
     * @param width
     * @param height
     * @param weight 
     */
    public OrderInfo(int width, int height, float weight)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please print the name associated with the order");
        String givenName = sc.nextLine();
        setName(givenName);
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
    
    
}
