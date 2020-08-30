package poly;

public class product implements DAO {
//khai báo các thuộc tínhh

    private String name;
    private double price;
    //hàm tạo

    public product() {
    }

    public product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    //set get

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "product{" + "name=" + name + ", price=" + price + '}';
    }

    public double getImportTax() {
        return 0.1 * price;
//    
//ví dụ như tính điểm trung bình của sinh viên

//    public String gethocluc() {
//        String xaploai = "";
//        if (getDiemTB() < 5) {
//            xaploai = "yeu";
//        } else if  {
//            xaploai = "gioi";
//        } else if  {
//            xaploai = "gioi";
//        } else {
//            xaploai = "dangcap";
//        }
//        return xaploai;
    }

    @Override
    public void insert() {
        System.out.println("hello các con vợ");
    }

    @Override
    public void update() {
        System.out.println("hello các thằng chồng");
    }

    @Override
    public void delete() {
        System.out.println("tao sẽ xõa các con vợ");
    }

    @Override
    public void select() {
        System.out.println("select success!");
    }

    public void phuongthuc() {
    }
}
