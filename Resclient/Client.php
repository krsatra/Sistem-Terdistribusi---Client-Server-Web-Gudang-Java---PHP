<?php
session_start();
 
if (!isset($_SESSION['username'])) {
    header("Location: main.php");
    exit();
}

$sumber = 'http://localhost:8080/gudangRestful/webresources/gudangController/tampilData';
$konten = file_get_contents($sumber);
$data = json_decode($konten, true);

?>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <title>Gudang Gondang Gandung</title>
</head>

<nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">
  <div class="container-fluid">
    <img class="img-profile rounded-circle" src="img/undraw_profile.svg" style="width:70px; height:60px;">
    <a class="navbar-brand" href="#">Welcome Guys</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarScroll">
      <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="Client.php">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="main.php">Logout</a>
        </li>
      </ul>
      <!-- <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form> -->
    </div>
  </div>
</nav>

<div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h4 class="m-0 font-weight-bold text-primary">Gudang Toko Sumber Bukit</h4>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <div id="dataTable_wrapper" class="dataTables_wrapper dt-bootstrap4">
                                  <div class="row"><div class="col-sm-12 col-md-6"><div class="dataTables_length" id="dataTable_length">
                                  
                                </div>
                                <td><a
                                      href="Tambah.php" class="btn btn-primary">Tambah Data</a></td>
                                <div class="col-sm-12 col-md-6">
                                  <div id="dataTable_filter" class="dataTables_filter">
                                    </label>
                                  </div>
                                </div>
                              </div>
                              <div class="row"><div class="col-sm-12"><table class="table table-bordered dataTable" id="dataTable" width="100%" cellspacing="0" role="grid" aria-describedby="dataTable_info" style="width: 100%;">
                                    <thead>
                                        <tr role="row">
                                          <th class="sorting sorting_asc" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Name: activate to sort column descending" style="width: 74.2cm">Nama</th>
                                          <th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-label="Position: activate to sort column ascending" style="width: 97.2cm;">Harga</th>
                                          <th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-label="Office: activate to sort column ascending" style="width: 58.2cm;">Jumlah</th>
                                          <th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-label="Age: activate to sort column ascending" style="width: 60.2cm;">Tanggal Masuk</th>
                                          <th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-label="Start date: activate to sort column ascending" style="width: 66.2px;">Aksi</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                          <th rowspan="1" colspan="1">Nama</th
                                          ><th rowspan="1" colspan="1">Harga</th>
                                          <th rowspan="1" colspan="1">Jumlah</th>
                                          <th rowspan="1" colspan="1">Tanggal Masuk</th>
                                          <th rowspan="1" colspan="1">Aksi</th>
                                        </tr>
                                    </tfoot>
                                    <tbody>
                                    <?php foreach ($data as $a): ?>
                                      <!-- <tr>
                                          <td>
                                            <?= $a['id'] ?>
                                          </td> -->
                                      <td>
                                        <?= $a['nama'] ?>
                                      </td>
                                      <td>
                                        <?= $a['harga'] ?>
                                      </td>
                                      <td>
                                        <?= $a['jumlah'] ?>
                                      </td>
                                      <td>
                                        <?= $a['tgl_masuk'] ?>
                                      </td>
                                      <td><a
                                          href="EditData.php?id=<?= $a['id'] ?>&nama=<?= $a['nama'] ?>&harga=<?= $a['harga'] ?>&jumlah=<?= $a['jumlah'] ?>&tgl_masuk=<?= $a['tgl_masuk'] ?>"
                                          class="btn btn-warning">Edit</a></td>
                                      <td><a onclick="return confirm('apakah anda yakin ingin menghapus?')" href="Tampung3.php?id=<?= $a['id'] ?>"
                                          class="btn btn-danger">Delete</a></td>
                                      </tr>
                                    <?php endforeach; ?>
                                    </tbody>
                            </div>
                        </div>
                    </div>


</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
  integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>

</html>