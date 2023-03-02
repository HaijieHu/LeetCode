package leetcode.goForOffer;

import java.util.Stack;

public class Q9 {

    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(3);
        cQueue.deleteHead();
        cQueue.deleteHead();
        cQueue.deleteHead();
    }

    static class CQueue {

        private Stack<Integer> A;
        private Stack<Integer> B;


        public CQueue() {
            A = new Stack<>();
            B = new Stack<>();
        }

        public void appendTail(int value) {
            A.push(value);
        }

        public int deleteHead() {
            int res = -1;
            if (A.size() > 0) {
                while (A.size() > 0) {
                    B.push(A.pop());
                }
            }

            if (B.size() > 0) {
                res = B.pop();
            }

            while (B.size() > 0) {
                A.push(B.pop());
            }

            return res;
        }
    }
}
