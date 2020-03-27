package com.zxp;

/**
 * @ClassName BinaryTree
 * @Description TODO
 * @Author zhaoxp
 * @Date 2019/9/5 22:27
 * @Version 1.0
 **/
public class BinaryTree {

    private TreeNode rootTree;

    public TreeNode getRootTree() {
        return rootTree;
    }

    public void setRootTree(TreeNode rootTree) {
        this.rootTree = rootTree;
    }

    class TreeNode{
        private int value;
        private TreeNode leftNode;
        private TreeNode rigutNode;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public TreeNode getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(TreeNode leftNode) {
            this.leftNode = leftNode;
        }

        public TreeNode getRigutNode() {
            return rigutNode;
        }

        public void setRigutNode(TreeNode rigutNode) {
            this.rigutNode = rigutNode;
        }
    }
}
