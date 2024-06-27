package ChapterThree.Lab5.src;

public class PassByValue {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Before passing by value: " + num);
        firstFunction(num);
        System.out.println("After passing by value: " + num);
    }
    public static void firstFunction(int num){
        num = 68;
        System.out.println("Inside another function: " + num);
    }
}
