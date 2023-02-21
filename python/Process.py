class Human:
    def __init__(self, nik, name, jenis_kelamin):  # constructed human
        self.nik = nik
        self.name = name
        self.jenis_kelamin = jenis_kelamin

    # getter/setter methods untuk class human
    def get_nik(self):
        return self.nik

    def set_nik(self, nik):
        self.nik = nik

    def get_name(self):
        return self.name

    def set_name(self, name):
        self.name = name

    def get_jenis_kelamin(self):
        return self.jenis_kelamin

    def set_jenis_kelamin(self, jenis_kelamin):
        self.jenis_kelamin = jenis_kelamin


class Temp(Human):

    # constructor temp atau mahasiwa
    def __init__(self, nik, name, jenis_kelamin, nim, prodi, fakultas):
        # pemanggilan variabel di kelas parent
        super().__init__(nik, name, jenis_kelamin)
        self.nim = nim
        self.prodi = prodi
        self.fakultas = fakultas

    # getter/setter methods untuk class temp atau mahasiswa
    def get_nim(self):
        return self.nim

    def set_nim(self, nim):
        self.nim = nim

    def get_prodi(self):
        return self.prodi

    def set_prodi(self, prodi):
        self.prodi = prodi

    def get_fakultas(self):
        return self.fakultas

    def set_fakultas(self, fakultas):
        self.fakultas = fakultas


class SivitasAkademik(Temp):
    # constructor sivitasAkademik
    def __init__(self, nik, name, jenis_kelamin, nim, prodi, fakultas, asal_univ, email):
        # pemanggilan variabel kelas parent
        super().__init__(nik, name, jenis_kelamin, nim, prodi, fakultas)
        self.asal_univ = asal_univ
        self.email = email

    # getter/setter methods untuk class Sivitas akademik
    def get_asal_univ(self):
        return self.asal_univ

    def set_asal_univ(self, asal_univ):
        self.asal_univ = asal_univ

    def get_email(self):
        return self.email

    def set_email(self, email):
        self.email = email
