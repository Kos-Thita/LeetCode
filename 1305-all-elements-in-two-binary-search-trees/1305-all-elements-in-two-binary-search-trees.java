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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1=new ArrayList<>();
        getInorder(root1,arr1);

        ArrayList<Integer> arr2=new ArrayList<>();
        getInorder(root2,arr2);

        int i=0,j=0;
        ArrayList<Integer> result=new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<arr2.get(j)){
                result.add(arr1.get(i));
                i++;
            }else{
                result.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            result.add(arr1.get(i));
            i++;
        }

        while(j<arr2.size()){
            result.add(arr2.get(j));
            j++;
        }

        return result;
    }

    public static void getInorder(TreeNode root, ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        getInorder(root.left,arr);
        arr.add(root.val);
        getInorder(root.right,arr);
    }
}
    

    