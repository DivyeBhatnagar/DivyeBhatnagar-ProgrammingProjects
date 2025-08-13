#include <stdio.h>

int main() {
    int a, b, temp;
    
    printf("Enter first number: ");
    scanf("%d", &a);
    printf("Enter second number: ");
    scanf("%d", &b);
    
    printf("\n With 3rd variable\n");
    printf("Before: a=%d b=%d\n", a, b);
    
    temp = a;
    a = b;
    b = temp;
    printf("After: a=%d b=%d\n", a, b);
    
    printf("\n Without 3rd variable\n");
    printf("Before: a=%d b=%d\n", a, b);
    a = a + b;
    b = a - b;
    a = a - b;
    printf("After: a=%d b=%d\n", a, b);
    
    return 0;
}