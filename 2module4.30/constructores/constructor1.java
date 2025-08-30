class Dog
{
     int cost;
     String name;
     String color;

    Dog(int cost, String name,String color)
    {
        this.cost=cost;
        this.name=name;
        this.color=color;
    }
    // public void setCost(int cost){
    //     this.cost=cost;
    // }
    // public int getCost(){
    //     return cost;
    // }
    //  public void setcost(String name){
    //     this.name=name;
    // }
    // public String getName(){
    //     return name;
    // }
    // public void setColor(String color){
    //     this.color=color;
    // }
    // public String getColor(){
    //     return color;
    // }

}
public class constructor1 {
    public static void main(String[] args) {
        Dog d1=new Dog(4,"sheruji", "white");
        System.out.println(d1.cost);
         System.out.println(d1.name);
         System.out.println(d1.color);

       // Dog d2=new Dog();


    }
}
