import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class converter {

    public static void main(String[] args) {
        //let's start with decimal to binary, then binary to decimal
        //then we can deal with decimal to hex, then hex to decimal
        //after everything is done we can deal with alphabets and stuff. for now i want to work with numbers
        int num = 27;

        //give decimalToBinary a number, then return a string

        System.out.println(decimalToBinary(num));

    }

    public static int binaryToDecimal(int binary){
        return 00;
    }
    public static String decimalToBinary(int decimal){
        //divide num by two and push the remainder to a stack
        LinkedList<Integer> stack = new LinkedList<Integer>();
        int num = decimal;
        while(num > 0){
            stack.push(num%2);
            num = num/2;
        }
        return(arrayToString(stack));
    }
    public static String arrayToString(LinkedList<Integer> stack) {
        String binary = "";
        Iterator<Integer> iterator = stack.iterator();
        while(iterator.hasNext()){
            binary = binary + iterator.next();
        }
        return(binary);

    }


}
