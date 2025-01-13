import java.util.ArrayList;
import java.util.List;

public class MountainTrip extends TravelPlanner {
    private List<String> mountainRecommendations;
    private List<Integer> registrationFees; // Biaya registrasi setiap gunung
    private List<Integer> hikingRentalFees; // Biaya sewa alat hiking
    private List<Integer> campingRentalFees; // Biaya sewa alat camping
    private List<String> hikingEquipment; // Rincian alat sewa hiking
    private List<String> campingEquipment;
    private List<String> ContactPerson;

    public MountainTrip( int duration) {
        super("Gunung",  duration);
        this.mountainRecommendations = new ArrayList<>();
        this.registrationFees = new ArrayList<>();
        this.hikingRentalFees = new ArrayList<>();
        this.campingRentalFees = new ArrayList<>();
        this.hikingEquipment = new ArrayList<>();
        this.campingEquipment = new ArrayList<>();
        this.ContactPerson = new ArrayList<>();
        populateRecommendations();
        populateEquipment();
    }


    private void populateRecommendations() {
        mountainRecommendations.add("Gunung Rinjani - Lombok");
        ContactPerson.add("Pak Mail . 0843561323576");
        registrationFees.add(150000);
        hikingRentalFees.add(50000);
        campingRentalFees.add(100000);

        mountainRecommendations.add("Gunung Semeru - Jawa Timur");
        ContactPerson.add("Pak Mail . 0843561323576");
        registrationFees.add(100000);
        hikingRentalFees.add(40000);
        campingRentalFees.add(90000);

        mountainRecommendations.add("Gunung Merapi - Jawa Tengah");
        ContactPerson.add("Pak Mail . 0843561323576");
        registrationFees.add(75000);
        hikingRentalFees.add(35000);
        campingRentalFees.add(80000);

        mountainRecommendations.add("Gunung Gede - Jawa Barat");
        ContactPerson.add("Pak Mail . 0843561323576");
        registrationFees.add(50000);
        hikingRentalFees.add(70000);
        campingRentalFees.add(120000);

        mountainRecommendations.add("Gunung Bromo - Jawa Timur");
        ContactPerson.add("Pak Mail . 0843561323576");
        registrationFees.add(50000);
        hikingRentalFees.add(70000);
        campingRentalFees.add(130000);

        mountainRecommendations.add("Gunung Kerinci - Sumatra Barat");
        ContactPerson.add("Pak Mail . 0843561323576");
        registrationFees.add(55000);
        hikingRentalFees.add(70000);
        campingRentalFees.add(130000);

        mountainRecommendations.add("Gunung Slamet - Jawa Tengah");
        ContactPerson.add("Pak Mail . 0843561323576");
        registrationFees.add(50000);
        hikingRentalFees.add(90000);
        campingRentalFees.add(120000);

        mountainRecommendations.add("Gunung Sindoro - Jawa Tengah");
        ContactPerson.add("Pak Mail . 0843561323576");
        registrationFees.add(45000);
        hikingRentalFees.add(80000);
        campingRentalFees.add(100000);

        mountainRecommendations.add("Gunung Lawu - Jawa Tengah");
        ContactPerson.add("Pak Mail . 0843561323576");
        registrationFees.add(50000);
        hikingRentalFees.add(90000);
        campingRentalFees.add(110000);

        mountainRecommendations.add("Gunung Papandayan - Jawa Barat");
        ContactPerson.add("Pak Mail . 0843561323576");
        registrationFees.add(40000);
        hikingRentalFees.add(70000);
        campingRentalFees.add(99000);
    }


    private void populateEquipment() {
        hikingEquipment.add("Sepatu Hiking");
        hikingEquipment.add("Trekking Pole");
        hikingEquipment.add("Daypack");
        hikingEquipment.add("Jaket Summit");
        hikingEquipment.add("Include Photographer");

        campingEquipment.add("Tenda");
        campingEquipment.add("Matras");
        campingEquipment.add("Sleeping Bag");
        campingEquipment.add("Jaket Summit");
        campingEquipment.add("Jaket Tebal");
        campingEquipment.add("Sepatu Hiking");
        campingEquipment.add("Trekking pole");
        campingEquipment.add("Cerier");
        campingEquipment.add("Head Lamp");
        campingEquipment.add("Peralatan Masak(opsional");
        campingEquipment.add("Include Photographer");
    }

    @Override
    public void planTrip() {
        System.out.println("Planning a mountain trip:");
        System.out.println("Duration: " + getDuration() + " days");
        System.out.println("Activities: Hiking, Camping.");
        System.out.println("\nRekomendasi Gunung untuk Mendaki:");
        displayRecommendations();
    }


    private void displayRecommendations() {
        for (int i = 0; i < mountainRecommendations.size(); i++) {
            System.out.println((i + 1) + ". " + mountainRecommendations.get(i));
        }
    }


    public String getRecommendation(int index) {
        if (index >= 0 && index < mountainRecommendations.size()) {
            return mountainRecommendations.get(index);
        } else {
            return "Pilihan tidak valid";
        }
    }


    public int getRegistrationFee(int index) {
        return (index >= 0 && index < registrationFees.size()) ? registrationFees.get(index) : 0;
    }


    public int getHikingRentalFee(int index) {
        return (index >= 0 && index < hikingRentalFees.size()) ? hikingRentalFees.get(index) : 0;
    }


    public int getCampingRentalFee(int index) {
        return (index >= 0 && index < campingRentalFees.size()) ? campingRentalFees.get(index) : 0;
    }


    public List<String> getHikingEquipment() {
        return hikingEquipment;
    }


    public List<String> getCampingEquipment() {
        return campingEquipment;
    }


    public String getContactPerson(int index) {
        if (index >= 0 && index < ContactPerson.size()) {
            return ContactPerson.get(index);
        } else {
            return "Pilihan tidak valid";
        }
    }
}
