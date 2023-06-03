<?php
use LDAP\Result;
$url = 'http://localhost:8080/gudangRestful/webresources/gudangController/tambahData';
$ch = curl_init($url);
$ID = $_POST['id'];
$nama = $_POST['nama'];
$harga = $_POST['harga'];
$jumlah = $_POST['jumlah'];
$tgl_masuk = $_POST['tgl_masuk'];
$data = array("nama" => $nama, "harga" => $harga,"jumlah"=>$jumlah,"tgl_masuk" => $tgl_masuk);
// $data = array("id"=> 100);
$dataencode = json_encode($data);
curl_setopt($ch, CURLOPT_POST,1);
curl_setopt($ch, CURLOPT_POSTFIELDS,$dataencode);
curl_setopt($ch, CURLOPT_HTTPHEADER,array('Content-Type:application/json'));
$result = curl_exec($ch);
header("location: Client.php");
?>

