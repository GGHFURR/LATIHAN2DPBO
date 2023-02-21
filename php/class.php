<?php

class Human
{
    // deklar variabel class human
    public $nik;
    public $name;
    public $jenis_kelamin;

    // constructor  human
    public function __construct($nik, $name, $jenis_kelamin)
    {
        $this->nik = $nik;
        $this->name = $name;
        $this->jenis_kelamin = $jenis_kelamin;
    }
    // getter/setter methods untuk class human
    public function getNik()
    {
        return $this->nik;
    }

    public function setNik($nik)
    {
        $this->nik = $nik;
    }

    public function getName()
    {
        return $this->name;
    }

    public function setName($name)
    {
        $this->name = $name;
    }

    public function getJenisKelamin()
    {
        return $this->jenis_kelamin;
    }

    public function setJenisKelamin($jenis_kelamin)
    {
        $this->jenis_kelamin = $jenis_kelamin;
    }
}

class Temp extends Human
{
    // deklar variabel class Temp atau mahasiswa
    public $nim;
    public $prodi;
    public $fakultas;

    // constructor temp atau mahasiwa
    public function __construct($nik, $name, $jenis_kelamin, $nim, $prodi, $fakultas)
    {
        parent::__construct($nik, $name, $jenis_kelamin);
        $this->nim = $nim;
        $this->prodi = $prodi;
        $this->fakultas = $fakultas;
    }
    // getter/setter methods untuk class temp atau mahasiswa
    public function getNim()
    {
        return $this->nim;
    }

    public function setNim($nim)
    {
        $this->nim = $nim;
    }

    public function getProdi()
    {
        return $this->prodi;
    }

    public function setProdi($prodi)
    {
        $this->prodi = $prodi;
    }

    public function getFakultas()
    {
        return $this->fakultas;
    }

    public function setFakultas($fakultas)
    {
        $this->fakultas = $fakultas;
    }
}

class SivitasAkademik extends Temp
{
    // deklar variabel class sivitas akademik
    public  $asal_univ;
    public  $email;
    // constructor sivitasAkademik
    public function __construct($nik, $name, $jenis_kelamin, $nim, $prodi, $fakultas, $asal_univ, $email)
    {
        parent::__construct($nik, $name, $jenis_kelamin, $nim, $prodi, $fakultas);
        $this->asal_univ = $asal_univ;
        $this->email = $email;
    }
    // getter/setter methods untuk class Sivitas akademik
    public function getAsalUniv()
    {
        return $this->asal_univ;
    }

    public function setAsalUniv($asal_univ)
    {
        $this->asal_univ = $asal_univ;
    }

    public function getEmail()
    {
        return $this->email;
    }

    public function setemail($email)
    {
        $this->email = $email;
    }
}
