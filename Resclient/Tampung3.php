<?php
use LDAP\Result;
$url = 'http://localhost:8080/gudangRestful/webresources/gudangController/deleteDataID';
$ch = curl_init($url);
$ID = $_GET['id'];
$data = array("id" => $ID);
// $data = array("id"=> 100);
$dataencode = json_encode($data);
curl_setopt($ch, CURLOPT_POST,1);
curl_setopt($ch, CURLOPT_POSTFIELDS,$dataencode);
curl_setopt($ch, CURLOPT_HTTPHEADER,array('Content-Type:application/json'));
$result = curl_exec($ch);
header("location: Client.php");
?>

