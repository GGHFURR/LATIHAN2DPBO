#include <iostream>
#include <vector>
#include <string>
#include <iomanip>

using namespace std;

class Human
{
private:
    // deklar variabel class human
    string nik, name, jenis_kelamin;

public:
    // constructor  human
    Human(string nik, string name, string jenis_kelamin)
    {
        this->nik = nik;
        this->name = name;
        this->jenis_kelamin = jenis_kelamin;
    }
    // getter/setter methods untuk class human
    string get_nik()
    {
        return nik;
    }

    void set_nik(string nik)
    {
        this->nik = nik;
    }

    string get_name()
    {
        return name;
    }

    void set_name(string name)
    {
        this->name = name;
    }

    string get_jenis_kelamin()
    {
        return jenis_kelamin;
    }

    void set_jenis_kelamin(string jenis_kelamin)
    {
        this->jenis_kelamin = jenis_kelamin;
    }
};

class Temp : public Human
{
private:
    // deklar variabel class Temp atau mahasiswa
    string nim, prodi, fakultas;

public:
    // constructor temp atau mahasiwa
    Temp(string nik, string name, string jenis_kelamin, string nim, string prodi, string fakultas) : Human(nik, name, jenis_kelamin) //: adalah super dari CPP
    {
        this->nim = nim;
        this->prodi = prodi;
        this->fakultas = fakultas;
    }

    // getter/setter methods untuk class temp atau mahasiswa
    string get_nim()
    {
        return nim;
    }

    void set_nim(string nim)
    {
        this->nim = nim;
    }

    string get_prodi()
    {
        return prodi;
    }

    void set_prodi(string prodi)
    {
        this->prodi = prodi;
    }

    string get_fakultas()
    {
        return fakultas;
    }

    void set_fakultas(string fakultas)
    {
        this->fakultas = fakultas;
    }
};

class SivitasAkademik : public Temp
{
private:
    // deklar variabel class sivitas akademik
    string asal_univ, email;

public:
    // constructor sivitasAkademik
    SivitasAkademik(string nik, string name, string jenis_kelamin, string nim, string prodi, string fakultas, string asal_univ, string email) : Temp(nik, name, jenis_kelamin, nim, prodi, fakultas)
    {
        this->asal_univ = asal_univ;
        this->email = email;
    }
    // getter/setter methods untuk class Sivitas akademik
    string get_asal_univ()
    {
        return asal_univ;
    }

    void set_asal_univ(string asal_univ)
    {
        this->asal_univ = asal_univ;
    }

    string get_email()
    {
        return email;
    }

    void set_email(string email)
    {
        this->email = email;
    }
};
