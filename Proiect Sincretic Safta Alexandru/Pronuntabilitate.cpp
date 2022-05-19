#include <iostream>
#include <fstream>
using namespace std;
int main()
{
	ifstream f("input.txt");

	//Declarare variabile
	
	double P, lungime;
	int vocale = 0, consoane = 0, nr_litere, nr_cuvinte = 0;
	char c;

	while (f.get(c))
	{
		if (strchr("aeiouAEIOU", c))  //Cautare litere care sunt vocale
			vocale++;
		else if (strchr("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ", c))  //Cautare litere care sunt consoane
			consoane++;


		else {
			while (strchr(",.;?!", c))  //Cautare caractere speciale 
				f.get(c);
			nr_cuvinte++;
		}
	}

	nr_cuvinte++;

	f.close();

	nr_litere = vocale + consoane;  //Numarul de litere obtinut prin adunarea tuturor vocalelor si consoanelor gasite in text

	lungime = (double)nr_litere / nr_cuvinte;  //Lungimea medie a cuvintelor obtinuta prin raportul numarului de litere si al numarului de cuvinte

	P = ((double)vocale / consoane) * (1 / lungime);  //Calcularea pronuntabilitatii

	
	//Afisare in consola 
	
	cout << "Numar cuvinte : " << nr_cuvinte << endl << endl;
	cout << "Vocale : " << vocale << endl << endl;
	cout << "Consoane : " << consoane << endl << endl;
	cout << "Lungimea medie a cuvintelor : " << lungime << endl << endl;
	cout << "Pronuntabilitatea textului este " << P << endl << endl;

	system("pause");

	return 0;
}
