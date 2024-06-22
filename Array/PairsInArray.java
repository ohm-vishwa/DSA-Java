public class PairsInArray {
    public static void pairsInArray(int arr[]){
        int firstNum;
        for(int i = 0 ; i < arr.length ; i++){
            firstNum = arr[i];
            for(int j = i + 1 ; j < arr.length ; j++){
                System.out.print("["+firstNum + "," + arr[j] +"], ");
            }
        }
    }
    public static void main(String[] args){
        int number[] = {1,2,3,4,5};
        pairsInArray(number);
        //[1,2], [1,3], [1,4], [1,5], [2,3], [2,4], [2,5], [3,4], [3,5], [4,5]
    }
}