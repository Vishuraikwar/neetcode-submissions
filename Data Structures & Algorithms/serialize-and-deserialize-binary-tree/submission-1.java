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

public class Codec {
    List<String> list = new ArrayList<>();
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        dfsSerialize(root);
        return String.join(",",list);
    }
    public void dfsSerialize(TreeNode root){
        if(root == null) {
            list.add("N");
            return;
        }
        list.add(String.valueOf(root.val));
        dfsSerialize(root.left);
        dfsSerialize(root.right);
        return;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return dfsd(queue);
    }
    public TreeNode dfsd(Queue<String> queue){
        if(queue.isEmpty()) return null;

    
        String val = queue.poll();
        if(val.equals("N")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = dfsd(queue);
        root.right = dfsd(queue);
        return root;
    }
}
