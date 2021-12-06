package com.zxp.linked_list;

public class MyLinkedList<T> {
    private Node<T> head;

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getHead() {
        return head;
    }

    class Node<G> {
        private G data;
        private Node<G> next;

        public Node(G data) {
            this.data = data;
        }

        public G getData() {
            return data;
        }

        public void setData(G data) {
            this.data = data;
        }

        public Node<G> getNext() {
            return next;
        }

        public void setNext(Node<G> next) {
            this.next = next;
        }

        public boolean hasNext() {
            return next == null;
        }
    }

    /**
     * 向链表头部插入元素
     * @param node 插入的元素
     * @return MyLinkedList
     */
    public MyLinkedList<T> addHead(Node<T> node) {
        if (this.getHead() == null) {
            this.setHead(node);
            return this;
        }
        node.setNext(this.getHead());
        this.setHead(node);
        return this;
    }

    public MyLinkedList<T> addNode(T data){
        Node<T> tNode = new Node<>(data);
        if (this.head == null) {
            this.head = tNode;
            return this;
        }

        Node<T> node = head;
        while (node.getNext() != null ) {
            node = node.getNext();
        }
        node.setNext(tNode);
        return this;
    }

    public void delNode(T data) {
        if (head == null || data == null) {
            return;
        }

        if (data.equals(head.getData())) {
            head = head.getNext();
            return;
        }

        Node<T> node = this.head;
        while (node.getNext() != null) {
            if (data.equals(node.getNext().getData())) {
                node.setNext(node.getNext().getNext());
                return;
            }
            node = node.getNext();
        }
    }

    public MyLinkedList<T> reverse(){
        //链表为空或者链表只有一个元素不需要进行操作
        if (head == null || head.getNext() == null) {
            return this;
        }

        //创建一条新链表
        MyLinkedList<T> dstLinked = new MyLinkedList<>();

        while (this.getHead() != null) {
            Node<T> node = this.getHead();
            //将首元素弹出
            this.setHead(node.getNext());
            node.setNext(null);

            dstLinked.addHead(node);
        }

        return dstLinked;
    }
}
