import java.util.*;
class animal{
    String name;
    double height;
    int weight;
    int speed;

    void show(){
        System.out.println("姓名: " + name);
        System.out.println("身高(公尺): " + height);
        System.out.println("體重(公斤): " + weight);
        System.out.println("速度(公尺/分鐘): " + speed);
        System.out.println();
    }

    double distance (int x, double y){
        return x * y * this.speed;
    }
    int distance (int x){
        return x * speed;
    }
}

public class A1113315_0324_1 {
    public static void main(String[] argv) {
        
        animal [] animals = new animal [4];
        for (int i = 0 ; i < animals.length ; i++){
            animals [i] = new animal();
        }

        animals[0].name = "雪寶";
        animals[0].height = 1.1;
        animals[0].weight = 52;
        animals[0].speed = 100;
        animals[0].show();

        animals[1].name = "驢子";
        animals[1].height = 1.5;
        animals[1].weight = 99;
        animals[1].speed = 200;
        animals[1].show();

        animals[2].name = "安那";
        animals[2].height = 1.7;
        animals[2].weight = 48;
        animals[2].speed = 120;
        animals[2].show();

        animals[3].name = "愛沙";
        animals[3].height = 1.7;
        animals[3].weight = 50;
        animals[3].speed = 120;
        animals[3].show();

        //雪寶
        System.out.println("請輸入雪寶奔跑的時間(分鐘)及加速度(若無則輸入0)");
        Scanner sc1 = new Scanner (System.in);
        int x1 = sc1.nextInt();
        double y1 = sc1.nextDouble();
        
        if(y1 == 0.0){
            System.out.println("雪寶奔跑的距離為 " + animals[0].distance(x1));
        }
        else{
            System.out.println("雪寶奔跑的距離為 " + animals[0].distance(x1,y1));
        }
        
        //驢子
        System.out.println("請輸入驢子奔跑的時間(分鐘)及加速度(若無則輸入0)");
        Scanner sc2 = new Scanner (System.in);
        int x2 = sc2.nextInt();
        double y2 = sc2.nextDouble();
        
        if(y2 == 0.0){
            System.out.println("驢子奔跑的距離為 " + animals[1].distance(x2));
        }
        else{
            System.out.println("驢子奔跑的距離為 " + animals[1].distance(x2,y2));
        }

        //安那
        System.out.println("請輸入安那奔跑的時間(分鐘)及加速度(若無則輸入0)");
        Scanner sc3 = new Scanner (System.in);
        int x3 = sc3.nextInt();
        double y3 = sc3.nextDouble();
        
        if(y3 == 0.0){
            System.out.println("安那奔跑的距離為 " + animals[2].distance(x3));
        }
        else{
            System.out.println("安那奔跑的距離為 " + animals[2].distance(x3,y3));
        }

        //愛沙
        System.out.println("請輸入愛沙奔跑的時間(分鐘)及加速度(若無則輸入0)");
        Scanner sc4 = new Scanner (System.in);
        int x4 = sc4.nextInt();
        double y4 = sc4.nextDouble();
        
        if(y4 == 0.0){
            System.out.println("愛沙奔跑的距離為 " + animals[3].distance(x4));
        }
        else{
            System.out.println("愛沙奔跑的距離為 " + animals[3].distance(x4,y4));
        }
    }
}
