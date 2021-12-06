package com.zxp.linked_list;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MyLinkedListTest {
    @Test
    public void testReverse(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(3);
        myLinkedList.addNode(4);
        myLinkedList.addNode(5);

        MyLinkedList<Integer> dstLinkedList = myLinkedList.reverse();
        MyLinkedList<Integer>.Node<Integer> node = dstLinkedList.getHead();
        int i = 5;
        Assert.assertEquals(node.getData(), Integer.valueOf(i));
        while (node.hasNext()) {
            i --;
            node = node.getNext();
            Assert.assertEquals(node.getData(), Integer.valueOf(i));
        }
    }

    @Test
    public void testReverseNull(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        MyLinkedList<Integer> dstLinkedList = myLinkedList.reverse();
        Assert.assertNull(dstLinkedList.getHead());
    }

}
