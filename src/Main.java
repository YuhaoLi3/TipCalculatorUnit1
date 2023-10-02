// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to yuhao's tip calculator!");
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();
        System.out.print("What is the tip percentage(0-100): ");
        double tip = scan.nextDouble();
        double number = 0;
        double total = 0;
        String item = "";
        int i = 0;
        ArrayList<String> items = new ArrayList<String>();
        while (number != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            number = scan.nextDouble();
            total += number;
            scan.nextLine();
            System.out.print("enter a item(enter -------- if there is no items) ");
            item =  scan.nextLine();
            items.add(item);

        }
        total++; // add the -1 that we entered
        if (total >= 100) { //if total is greater than 100, it will take away 10%
            System.out.println("congratulations, you spent spend 100$ or more, you get 10% off your entire purchase!!");
            total = total * .9;
        } else {
            total = total *1;
        }


        System.out.println("----------------------------------");
        double total1 = Math.round(total * 100) / 100.0; // this will round the Total bill before tip to a two decimal place
        System.out.println("Total bill before tip: $" + total1);
        System.out.println("total percentage: " + (int)tip + "%");
        double tipTotal = 0;
        tip *= .01; //turns the percentage into a decimal
        tipTotal = total * tip;
        double tipTotal1 = Math.round(tipTotal * 100) / 100.0; // this will round the total tip to a two decimal place
        System.out.println("total tip: $" + tipTotal1);
        double totalCost = 0;
        totalCost = total + tipTotal;
        double totalCost1 = Math.round(totalCost * 100) / 100.0; // this will round the total bill with tip to a two decimal place
        System.out.println("total bill with tip: $" + totalCost1);
        total = total / people;
        double total2 = Math.round(total * 100) / 100.0; //this will round the person cost before tip to a two decimal place
        System.out.println("Per person cost before tip: $" + total2);
        double tipAfter = 0;
        tipAfter = tipTotal / people;
        double tipAfter1 = Math.round(tipAfter * 100) / 100.0; //this will round tip per person after to a two decimal place
        System.out.println("tip per person: $" + tipAfter1);
        totalCost = totalCost / people; //this gives totalcost a new value to find the total cost per person
        double totalCost2 = Math.round(totalCost * 100) / 100.0; //this will round the total cost per person  tip to a two decimal place
        System.out.println("total cost per person: $" + totalCost2);
        System.out.println("----------------------------------");
        System.out.println("Items ordered: ");
        for( i = 0; i<items.size(); i++) { //this for loop will print every string stored into the array. This is known as an arraylist
            System.out.println(items.get(i));
        }

    }
}
