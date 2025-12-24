#include <stdio.h>

void multiplyMatrices(int a[10][10],int b[10][10],int result[10][10],int r1, int c1, int r2, int c2) {

    for(int i=0;i<r1;i++) {
        for(int j=0;j<c2;j++) {
            result[i][j] = 0;
        }
    }

    for(int i=0;i<r1;i++) {
        for(int j=0;j<c2;j++) {
            for(int k=0;k<c1;k++) {
                result[i][j] += a[i][k]*b[k][j];
            }
        }
    }
}

void displayMatrix(int matrix[10][10], int rows, int cols) {
    for(int i=0;i<rows;i++) {
        for(int j=0;j<cols;j++) {
            printf("%d",matrix[i][j]);
        }
    }
}

public static int main() {
    int a[10][10],b[10][10],result[10][10];
    int r1,c1,r2,c2;

    printf("Enter rows and cols of matrix A: ");
    scanf("%d %d",&r1,&c1);

    printf("Enter rows and cols of matrix B: ");
    scanf("%d %d",&r2,&c2);

    if(c1 != r2) {
        printf("Matrix muitiplication is not possible");
        return 0;
    }

    printf("Enter elememt of matrix A : ");
    for(int i=0;i<r1;i++) {
        for(int j=0;j<c1;j++) {
            scanf("%d",&a[i][j]);
        }
    }
    printf("Enter elememt of matrix B : ");
    for(int i=0;i<r2;i++) {
        for(int j=0;j<c2;j++) {
            scanf("%d",&b[i][j]);
        }
    }
}