package day03;

import java.util.Date;

/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 * 
 * 定义构造方法，以及属性get,set方法.
 * 定义toString方法，格式如:
 *    姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2006-02-15
 * 
 * 定义equals方法，要求只要名字相同，则认为内容一致。
 * @author Bonnie
 *
 */
public class Emp {
    private String name;
    private int age;
    private String gender;
    private int salary;
    private Date hiredate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }
    public Emp() {
    }

    public Emp(String name, int age, String gender, int salary, Date hiredate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.hiredate = hiredate;
    }
    public String toString(){
        System.out.println();
        return "姓名:"+this.name+",年龄:"+this.age+",性别:"+this.gender+",薪资:"+this.salary+",入职时间:"+this.hiredate;
    }
    public boolean equals(Emp p1,Emp p2){
        if((p1.getName().equals(p2.getName()))&&(p1.getSalary()==p2.getSalary())&&(p1.hiredate.getTime()==p2.hiredate.getTime())&&(p1.getAge()==p2.getAge())&&(p1.getGender().equals(p2.getGender()))){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Emp p1=new Emp("小明",25,"男",6000,new Date(999999999));
        Emp p2=new Emp("小明",25,"男",6000,new Date(999999999));
        System.out.println(p1.toString());
        System.out.println(p1.equals(p1,p2));
    }
}
