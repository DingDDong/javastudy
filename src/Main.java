class AccessWay {
    static int num = 0;

    AccessWay() {
        incrCnt();
    }

    void incrCnt() {
        num++;
    }
}

class ClassVarAccess {
    /*
      오늘의 교훈 : main은 대문자가 아니라 소문자로 적자.
     */
    public static void main(String[] args) {
        AccessWay way = new AccessWay();
        way.num++;
        AccessWay.num++;
        System.out.println("num = " + AccessWay.num);
    }
}