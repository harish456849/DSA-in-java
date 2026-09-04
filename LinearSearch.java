import java.util.*;
class LinearSearch{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();
        int i,h = -1;
        int[] arr = new int[n];
        System.out.print("Enter the Array Elements: ");
        
        for(i=0;i<n;i++)
        {
          arr[i] = sc.nextInt();
        }
        System.out.print("Enter Element to be searched: ");
        int k = sc.nextInt();

         for(i=0;i<n;i++)
        {
          if(arr[i] == k)
            {
               h = i;
            } 
        }
        if(h!=-1)
        {
            System.out.println("Element Found at index: " + h);

        }
        else{
            System.out.println("Element not exist");
        }
         

    }

}