package Client;

import Controller.MaterialManager;
import Model.Material;
import Model.Meat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static List<Material> list = MaterialManager.list;
    public static void main(String[] args) {

    }

    public static Material addMeat(){
        Meat meat = new Meat();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter ID: ");
        meat.setId(scanner.nextLine());
        System.out.print("Enter Name: ");
        meat.setName(scanner1.nextLine());
        System.out.print("Enter Manufactureing Date: ");
        meat.setManufacturingDate(scanner1.ne);

    }
}
