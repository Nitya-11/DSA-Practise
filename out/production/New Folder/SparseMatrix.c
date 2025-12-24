#include <stdio.h>

#define MAX 50

//Function to read sparse matrix in triplet form
void readSparse(int X[MAX][3]) {
    int rows, cols, t;
    printf("Enter number of rows columns and non-zero elements : ");
    scanf("%d %d %d",&rows,&cols,&t);

    X[0][0] = rows;
    X[0][1] = cols;
    X[0][2] = t;

}

//Function to add two sparse Matrix
void addSparse(int A[MAX][3],intB[MAX][3], intC[MAX][3]) {
    int i=1,j=1,k=1;
    int tA = A[0][2],tB = B[0][2];

    //check if additional is possible
    if(A[0][0] != B[0][0] || A[0][1] != B[0][1]) {
        printf("Additional is not possible! Dimensions are different");
        return;
    }

    C[0][0] = A[0][0];
    C[0][1] = A[0][1];

    //Add matrices in triplet form
    while(i<= tA && j <= tB) {
        if(A[i][0] < B[j][0] || (A[i][0] == B[j][0] && A[i][1] < B[j][1])) {
            C[k][0] = A[i][0];
            C[k][1] = A[i][1];
            C[k][2] = A[i][2];
            i++;k++;
        }
        else if(A[i][0] > B[j][0] || (A[i][0] == B[j][0] && A[i][1] > B[j][1])) {
            C[k][0] = B[i][0];
            C[k][1] = B[i][1];
            C[k][2] = B[i][2];
            i++;k++;
        }
        else {
            int sum = A[i][2] +B[j][2];
            if(sum != 0) {
                C[k][0] = A[i][0];
                C[k][1] = A[i][1];
                C[k][2] = sum;
                k++;
            }
            i++;j++;
        }
    }

    while(i<=tA) {
        C[k][0] = A[i][0];
        C[k][1] = A[i][1];
        C[k][2] = A[i][2];
        i++;k++;
    }
    while(i<=tA) {
        C[k][0] = A[i][0];
        C[k][1] = A[i][1];
        C[k][2] = A[i][2];
        i++;k++;
    }

    C[0][2] = k-1;
}

//function to display matrix in readable form

void displayMatrix(int X[MAX][3]) {
    int rows = X[0][0], cols = X[0][1],t = X[0][2];
    int k=1;
    printf("Resultant Matrix: ");
    for(int i=0;i<rows;i++) {
        for(int j=0;j<cols;j++) {
            if(k<=t && i == X[k][0] && j == X[k][1]) {
                print("%d",X[k][2]);
                k++;
            } else {
                printf("0");
            }
        }
    }
}

int main() {
    int A[MAX][3],B[MAX][3],MAX[3];

    printf("Enter first sparse matrix: ");
    readSparse(A);

    printf("Enter second sparse matrix: ");
    readSparse(B);

    addSparse(A,B,C);
    displayMatrix(C);
}