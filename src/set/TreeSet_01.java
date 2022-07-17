package set;

import java.util.Set;
import java.util.TreeSet;

/**
 * 测试TreeSet
 * @author Jay Zhou
 * @version 1.0
 */
public class TreeSet_01 {
    /**
     * 测试TreeSet类
     * @param args
     */
    public static void main(String[]args){
        Set<Person> treeSet = new TreeSet<Person>();
        treeSet.add(new Person("张一",21));
        treeSet.add(new Person("李二",11));
        treeSet.add(new Person("吴三",29));
        treeSet.add(new Person("张一",27));
        treeSet.add(new Person("张一",27));//重复元素不能加入
        treeSet.add(new Person("王五",65));
        System.out.println(treeSet.toString());
    }


}

class Person implements Comparable<Person>{
    private int age;
    private String name;

    public Person(String name,int age){
        this.setAge(age);
        this.setName(name);
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;//从小到大排序
    }

    //compareTo方法里比较是哪个属性，就会通过哪个属性来判断两个对选哪个实例是否相同
    @Override
    public String toString() {
        return this.getName()+","+this.getAge();
    }
}
