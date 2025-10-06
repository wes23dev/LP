vendas(leite,alimento,1.00, 7.00,51).
vendas(pilha,eletro,2.00,3.00,105).
vendas(arroz,alimento,5.00,10.00,300).
vendas(alcool,limpeza,3.00,8.00,57).
vendas(bombril,limpeza,1.00,2.00,17).

lucroTotal(Prod,baixo):-
	vendas(Prod,_,PrecoC,Preco,_),
	Lucro is (Preco - PrecoC) / PrecoC * 100, Lucro < 30.

lucroTotal(Prod,medio):-
	vendas(Prod,_,PrecoC,Preco,_),
	Lucro is (Preco - PrecoC) / PrecoC * 100, Lucro >= 30, Lucro < 60.

lucroTotal(Prod,alto):-
	vendas(Prod,_,PrecoC,Preco,_),
	Lucro is (Preco - PrecoC) / PrecoC * 100, Lucro >= 60.
