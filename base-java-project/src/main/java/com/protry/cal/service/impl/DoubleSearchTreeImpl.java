package com.protry.cal.service.impl;

import com.protry.cal.entity.TreeNode;
import com.protry.cal.service.Tree;

public class DoubleSearchTreeImpl implements Tree {


    private TreeNode root;

    public DoubleSearchTreeImpl(TreeNode root) {
        this.root = root;
    }

    @Override
    public TreeNode find(int key) {
        TreeNode current = root;
        while (current != null) {
            //当前值比查找值大，搜索左子树
            if (current.getData() > key) {
                current = current.getLeftChild();
                //当前值比查找值小，搜索右子树
            } else if (current.getData() < key ){
                current = current.getRightChild();
            } else {
                return current;
            }
        }
        return null;//遍历完整个树没找到，返回null
    }

    @Override
    public boolean insert(int key) {
        TreeNode newTreeNode = new TreeNode(key);
        if (root == null) {
            root = newTreeNode;
            return true;
        } else {
            TreeNode current = root;
            TreeNode parentTreeNode;
            while (current != null) {
                parentTreeNode = current;
                //当前值比插入值大，搜索左子节点
                if (current.getData() > key) {
                    current = current.getLeftChild();
                    //左子节点为空，直接将该值插入该节点
                    if (current == null) {
                        parentTreeNode.setLeftChild(newTreeNode);
                        return true;
                    }
                } else {
                    current = current.getRightChild();
                    //右子节点为空，直接将该值插入该节点
                    if (current == null) {
                        parentTreeNode.setRightChild(newTreeNode);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean delete(int key) {
        TreeNode current = root;
        TreeNode parent = root;
        boolean isLeftChild = false;
        //查找删除值，没有则返回false
        while (current.getData() != key) {
            parent = current;
            //查找左子节点
            if (current.getData() > key) {
                current = current.getLeftChild();
                isLeftChild = true;
            } else { //查找右子节点
                isLeftChild = false;
                current = current.getRightChild();
            }
            //如果没有找到，返回false
            if (current == null) {
                return false;
            }
        }
        //如果没有子节点
        if (current.getLeftChild() == null && current.getRightChild() == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.setLeftChild(null);
            } else {
                parent.setRightChild(null);
            }
            return true;
            //有一个左子节点
        } else if (current.getLeftChild() == null && current.getRightChild() != null){
            if (current == root) {
                root = current.getRightChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getRightChild());
            } else {
                parent.setRightChild(current.getRightChild());
            }
            return true;
            //有一个右子节点
        } else if (current.getLeftChild() != null && current.getRightChild() == null){
            if (current == root) {
                root = current.getLeftChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getLeftChild());
            } else {
                parent.setRightChild(current.getLeftChild());
            }
            return true;
        }
        return false;
    }
}
