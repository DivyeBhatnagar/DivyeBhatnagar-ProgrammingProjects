#include <stdio.h>

int main() {
    float m, f;
    
    printf("Enter meters: ");
    scanf("%f", &m);
    
    f = m * 3.28084f;
    
    printf("%.2f meters = %.2f feet\n", m, f);
    
    return 0;
}