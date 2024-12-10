class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>ans = new ArrayList<>();
        List<Integer>counts = new ArrayList<>();
        
        calculateAverage(root, ans, counts, 0);
        for(int i = 0; i < counts.size(); i++)
            ans.set(i, ans.get(i) / counts.get(i));
        
        return ans;
    }

    private void calculateAverage(TreeNode node, List<Double> ans, List<Integer> counts, int level){
        if (node == null) return;

        if (ans.size() - 1 < level) {
            counts.add(1);
            ans.add((double)node.val);
        } else {
            counts.set(level, counts.get(level) + 1);
            ans.set(level, ans.get(level) + (double)node.val);
        }
        level++;
        calculateAverage(node.left, ans, counts, level);
        calculateAverage(node.right, ans, counts, level);
    }
}
