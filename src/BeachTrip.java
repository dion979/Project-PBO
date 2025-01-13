import java.util.ArrayList;
import java.util.List;

public class BeachTrip extends TravelPlanner {
    private List<String> beachRecommendations;
    private List<String> beachContact;
    private List<Integer> campingFees;
    private List<Integer> villaFees;

    public BeachTrip(int duration) {
        super("Pantai", duration);
        this.beachRecommendations = new ArrayList<>();
        this.beachContact = new ArrayList<>();
        this.campingFees = new ArrayList<>();
        this.villaFees = new ArrayList<>();
        populateRecommendations();
    }

    private void populateRecommendations() {
        beachRecommendations.add("Pantai Kuta - Bali");
        beachContact.add("Pak Andre . 082271876543");
        campingFees.add(75000);
        villaFees.add(300000);

        beachRecommendations.add("Pantai Parangtritis - Yogyakarta");
        beachContact.add("Pak Andre . 082271876543");
        campingFees.add(50000);
        villaFees.add(250000);

        beachRecommendations.add("Pantai Tanjung Tinggi - Belitung");
        beachContact.add("Pak Andre . 082271876543");
        campingFees.add(100000);
        villaFees.add(400000);

        beachRecommendations.add("Pantai Pink - Lombok");
        beachContact.add("Pak Andre . 082271876543");
        campingFees.add(120000);
        villaFees.add(500000);

        beachRecommendations.add("Pantai Ora - Maluku");
        beachContact.add("Pak Andre . 082271876543");
        campingFees.add(150000);
        villaFees.add(700000);

        beachRecommendations.add("Pantai Nihiwatu - Sumba");
        beachContact.add("Pak Andre . 082271876543");
        campingFees.add(180000);
        villaFees.add(750000);

        beachRecommendations.add("Pantai Derawan - Kalimantan Timur");
        beachContact.add("Pak Andre . 082271876543");
        campingFees.add(300000);
        villaFees.add(850000);

        beachRecommendations.add("Pantai Karimunjawa - Jawa Tengah");
        beachContact.add("Pak Andre . 082271876543");
        campingFees.add(120000);
        villaFees.add(600000);

        beachRecommendations.add("Pantai Losari - Makassar");
        beachContact.add("Pak Andre . 082271876543");
        campingFees.add(400000);
        villaFees.add(800000);

        beachRecommendations.add("Pantai Pandawa - Bali");
        beachContact.add("Pak Andre . 082271876543");
        campingFees.add(300000);
        villaFees.add(900000);


        beachRecommendations.add("Pantai Gili Trawangan - Lombok");
        beachContact.add("Pak Andre . 082271876543");
        campingFees.add(450000);
        villaFees.add(990000);

        beachRecommendations.add("Pantai Tanjung Bira - Sulawesi Selatan");
        beachContact.add("Pak Andre . 082271876543");
        campingFees.add(400000);
        villaFees.add(8800000);

        beachRecommendations.add("Pantai Senggigi - Lombok");
        beachContact.add("Pak Andre . 082271876543");
        campingFees.add(300000);
        villaFees.add(7900000);

        beachRecommendations.add("Pantai Sawarna - Banten");
        beachContact.add("Pak Andre . 082271876543");
        campingFees.add(250000);
        villaFees.add(550000);

        beachRecommendations.add("Pantai Batu Karas - Jawa Barat");
        beachContact.add("Pak Andre . 082271876543");
        campingFees.add(140000);
        villaFees.add(500000);
    }

    public String getRecommendation(int index) {
        return beachRecommendations.get(index);
    }

    public String getContact(int index) {
        return beachContact.get(index);
    }

    public int getCampingFee(int index) {
        return campingFees.get(index);
    }

    public int getVillaFee(int index) {
        return villaFees.get(index);
    }

    @Override
    public void planTrip() {
        System.out.println("Planning a beach trip:");
        System.out.println("Duration: " + getDuration() + " days");
        System.out.println("Choose from 15 recommended beaches in Indonesia:");
        for (int i = 0; i < beachRecommendations.size(); i++) {
            System.out.println((i + 1) + ". " + beachRecommendations.get(i));
        }
    }
}
