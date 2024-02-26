package week05_rewiew;

public class PizzaClients {

    public static void main(String[] args) {

       Pizza pizza1 =new Pizza(); // degerleri tanimladigimiz clasin adi
       /* pizza1.size = "Small";
        pizza1.quantity = 3;
        pizza1.getNumberOfPepperoniTopping = 4;
        pizza1.numberOfCheeseTopping = 3;*/

     pizza1.setInfo("Small",3,4,5);

        Pizza pizza2 = new Pizza();
       /* pizza2.size = "Medium";
        pizza2.quantity =4;
        pizza2.getNumberOfPepperoniTopping = 2;
        pizza2.numberOfCheeseTopping = 5;  */

     pizza2.setInfo("Medium",1,2,3);

        Pizza pizza3 = new Pizza();
       /* pizza3.size = "Large";
        pizza3.quantity = 6;
        pizza3.getNumberOfPepperoniTopping = 4;
        pizza3.numberOfCheeseTopping = 6; */

     pizza3.setInfo("Large",2,4,3);

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);

     System.out.println(pizza1.calcCost());
     System.out.println(pizza2.calcCost());
     System.out.println(pizza3.calcCost());
    }
}
