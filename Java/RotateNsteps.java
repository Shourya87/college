import java.util.Arrays;
import java.util.Scanner;

public class RotateNsteps {
    
    static void rotateSteps(int []arr, int k){
        int n = arr.length;
        int a = k % n;
        int ans[] = new int[n];
        int j = n-1;
        int d = 0;

        if (a == 0){
            System.out.println(Arrays.toString(arr));
        }
        else{
            for(int i = a-1; i >= 0; i--, j--){
                ans[i] = arr[j];
            }
            for(int i = a; i < n; i++){
                ans[i] = arr[d];
                d++;
            }
            System.out.println(Arrays.toString(ans));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Value in Array: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the rotatin time: ");
        int k = sc.nextInt();

        rotateSteps(arr, k);

    }

}
