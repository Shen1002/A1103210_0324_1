import java.util.*;

class animal{
    String name;
    double height;
    int weight, speed;
    void show(){
        System.out.println("name:" + this.name + " height:" + this.height +" weight:" + this.weight + " speed:" + this.speed);
    }

    double distance(int x,double y){
        double distance;
        distance = x * y * this.speed;
        return distance;
    }
    
    int distance(int x){
        int distance;
        distance = x * this.speed;
        return distance;
    }
}



public class A1103210_0324_1 {
    public static void main(String[] args) {
        
        animal A, B, C, D;
        A = new animal();
        B = new animal();
        C = new animal();
        D = new animal();
        
        A.name = "雪寶";
        A.height = 1.1;
        A.weight = 52;
        A.speed = 100;
        A.show();
        System.out.println("請輸入x,y:");
        Scanner myInput = new Scanner(System.in);
        int Ax = myInput.nextInt();
        Double Ay = myInput.nextDouble();
        System.out.println("distance :" + A.distance(Ax, Ay));

        B.name = "驢子";
        B.height = 1.5;
        B.weight = 99;
        B.speed = 200;
        B.show();
        System.out.println("請輸入x,y:");
        int Bx = myInput.nextInt();
        Double By = myInput.nextDouble();
        System.out.println("distance :" + B.distance(Bx, By));

        C.name = "安那";
        C.height = 1.7;
        C.weight = 48;
        C.speed = 120;
        C.show();
        System.out.println("請輸入x:");
        int Cx = myInput.nextInt();
        System.out.println("distance :" + C.distance(Cx));

        D.name = "愛沙";
        D.height = 1.7;
        D.weight = 50;
        D.speed = 120;
        D.show();
        System.out.println("請輸入x:");
        int Dx = myInput.nextInt();
        myInput.close();
        System.out.println("distance :" + D.distance(Dx));
    }
}
    
