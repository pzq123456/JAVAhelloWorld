import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        mainFunction mainFunction = new mainFunction();
        mainFunction.reportTime();
        // mainFunction.Fun1();
        // mainFunction.Fun2();
        mainFunction.Fun3();
    }
}
/**
 * 该类存放 不同的 main 方法 用以匹配不同题目
 */
class mainFunction{
    /*
     * report time and date
     */
    public void reportTime(){
        long millis = System.currentTimeMillis();
        System.out.println(millis);
        // convert millis to date time
        java.util.Date date = new java.util.Date(millis);
        System.out.println(date);
        // convert date time to millis
        long millis2 = date.getTime();
        System.out.println(millis2);
    }
    /**
     * 第一题
     */
    public void Fun1(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        double x = scanner.nextDouble();
        System.out.print("y = ");
        double y = scanner.nextDouble();
        System.out.print("r = ");
        double r = scanner.nextDouble();
        Circle circle = new Circle(x, y, r);
        circle.print();
        System.out.println("perimeter = " + circle.perimeter());
        System.out.println("area = " + circle.area());
        scanner.close();
    }

    public void Fun3(){        
        // PingPongPayer pp1 = new PingPongPayer("张继科", 30);
        // BasketballPayer bp1 = new BasketballPayer("易建联", 31);
        // PingPongTrainer pt1 = new PingPongTrainer("刘国梁", 42);
        // BasketballTrainer bt1 = new BasketballTrainer("杜锋", 37);

        Person[] people = new Person[4];
        people[0] = new PingPongPayer("张继科", 30);
        people[1] = new BasketballPayer("易建联", 31);
        people[2] = new PingPongTrainer("刘国梁", 42);
        people[3] = new BasketballTrainer("杜锋", 37);

        for (Person person : people) {
            person.info();
            person.sleep();
            person.eat();

            if (person instanceof Player) {
                ((Player) person).exercise();

                // if implemet interface StudyEnglish
                
                if (person instanceof StudyEnglish) {
                    ((StudyEnglish) person).oralEnglish();;
                }

            }
            if (person instanceof Trainer) {
                ((Trainer) person).teach();

                // if implemet interface StudyEnglish
                if (person instanceof StudyEnglish) {
                    ((StudyEnglish) person).oralEnglish();;
                }
            }

            // print slah
            person.printSlash();

        }

    }

    /**
     * 第二题
     */
    public void Fun2(){
        Student[] students = new Student[5];
        students[0] = new Student("111", "张三", "男", 18, 95);
        students[1] = new Student("222", "李四", "女", 19, 86);
        students[2] = new Student("333", "王五", "男", 21, 99);
        students[3] = new Student("444", "郑七", "女", 17, 79);
        students[4] = new Student("555", "赵六", "男", 22, 80);
        double sum = 0;
        double max = students[0].getSjava();
        double min = students[0].getSjava();
        for (Student student : students) {
            System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", student.getSno(), student.getSname(), student.getSsex(), student.getSage(), student.getSjava());
            sum += student.getSjava();
            if (student.getSjava() > max) {
                max = student.getSjava();
            }
            if (student.getSjava() < min) {
                min = student.getSjava();
            }
        }
        System.out.println("平均分:" + sum / students.length);
        System.out.println("最高分:" + max);
        System.out.println("最低分:" + min);
    }
}
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("x = " + x + ", y = " + y);
    }
}

class Circle extends Point {
    private double r;

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    public double perimeter() {
        return 2 * Math.PI * r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("r = " + r);
    }
}

class Cylinder extends Circle {
    private double h;

    public Cylinder(double x, double y, double r, double h) {
        super(x, y, r);
        this.h = h;
    }

    @Override
    public double area() {
        return 2 * super.area() + super.perimeter() * h;
    }

    public double volume() {
        return super.area() * h;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("h = " + h);
    }
}

// 第二题
class Student {
    private String sno;
    private String sname;
    private String ssex;
    private int sage;
    private double sjava;

    public Student(String sno, String sname, String ssex, int sage, double sjava) {
        this.sno = sno;
        this.sname = sname;
        this.ssex = ssex;
        this.sage = sage;
        this.sjava = sjava;
    }

    public String getSno() {
        return sno;
    }

    public String getSname() {
        return sname;
    }

    public String getSsex() {
        return ssex;
    }

    public int getSage() {
        return sage;
    }

    public double getSjava() {
        return sjava;
    }
}
// 第三题
abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();

    public abstract void sleep();

    public void info() {
        System.out.println(name + "------" + age);
    }

    public void printSlash(){
        System.out.println("--------------------");
    }
}

interface StudyEnglish {
    void oralEnglish();
}

abstract class Player extends Person {
    public Player(String name, int age) {
        super(name, age);
    }

    public abstract void exercise();
}

abstract class Trainer extends Person {
    public Trainer(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}

class PingPongPayer extends Player implements StudyEnglish {
    public PingPongPayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃大白菜，喝小米粥");
    }

    @Override
    public void sleep() {
        System.out.println("人都是要睡觉的");
    }

    @Override
    public void exercise() {
        System.out.println("乒乓球运动员学习如何发球和接球");
    }

    @Override
    public void oralEnglish() {
        System.out.println("乒乓球运动员说英语");
    }
}

class BasketballPayer extends Player {
    public BasketballPayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃牛肉，喝牛奶 ");
    }

    @Override
    public void sleep() {
        System.out.println("人都是要睡觉的 ");
    }

    @Override
    public void exercise() {
        System.out.println("篮球运动员学习如何运球和投篮");
    }
}

class PingPongTrainer extends Trainer implements StudyEnglish {
    public PingPongTrainer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃小白菜，喝大米粥");
    }

    @Override
    public void sleep() {
        System.out.println("人都是要睡觉的");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球运动员如何发球和接球");
    }

    @Override
    public void oralEnglish() {
        System.out.println("乒乓球教练说英语");
    }
}

class BasketballTrainer extends Trainer {
    public BasketballTrainer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃羊肉，喝羊奶 ");
    }

    @Override
    public void sleep() {
        System.out.println("人都是要睡觉的 ");
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教篮球运动员如何运球和投篮");
    }
}



