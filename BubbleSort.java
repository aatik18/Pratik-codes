public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {4,1,9,7,0};
        sorting(arr);
    }

    private static void sorting(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            
        }
        for (int i : arr) {

            System.out.print(i + "  ");
            
        }

    }
}