package list;
import java.util.LinkedList;

/**
 * 测试LinkedList类的内容
 * @author Jay Zhou
 * @version 1.0
 */
public class LinkedListDemo {
    /**
     * 测试LinkedList类
     * @param args
     */
    public static void main(String[]args){
        LinkedList<String> link = new LinkedList<String>();
        link.add("2");
        link.add(0,"1");
        link.add("3");
        //初始列表
        System.out.println(link.toString());
        link.addFirst("A");
        link.addLast("D");

        //修改过后的列表
        System.out.println(link.toString());

        //element()方法找到表头
        System.out.println(link.element());

        //peek()方法自己安排到表头

        //poll()方法找到并删除表头
    }
}
