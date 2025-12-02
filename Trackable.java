//Liam McCormack - 25259012
public interface Trackable {

    // Abstract method to be implemented by concrete classes
    double calculateCost();

    // Default method to show common process steps
    default void showTrackingSteps() {
        System.out.println("Tracking Steps: Check progress daily and send weekly report.");
    }

    // Static method for general info
    static void displayProjectInfo() {
        System.out.println("All projects are subject to quality assurance checks.");
    }

    
    void logProgress();
}