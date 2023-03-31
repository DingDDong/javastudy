class Box<T>{
    private T ob;
    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}
class BoxinBox{
    public static void main(String[] args){
        Box<String> sBox = new Box<>();
        sBox.set("I am so happy.");
        Box<Box<String>> tBox = new Box<>();
        tBox.set(sBox);
        Box<Box<Box<String>>> fBox = new Box<>();
        fBox.set(tBox);
        System.out.println(fBox.get().get().get());
    }
}
