package Constructor;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class usingLomBok {
    String name;
    int age;
//  public usingLomBok()
//  {
//      System.out.println("data");
//  }
//    public usingLomBok(String name, int age)
//    {
//        this.name=name;
//        this.age=age;
//    }
//
//    public int getAge() {
//        return age;
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public static void main(String[] args)
    {
        new usingLomBok();
        usingLomBok l=new usingLomBok("Babul",23);
        System.out.println(l.getAge()+ l.getName());
    }
}
