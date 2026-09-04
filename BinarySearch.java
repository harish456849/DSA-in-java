import java.util.*;
class Bubble{
    public  static int[] Sort(int n,int arr[])
    {
        int i,j,temp;
         for(i=0;i<n-1;i++)
     {
        for(j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
     }
     return arr;
    }
    
}
class Binary{
    public static int Search(int k,int[] arr)
    {
     int min = 0, max = arr.length - 1,mid = (max + min)/2;
     
     while(min<=max){
     mid = (min + max)/2;
     if(k==arr[mid])
     {
        return mid;
     }
     else if(k<arr[mid])
     {
        max = mid - 1;
     }
     else 
     {
        min = mid + 1;
     }

    }
    return -1;
}
}


class BinarySearch{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of Array: ");
     int n = sc.nextInt();
        int i,h = -1,temp,g;
        int[] arr = new int[n];
        System.out.print("Enter the Array Elements: ");
        
        for(i=0;i<n;i++)
        {
          arr[i] = sc.nextInt();
        }
        

//binary search needs sorted array 
    int[] arr1 = Bubble.Sort(n,arr);
    for(i=0;i<n;i++)
    {
        System.out.print(arr1[i] + " ");
    }
        System.out.println();
        System.out.print("Enter Element to be searched: ");
        int k = sc.nextInt();


      //binary search
    
    int d = Binary.Search(k,arr1);
    if(d==-1)
    {
        System.out.println("Element Not Present");
    }
    else
    {
      System.out.println("Element Present At Index: " + d);
    }



  }
}