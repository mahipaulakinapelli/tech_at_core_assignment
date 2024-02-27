import java.util.*;


/*
input 1: 

    Enter 10 elements in to array:
     1 3 4 2 5 7 8 5 9 10

output 1:    
    Array elemts in array are
     1 3 4 2 5 7 8 5 9 10

    Reverse Array
     10 9 5 8 7 5 2 4 3 1

    Duplicate Array:
     5
    
    Missing Element in the array between 1 to 10
     6
*/

/*
input 2: 

    Enter 10 elements in to array:
    1 1 2 2 3 3 4 4 5 5

output 2:    
    Array elemts in array are
     1 1 2 2 3 3 4 4 5 5

    Reverse Array
     5 5 4 4 3 3 2 2 1 1 

    Duplicate Array:
     5 4 3 2 1
    
    Missing Element in the array between 1 to 10
     6 7 8 9 10
*/

public class task {

    //method to reverse the elements in the array
    void reverseArray(int arr[])
    {
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



    //method for duplicates in the array
    void duplicateElemets(int arr[])
    {
         int i=0;
         HashMap<Integer,Integer> map = new LinkedHashMap();  //LinkedHashMap is used to maintain the insertion order

         ArrayList<Integer> dup = new ArrayList<>();    //arraylist to store duplicate elements
 
         for(i=0;i<arr.length;i++)
         {
             if(map.containsKey(arr[i]))
             {
                 map.put(arr[i],map.get(arr[i])+1);
             }
             else{
                 map.put(arr[i],1);
             }
         }
 
         for(Map.Entry<Integer,Integer> entry : map.entrySet())  // iterating the map
         {
             if(entry.getValue()>1)
             {
                 dup.add(entry.getKey());
             }
         }
 
         System.out.println();

         if(dup.size()==0)
         {
            System.out.println("There are no duplicate elements in the array ");
            return;
         }
         System.out.println("duplicate elements in the array are:");
 
         for(i=0;i<dup.size();i++)
         {
             System.out.print(dup.get(i)+" ");
         }
 
         System.out.println();
    }



    //method for missing number in the array
    //assuming that the elements in array are between 1 to 10 
    void missingNumber(int arr[])
    {
         int i=0;
         
         Set<Integer> set = new HashSet<>(); //HashSet ensures that no duplicates are allowed
 
         for(i=0;i<arr.length;i++)  // adding the array elemets in to the HashSet
         {
             set.add(arr[i]);
         }

         if(set.size()==arr.length)
         {
            System.out.println("No missing number between 1 to 10");
            return;
         }
 
         System.out.print("missing element is:");
         for( i=1;i<=10;i++)   // printing the missing numbers
         {
             if(!set.contains(i))
             {
                 System.out.print(i+" ");
             }
         }
 
    }

    public static void main(String[] args) {

        task t = new task();  // creting object for the task class

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];  //initializing a array of size 10

        System.out.println();
        System.out.println("enter 10 elements in to array");
        
        for(int i=0;i<arr.length;i++)   //taking input elements to thr array
        {
            arr[i]=sc.nextInt();
        }

        System.out.println();
        System.out.println("The elements in the array are");
    
        for(int i=0;i<arr.length;i++)                   // Displaying the elements in the array
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        t.reverseArray(arr);    // calling the method to reverse the elements in the array

        System.out.println();

        t.duplicateElemets(arr);  // calling the duplicateElemets method to find out the duplicate elements in the array

        System.out.println();

        t.missingNumber(arr);    // calling the missingNumber method to find out the missing number in the array

        
    }

}