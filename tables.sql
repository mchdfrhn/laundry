create database laundry;

create table pelanggan (
	id serial primary key,
	nama varchar(100) not null,
	telepon varchar(15),
	alamat text
);

create table layanan (
  id serial primary key,
  nama_layanan varchar(50) not null,
  harga_per_kg numeric(10, 2) not null check (harga_per_kg > 0)
);

create table pesanan (
  id serial primary key,
  id_pelanggan int not null references pelanggan(id) on delete cascade,
  tanggal_pesanan timestamp default current_timestamp,
  status varchar(20) default 'Proses' check (status in ('Proses', 'Selesai', 'Dibatalkan')),
  total_harga numeric(10, 2) check (total_harga >= 0)
);

create table detail_pesanan (
  id serial primary key,
  id_pesanan int not null references pesanan(id) on delete cascade,
  id_layanan int not null references layanan(id) on delete cascade,
  berat_kg numeric(5, 2) not null check (berat_kg > 0),
  subtotal numeric(10, 2) not null check (subtotal >= 0)
);