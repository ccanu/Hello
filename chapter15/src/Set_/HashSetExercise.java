package Set_;

import java.util.HashSet;
import java.util.Objects;

public class HashSetExercise {
    public static void main(String[] args) {
        /*
        Employeeクラスの定義
        このクラスには、privateメンバー属性name、age要件：nameとageの値が同じ場合、
        HashSetコレクションに追加できない同じ従業員とみなす3つのEmployeeオブジェクトを作成するHashSetに配置する
         */
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("qyu",18));
        hashSet.add(new Employee("jyu",23));
        hashSet.add(new Employee("qyu",18));

        System.out.println("hashset=" + hashSet);

    }
}

//Employee
class Employee {
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;



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
    //nameとageが同じ値の場合は、同じhash値を返します


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
