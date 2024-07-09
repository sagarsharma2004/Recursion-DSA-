public class linearSearch {
    public static void main(String[] args) {
        int arr[]={14,21,34,45,46,56,67,33};
        int ans=ls(arr,0,45);
        if(ans==-1){
            System.out.println("Target is not fount.");
        }else{
            System.out.println("Target is found at index "+ans);
        }
    }

    private static int ls(int[] arr, int index, int target) {
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return ls(arr, index+1, target);
    }
}
