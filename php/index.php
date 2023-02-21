<?php
require('class.php');

//pemasukkan isi list secara hardcode 
$list = array(
    new SivitasAkademik("110000", "Ghafur", "Laki", "2106923", "ilkom", "FPMIPA", "upiedun", "gghfurr@upi.edu"),
    new SivitasAkademik("110001", "Jhonny", "Laki", "2106872", "ilkom", "FPMIPA", "upiedun", "johnyyesspapa@upi.edu"),
    new SivitasAkademik("110022", "Ryujin", "Sista", "2106232", "ilkom", "FPMIPA", "upiedun", "rujintwice@upi.edu")
);


//cetak data 
echo "<h1> SHOW DATA AWAL </h1>";
echo "<table border=1>";
echo "<tr><th>NIK</th><th>Nama</th><th>Jenis Kelamin</th><th>NIM</th><th>Prodi</th><th>Fakultas</th><th>Asal</th><th>Email</th></tr>";
//looping tampil data
foreach ($list as $listkeren) {
    echo "<tr>";
    echo "<td>" . $listkeren->getnik() . "</td>";
    echo "<td>" . $listkeren->getname() . "</td>";
    echo "<td>" . $listkeren->getJenisKelamin() . "</td>";
    echo "<td>" . $listkeren->getNim() . "</td>";
    echo "<td>" . $listkeren->getProdi() . "</td>";
    echo "<td>" . $listkeren->getFakultas() . "</td>";
    echo "<td>" . $listkeren->getAsalUniv() . "</td>";
    echo "<td>" . $listkeren->getEmail() . "</td>";
    echo "</tr>";
}
echo "</table>";
