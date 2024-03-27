import java.util.Scanner
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val scanner = Scanner(System.`in`)
    val daftarTugas = DaftarTugas()

    while (true) {
        println("Menu:")
        println("1. Tambah Tugas")
        println("2. Lihat Daftar Tugas")
        println("3. Ubah Status Tugas")
        println("4. Keluar")
        print("Pilih menu (1/2/3/4): ")
        val menu = scanner.nextInt()

        when (menu) {
            1 -> {
                print("Masukkan nama tugas: ")
                val namaTugas = scanner.next()
                print("Masukkan deadline tugas (contoh: 'Senin'): ")
                val deadline = scanner.next()
                daftarTugas.tambahTugas(namaTugas, deadline)
            }
            2 -> daftarTugas.lihatDaftarTugas()
            3 -> {
                print("Masukkan nama tugas yang ingin diubah statusnya: ")
                var namaTugas = scanner.next()
                while (!daftarTugas.isTugasExist(namaTugas)) {
                    println("Nama tugas tidak ada. Masukkan nama tugas yang valid:")
                    namaTugas = scanner.next()
                }
                print("Masukkan status baru ('selesai' atau 'belum'): ")
                val status = scanner.next()
                daftarTugas.ubahStatusTugas(namaTugas, status)
            }
            4 -> {
                println("Keluar dari program.")
                break
            }
            else -> println("Menu tidak valid. Silakan pilih menu yang sesuai.")
        }
    }
}