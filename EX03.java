class Cddd {
    String name;
    double height;
    double weight;
}

public class EX03
 {
    public static void main(String[] args) {
        // (a) 建立Cddd類別型態的物件 student。
        Cddd student = new Cddd();
        
        // (b) 設定student的資料成員
        student.name = "Sandy";
        student.height = 165.5; // 單位為公分
        student.weight = 58.2; // 單位為公斤
        
        // (c) 計算學生的BMI值
        double heightInMeters = student.height / 100; // 將身高轉換為公尺
        double bmi = student.weight / (heightInMeters * heightInMeters);
        
        // (d) 印出學生的資料及BMI值
        System.out.println("學生姓名: " + student.name);
        System.out.println("身高: " + student.height + " 公分");
        System.out.println("體重: " + student.weight + " 公斤");
        System.out.println("BMI值: " + bmi);
    }
}
