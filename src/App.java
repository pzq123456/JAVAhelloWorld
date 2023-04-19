import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        set.add(10);
        set.add(5);
        set.add(15); 
        set.add(5);
        set.add(10);
        System.out.println("size = " + set.size());
        Iterator<Integer> it = set.iterator();
        while (it.hasNext() ) {
            System.out.print(it.next() + " ");
    }
        
}    
}
        // ArrayList<student> s=new ArrayList<student>();
        // for(int i=0;i<27;i++){
        //     s.add(new student(i,i,i));
        // }

        // // normal for loop
        // for(int i=0;i<s.size();i++){
        //     System.out.println(s.get(i));
        // }

        // // for each loop
        // for(student i:s){
        //     System.out.println(i);
        // }

        // // iterator
        // Iterator<student> it=s.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
class student{
    private int sno;
    private int sclass;
    private int score;
    public student(int sno,int sclass,int score){
        this.sno=sno;
        this.sclass=sclass;
        this.score=score;
    }
    public String toString(){
        return this.sno + "/t" + this.sclass + "/t" + this.score;
    }

}






class Base {
    int x;
    public Base() {
        x = 1;
        System.out.println("Base");
    }
}

class Abs extends Base {
    int y;
    public Abs(int i) {
        // super(i);
        y = i;
        System.out.println("Abs");
    }
}





// for (int i = 0; i < 5; i++) {
//     switch (i) {
//         case 0:
//             System.out.print("zero\t");
//             i++;
//             break;
//         case 1:
//             System.out.print("one\t");
//         case 2:
//             System.out.print("two\t");
//             i++;
//         case 3: 
//             break;
//         case 4:
//             System.out.print("default \t");
//     }
// }
// }
    // String s1=new String("abc");
        // String s2=new String("abc");
        // boolean b1=s1.equals(s2); 
        // boolean b2=(s1==s2);
        // System.out.print(b1+" "+b2);
       //Pet a = new Pet ("name");
        // Cat c = new Cat("Tom","blue");
        // Dog d = new Dog("Bob", "black");
        // System.out.println(a instanceof Pet);
        // System.out.println(c instanceof Pet);
        // System.out.println(d instanceof Pet);
        // System.out.println(a instanceof Cat); // A1 a1=new A1(); 
        // a1.setX(4); 
        // a1.printa();

        // B1 b1=new B1(); 
        // b1.printb();
        // b1.printa();
// class A1 {
//     int x=2;
//     public void setX(int i) {
//         x=i;
//     }
//     void printa() {
//         System.out.println(x);
//     }
// }

// class B1 extends A1{
//         int x=100;
//     void printb() {
//         super.x=super.x+10;
//         System.out.println("super.x="+super.x+" x="+x);
//     }
// }

class Pet{
    String name;
    public Pet(String name)
    {this.name=name;} 
}

class Cat extends Pet{
    String eyesColor;
    public Cat(String n,String c){
    super(n); 
    eyesColor = c;
}
}
class Dog extends Pet {
    String furColor;
    public Dog(String n,String c){
    super(n); furColor=c;
}
}