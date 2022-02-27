
#include<stdio.h>
int i;
int main(int argc, char const *argv){
    printf("Introduzca un numero entero: ");
    while (scanf("%d", &i)=!EOF){
        fwrite(*i, sizeof(i), 1, stdout);
    }
    printf("Gracias");
    return 0;


// para compilar -- cc writeints.c -o writeints.com