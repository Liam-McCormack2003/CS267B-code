//Liam McCormack - 25259012
import java.util.ArrayList;

public class ProjectUtil {

     public static void printProjectDetails(ArrayList<Project> projects){
        System.out.println("\n===== ALL ACTIVE PROJECTS =====");
        for(Project p : projects){
            
            p.displayInfo(); // Displays project and freelancer info
            
            // Polymorphism: Calling the interface method
            System.out.println("The calculated total cost is: €" + p.calculateCost());
            p.logProgress();
            p.showTrackingSteps(); // Default method from Trackable interface
            System.out.println("-----------------------------");
        }
     }
}