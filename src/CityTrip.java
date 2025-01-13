import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityTrip extends TravelPlanner {
    private List<String> cityRecommendations;
    private List<Integer> hotelFees;
    private List<Integer> transportationFees;
    private List<String> contact;

    public CityTrip(int duration) {
        super("Kota", duration);
        this.cityRecommendations = new ArrayList<>();
        this.hotelFees = new ArrayList<>();
        this.transportationFees = new ArrayList<>();
        this.contact = new ArrayList<>();
        populateRecommendations();
    }

    private void populateRecommendations() {
        cityRecommendations.add("Jakarta");
        contact.add("Pak Jono . 082345635534");
        hotelFees.add(900000);
        transportationFees.add(450000);

        cityRecommendations.add("Yogyakarta");
        contact.add("Pak Jono . 082345635534");
        hotelFees.add(500000);
        transportationFees.add(200000);

        cityRecommendations.add("Surabaya");
        contact.add("Pak Jono . 082345635534");
        hotelFees.add(400000);
        transportationFees.add(120000);

        cityRecommendations.add("Bandung");
        contact.add("Pak Jono . 082345635534");
        hotelFees.add(350000);
        transportationFees.add(110000);

        cityRecommendations.add("Bali - Denpasar");
        contact.add("Pak Jono . 082345635534");
        hotelFees.add(600000);
        transportationFees.add(200000);


        cityRecommendations.add("Malang");
        contact.add("Pak Jono . 082345635534");
        hotelFees.add(400000);
        transportationFees.add(250000);

        cityRecommendations.add("Semarang");
        contact.add("Pak Jono . 082345635534");
        hotelFees.add(300000);
        transportationFees.add(1800000);

        cityRecommendations.add("Makassar");
        contact.add("Pak Jono . 082345635534");
        hotelFees.add(680000);
        transportationFees.add(300000);

        cityRecommendations.add("Medan");
        contact.add("Pak Jono . 082345635534");
        hotelFees.add(4500000);
        transportationFees.add(270000);

        cityRecommendations.add("Balikpapan");
        contact.add("Pak Jono . 082345635534");
        hotelFees.add(500000);
        transportationFees.add(300000);

        cityRecommendations.add("Manado");
        contact.add("Pak Jono . 082345635534");
        hotelFees.add(700000);
        transportationFees.add(400000);

        cityRecommendations.add("Pekanbaru");
        contact.add("Pak Jono . 082345635534");
        hotelFees.add(550000);
        transportationFees.add(270000);

        cityRecommendations.add("Palembang");
        contact.add("Pak Jono . 082345635534");
        hotelFees.add(400000);
        transportationFees.add(270000);

        cityRecommendations.add("Solo (Surakarta)");
        contact.add("Pak Jono . 082345635534");
        hotelFees.add(390000);
        transportationFees.add(200000);

        cityRecommendations.add("Bogor");
        contact.add("Pak Jono . 082345635534");
        hotelFees.add(550000);
        transportationFees.add(250000);

        cityRecommendations.add("Padang");
        contact.add("Pak Jono . 082345635534");
        hotelFees.add(500000);
        transportationFees.add(300000);

        cityRecommendations.add("Kupang");
        contact.add("Pak Jono . 082345635534");
        hotelFees.add(500000);
        transportationFees.add(260000);

        cityRecommendations.add("Jayapura");
        contact.add("Pak Jono . 082345635534");
        hotelFees.add(800000);
        transportationFees.add(400000);

        cityRecommendations.add("Banjarmasin");
        contact.add("Pak Jono . 082345635534");
        hotelFees.add(550000);
        transportationFees.add(260000);

        cityRecommendations.add("Mataram");
        contact.add("Pak Jono . 082345635534");
        hotelFees.add(680000);
        transportationFees.add(3800000);
    }

    public String getRecommendation(int index) {
        return cityRecommendations.get(index);
    }

    public String getContact(int index) {
        return contact.get(index);
    }

    public int getHotelFee(int index) {
        return hotelFees.get(index);
    }

    public int getTransportationFee(int index) {
        return transportationFees.get(index);
    }

    @Override
    public void planTrip() {
        System.out.println("Planning a city trip:");
        System.out.println("Duration: " + getDuration() + " days");
        System.out.println("Choose from 20 recommended cities in Indonesia:");
        for (int i = 0; i < cityRecommendations.size(); i++) {
            System.out.println((i + 1) + ". " + cityRecommendations.get(i));
        }
    }
}




