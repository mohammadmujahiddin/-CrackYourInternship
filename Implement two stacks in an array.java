Implement two stacks in an array
Your task is to implement  2 stacks in one array efficiently. You need to implement 4 methods.
twoStacks : Initialize the data structures and variables to be used to implement  2 stacks in one array.
push1 : pushes element into first stack.
push2 : pushes element into second stack.
pop1 : pops element from first stack and returns the popped element. If first stack is empty, it should return -1.
pop2 : pops element from second stack and returns the popped element. If second stack is empty, it should return -1.

class twoStacks {
    int arr1[];
    int arr2[];
    int peek1 = 0;
    int peek2 = 0;
    twoStacks() {
        this.arr1 = new int[101];
        this.arr2 = new int[101];
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        peek1++;
        arr1[peek1] = x;
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        peek2++;
        arr2[peek2] = x;
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        if(peek1 == 0) return -1;
        int rm = arr1[peek1];
        arr1[peek1] = -1;
        peek1--;
        return rm;
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        if(peek2 == 0) return -1;
        int rm = arr2[peek2];
        arr2[peek2] = -1;
        peek2--;
        return rm;
    }
}
