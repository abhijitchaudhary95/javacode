import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Stringcount {
	    public static void main(String[] args) {
    int count[]= new int[256];
    String str="hello how are you";

    for(int i=0;i<str.length(); i++){


        count[str.charAt(i)]++;

    }
  //Now display wht character is repeated how many times

    for (int i = 0; i < count.length; i++) {
        if (count[i] > 0)
           System.out.println("Number of " + (char) i + ": " + count[i]);
    }


}
}



