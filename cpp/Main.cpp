#include <iostream>
#include <vector>
#include <string>
#include <iomanip>
#include "process.cpp"

using namespace std;

int main()
{
    vector<SivitasAkademik> list; // deklaR list dalam bentuk vector untuk memudahkan pengaksesan
    int no = 0;

    while (no < 10)
    {
        // menampilkan menu input
        cout << "=MENU INPUT=" << endl;
        string nik, name, jenis_kelamin, nim, prodi, fakultas, asal_univ, email;
        cout << "NIK       : ";
        cin >> nik;
        // apabila input NIK == N maka berhenti untuk menerima masukan
        if (nik == "N")
        {
            break;
        }

        cout << "NAMA      : ";
        cin >> name;
        cout << "JENIS KELAMIN : ";
        cin >> jenis_kelamin;
        cout << "NIM       : ";
        cin >> nim;
        cout << "Prodi     : ";
        cin >> prodi;
        cout << "Fakultas  : ";
        cin >> fakultas;
        cout << "Asal Univ : ";
        cin >> asal_univ;
        cout << "Email     : ";
        cin >> email;

        // memasukkan inputan kedalam list

        list.push_back(SivitasAkademik(nik, name, jenis_kelamin, nim, prodi, fakultas, asal_univ, email));
        no++;
    }

    // mencetak isi list dalam bentuk tabel
    cout << "=================================================================================================================================" << endl;
    cout << "|   NIK   |      Name      |     Jenis Kelamin     |   nim    |     Prodi     |     fakultas     |     Asal     |     Email     |" << endl;
    cout << "=================================================================================================================================" << endl;

    for (SivitasAkademik obj : list)
    {
        cout << "|" << left << setw(9) << obj.get_nik()
             << "|" << left << setw(16) << obj.get_name()
             << "|" << left << setw(23) << obj.get_jenis_kelamin()
             << "|" << left << setw(10) << obj.get_nim()
             << "|" << left << setw(15) << obj.get_prodi()
             << "|" << left << setw(18) << obj.get_fakultas()
             << "|" << left << setw(14) << obj.get_asal_univ()
             << "|" << left << setw(15) << obj.get_email()
             << "|" << endl;
    }

    cout << "=================================================================================================================================" << endl;
    cout << endl;

    return 0;
}
