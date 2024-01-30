import java.util.ArrayList;

/**
 * Tester class to simulate addition of real estate agents and their listings
 * @author Yerdaulet
 */
public class Tester {
    /**
     * Simulates the addition of new real estate agents and their listings
     * @param args not used
     */
    public static void main(String[] args) {
        ArrayList<EstateAgent> agents = new ArrayList<EstateAgent>();

        // Add two new estate agents with names "Agent 1" and "Agent 2" to the agents ArrayList
        for (int i = 0; i < 2; i++) {
            agents.add(new EstateAgent("Agent " + (i + 1)));

            // Add three new listings to each estate agent's listings ArrayList
            for (int j = 1; j <= 3; j++) {
                agents.get(i).addListing(new Listing());
            }
        }

        // Iterate through each estate agent and their listings, and print out the information for each listing
        for (int i = 0; i < agents.size(); i++) {
            for (int j = 0; j < agents.get(i).getListings().size(); j++) {
                System.out.print(agents.get(i).getName() + ": "); // Print the estate agent's name
                System.out.print(agents.get(i).getListings().get(j).getYear() + "/"); // Print the listing's year
                System.out.print(agents.get(i).getListings().get(j).getMonthString() + "/"); // Print the listing's month (as a string)
                System.out.print(agents.get(i).getListings().get(j).getDay() + "\n"); // Print the listing's day
                
                // Update the frontend with the listing information
            }
        }
    }
}