/**
 * Definition for a binary tree node.
 
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/**
*  TC: O(n) : n is the number of nodes in tree
    SC: O(h): height of the tree
    submission successfull on leetcode
*
**/
class Solution {
    
    public boolean isValidBST(TreeNode root) {
        
          if(root==null) return true;
        return checkValidity(root,null,null);
        
    }
    
    private boolean checkValidity(TreeNode root, Integer max, Integer min){
         if(root==null) return true;
        
        // logic
        
        if(max!=null && root.val>=max) return false;
        if(min!=null && root.val<=min) return false;
        boolean case1= checkValidity(root.left,root.val,min);
        
        boolean case2= checkValidity(root.right,max,root.val);
        
        return case1 && case2;

    }
    
}