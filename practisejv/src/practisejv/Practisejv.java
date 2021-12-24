/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practisejv;

import java.util.Scanner;

/**
 *
 * @author steven
 */
public class Practisejv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []nums={3,2,2,3};
        Solution s = new Solution();
        int ans =s.rangeSumBST(10, 7, 15);
        System.out.printf("%d",ans);
    }
        
}
class Solution {
    int sum=0;
    public int rangeSumBST(int num, int low, int high) {
        
        if(num >= low && num<=high){
            sum=sum+num;
        }
        if(sum >= low && sum<=high)rangeSumBST(num, low,high);
        if(sum<= high)rangeSumBST(5, low,high);
        return sum;
    }
}
    
