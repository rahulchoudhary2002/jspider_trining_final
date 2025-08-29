class Delta
{
    int num;
    void play(){
        System.out.println("executing play()...");
    }
    Delta(){
        System.out.println("Delta() constructor ");
    }
}

public class Mainclass3 {
    public static void main(String[] args) {
        Delta ref = new Delta();
        System.out.println(ref.num);
        ref.play();                                               
    }
}
