import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;




    /*
     * Complete the 'calculateAmount' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY prices as parameter.
     */


public class Solution {

    public static long calculateAmount(List<Integer> prices) {
        // Write your code here
        long sum = 0;
        List<Integer> temp = new ArrayList<>();
        temp.add(prices.get(0));
        sum += prices.get(0);
        for(int i = 1; i < prices.size();i++){
            temp.add(prices.get(i));
            if(prices.get(i) - minElement(temp) > 0) {
                sum += prices.get(i) - minElement(temp);
            }
        }
        return sum;
    }

    public static int minElement(List<Integer> list){
        int min = Integer.MIN_VALUE;
        for(int i = 0;i<list.size();i++){
            if(list.get(i) < min){
                min = list.get(i);
            }
        }
        return min;
    }
    public static void main(String[] args) throws IOException {
//        List<Integer> list = new ArrayList<>();
//        list.add(4);
//        list.add(9);
//        list.add(2);
//        list.add(3);
//        calculateAmount(list);
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            String input = sc.nextLine();
            list.add(input);
        }
        list.sort((p1, p2) -> p1.compareTo(p2));
        System.out.println(list.get(list.size()-1));
    }
}
