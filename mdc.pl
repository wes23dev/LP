mdc(X, X, X).
mdc(X, Y, Z) :-
    X >= Y,
    X1 is X - Y,
    mdc(Y, X1, Z).
mdc(X, Y, Z) :-
    X < Y,
    Y1 is Y - X,
    mdc(X, Y1, Z).
