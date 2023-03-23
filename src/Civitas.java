abstract class Civitas {
    protected String nama, jenisKelamin;
    protected int umur;

    public Civitas(String nama, String jenisKelamin, int umur) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    // Function overloading
    public abstract void displayInfo();
}

// Kelas Dosen turunan dari Civitas
class Dosen extends Civitas {
    private String NIDN;

    public Dosen(String nama, String jenisKelamin, int umur, String NIDN) {
        super(nama, jenisKelamin, umur);
        this.NIDN = NIDN;
    }

    // Function overloading
    public void displayInfo() {
        System.out.println();
        System.out.println("=========================|DATA DIRI CIVITAS|=========================");
        System.out.println("DOSEN");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Umur          : " + umur);
        System.out.println("NIDN          : " + NIDN);
    }
}

// Kelas Mahasiswa turunan dari Civitas
class Mahasiswa extends Civitas {
    private String NIM;

    public Mahasiswa(String nama, String jenisKelamin, int umur, String NIM) {
        super(nama, jenisKelamin, umur);
        this.NIM = NIM;
    }

    // Function overloading
    public void displayInfo() {
        System.out.println();
        System.out.println("=========================|DATA DIRI CIVITAS|=========================");
        System.out.println("MAHASISWA");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Umur          : " + umur);
        System.out.println("NIDN          : " + NIM);
    }
}

// Kelas TenagaPendidik turunan dari Civitas
class TenagaPendidik extends Civitas {
    private String NIP;

    public TenagaPendidik(String nama, String jenisKelamin, int umur, String NIP) {
        super(nama, jenisKelamin, umur);
        this.NIP = NIP;
    }

    // Function overloading
    public void displayInfo() {
        System.out.println();
        System.out.println("=========================|DATA DIRI CIVITAS|=========================");
        System.out.println("TENAGA PENDIDIK");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Umur          : " + umur);
        System.out.println("NIDN          : " + NIP);
    }
}
