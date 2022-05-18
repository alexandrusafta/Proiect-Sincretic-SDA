#include <iostream>
#include <fstream>
using namespace std;
int main()
{
	ifstream f("input.txt");

	double P, lungime;
	int vocale = 0, consoane = 0, nr_litere, nr_cuvinte = 0;
	char c;

	while (f.get(c))
	{
		if (strchr("aeiouAEIOU", c))
			vocale++;
		else if (strchr("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ", c))
			consoane++;
		else nr_cuvinte++;
	}

	nr_cuvinte++;

	f.close();

	nr_litere = vocale + consoane;

	lungime = (double)nr_litere / nr_cuvinte;

	P = ((double)vocale / consoane) * (1 / lungime);

	cout << "Numar cuvinte : " << nr_cuvinte << endl << endl;
	cout << "Vocale : " << vocale << endl << endl;
	cout << "Consoane : " << consoane << endl << endl;
	cout << "Lungimea medie a cuvintelor : " << lungime << endl << endl;
	cout << "Pronuntabilitatea textului este "<<P<<endl<<endl;

	system("pause");

	return 0;
}