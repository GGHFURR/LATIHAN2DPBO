from Process import Human  # import class dari file sebelah
from Process import Temp
from Process import SivitasAkademik

# main function


def main():
    list = []  # deklar list
    no = 0  # deklar variable iterations
    while no < 10:
        # meminta inputan data
        print("=MENU INPUT=")
        nik = input("NIK       : ")
        # apabila inputan K maka berhenti dan print
        if nik == "N":
            break

        name = input("NAMA      : ")
        jenis_kelamin = input("JENIS KELAMIN : ")
        nim = input("NIM       : ")
        prodi = input("Prodi     : ")
        fakultas = input("Fakultas  : ")
        asal_univ = input("Asal Univ  : ")
        email = input("Email     : ")
        print()

        # masukkan inputan kedalam list
        list.append(SivitasAkademik(nik, name, jenis_kelamin,
                    nim, prodi, fakultas, asal_univ, email))
        no += 1

    # cetak data dalam bentuk table
    print("=================================================================================================================================")
    print("|   NIK   |      Name      |     Jenis Kelamin     |   nim    |     Prodi     |     fakultas     |     Asal     |     Email     |")
    print("=================================================================================================================================")

    # pengulangan untuk cetak data dalam list
    for obj in list:
        print("|{:<9}|{:<16}|{:<23}|{:<10}|{:<15}|{:<18}|{:<14}|{:<15}|".format(
            obj.get_nik(), obj.get_name(), obj.get_jenis_kelamin(), obj.get_nim(), obj.get_prodi(), obj.get_fakultas(), obj.get_asal_univ(), obj.get_email()))
    print("=================================================================================================================================")
    print()


if __name__ == "__main__":
    main()
