import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class TwoSum{
    public static int[] findIndeces(int[] arr,int target){
        int len = arr.length;
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<len; i++){
            map.put(arr[i], i);
        } 
        for(int j=0; j<len; j++){
            int dif = target-arr[j];
            if(map.containsKey(dif)){
               result[0] = j;
               result[1] = map.get(dif);
               break;
            }
        }
        return result;

    }
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the Elements: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        int[] result = findIndeces(arr, target);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}