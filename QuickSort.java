import java.util.*;
class Quick{
    public static int[] sort(int[] arr,int low,int high)
{

    if(low<high)
    {
        int pi = partition(arr,low,high);
        sort(arr,low,pi-1);
        sort(arr,pi+1,high);

    }
    return arr;
        
}
//partition function to find the pivot element and place it in the correct position
 public static int partition(int[] arr,int low,int high)
    {

        int piv = arr[high];
        int i = low - 1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<piv)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swapping the pivot element with the element at i+1
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}



class QuickSort{
    public static void main(String[] args)
    {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of Array: ");
     int n = sc.nextInt();
        int i;
        int[] arr = new int[n];
        System.out.print("Enter the Array Elements: ");
        
        for(i=0;i<n;i++)
        {
          arr[i] = sc.nextInt();
        }
    //calling quickSort
    int arr1[] = Quick.sort(arr,0,n-1);

    //output
    System.out.print("Sorted Array Elements: ");

     for(i=0;i<n;i++)
        {
          System.out.print(arr1[i] + " ");
        }


    }
}