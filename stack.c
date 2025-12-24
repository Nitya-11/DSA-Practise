#include <stdio.h>
 
void push(int item) {
    if(top == n-1) {
        printf("stack overflow");
    } else {
        top++;
        stack[top] = item;
    }
}

void pop() {
    if(top == -1) {
        printf("stack underflow");
    } else {
        int item = stack[top];
        top--;
        printf("Popped element: %d",item);
    }
}

void display() {
    if(top == -1) {
        printf("stack is empty");
    } else {
        for(int i=top;i>=0;i--) {
            printf("%d",stack[i]);
        }
    }
}

