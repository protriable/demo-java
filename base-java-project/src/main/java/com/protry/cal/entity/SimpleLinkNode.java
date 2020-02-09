package com.protry.cal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 单向列表的节点
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimpleLinkNode {

    private Object data;
    private SimpleLinkNode next;

    public SimpleLinkNode(Object data) {
        this.data = data;
    }
}
