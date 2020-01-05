import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ShoppingList shoppingList = new ShoppingList ();
        Scanner scanner = new Scanner(System.in);
        ArrayList<ShoppingList> list = new ArrayList<ShoppingList>();


        System.out.println ("Add name: ");
        shoppingList.name = scanner.nextLine ();
        System.out.println (shoppingList.name);
        list.add(shoppingList.name);
        System.out.println (list);
        list.add (  )


    }
}
