import java.util.*;

public class duplicateNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        System.out.println("enter 10 elemets into the array");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int i=0;
        HashMap<Integer,Integer> map = new LinkedHashMap();  //LinkedHashMap is used to maintain the insertion order

        ArrayList<Integer> dup = new ArrayList<>();    //arraylist to add duplicate elements

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
    
}
