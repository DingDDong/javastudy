import java.util.Arrays;

class INum{
    private int num;
    public INum(int num){
        this.num = num;
    }
    @Override  // 없으면 false를 반환 왜?? 인스턴스의 equals비교는 기본적으로 참조값 비교를 하지만 Override를 해줌으로써 값 비교로 바꾸기 때문
    public boolean equals(Object obj){
        if(this.num == ((INum)obj).num)  // 두 인스턴스의 내용 비교
            return true;
        else
            return false;
    }
}
class ArrayObjEquals{
    public static void main(String[] args){
        INum[] ar1 = new INum[3];
        INum[] ar2 = new INum[3];
        ar1[0] = new INum(1); ar2[0] = new INum(1);
        ar1[1] = new INum(2); ar2[1] = new INum(2);
        ar1[2] = new INum(3); ar2[2] = new INum(3);
        System.out.println(Arrays.equals(ar1, ar2));
    }
}



