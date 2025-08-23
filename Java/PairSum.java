import java.util.Scanner;

public class PairSum {
    
    static int pairSum(int[] arr, int target){
        int n = arr.length;
        int ans = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){//First number
                if(arr[i] + arr[j] == target){//Second number
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter pair sum ");
        int target = sc.nextInt();

        System.out.println(pairSum(arr, target));
    }
}
