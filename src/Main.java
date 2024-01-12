public class Main {
    public static void main(String[] args) {

        //declare variables
        double SummerCost = 40.11;
        double fallCost = 60.30;
        double winterCost = 100.30;
        double springCost = 50.55;

        //process total cost 
        double totalCost = SummerCost + fallCost + winterCost + springCost;

        //output total cost breaking down each season

        System.out.println(" The total cost for Summer was: $" + SummerCost + " The total cost of Fall was: $" + fallCost + " The total cost of winter was: $" + winterCost + " The total cost of Spring was: $" + springCost);
        System.out.println("The total cost for all 4 seasons was: $" + totalCost);


    }
}
