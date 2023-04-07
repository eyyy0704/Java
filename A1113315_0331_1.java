import java.util.*;

//(1) 雪寶、驢子
class animal{
    //A
    String name;
    double height;
    int weight;
    int speed;

    //B
    animal(String n,double h,int w,int s){
        this.name = n;
        this.height = h;
        this.weight = w;
        this.speed = s;
    }

    //C
    void show(){ //顯示屬性
        System.out.println("姓名: " + name);
        System.out.println("身高(公尺): " + height);
        System.out.println("體重(公斤): " + weight);
        System.out.println("速度(公尺/分鐘): " + speed + "\n");
    }

    //D 計算跑步距離 x為時間 y為加速度
    double distance (int x, double y){
        return x * y * this.speed;
    }
    //E
    int distance (int x){
        return x * speed;
    }

    //F
    static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}

//(2) 阿克、漢斯、安那
class human extends animal{
    //A
    String gender;

    //B
    human(String n,double h, int w, int s, String g){
        super(n,h,w,s);
        this.gender = g;
    }

    //C
    void show(){ //顯示屬性
        System.out.println("姓名: " + name);
        System.out.println("身高(公尺): " + height);
        System.out.println("體重(公斤): " + weight);
        System.out.println("速度(公尺/分鐘): " + speed);
        System.out.println("性別: " + gender + "\n");
    }
}

//(3) 愛沙
class snow extends human{
    //A
    String skill;

    //B
    snow(String n, double h,int w,int s,String g,String sk){
        super(n,h,w,s,g);
        this.skill = sk;
    }

    //C
    void show(){ //顯示屬性
        System.out.println("姓名: " + name);
        System.out.println("身高(公尺): " + height);
        System.out.println("體重(公斤): " + weight);
        System.out.println("速度(公尺/分鐘): " + speed);
        System.out.println("性別: " + gender);
        System.out.println("冰凍技能屬性值: " + skill + "\n");
    }

    //D
    double distance (int x, double y){
        return x * y * this.speed * 2;
    }
    int distance (int x){
        return x * speed * 2;
    }
}

//(04)
public class A1113315_0331_1 {
    public static void main(String[] argv){
        //A
        animal.showinfo();

        //B
        animal animal1 = new animal("雪寶",1.1,52,100);
        animal animal2 = new animal("驢子",1.5,99,200);
        human human1 = new human("阿克",1.9,80,150,"男");
        human human2 = new human("漢斯",1.8,78,130,"男");
        human human3 = new human("安那",1.7,48,120,"女");
        snow snow1 = new snow("愛沙",1.7,50,120,"女","Yes");

        //C
        animal1.show();
        animal2.show();
        human1.show();
        human2.show();
        human3.show();
        snow1.show();

        //D

        //雪寶
        System.out.println("請輸入雪寶奔跑的時間(分鐘)及加速度(若無則輸入0)");
        Scanner sc1 = new Scanner (System.in);
        int x1 = sc1.nextInt();
        double y1 = sc1.nextDouble();
        
        if(y1 == 0.0){
            System.out.println("雪寶奔跑的距離為 " + animal1.distance(x1) + "公尺");
        }
        else{
            System.out.println("雪寶奔跑的距離為 " + animal1.distance(x1,y1) + "公尺");
        }
        
        //驢子
        System.out.println("請輸入驢子奔跑的時間(分鐘)及加速度(若無則輸入0)");
        Scanner sc2 = new Scanner (System.in);
        int x2 = sc2.nextInt();
        double y2 = sc2.nextDouble();
        
        if(y2 == 0.0){
            System.out.println("驢子奔跑的距離為 " + animal2.distance(x2) + "公尺");
        }
        else{
            System.out.println("驢子奔跑的距離為 " + animal2.distance(x2,y2) + "公尺");
        }

        //阿克
        System.out.println("請輸入阿克奔跑的時間(分鐘)及加速度(若無則輸入0)");
        Scanner sc3 = new Scanner (System.in);
        int x3 = sc3.nextInt();
        double y3 = sc3.nextDouble();
        
        if(y3 == 0.0){
            System.out.println("阿克奔跑的距離為 " + human3.distance(x3) + "公尺");
        }
        else{
            System.out.println("阿克奔跑的距離為 " + human3.distance(x3,y3) + "公尺");
        }

        //漢斯
        System.out.println("請輸入漢斯奔跑的時間(分鐘)及加速度(若無則輸入0)");
        Scanner sc4 = new Scanner (System.in);
        int x4 = sc4.nextInt();
        double y4 = sc4.nextDouble();
        
        if(y4 == 0.0){
            System.out.println("漢斯奔跑的距離為 " + human3.distance(x4) + "公尺");
        }
        else{
            System.out.println("漢斯奔跑的距離為 " + human3.distance(x4,y4) + "公尺");
        }

        //安那
        System.out.println("請輸入安那奔跑的時間(分鐘)及加速度(若無則輸入0)");
        Scanner sc5 = new Scanner (System.in);
        int x5 = sc5.nextInt();
        double y5 = sc5.nextDouble();
        
        if(y5 == 0.0){
            System.out.println("安那奔跑的距離為 " + human3.distance(x5) + "公尺");
        }
        else{
            System.out.println("安那奔跑的距離為 " + human3.distance(x5,y5) + "公尺");
        }

        //愛沙
        System.out.println("請輸入愛沙奔跑的時間(分鐘)及加速度(若無則輸入0)");
        Scanner sc6 = new Scanner (System.in);
        int x6 = sc6.nextInt();
        double y6 = sc6.nextDouble();
        
        if(y6 == 0.0){
            System.out.println("愛沙奔跑的距離為 " + snow1.distance(x6) + "公尺");
        }
        else{
            System.out.println("愛沙奔跑的距離為 " + snow1.distance(x6,y6) + "公尺");
        }
    }
}
