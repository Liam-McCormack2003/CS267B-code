//Liam McCormack - 25259012
public class Project implements Trackable {
    private final String title;
    private final int durationDays;
    private final double baseRate;
    private ProjectStatus status;
    private final Freelancer assignedFreelancer;
    public Project(String title, int durationDays, double baseRate, Freelancer assignedFreelancer) {
        this.title = title;
        this.durationDays = durationDays;
        this.baseRate = baseRate;
        this.status = ProjectStatus.NEW;
        this.assignedFreelancer = assignedFreelancer;
    }

    // --- Getters & Setters ---
    public String getTitle() {
        return title;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public void setStatus(ProjectStatus status) {
        this.status = status;
    }

    public Freelancer getAssignedFreelancer() {
        return assignedFreelancer;
    }

    // --- Interface Method Implementation ---
    @Override
    public double calculateCost() {
        double totalCost = baseRate * durationDays;
        
        // Bonus for Senior Freelancers
        if (assignedFreelancer.getTier() == FreelancerTier.SENIOR) {
            totalCost += 150.00; // Senior bonus
        }
        
        // Discount for Junior Freelancers
        if (assignedFreelancer.getTier() == FreelancerTier.JUNIOR) {
            totalCost -= 50.00; // Junior discount
        }

        return totalCost;
    }

    // --- Interface Method Implementation ---
    @Override
    public void logProgress() {
        if (this.status == ProjectStatus.IN_PROGRESS) {
            System.out.println(title + ": Freelancer " + assignedFreelancer.getName() + " is actively working.");
        } else if (this.status == ProjectStatus.COMPLETED) {
            System.out.println(title + ": Project is finished and ready for review.");
        } else {
            System.out.println(title + ": Waiting to start or currently on hold.");
        }
    }
    
    // --- Display Info ---
    public void displayInfo() {
        System.out.println("\n--- Project Details ---");
        System.out.println("Title: " + title);
        System.out.println("Duration (days): " + durationDays);
        System.out.println("Status: " + status);
        System.out.print("Assigned to: ");
        assignedFreelancer.displayInfo(); // Display freelancer's details
    }
}