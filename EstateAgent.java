import java.util.ArrayList;

/**
 * A class to store information about a real estate agent and their listings
 * @author Yerdaulet
 */
public class EstateAgent {
    // Static counter to keep track of the number of estate agents created
    private static int counter = 0;
    
    private String id; // Unique identifier for the estate agent
    private String name; // Name of the estate agent
    private ArrayList<Listing> listings; // List of listings associated with the estate agent
    
    // Default constructor
    EstateAgent() {
        listings = new ArrayList<Listing>();
        id = "" + (counter + 1); // Assign a unique ID to the estate agent
        counter++;
    }
    
    // Constructor with name parameter
    EstateAgent(String name) {
        listings = new ArrayList<Listing>();
        id = "" + (counter + 1); // Assign a unique ID to the estate agent
        counter++;
        this.name = name; // Set the name of the estate agent
    }
    
    /**
     * Setter function for the ID of the estate agent
     * @param id the ID to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Setter function for the name of the estate agent
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Getter function for the name of the estate agent
     * @return the name of the estate agent
     */
    public String getName() {
        return name;
    }
    
    /**
     * Getter function for the ID of the estate agent
     * @return the ID of the estate agent
     */
    public String getId() {
        return id;
    }
    
    /**
     * Getter function for the list of listings associated with the estate agent
     * @return the list of listings
     */
    public ArrayList<Listing> getListings() {
        return listings;
    }
    
    /**
     * Adds a listing to the list of listings associated with the estate agent
     * @param listing the listing to add
     */
    public void addListing(Listing listing) {
        listings.add(listing);
    }
}