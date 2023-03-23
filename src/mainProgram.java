public class mainProgram {
    public static void main(String[] args) {
        Civitas[] civitas = new Civitas[3];

        //array civitas berdasarkan objek simulasi
        civitas[0] = new Dosen("Ir. Subakjo Sudarso Kusumo, S.Kom., M.Kom.", "Laki-laki", 41, "317302065525511");
        civitas[1] = new Mahasiswa("Theodorik Raditya Kusuma", "Laki-laki", 19, "225150701111030");
        civitas[2] = new TenagaPendidik("Erika Sabdono", "Perempuan", 35, "517308076686633");
        for (int i = 0; i < civitas.length; i++) {
            civitas[i].displayInfo();
        }
    }
}