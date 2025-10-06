pai(jose, joao).
pai(jose, carlos).
pai(carlos, cassio).
pai(cassio, karla).
pai(cassio, wesin).
pai(cassio, wendin).
pai(cassio, machadao).
pai(cassio, padre).

ancestral(X,Y) :- pai(X,Y).
ancestral(X,Y) :- pai(X,Z), ancestral(Z,Y), \+ Y=X.
