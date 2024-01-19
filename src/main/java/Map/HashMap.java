package Map;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<Integer,String> m=new java.util.HashMap<>();
      //store the key and value
        m.put(101,"purva");
        m.put(102,"Mahi");
        m.put(103,"Tanu");
        m.put(104,"Anisha");
        m.put(105,"Neha");
        System.out.println(m);
        Map<Integer,String> m1=new java.util.HashMap<>();
        m1.put(11,"krish");
        m1.put(12,"harshal");
        m1.put(13,"mohit");
        //put all key and value of m1 in m
        m.putAll(m1);
        System.out.println(m);

        System.out.println(m.putIfAbsent(108,"xyz"));
        //remove the key and value
        System.out.println(m.remove(102,"Mahi"));
       //print key element
        System.out.println(m.keySet());
        //print value element
        System.out.println(m.values());
        //is map is empty or not
        System.out.println(m.isEmpty());
        //is value contain or not
        System.out.println(m.containsValue("purva"));
        //is key contain or not
        System.out.println(m.containsKey(16));
        //replace the key or value
        m.replace(101,"sita");
        System.out.println(m);
        //print the size
        System.out.println(m.size());


    }
}
