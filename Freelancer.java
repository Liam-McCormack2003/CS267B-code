
//Liam McCormack - 25259012
public class Freelancer {
    private final String name;
    private final String specialty;
    private final FreelancerTier tier;
    private final int freelancerID;
    static int FreelancerCount = 1001; // Starting IDs from 1001

    public Freelancer(String name, String specialty, FreelancerTier tier) {
        this.name = name;
        this.specialty = specialty;
        this.tier = tier;
        this.freelancerID = FreelancerCount;
        FreelancerCount++;
    }

    // --- Getters ---
    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public FreelancerTier getTier() {
        return tier;
    }

    public int getFreelancerID() {
        return freelancerID;
    }

    // --- Display Info ---
    public void displayInfo() {
        System.out.println("Freelancer ID: " + freelancerID);
        System.out.println("Name: " + name);
        System.out.println("Specialty: " + specialty);
        System.out.println("Tier: " + tier);
    }
}