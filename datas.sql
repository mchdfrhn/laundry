insert into pelanggan (nama, telepon, alamat) values
('Andi Wijaya', '081234567890', 'Jl. Merdeka No. 10'),
('Budi Santoso', '081234567891', 'Jl. Pahlawan No. 5'),
('Citra Lestari', '081234567892', 'Jl. Sudirman No. 22'),
('Dewi Permata', '081234567893', 'Jl. Thamrin No. 8'),
('Eka Pratama', '081234567894', 'Jl. Diponegoro No. 15');

insert into layanan (nama_layanan, harga_per_kg) values
('Cuci Kering', 15000.00),
('Cuci Lipat', 12000.00),
('Setrika Saja', 8000.00),
('Cuci Lengkap', 20000.00),
('Paket Ekspres', 25000.00);

insert into pesanan (id_pelanggan, status, total_harga) values
(1, 'Proses', 60000.00),
(2, 'Selesai', 45000.00),
(3, 'Dibatalkan', 75000.00),
(4, 'Proses', 50000.00),
(5, 'Selesai', 100000.00);

insert into detail_pesanan (id_pesanan, id_layanan, berat_kg, subtotal) values
(1, 1, 3.0, 45000.00),
(1, 3, 1.5, 12000.00),
(2, 2, 3.0, 36000.00),
(3, 4, 4.0, 80000.00),
(5, 5, 4.0, 100000.00);