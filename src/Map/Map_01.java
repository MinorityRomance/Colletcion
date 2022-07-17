package Map;

import java.util.*;

/**
 * 测试Map类相关内容
 * @author Jay Zhou
 * @version 1.0
 */
public class Map_01 {
    /**
     * 测试Map类的内容
     * @param args
     */
    public static void main(String[]args){
        //HashMap输出是无序的，而TreeMap的主要区别在于对K排序
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("A",1);
        map.put("B",2);
        map.put("c",3);

        //用keySet()方法来取得K的值
        Set<String> keys = map.keySet();
        Iterator<String> iterator_01 = keys.iterator();
        while(iterator_01.hasNext()){
            System.out.println(iterator_01.next());
        }

        //用values()方法取得V的值
        Collection<Integer> value = map.values();//注意这里是Collection！！！
        Iterator<Integer> iterator_02 = value.iterator();
        while (iterator_02.hasNext()){
            System.out.println(iterator_02.next());
        }

        //直接用Iterator输出Map实例
        Set<Map.Entry<String,Integer>> allSet = map.entrySet();//用entrySet()方法来把存储一对对象的Map转化成存储单个对象的SET
        Iterator<Map.Entry<String,Integer>> iterator_03 = allSet.iterator();
        while (iterator_03.hasNext()){
            Map.Entry<String,Integer> me = iterator_03.next();
            System.out.println(me.getKey()+","+me.getValue());
        }

        //可以用map.get(k)的值来查找value的值
        System.out.println(map.get("A"));
        //如果要使用自定义类的对象来表示Map中的key,则对象所在的类要复写equals(),和hasCode方法，否则无法找到对应value
    }
}
