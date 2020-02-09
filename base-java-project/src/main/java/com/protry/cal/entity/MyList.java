package com.protry.cal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MyList {

    private DoubleLinkNode head;

    private DoubleLinkNode tail;

    private int size = 0;

    public MyList() {
        head = new DoubleLinkNode();
        tail = new DoubleLinkNode();
        head.setNext(null);
        tail.setPre(null);
    }

    public boolean empty() {
        return head.getNext()==null;
    }

    //找到所找下标节点的前一个节点
    public DoubleLinkNode findPre(int index ) {
        DoubleLinkNode rNode = head;

        int idx = 0;

        while (rNode.getNext() != null) {
            if (idx == index) {
                return rNode;
            }
            rNode = rNode.getNext();
            idx ++;
        }
        return null;
    }

    public DoubleLinkNode findThis(int index) {
        DoubleLinkNode rNode = head;
        //把rNode想象为指针，dex为指向的下标，这个地方很容易错，因为当指向最后一个节点时没有判断IF就跳出循环了
        int idx = 0;
        while (rNode.getNext() != null) {
            if (idx == index+1) {
                return rNode;
            }
            rNode = rNode.getNext();
            idx ++;
        }
        //TODO ?? 为什么要用size？？这个应该是最后一个，应该比的是index吧？
        if (idx == size) {
            return rNode;
        }
        return null;
    }

    // 往链表末尾加入节点
    public void add(Object object) {
        DoubleLinkNode node = new DoubleLinkNode(object);
        DoubleLinkNode rNode = head;
        //如果是空链表的话插入一个节点，这个节点的pre不能指向上一个节点，必须指空
        if (this.empty()) {
            rNode.setNext(node);
            rNode.getNext().setPre(null);
            tail.setPre(node);
        } else {
            while (rNode.getNext() != null) {
                rNode = rNode.getNext();
            }
            rNode.setNext(node);
            node.setPre(rNode);
            tail.setPre(node);
        }
        size++;

    }

    //往链表的某一个标插入一个节点
    public boolean add(Object object, int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        DoubleLinkNode node = new DoubleLinkNode(object);
        DoubleLinkNode preNode = this.findPre(index);
        //前一个节点的下一个节点的前置节点指向新节点
        preNode.getNext().setPre(node);
        //新节点的下一个节点指向前一个节点的下一个节点
        node.setNext(preNode.getNext());
        //新节点的前置节点指向前节点
        node.setPre(preNode);
        //前节点的后置节点指向新节点
        preNode.setNext(node);
        size++;
        return true;
    }

    public boolean add(int index, MyList myList) {
        if (index<0 || index> size) {
            return false;
        }
        DoubleLinkNode preNode = this.findPre(index);
        //新插入列的最后一个节点的下一个节点指向 预插入位置前置节点的下一个节点
        myList.tail.getPre().setNext(preNode.getNext());
        //与插入位置前置节点的下一个节点的前一个节点指向 新插入列的最后一个节点的前一个节点
        preNode.getNext().setPre(myList.tail.getPre().getPre());
        myList.head.getNext().setPre(preNode.getPre());
        preNode.setNext(myList.head.getNext());
        myList.head = null;
        myList.tail = null;
        size += myList.size;
        return true;
    }

    public Object remove(int index) {

        if (index<0 || index> size) {
            return null;
        }
        //特殊情况，当移除节点是最后一个节点的时候
        if (index == size-1) {
            this.tail.setPre(this.tail.getPre().getPre());
            //TODO 这个应该不需要了吧
            this.tail.getPre().getNext().setPre(null);
            //END
            this.tail.getPre().setNext(null);

        } else {
            DoubleLinkNode preNode = this.findPre(index);
            preNode.setNext(preNode.getNext().getNext());
            preNode.getNext().getPre().setNext(null);
            preNode.getNext().setPre(preNode.getNext().getPre().getPre());

        }

        size--;
        return this.get(index);
    }

    public Object get(int index) {
        DoubleLinkNode node = this.findThis(index);
        return node == null?null: node.getData();
    }

}
