//Fibonacci series (non - recursive)

#include <stdio.h>

int main() {
    int n, int first = 0, second = 1,next;
    printf("Enter the number: ");
    scanf("%d",&n);

    for(int i=1;i<=n;i++) {
        printf("%d",first);
        next = first + second;
        first = second;
        second = next;
    }
    return 0;
}


// code for factorial (Non-Recursive code)

#include <stdio.h>
int main() {
    int n;
    long factorial = 1;
    
    printf("enter the number: ");
    scanf("%d",&n);

    if(n<0) {
        printf("Factorial is not defined for the negative value");
    } else {
        for(int i=1;i<=n;i++) {
            factorial *= i;
        }
    }
    return 0;
}