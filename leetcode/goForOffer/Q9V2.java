package leetcode.goForOffer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Q9V2 {

    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(3);
        cQueue.deleteHead();
        cQueue.deleteHead();
        cQueue.deleteHead();
    }

    static class CQueue {

        private Deque<Integer> A;
        private Deque<Integer> B;


        public CQueue() {
            A = new ArrayDeque<>();
            B = new ArrayDeque<>();
        }

        public void appendTail(int value) {
            A.push(value);
        }

        public int deleteHead() {
            if (B.size() > 0) {
                return B.pop();
            }

            if (A.size() == 0 && B.size() == 0) {
                return -1;
            }

            while (A.size() > 1) {
                B.push(A.pop());
            }

            return A.pop();
        }
    }
}
