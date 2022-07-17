package set;

import java.util.HashSet;
import java.util.Set;

/**
 * 测试HashSet
 * @author Jay Zhou
 * @version 1.0
 */
public class HashSet_01 {
    public static void main(String[] args){
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("D");//重复元素不能添加
        System.out.println(hashSet.toString());
    }
}
