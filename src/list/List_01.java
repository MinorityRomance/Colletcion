package list;

import java.util.*;

/**
 * 测试List类
 * @author Jay Zhou
 * @version 1.0
 */
public class List_01 {
    /**
     * 测试ArrayList类
     * @param args
     */
    public static void main(String[]args){
        List<String> list = new ArrayList<String>();

        Collection<String> collection = new ArrayList<String>();

        list.add("1");
        list.add("2");
        collection.add("3");
        collection.add("4");

        //增加前输出
        Iterator<String> iterable = list.iterator();

        while(iterable.hasNext()){
            System.out.print(iterable.next()+",");
        }

        list.addAll(collection);
        System.out.println();

        //增加后输出
        Iterator<String> iterator1 = list.iterator();

        while(iterator1.hasNext()){
            System.out.print(iterator1.next()+",");
        }
        System.out.println();

        //移除部分对象后输出
        list.remove(0);
        list.remove("3");
        System.out.println(list.toString());

        //大括号的作用是为了初始化
        String []arr = list.toArray(new String[]{});
        System.out.println();
        for(String str:arr){
            System.out.print(str+",");
        }

    }
}
