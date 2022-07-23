package Client;

import Controller.MaterialManager;
import Model.CrispyFlour;
import Model.Material;
import Model.Meat;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static List<Material> list = MaterialManager.list;
    public static MaterialManager ducanh = new MaterialManager();

    public static void main(String[] args) {
        choice();
    }

    public static int checkID() {
        int temp = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID: ");
        String id = input.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) temp = i;
        }
        return temp;
    }

    public static Material addMeat() {
        Meat meat = new Meat();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter ID: ");
        meat.setId(scanner.nextLine());
        System.out.print("Enter Name: ");
        meat.setName(scanner.nextLine());
        System.out.print("Enter Date of munafacturing (yyyy-mm-dd): ");
        String dateOfMetarial = scanner.nextLine();
        meat.setManufacturingDate(LocalDate.parse(dateOfMetarial));
        System.out.print("Enter Cost: ");
        meat.setCost(scanner1.nextInt());
        System.out.print("Enter weight: ");
        meat.setWeight(scanner1.nextDouble());
        return meat;
    }

    public static Material addCrispyFlour() {
        CrispyFlour crispyFlour = new CrispyFlour();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter ID: ");
        crispyFlour.setId(scanner.nextLine());
        System.out.print("Enter Name: ");
        crispyFlour.setName(scanner.nextLine());
        System.out.print("Enter Date of munafacturing (yyyy-mm-dd): ");
        String dateOfMetarial = scanner.nextLine();
        crispyFlour.setManufacturingDate(LocalDate.parse(dateOfMetarial));
        System.out.print("Enter Cost: ");
        crispyFlour.setCost(scanner1.nextInt());
        System.out.print("Enter quantity ");
        crispyFlour.setQuantity(scanner1.nextInt());
        return crispyFlour;
    }

    public static void editMaterial() {
        int cham = checkID();
        Material temp = list.get(cham);
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter Name: ");
        temp.setName(scanner1.nextLine());
        System.out.print("Enter Date of munafacturing (yyyy-mm-dd): ");
        String dateOfMetarial = scanner1.nextLine();
        temp.setManufacturingDate(LocalDate.parse(dateOfMetarial));
        System.out.print("Enter Cost: ");
        temp.setCost(scanner.nextInt());
        if (temp instanceof Meat) {
            System.out.print("Enter weight: ");
            ((Meat) temp).setWeight(scanner.nextDouble());
        } else if (temp instanceof CrispyFlour) {
            System.out.print("Enter quantity: ");
            ((CrispyFlour) temp).setQuantity(scanner.nextInt());
        }
        list.set(cham, temp);
    }

    public static void choice() {
        Scanner scanner = new Scanner(System.in);
        int choice = -8;
        while (choice != 0) {
            System.out.println("-----------------------------------------");
            System.out.println("Menu");
            System.out.println("1. Display Material");
            System.out.println("2. Add Material");
            System.out.println("3. Edit Material By ID");
            System.out.println("4. Delete Material");
            System.out.println("5. Total Price ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println("------------------------------------------");
            switch (choice) {
                case 1:
                    ducanh.displayMaterial();
                    break;
                case 2:
                    System.out.println("Add Meat");
                    System.out.println("Add CrispyFlour");
                    int option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            ducanh.addMaterial(addMeat());
                            break;
                        case 2:
                            ducanh.addMaterial(addCrispyFlour());
                            break;
                        default:
                            System.out.println("Not Avaliale");
                    }
                    break;
                case 3:
                    editMaterial();
                    break;
                case 4:
                    ducanh.removeMaterial(checkID());
                    break;
                case 5:
                    ducanh.exchangeRateDifference();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice");
                    break;
            }
        }
    }
}
