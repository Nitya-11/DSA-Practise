// Fibonacci series(tail- recursive)

#include <stdio.h>

int fib(int n) {
    if(n == 0 || n==1){
        return n;
    }else {
        return fib(n-1)+fib(n-2);
    }
}

int main() {
    int n;

    printf("Enter the number of terms: ");
    scanf("%d",&n);

    for(int i=0;i<n;i++) {
        printf("%d",fib(i));
    }
    return 0;
}

// Non tail recursive function for factorial function

#include <stdio.h>

int factorial(int n) {
    if(n==0 || n==1) {
        return 1;
    return n * factorial(n-1);
    }     
}

int main() {
    int num;
    printf("Enter the number : ");
    scanf("%d",&num);

    printf("factorial is %d",factorial(num));
}

//tail recursive function for factorial function

#include <stdio.h>

int fact(int n, int result) {
    if(n==0 || n==1) {
        return result;
    return fact(n-1, n * result);
    }
}

int main() {
    int num;
    printf("Enter the non-negative number: ");
    scanf("%d",num);

    if(num < 0) {
        printf("Factorial is not defined for the negative number")
    } else {
        printf("Factorial is %d");
    }
    return 0;
}