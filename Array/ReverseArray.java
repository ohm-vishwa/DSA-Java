public class ReverseArray {
    public static void reverseArray(int arr[]){
        int temp;
        for(int i = 0 ; i < (arr.length) / 2 ; i++){
            temp = arr[i];
            arr[i] = arr[(arr.length - i) -1];
            arr[(arr.length - i) -1] = temp;

        }
    }
    public static void main(String[] args){
        int number[] = {1,2,3,4,5,6,7,8,9,12,23,24,3,5,45,56,67,78};
        reverseArray(number);
        for(int i = 0 ; i < number.length -1 ; i++){
            System.out.println(number[i]);
        }
    }
}