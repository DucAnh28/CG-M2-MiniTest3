## Thực hành về interface and abstract class
### Abstract Material:
- Thuộc tính: String id, String name, LocalDate manufacturingDate, int cost
- Method : Getter/Setter, Constructor, abstract double getAmount, abstract LocalDate get Expiry Date
### Crispyflour extends Material:
- Thuộc tính: kế thừa của lớp material và thêm int quantity.
- Method : double getAmount = quantity * cost và LocalDate = manufacturingDate + 1 năm
### Meat extends Material:
- Thuộc tính: Kế thừa của lớp material và thêm double weight.
- Method : double getAmount = cost * weight và LocalDate getExpiryDate = manufacturingDate + 7 ngày
### Interface Discount:
- abstract getRealMoney() 
### Material Manager: 
- Tính năng: Add, edit, remove Material
- getRealMoney():
+ Meat: Nếu thịt còn 5 ngày hết hạn thì giảm 30%, còn lại thì giảm 10%.
+ CrispyFlour: Nếu bột còn 2 tháng hết hạn thì giảm 40%, bột còn 4 tháng hết hạn thì giảm 20%, còn lại thì giảm 5%.
=> Tính số chênh lệch giữa chiết khấu và không chiết khấu tại ngày hôm nay


### Link
https://docs.google.com/document/d/15PVJfUJN2PSpifrwEcJQGLC9rxtmeIKFiDxmPgG0BOc/edit