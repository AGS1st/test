import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        randomize();
    }
    public static void randomize(){
        List<String> students = Arrays.asList("Ahmed","Suliman","BAndar","khalid");
        Collections.shuffle(students);
            System.out.println("Random Groups: "+ students);
        }
}