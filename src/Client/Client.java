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
        MaterialManager ducanh = new MaterialManager();
        ducanh.displayMaterial();
//        ducanh.addMaterial(addMeat());
//        ducanh.addMaterial(addCrispyFlour());
//        ducanh.displayMaterial();
//        ducanh.editMeat(checkID(),editMeat());
//        ducanh.editMeat(checkID(),editCrispyFlour());
//        ducanh.displayMaterial();
    }

    public static int checkID(){
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

    public static void editMaterial(){
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
        }
        else if (temp instanceof CrispyFlour){
            System.out.print("Enter quantity: ");
            ((CrispyFlour) temp).setQuantity(scanner.nextInt());
        }
        list.set(cham,temp);
    }
}
