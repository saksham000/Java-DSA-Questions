import java.util.*;
public class input {
    public static void main(String [] arg ) {
        System.out.println("Please enter your text");
        Scanner firstinput = new Scanner(System.in);
        String name = firstinput.next();
        System.out.println(name);

        //to input all line then use nextline
        System.out.println("Enter your second text here ");
        Scanner secondinput = new Scanner(System.in);
        String fullname = secondinput.nextLine();
        System.out.println(fullname);
        firstinput.close();
        secondinput.close();


    }
}
