package Interview;

import java.util.*;

public class MapTest {

    public static void main(String[] args)
    {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Babul");
        map.put(2,"Babul1");
        map.put(3,"Babul2");
        map.put(4,"Babul2");
        map.put(5,"Babul2");

        System.out.println(map.get(3)+map.replace(3,"Jyoti"));
        System.out.println(map);

        for(Object m:map.keySet())
        {
            System.out.println(m);
        }
        for(Object n:map.values())
        {
            System.out.println(n);
        }

        for(Map.Entry entry :map.entrySet() )
        {
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }

        Map<Integer,List<Mobile>> mobile= new HashMap<Integer, List<Mobile>>();
        mobile.put(1, Collections.singletonList(new Mobile(Arrays.asList("Samsung", "Nokia"), Arrays.asList("12000", "12700"))));
        //mobile.put(2,new Mobile("Nokia",7000));

        for(Map.Entry data: mobile.entrySet())
        {
            System.out.println("  &  "+data.getValue());

        }
    }
}
