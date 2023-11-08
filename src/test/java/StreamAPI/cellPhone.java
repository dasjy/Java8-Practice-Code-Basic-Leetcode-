package StreamAPI;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class cellPhone {
    private String name;
    private int cost;
    private String colour;

    public cellPhone(String name, int cost, String colour) {
        this.name = name;
        this.cost = cost;
        this.colour = colour;
    }
}

class mobile
{
    public static void main(String[] args)
    {
        List<cellPhone> c=new ArrayList<cellPhone>();
        c.add(new cellPhone("iphone",25000,"black"));
        c.add(new cellPhone("iphone",26000,"red"));
        c.add(new cellPhone("iphone",27000,"white"));
        c.add(new cellPhone("samsung",20000,"red"));
        c.add(new cellPhone("samsung",21000,"black"));
        c.add(new cellPhone("samsung",22000,"blue"));

        List<cellPhone> c2= Arrays.asList(new cellPhone("iphone",25000,"black"),
                new cellPhone("MI",25000,"green"));

      // c.stream().filter(p->p.getCost()<25000 && p.getColour().equalsIgnoreCase("red")).forEach(System.out::print);

       c.stream().filter(p->p.getColour().equalsIgnoreCase("iphone")).map(e->e.getCost()+100).forEach(System.out::print);

       c.stream().filter(e->e.getName().equalsIgnoreCase("iphone") && e.getColour().equalsIgnoreCase("red"))
               .map(p->p.getCost()+200).forEach(System.out::println);


       // Flat Map -- collect the multiple collections and make it one stream and return type is Stream.

        List<List<cellPhone>> finalData=Arrays.asList(c,c2);

       List <cellPhone> d2= finalData.stream().flatMap(x->x.stream())
               .filter(p->p.getColour().equalsIgnoreCase("red")).collect(Collectors.toList());



    }
}
