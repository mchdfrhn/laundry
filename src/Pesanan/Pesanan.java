package Pesanan;

public class Pesanan {
    private String id;
    private String pelanggan;
    private String tanggal;
    private String status;
    private  String total;

    public Pesanan(String id, String pelanggan, String tanggal, String status, String total) {
        this.id = id;
        this.pelanggan = pelanggan;
        this.tanggal = tanggal;
        this.status = status;
        this.total = total;
    }

    // Getter dan Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
