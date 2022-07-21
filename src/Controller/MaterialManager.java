package Controller;

import Model.CrispyFlour;
import Model.Material;
import Model.Meat;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MaterialManager {
    public static List<Material> list = new LinkedList<>();
    static {
        Meat meat1 = new Meat("M1","Steek", LocalDate.of(2022,7,17),80,40);
        Meat meat2 = new Meat("M2","Chicken", LocalDate.of(2022,7,18),50,80);
        Meat meat3 = new Meat("M3","Pork", LocalDate.of(2022,7,19),5,2);
        CrispyFlour crispyFlour1 = new CrispyFlour("CF1","Steek", LocalDate.of(2022,2,19),20,2);
        CrispyFlour crispyFlour2 = new CrispyFlour("CF1","Steek", LocalDate.of(2022,3,19),20,1);
        CrispyFlour crispyFlour3 = new CrispyFlour("CF1","Steek", LocalDate.of(2022,4,19),20,3);
        list.add(meat1);
        list.add(meat2);
        list.add(meat3);
        list.add(crispyFlour1);
        list.add(crispyFlour2);
        list.add(crispyFlour3);
    }

    //   thêm sản phẩm:
    public void addMaterial(Material material) {
        list.add(material);
    }

    //   xóa sản phẩm:
    private void removeMaterial(Material material) {
        list.remove(material);
    }

    //   sửa sản phẩm theo tên:
    public void editMeat(String id,Material edit) {
        Scanner scanner = new Scanner(System.in);
        boolean isExisted = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id && list.get(i) instanceof Meat) {
                isExisted = true;
                list.set(i,edit);
            }
        }
    }
}
