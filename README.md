# Proiect-Sincretic-SDA


Se dă fișier text. Se cere să se calculeze pronunțabilitatea P a textului din fișier, după formula:
P = (număr total de vocale / număr total de consoane) * (1 / lungimea medie a cuvintelor).
Cuvintele se consideră separate prin spații sau semne de punctuație (virgula, punct, punct și
virgulă, semnul întrebării, semnul exclamării).


Programul parcurge fiecare caracter, cautand prima data in textul din fisier vocalele. In momentul in care a gasit o vocala, variabila "vocale" creste cu 1.
Exact acelasi lucru se intampla si pentru consoane, variabila "consoane" crescand cu 1.

Daca programul intalneste un caracter ce nu este litera, atunci variabila "nr_cuvinte" va creste cu 1.

Numarul de litere se obtine prin adunarea vocalelor si a consoanelor.

Lungimea medie a cuvintelor este reprezentata de raportul dintre numarul de litere si numarul de cuvinte.

Elementul final , "P", se afla prin inmultirea raportului vocalelor si consoanelor cu raportul dintre numarul 1 si lungimea medie a cuvintelor.

