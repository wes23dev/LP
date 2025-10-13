fatorial(1, 1).
fatorial(X,Num):- X1 is X-1,
	fatorial(X1,N1),
    Num is X * N1.
