package com.protry.cal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 二叉树节点类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeNode {

    public TreeNode(int data) {
        this.data = data;
    }

    /** 节点数据 */
    private int data;

    /** 左节点数据 */
    private TreeNode leftChild;

    /** 右节点数据 */
    private TreeNode rightChild;

    /**
     * 打印数据
     */
    public void display() {
        System.out.println(data);
    }
}
