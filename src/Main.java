import java.time.LocalDate;
import java.util.Scanner;
class Friend{
    protected String name;
    protected String phone;

    public Friend(String na, String ph){
        name = na;
        phone = ph;
    }
    public void showInfo(){
        System.out.println("이름: " + name);
        System.out.println("전화: " + phone);
    }
}
class ComFriend extends Friend{
    private String department;

    public ComFriend(String na, String de, String ph){
        super(na, ph);
        department = de;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("부서: " + department);
    }
}
