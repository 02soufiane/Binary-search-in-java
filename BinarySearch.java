public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={1, 4, 5, 8, 9};
        int left=0;
        int right=nums.length-1;
        int target=2;

        Boolean TEMP=false;
        while(left <= right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                System.out.println("Eelement found ar index : "+mid);
                TEMP=true;
                break;
            }else if(nums[mid] < target){
                left=mid+1;
            }else
                right-=mid+1;
        }

        if(!TEMP){
            System.out.println("Element not found");
        }
    }
}
