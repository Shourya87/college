
import java.util.Arrays;

public class ArrayInput {

    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
       //     System.out.println(arr[i]);
            for(int j = 0; j < arr.length; j++){
                System.out.print(Arrays.toString(arr));
            }
            System.out.println();
        }
    }



    public static void main(String[] args){
        int[] arr = new int[5];
        System.out.println("Enter Array Elements-");
        arr[0] = 45;
        arr[1] = 34;
        arr[2] = 56;
        arr[3] = 10;
        arr[4] = 60;

        printArray(arr);

        //Trying to copy arr to arr_2
        int arr_2[] = Arrays.copyOfRange(arr,0, 2);
        System.out.println("Copied arr_2");
        printArray(arr_2);

        
    }
}
