import java.util.Random;

class PseudoRandom{
    public static void main(String[] args){
        System.out.println("실행할 때 마다 같음");
        Random rand = new Random(12);
        for(int i = 0; i < 7; i++)
            System.out.println(rand.nextInt(1000));
        System.out.println("실행할 때 마다 다름");
        Random rand1 = new Random();
        for(int i = 0; i < 7; i++)
            System.out.println(rand1.nextInt(1000));
    }
}

