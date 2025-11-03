
#include <stdio.h>



#define inicio {
#define fim }
#define inteiro int
#define recebe =
#define imprima(texto) printf("%s", texto)
#define leiaInt(x) scanf("%d", &x)
#define maior(x,y) ((x) > (y) ? (x) : (y))
#define imprimaInt(z) printf("%d", z)

int main() inicio
    inteiro x, y, z;
    imprima("Digite 2 numeros");
    leiaInt(x);
    leiaInt(y);
    z = maior(x,y);
    imprima("Maior = ");
    imprimaInt(z);
    fim

 
