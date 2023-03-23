import java.time.LocalDate;

class RemoveBar2{
    public static void main(String[] args){
        String str1 = "990925-1012999";
        String str2 = str1.substring(0, 6)+ ' ' +str1.substring(7);
        System.out.println(str2);

        StringBuilder sb = new StringBuilder("990925-1012999");
        sb.replace(6,7," ");
        System.out.println(sb.toString());
    }
}