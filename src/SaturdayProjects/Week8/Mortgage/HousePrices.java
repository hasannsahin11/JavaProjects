package SaturdayProjects.Week8.Mortgage;

public class HousePrices extends Users {
    private int price;

    public HousePrices(String username, String whichCondition, String houseType, int roomCount, int downPayment, int longTerm, StatesTax statesTax, int price) {
        super(username, whichCondition, houseType, roomCount, downPayment, longTerm, statesTax);
        this.price = price;
    }

    public void roomCountToPrice() {
        int roomCount = 0;
        if ((roomCount == 0)) {
            price += 10000;
        } else if (roomCount == 1) {
            price += 20000;
        } else if (roomCount == 2) {
            price += 30000;
        } else if (roomCount == 3) {
            price += 40000;
        } else if (roomCount == 4) {
            price += 50000;
        } else if (roomCount == 5) {
            price += 60000;
        }
    }

    public void conditionToPrice() {
        String whichCondition = "";
        if (whichCondition.equalsIgnoreCase("New")) {
            price += 50000;
        } else if (whichCondition.equals("Like New")) {
            price += 40000;
        } else if (whichCondition.equals("Old")) {
            price += 30000;
        } else if (whichCondition.equals("Renew Required")) {
            price += 15000;
        }

    }

    public void houseTypeToPrice() {
        String houseType = "";
        if (houseType.equals("Apartment")) {
            price += 20000;
        } else if (houseType.equals("Condo")) {
            price += 30000;
        } else if (houseType.equals("House")) {
            price += 40000;
        }
    }

    public int getPriceTotal() {
        int totalPrice = price ;
        return totalPrice;
    }

    /*
            Create a method, name is getPriceTotal
            return type is int
            Return the total price(housetype, condition and roomcount prices)
            Also you need to calculate the tax and add  to the price
            For the tax percentage use the StatesTax enum
     */


    /*
        Create a method, name is getPriceEachMonth

            Return the monthly payment amount.
            reduce the downPayment and calculate the each month's payment
     */
}

