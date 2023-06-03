<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Document</title>
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
          <a class="nav-link" href="#">Logout</a>
        </li>
      </ul>
      <!-- <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form> -->
    </div>
  </div>
</nav>

  <form action="Tampung.php" method="post">
    <div class="row">
      <div class="col-12">
        <div class="card shadow mb-4">
          <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">TAMBAH BARANG</h6>
          </div>
          <div class="card-body">
            <div class="form-group">
                <label for="exampleFormControlInput1" class="form-label">Nama</label>
                <input name="nama" type="text" class="form-control" id="exampleFormControlInput1" placeholder="Nama">
            </div>
            <div class="form-group">
                <label for="exampleFormControlInput1" class="form-label">Harga</label>
                <input name="harga" type="text" class="form-control" id="exampleFormControlInput1" placeholder="Harga">
            </div>
            <div class="form-group">
                <label for="exampleFormControlInput1" class="form-label">Jumlah</label>
                <input name="jumlah" type="text" class="form-control" id="exampleFormControlInput1" placeholder="Jumlah">
            </div>
            <div class="form-group">
                <label for="exampleFormControlInput1" class="form-label">Tanggal Masuk</label>
                <input name="tgl_masuk" type="date" class="form-control" id="exampleFormControlInput1" placeholder="Tanggal Masuk">
            </div>
          </div>
          <div class="card-footer">
            <button type="submit" class="btn btn-primary">Simpan</button>
            <a href="Client.php" class="btn btn-secondary">Kembali</a>
          </div>
        </div>
      </div>
    </div>
  </form>
    

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>

</html>