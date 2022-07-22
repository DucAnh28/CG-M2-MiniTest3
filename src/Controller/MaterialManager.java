package Controller;

import Model.CrispyFlour;
import Model.Material;
import Model.Meat;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class MaterialManager {
    public static List<Material> list = new LinkedList<>();

    static {
        Meat meat1 = new Meat("M1", "Steek", "2022-07-18", 80, 40);
        Meat meat2 = new Meat("M2", "Chicken", "2022-07-19", 50, 80);
        Meat meat3 = new Meat("M3", "Pork", "2022-07-20", 5, 2);
        CrispyFlour crispyFlour1 = new CrispyFlour("CF1", "BotGiat", "2022-02-19", 20, 2);
        CrispyFlour crispyFlour2 = new CrispyFlour("CF2", "BotMy", "2022-03-19", 20, 1);
        CrispyFlour crispyFlour3 = new CrispyFlour("CF3", "BotMem", "2022-04-19", 20, 3);
        list.add(meat1);
        list.add(meat2);
        list.add(meat3);
        list.add(crispyFlour1);
        list.add(crispyFlour2);
        list.add(crispyFlour3);
    }

    //   Hiển thị sản phẩm:
    public void displayMaterial() {
        int stt = 1;
        for (Material x : list
        ) {
            if (x instanceof Meat) {
                System.out.println(stt + ". " + x.toString());
                stt++;
            } else if (x instanceof CrispyFlour) {
                System.out.println(stt + ". " + x.toString());
                stt++;
            }
        }
    }


    //   Thêm sản phẩm:
    public void addMaterial(Material material) {
        list.add(material);
    }

    //   Xóa sản phẩm:
    public void removeMaterial(Material material) {
        list.remove(material);
    }

    //    Tính discount
    public void exchangeRateDifference() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Meat){
                System.out.println("Product :" + list.get(i).getName()+" Giá gốc: " +list.get(i).getAmount() +" Giá chiết khấu: " + ((Meat) list.get(i)).getRealMoney());
            }
            else if (list.get(i) instanceof CrispyFlour){
                System.out.println("Product :" + list.get(i).getName()+" Giá gốc: " +list.get(i).getAmount() +" Giá chiết khấu: " + ((CrispyFlour) list.get(i)).getRealMoney());
            }
        }
    }
}