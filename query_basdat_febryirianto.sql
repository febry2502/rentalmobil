-->Create TABLESPACE
CREATE TABLESPACE rentalmobil
  datafile 'F:\Praktikum\rentalmobil.dbf'
  size 30M;


-->create USER
CREATE USER febry_07085
  DENTIFIED BY febry
  DEFAULT TABLESPACE rentalmobil
  QUOTA 30M ON rentalmobil


-->Table penyewa
create table penyewa_07085
    (
    Id_penyewa INTEGER not null,
    Nama_penyewa VARCHAR2(30),
    Alamat VARCHAR2(100),
    No_ktp NUMBER(16),
    No_hp NUMBER(12),
    constraint PK_penyewa primary key (Id_penyewa)
    );

-->Table mobil
create table mobil_07085
    (
    Id_mobil INTEGER not null,
    Merk VARCHAR2(15),
    Jenis VARCHAR2(5),
    Nopol VARCHAR2(10),
    Kondisi VARCHAR2(10),
    Harga NUMBER(9),
    constraint PK_mobil primary key (Id_mobil)
    );

-->Table Transaksi
create table transaksi_07064
    (
    Id_order INTEGER not null,
    Id_penyewa INTEGER,
    Id_mobil INTEGER,
    Tanggal_sewa DATE,
    Tanggal_kembali DATE,
    Harga NUMBER(9),
    Total_bayar NUMBER(9),
   constraint PK_transaksi primary key (Id_order)
    );


alter table transaksi_07085
    add constraint FK_Id_penyewa FOREIGN KEY (Id_penyewa)
    references penyewa_07085(Id_penyewa)
    add constraint FK_Id_mobil FOREIGN KEY (Id_mobil)
    references mobil_07085(Id_mobil);



create sequence Id_order
minvalue 1
maxvalue 9999
start with 1
increment by 1
cache 20;


