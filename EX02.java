class Cbbb {
    double x;
    double y;
}

public class test2
 {
    public static void main(String[] args) {
        // (a) 建立Cbbb類別型態的物件 obj1、obj2 與 avg。
        Cbbb obj1 = new Cbbb();
        Cbbb obj2 = new Cbbb();
        Cbbb avg = new Cbbb();
        
        // (b) 設定obj1的資料成員x的值為5.2，y的值為3.9。
        obj1.x = 5.2;
        obj1.y = 3.9;
        
        // (c) 設定obj2的資料成員x的值為6.5，y的值為4.6。
        obj2.x = 6.5;
        obj2.y = 4.6;
        
        // (d) 計算obj1和obj2的x值平均後，指定給avg的x存放。
        avg.x = (obj1.x + obj2.x) / 2;
        
        // (e) 計算obj1和obj2的y值平均後，指定給avg的y存放。
        avg.y = (obj1.y + obj2.y) / 2;
        
        // (f) 印出obj1、obj2和avg的值。
        System.out.println("obj1: x=" + obj1.x + ", y=" + obj1.y);
        System.out.println("obj2: x=" + obj2.x + ", y=" + obj2.y);
        System.out.println("avg: x=" + avg.x + ", y=" + avg.y);
    }
}
