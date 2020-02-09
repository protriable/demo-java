package com.protry.cal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 双向链表节点
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoubleLinkNode {

    private Object data;

    private DoubleLinkNode pre;

    private DoubleLinkNode next;

    public DoubleLinkNode(Object data) {
        this.data = data;
    }
}
