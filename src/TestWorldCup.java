/** 
 * 定义世界杯类WorldCup，该类包括序号id、举办年份year、举办国country、冠军队team四个私有成员变量（已定义）。
 * 在该类中定义有参构造方法和所有成员变量的set、get方法。
*/
import java.util.*;
import java.util.Scanner;

class WorldCup {
    private int id;  //序号
    private int year;  //举办年份
    private String country;  //举办国
    private String team;    //冠军队

    //（1）此处定义有参构造方法。  
    WorldCup(int id,int year,String country,String team){
        this.id=id;
        this.year=year;
        this.country=country;
        this.team=team;
    }   
    //（2）此处定义所有成员变量的get和set方法。
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public String getTeam(){
        return team;
    }
    public void setTeam(String team){
        this.team=team;
    }


}



public class TestWorldCup {
    public static void main(String[] args) {        
        // 创建22个世界杯对象，代码如下：

        WorldCup wc1=new WorldCup(1,1930,"乌拉圭","乌拉圭");
        WorldCup wc2=new WorldCup(2,1934,"意大利","意大利");
        WorldCup wc3=new WorldCup(3,1938,"法国","意大利");
        WorldCup wc4=new WorldCup(4,1950,"巴西","乌拉圭");        
        WorldCup wc5=new WorldCup(5,1954,"瑞士","西德");
        WorldCup wc6=new WorldCup(6,1958,"瑞典","巴西");
        WorldCup wc7=new WorldCup(7,1962,"智利","巴西");
        WorldCup wc8=new WorldCup(8,1966,"英格兰","英格兰");        
        WorldCup wc9=new WorldCup(9,1970,"墨西哥","巴西");
        WorldCup wc10=new WorldCup(10,1974,"西德","西德");
        WorldCup wc11=new WorldCup(11,1978,"阿根廷","阿根廷");
        WorldCup wc12=new WorldCup(12,1982,"西班牙","意大利");        
        WorldCup wc13=new WorldCup(13,1986,"墨西哥","阿根廷");
        WorldCup wc14=new WorldCup(14,1990,"意大利","西德");
        WorldCup wc15=new WorldCup(15,1994,"美国","巴西");
        WorldCup wc16=new WorldCup(16,1998,"法国","法国");        
        WorldCup wc17=new WorldCup(17,2002,"韩日","巴西");
        WorldCup wc18=new WorldCup(18,2006,"德国","意大利");
        WorldCup wc19=new WorldCup(19,2010,"南非","西班牙");
        WorldCup wc20=new WorldCup(20,2014,"巴西","德国");
        WorldCup wc21=new WorldCup(21,2018,"俄罗斯","法国");
        WorldCup wc22=new WorldCup(22,2022,"卡塔尔","阿根廷");
        
        //世界杯年份做键，世界杯对象做值存入Map集合m中，代码如下：

        Map<Integer,WorldCup> m=new HashMap<Integer,WorldCup>();
        m.put(wc1.getYear(), wc1);
        m.put(wc2.getYear(), wc2);
        m.put(wc3.getYear(), wc3);
        m.put(wc4.getYear(), wc4);        
        m.put(wc5.getYear(), wc5);
        m.put(wc6.getYear(), wc6);
        m.put(wc7.getYear(), wc7);
        m.put(wc8.getYear(), wc8);        
        m.put(wc9.getYear(), wc9);
        m.put(wc10.getYear(), wc10);
        m.put(wc11.getYear(), wc11);
        m.put(wc12.getYear(), wc12);        
        m.put(wc13.getYear(), wc13);
        m.put(wc14.getYear(), wc14);
        m.put(wc15.getYear(), wc15);
        m.put(wc16.getYear(), wc16);        
        m.put(wc17.getYear(), wc17);
        m.put(wc18.getYear(), wc18);
        m.put(wc19.getYear(), wc19);
        m.put(wc20.getYear(), wc20);
        m.put(wc21.getYear(), wc21);
        m.put(wc22.getYear(), wc22);

        
        //（3）此处输入年份，根据年份查找该年的冠军队，如果该年没举办世界杯就输出“该年没举办世界杯”。
        // read year
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年份：");
        int year=sc.nextInt();
        if(m.containsKey(year)){
            System.out.println(year+"年的世界杯冠军是"+m.get(year).getTeam());
        }else{
            System.out.println("该年没有举办世界杯");
        }
        //（4）此处输入一支球队的名字，输出该球队夺冠的年份列表。 如果该球队未夺过冠，则输出“该队未曾获得过冠军”。

        System.out.println("请输入球队名字：");
        String team=sc.next();
        boolean flag=false;
        for(WorldCup wc:m.values()){
            if(wc.getTeam().equals(team)){
                System.out.print(wc.getYear()+"\t");
                flag=true;
            }
        }
        if(!flag){
            System.out.println("该队未曾获得过冠军");
        }

        sc.close();

    }
}   