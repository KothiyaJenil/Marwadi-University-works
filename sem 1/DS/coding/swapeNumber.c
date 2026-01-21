#include <stdio.h>

int swapeFunc(int *Pnum1, int *Pnum2){
    // calculate the vcalue of num1 and num2
    *Pnum1 = *Pnum1 - *Pnum2;
    *Pnum2 = *Pnum1 + *Pnum2;
    *Pnum1 = *Pnum2 - *Pnum1;
}

void main(){
  int num1, num2;
  printf("Enter the first number : ");
  scanf("%d", &num1);
  printf("Enter the second number : ");
  scanf("%d", &num2);
  
  swapeFunc(&num1, &num2); // pass the address of the varibale 

  printf("\nnum1 value after the swaping : %d", num1);
  printf("\nnum2 value after the swaping : %d", num2);
}

