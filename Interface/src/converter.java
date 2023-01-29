import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class converter {

    public static void main(String[] args) {
        //let's start with decimal to binary, then binary to decimal
        //then we can deal with decimal to hex, then hex to decimal
        //after everything is done we can deal with alphabets and stuff. for now i want to work with numbers
        int num = 213;

        //give decimalToBinary a number, then return a string
        decimalToBinary(num);

    }

    public static int binaryToDecimal(int binary){

        return 00;
    }
    public static void decimalToBinary(int decimal){
        int[] emptySet = {0, 1, 3};
        //divide num by two and push the remainder to a stack
        LinkedList<Integer> stack = new LinkedList<Integer>();
        int num = decimal;
        while(num > 0){
            System.out.println(num);
            stack.push(num%2);
            num = num/2;

        }

        System.out.println(stack);

        String s = "";
        Iterator<Integer> iterator = stack.iterator();
        while(iterator.hasNext()){

            s = s + iterator.next();

        }

        System.out.println(s);



    }
    public static int[] arrayToInt(LinkedList<Integer> array) {
        int[] nums = new int[array.size()];

        for (int i = 0; i < array.size(); i++){
            nums[i] = array.pop();
        }
        return nums;



    }


}
