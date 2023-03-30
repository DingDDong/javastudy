import java.util.Arrays;
class Person implements Comparable{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Object o){
        Person p = (Person)o;
        return this.age - p.age;
    }
    @Override
    public String toString(){
        return name + ": " + age;
    }
}
class ArrayObjSort{
    public static void main(String[] args){
        Person[] ar = new Person[3];
        ar[0] = new Person("Hyun", 28);
        ar[1] = new Person("Tae", 25);
        ar[2] = new Person("Jun", 45);
        Arrays.sort(ar);
        for(Person p : ar)
            System.out.println(p);
    }
}
