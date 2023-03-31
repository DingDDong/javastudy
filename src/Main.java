class DBox<L, R>{
    private L left;
    private R right;

    public void set(L o, R r) {
        left = o;
        right = r;
    }
    public String toString() { return left + " & " + right; }
}
class DDBox<U, D>{
    private U left1;
    private D right2;
    public void set(U u, D d){
        left1 = u;
        right2 = d;
    }
    @Override
    public String toString() { return left1.toString() + "\n" + right2.toString();}
}
class DDBoxDemo {
    public static void main(String[] args){
        DBox<String, Integer> box1 = new DBox<>();
        box1.set("Apple", 25);
        DBox<String, Integer> box2 = new DBox<>();
        box2.set("Orange", 33);
        DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
        ddbox.set(box1, box2);
        System.out.println(ddbox);
    }
}