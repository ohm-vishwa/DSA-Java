public class BinarySearch {
    public static int binarySearch(int number[], int key){
        int start = 0;
        int end = number.length;
        int mid = (start + end) >> 1;
        while (mid <= end) {
            if (number[mid] == key){
                return mid;
            }
            else if(number[mid] > key){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
            mid = (start + end) >> 1;
        }
        return -1;
    }
    public static void main(String[] args){
        int number[] = {1,2,3,4,5,6,7,8,9,12,23,24,3,5,45,56,67,78};
        System.out.println("key found at index : "+ binarySearch(number, 24));
    }
}
