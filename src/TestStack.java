
class Stack {
    int stck[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack Overflow.");
        } else {
            tos++;
            stck[tos] = item;
        }
    }

    int pop() {
        if (tos == -1) {
            System.out.println("Stack Underflow.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

class TestStack {
    public static void main(String args[]) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for (int i = 0; i < 11; i++) {
            mystack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            mystack2.push(i);
        }

        System.out.println("Stack in mystack1");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }

        System.out.println("Stack in mystack2");
        for (int i = 0; i < 11; i++) {
            System.out.println(mystack2.pop());
        }
    }
}
