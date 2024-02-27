import java.util.*;

public class missingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        System.out.println();
        System.out.println("enter 10 elemets in to the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println();
        System.out.print("missing element is:");
         
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }

        if(set.size()==arr.length)
        {
           System.out.println("No missing number between 1 to 10");
           return;
        }

        
        for(int i=1;i<=10;i++)
        {
            if(!set.contains(i))
            {
                System.out.print(i+" ");
            }
        }    
        
    }
    
}
