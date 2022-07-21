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

    public static void main(String[] args) {

    }

    public static Material addMeat() {
        Meat meat = new Meat();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter ID: ");
        meat.setId(scanner.nextLine());
        System.out.print("Enter Name: ");
        meat.setName(scanner1.nextLine());
        System.out.print("Enter Manufactureing Year: ");
        int year = scanner1.nextInt();
        System.out.print("Enter Manufactureing Month: ");
        int month = scanner1.nextInt();
        System.out.print("Enter Manufactureing Date: ");
        int date = scanner1.nextInt();
        LocalDate dateOfMetarial = LocalDate.of(year, month, date);
        meat.setManufacturingDate(dateOfMetarial);
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
        crispyFlour.setName(scanner1.nextLine());
        System.out.print("Enter Manufactureing Year: ");
        int year = scanner1.nextInt();
        System.out.print("Enter Manufactureing Month: ");
        int month = scanner1.nextInt();
        System.out.print("Enter Manufactureing Date: ");
        int date = scanner1.nextInt();
        LocalDate dateOfMetarial = LocalDate.of(year, month, date);
        crispyFlour.setManufacturingDate(dateOfMetarial);
        System.out.print("Enter Cost: ");
        crispyFlour.setCost(scanner1.nextInt());
        System.out.print("Enter quantity ");
        crispyFlour.setQuantity(scanner1.nextInt());
        return crispyFlour;
    }
}
