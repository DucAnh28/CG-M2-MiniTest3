package Controller;

import Model.Material;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaterialManager {
    public static List<Material> list = new ArrayList<>();

    //   thêm sản phẩm:
    public void addMaterial(Material material) {
        list.add(material);
    }

    //   xóa sản phẩm:
    private void removeMaterial(Material material) {
        list.remove(material);
    }

    //   sửa sản phẩm theo tên:
    public void editMaterial(String id) {
        boolean isExisted = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                isExisted = true;

            }
        }
    }
}
