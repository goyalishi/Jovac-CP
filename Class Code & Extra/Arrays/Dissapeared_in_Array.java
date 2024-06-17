import java.util.ArrayList;

public class Dissapeared_in_Array {
    public ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        
        ArrayList<Integer> ls=new ArrayList<Integer>();
            //Using cycle sort

            for(int i=0;i<nums.length;i++){
                while(nums[i]!=i+1){
                    int idx=nums[i]-1;
                    if(nums[idx]==nums[i]){
                        break;
                    }
                    int temp=nums[i];
                    nums[i]=nums[idx];
                    nums[idx]=temp;
                }
            }

            for(int i=0;i<nums.length;i++){
                if(nums[i]!=i+1){
                    ls.add(i+1);
                }
            }

            return ls;

        }    
}   
