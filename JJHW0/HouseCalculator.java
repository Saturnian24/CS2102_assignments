public class HouseCalculator {

    /**
     * @author Jasmine Jones
     * calculates the total cost of a house after interest
     * @param purchasePrice the purchase price of the house
     * @param downPayment the down payment (upfront payment) for the house
     * @return the dollar amount that is going to be paid for the house
     */
    public double totalCost(double purchasePrice, double downPayment){
        double cost = calcSimpleInterest(purchasePrice, downPayment) + 2500;
        return cost + purchasePrice;
    }
    // Helper Function
    protected double calcSimpleInterest(double purchasePrice, double downPayment){
        double principal = purchasePrice - downPayment;
        return (0.08 * principal * 30.0);
    }
}
