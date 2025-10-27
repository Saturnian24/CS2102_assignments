
public class BoatTour {

    /**  @author Jasmine Jones
     * calculates the expenses/cost of a boat trip
     * @param adults
     * @param kids
     * @return the total amount of money needed for the supplies and boat needed for the boat trip
     */
    public int tripCosts(int adults, int kids) {
        return ((adults * 7) + (kids * 5) + 1500);
    }

    /**
     * calculates the cost of tickets for a group of kids and adults
     * @param adults
     * @param kids
     * @return the total amount of money spent on tickets for a group of people
     */
    public int tripGross(int adults, int kids) {
        return ((adults * 60) + (kids * 45));
    }

    /**
     * determines if the company gained or lost money from a boat trip
     * @param adults
     * @param kids
     * @return the calculated profit from the boat trip expenses and ticket sales
     */
    public String netProfit(int adults, int kids){
        int profit = this.tripGross(adults, kids) - this.tripCosts(adults, kids);
        if (profit < 0){
            return "trip profit: -$" + (Math.abs(profit));
        }
        return "trip profit: $" + profit;
    }
}
