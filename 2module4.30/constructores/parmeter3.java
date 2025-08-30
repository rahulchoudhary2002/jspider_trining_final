class Product
{
    int pid;
    double price;
    double rating;
    Product(int pid ,double price, double rating){
        this.pid=pid;
        this.price=price;
        this.rating=rating;
    }
}

public class parmeter3 {
    public static void main(String[] args) {
        Product p= new Product(2243,35.33,4.3);
        System.out.println("Pid "+p.pid);
        System.out.println("Price "+p.price);
        System.out.println("Rating "+p.rating);
    }
}
