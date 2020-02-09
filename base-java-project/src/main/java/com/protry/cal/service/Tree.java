package com.protry.cal.service;

import com.protry.cal.entity.TreeNode;

/**
 * 二叉树
 */
public interface Tree {

    //查找节点
    TreeNode find(int key);

    //插入新节点
    boolean insert(int key);

    //删除节点
    boolean delete(int key);
}
