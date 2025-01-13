import java.io.*;
import java.util.Scanner;

public class TravelApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (!authenticate(scanner)) {
            System.out.println("\nGagal login atau mendaftar. Silakan coba lagi.\n");
        }

        System.out.println("\nWelcome to Planning a Holiday App\n");

        System.out.print("Masukkan liburan yang disukai (pantai, gunung, kota): ");
        String tripType = scanner.nextLine().toLowerCase();

        System.out.print("Masukkan lama liburan anda (hari): ");
        int duration = scanner.nextInt();

        System.out.print("Masukkan jumlah orang yang akan ikut: ");
        int numPeople = scanner.nextInt();
        scanner.nextLine();

        TravelPlanner planner;

        switch (tripType) {
            case "pantai":
                planner = new BeachTrip(duration);
                planner.planTrip();

                System.out.print("\nPilih pantai berdasarkan nomor (1-15): ");
                int choicep = scanner.nextInt();
                scanner.nextLine();

                BeachTrip beachTrip = (BeachTrip) planner;

                if (choicep > 0 && choicep <= 15) {
                    int index = choicep - 1;
                    System.out.println("Anda memilih: " + beachTrip.getRecommendation(index));

                    System.out.print("\nPilih aktivitas (camping/vila): ");
                    String activity = scanner.nextLine().toLowerCase();

                    if (activity.equals("camping")) {
                        int totalCost = numPeople * duration * beachTrip.getCampingFee(index);
                        System.out.println("Biaya Camping per orang per hari: Rp " + beachTrip.getCampingFee(index));
                        System.out.println("Include peralatan masak dan bahan makanan per hari");
                        System.out.println("Total Biaya untuk " + numPeople + " orang selama " + duration + " hari: Rp " + totalCost);
                        System.out.println("Contact Person : "+ beachTrip.getContact(index));

                    } else if (activity.equals("vila")) {
                        int totalCost = numPeople * duration * beachTrip.getVillaFee(index);
                        System.out.println("Biaya Vila per orang per hari: Rp " + beachTrip.getVillaFee(index));
                        System.out.println("Include catering sehari 2 kali");
                        System.out.println("Total Biaya untuk " + numPeople + " orang selama " + duration + " hari: Rp " + totalCost);
                        System.out.println("Contact Person : "+ beachTrip.getContact(index));

                    } else {
                        System.out.println("Aktivitas tidak valid.");
                    }
                } else {
                    System.out.println("Pilihan tidak valid. Tidak ada pantai yang dipilih.");
                }
                return;

            case "gunung":
                planner = new MountainTrip(duration);
                planner.planTrip();

                System.out.print("\nPilih gunung berdasarkan nomor (1-10): ");
                int choiceg = scanner.nextInt();
                scanner.nextLine();

                MountainTrip mountainTrip = (MountainTrip) planner;

                if (choiceg > 0 && choiceg <= 10) {
                    int index = choiceg - 1;
                    System.out.println("Anda memilih: " + mountainTrip.getRecommendation(index));
                    System.out.println("Biaya Registrasi per orang per hari: Rp " + mountainTrip.getRegistrationFee(index));
                    System.out.println("Biaya Hiking per orang per hari: Rp " + mountainTrip.getHikingRentalFee(index));
                    System.out.println("Biaya Camping per orang per hari: Rp " + mountainTrip.getCampingRentalFee(index));

                    System.out.print("\nPilih aktivitas (hiking/camping): ");
                    String activity = scanner.nextLine().toLowerCase();

                    if (activity.equals("hiking")) {
                        System.out.print("Apakah Anda akan menyewa alat hiking? (ya/tidak): ");
                        String rentEquipment = scanner.nextLine().toLowerCase();

                        int totalCost = numPeople * duration * mountainTrip.getRegistrationFee(index);
                        if (rentEquipment.equals("ya")) {
                            totalCost += numPeople * duration * mountainTrip.getHikingRentalFee(index);
                            System.out.println("Rincian alat sewa Hiking:");
                            for (String item : mountainTrip.getHikingEquipment()) {
                                System.out.println("- " + item);
                            }
                        }
                        System.out.println("Total Biaya untuk " + numPeople + " orang selama " + duration + " hari: Rp " + totalCost);
                        System.out.println("Contact Person : "+mountainTrip.getContactPerson(index));

                    } else if (activity.equals("camping")) {
                        int totalCost = numPeople * duration * (mountainTrip.getRegistrationFee(index) + mountainTrip.getCampingRentalFee(index));
                        System.out.println("Rincian alat sewa Camping:");
                        for (String item : mountainTrip.getCampingEquipment()) {
                            System.out.println("- " + item);
                        }
                        System.out.println("Total Biaya untuk " + numPeople + " orang selama " + duration + " hari: Rp " + totalCost);
                        System.out.println("Contact Person : "+mountainTrip.getContactPerson(index));
                    } else {
                        System.out.println("Aktivitas tidak valid.");
                    }
                } else {
                    System.out.println("Pilihan tidak valid. Tidak ada gunung yang dipilih.");
                }
                return;

            case "kota":
                planner = new CityTrip(duration);
                planner.planTrip();

                System.out.print("\nPilih kota berdasarkan nomor (1-20): ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                CityTrip cityTrip = (CityTrip) planner;

                if (choice > 0 && choice <= 20) {
                    int index = choice - 1;
                    System.out.println("Anda memilih: " + cityTrip.getRecommendation(index));
                    System.out.println("Biaya Hotel per orang per hari: Rp " + cityTrip.getHotelFee(index));
                    System.out.println("Biaya Transportasi Jalan-jalan per orang per hari: Rp " + cityTrip.getTransportationFee(index));
                    System.out.println("Include makan sehari 2 kali");

                    int totalCost = numPeople * duration * (cityTrip.getHotelFee(index) + cityTrip.getTransportationFee(index));
                    System.out.println("Total Biaya untuk " + numPeople + " orang selama " + duration + " hari: Rp " + totalCost);
                    System.out.println("Contact Person : "+cityTrip.getContact(index));
                } else {
                    System.out.println("Pilihan tidak valid. Tidak ada kota yang dipilih.");
                }
                return;

            default:
                System.out.println("Tipe perjalanan tidak dikenali.");
        }

        scanner.close();
    }

    private static boolean authenticate(Scanner scanner) {
        File userFile = new File("users.txt");

        try {
            if (!userFile.exists()) {
                userFile.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membuat file pengguna.");
            return false;
        }

        System.out.println("Selamat datang!\n1. Login\n2. Daftar");
        System.out.print("Pilih opsi: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        if (choice == 1) {
            return login(scanner, userFile);
        } else if (choice == 2) {
            return register(scanner, userFile);
        } else {
            System.out.println("Pilihan tidak valid.");
            return false;
        }
    }

    private static boolean login(Scanner scanner, File userFile) {
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(userFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] credentials = line.split(",");
                if (credentials[0].equals(username) && credentials[1].equals(password)) {
                    System.out.println("Login berhasil!\n");
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file pengguna.");
        }

        System.out.println("Username atau password salah.");
        return false;
    }

    private static boolean register(Scanner scanner, File userFile) {
        System.out.print("Masukkan username baru: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password baru: ");
        String password = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(userFile, true))) {
            writer.write(username + "," + password);
            writer.newLine();
            System.out.println("Pendaftaran berhasil! Silakan login.");
            return true;
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan data pengguna.");
            return false;
        }
    }
}



// Classes BeachTrip, MountainTrip, and CityTrip remain as they are but inherit from the abstract class TravelPlanner.
