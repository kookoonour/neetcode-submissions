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

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
    List<List<Integer>> resultingList = new ArrayList<>();

    Queue<TreeNode> q = new LinkedList<>();

    q.add(root);

    while(!q.isEmpty()){
        List<Integer> currLevel = new ArrayList<>();

        for(int i = q.size() ; i > 0 ; i --){
            TreeNode currNode = q.poll();

            if(currNode != null){
                currLevel.add(currNode.val);
                q.add(currNode.left);
                q.add(currNode.right);
            }
        }

        if(currLevel.size() > 0 ){
            resultingList.add(currLevel);
        }
    }
    return resultingList; 
    }




    
}
