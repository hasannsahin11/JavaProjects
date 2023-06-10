package SaturdayProjects.Week8.Mortgage;

public class Main {
    public static void main(String[] args) {

        /*Create 4 instances of HousePrices
        housePrices1 -> userName = David, whichCondition = LikeNew, houseType = House, roomCount = 5, downPayment = 50000, longTerm = 30, StateName = New York
        and check if PriceTotal is 120000, PriceEachMonth is 2333, userName is David

        housePrices2 -> userName = Fernando, whichCondition = new, houseType = Apartment, roomCount = 3, downPayment = 40000, longTerm = 30, StateName = Ohio
        and check if PriceTotal is 123200, PriceEachMonth is 2773, userName is Fernando

        housePrices3 -> userName = Emily, whichCondition = Old, houseType = condo, roomCount = 4, downPayment = 30000, longTerm = 36, StateName = Florida
        and check if PriceTotal is 115500, PriceEachMonth is 2375, userName is Emily

        housePrices4 -> userName = Linda, whichCondition = Renew Required, houseType = condo, roomCount = 1, downPayment = 50000, longTerm = 35, StateName = Florida
        and check if PriceTotal is 74750, PriceEachMonth is 707, userName is Linda
        * */
        HousePrices housePrices1 = new HousePrices("David","Like New","House",5,50000,30,new StatesTax("New York"),120000);
        housePrices1.getPriceTotal();

    }

}
