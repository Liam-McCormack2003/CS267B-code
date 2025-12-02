//Liam McCormack - 25259012
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 1. Freelancer Objects
        Freelancer chris = new Freelancer("Christopher Nolan", "Web Design", FreelancerTier.JUNIOR);
        Freelancer quentin = new Freelancer("Quentin Tarantino", "Copywriting", FreelancerTier.SENIOR);
        Freelancer martin = new Freelancer("Martin Scorsese", "App Development", FreelancerTier.INTERMEDIATE);

        // 2. Project Objects
        Project websiteRevamp = new Project("Website Revamp", 10, 50.00, chris);
        Project blogPosts = new Project("Monthly Blog Posts", 5, 40.00, quentin);
        Project mobileAppMVP = new Project("Mobile App MVP", 20, 80.00, martin);

        // 3. Demonstrate State Changes
        websiteRevamp.setStatus(ProjectStatus.IN_PROGRESS);
        blogPosts.setStatus(ProjectStatus.COMPLETED);
        mobileAppMVP.setStatus(ProjectStatus.ON_HOLD);
        
        // 4. Put all Projects into an ArrayList
        ArrayList<Project> projectList = new ArrayList<>();
        projectList.add(websiteRevamp);
        projectList.add(blogPosts);
        projectList.add(mobileAppMVP);

        // 5. Use the Utility Class
        ProjectUtil.printProjectDetails(projectList);
        
        // 6. Demonstrate Static Interface Method
        Trackable.displayProjectInfo(); 
    }
}