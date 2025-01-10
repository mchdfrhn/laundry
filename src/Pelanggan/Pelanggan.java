package Pelanggan;

public class Pelanggan {
        private String id;
        private String nama;
        private String telepon;
        private String alamat;

        public Pelanggan(String id, String nama, String telepon, String alamat) {
            this.id = id;
            this.nama = nama;
            this.telepon = telepon;
            this.alamat = alamat;
        }

        // Getter dan Setter
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getTelepon() {
            return telepon;
        }

        public void setTelepon(String telepon) {
            this.telepon = telepon;
        }

        public String getAlamat() {
            return alamat;
        }

        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }
}
