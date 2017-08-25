/**
 * Created by z001v89 on 8/25/17.
 *
 */


import java.util.HashMap;
import java.util.Map;
public class HashMapOperations {
    public static void main(String[] args){
        Map<String,String> m1 =new HashMap<String,String>();
        String a =  m1.put("Alif","Laila");
        String b =  m1.put("Alif","Ali");
        System.out.print(a + "\n");//On the same key m1 returns null
        System.out.print(b + "\n");// on the same b is returned as the first value
        System.out.print(m1.get("Alif") + "\n"); //get does the normal function
        System.out.print(m1.keySet() + "\n");//gets value for they key
        System.out.print(m1.values() + "\n");//shows hashmap losses  the old value and replaces with the new value

    }
}
