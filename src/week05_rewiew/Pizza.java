package week05_rewiew;

public class Pizza {

    public String size;
    public int quantity,
            numberOfCheeseTopping,
            getNumberOfPepperoniTopping;

    //   ÖNEMLI   Bundan sonra ki adim toString yapip Clients Classina gidip degerleri cagirmak. ÖNEMLI
    // Bu uzun bir islem oldugundan (p1,p2) setInfo metodunu cagiriyoruz.


    public void setInfo(String size, int quantity, int numberOfCheeseTopping, int getNumberOfPepperoniTopping) {
        this.size = size;
        this.quantity = quantity;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.getNumberOfPepperoniTopping = getNumberOfPepperoniTopping;
    }



    // böylece direk pizza1 yi yazdirinca bütün degerler cikacak tek tek yazmaya gerek yok

                  // setInfo nun pratik yöntemi generate -> canstructor hepsini sec







    public double calcCost(){
         double totalCost = 0;
         double startingPrice = (size.equalsIgnoreCase("small"))? 10
                 :size.equalsIgnoreCase("medium")? 14 : 16;

         double topping = (numberOfCheeseTopping * 0.8) +(getNumberOfPepperoniTopping * 1.5);

         totalCost = (startingPrice + topping)* quantity;

         return totalCost ;

    }
    }

/*Create a custom Java class named Pizza with the following specifications:

Attributes:
size: Indicates the size of the pizza (small, medium, or large).
quantity: Indicates the quantity of pizza
numberOfCheeseTopping: Indicates the number of cheese toppings.
numberOfPepperoniTopping: Indicates the number of pepperoni toppings.

Actions:
setInfo: Sets all the fields of the pizza object.
calcCost(): Returns the total cost of the pizza.
toString(): Returns a string containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost().


The pizza cost is determined by:
Small: Starts at $10.
        Medium: Starts at $14.
        Large: Starts at $16.

Per pepperoni topping: $1.5
Per cheese topping: $0.8 */

