// Carpet2.java 
// Displays the floor space of a room and price of 
import java.util.Scanner;
import java.util.scanner;
class Carpet2
{
    public static void main (String[] args)
    {
        double length, width, price, sqFeet, totalPrice;
        Scanner input = new Scanner (System.in);
        System.out.print ("Enter the lenght of the room ");
        length = input.nextDouble();
        System.out.print("Enter width ");
        width = input.nextDouble();
        System.out.print("Enter the price per aquare foot ");
        price = input.nextDouble();
        sqFeet = length * width;
        totalPrice = sqFeet * price;
        System.out.println("The length is " + length + 
        " and the width is " + width);
        System.out.println("The floor space is " + 
        sqFeet + " square feet");
        System.out.println("The price for carpet is $" + 
        totalPrice);

    }

}