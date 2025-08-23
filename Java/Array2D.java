public class Array2D {
    
    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++){
       //     System.out.println(arr[i]);
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
        
    public static void main(String[] args){
       // int[][] arr = new int[2][3];

        int[][] arr2 = { {1,4,6},
                         {7,9,11},
                        {8,1,3} 
                    };
        printArray(arr2);

   }
}
