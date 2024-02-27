import java.util.*;

public class reverseArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        System.out.println();

        System.out.println("enter 10 elements into the array");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int i=0;
        int j=arr.length-1;

        while(i<j)
        {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        System.out.println();
        System.out.println("after reversing the array the elements in the array are: ");

        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
