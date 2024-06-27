package ChapterThree.Lab5.src;
import ChapterThree.Lab5.src.Reference;

public class PassByReference {

    public static void main(String[] args) {
        Reference ref = new Reference("This is hello bro");
        System.out.println("Before:" + ref.getReference());

        referenceValue(ref);
        System.out.println("After: " + ref.getReference());
    }

    public static void referenceValue(Reference ref){
        ref.setReference("This is not hello bro");
        System.out.println("While: " + ref.getReference());
    }
}