import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class converter {

    public static void main(String[] args) {
        //let's start with decimal to binary, then binary to decimal
        //then we can deal with decimal to hex, then hex to decimal
        //after everything is done we can deal with alphabets and stuff. for now i want to work with numbers
        int num = 89;
        int n = 123456789;

        //give decimalToBinary a number, then return a string

        System.out.println(decimalToBinary(num));
        int binary = 1011001; //this number is 89


        int one=(n/1)%10;
        int tens= (n/10)%10;
        int hundred = (n/100)%10;
/*        System.out.println(one);
        System.out.println(tens);
        System.out.println(hundred); */
        String nString = "" + n;

        int place = 1;
        int decNum = 0;
        for(int i = 0; i<nString.length(); i++){
            System.out.println((n/place)%10);
            place *=10;
        }

    }

    public static int binaryToDecimal(String binary){
        //process of binary -> decimal is as follows
        //for length of binary num, (ex. 1101 has length of 4)

        for(int i = 0; i<binary.length(); i++){

        }
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
