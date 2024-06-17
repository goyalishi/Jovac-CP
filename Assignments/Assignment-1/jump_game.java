public class jump_game {
    static int minJumps(int[] nums, int n) {
        
        if(nums.length==1) return 0;
        
        if(nums[0]==0)  return -1;
        
        int maxReach=0;
        int jumps=0;
        int lstIdx=0;
        int dest=n-1;
        for(int i=0;i<n;i++){

            maxReach=Math.max(maxReach,nums[i]+i);

            if(i==lstIdx){
                jumps++;
                lstIdx=maxReach;
            }
            
            if(lstIdx>=dest){
                return jumps;

            }
            
            if(i>maxReach) return -1;
        }
        return -1;
    }  
    
}
