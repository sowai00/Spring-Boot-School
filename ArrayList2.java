import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        // 2D ArrayList
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("donuts");
        bakeryList.add("garlic bread");
        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");
        ArrayList<String> drinkList = new ArrayList<String>();
        drinkList.add("water");
        drinkList.add("coffee");


        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList.get(1));
    }
}
