class Tugas(val namaTugas: String, val deadline: String, var status: String)

class DaftarTugas {
    private val tugasList = mutableListOf<Tugas>()

    fun tambahTugas(nama: String, deadline: String) {
        tugasList.add(Tugas(nama, deadline, "belum"))
        println("Tugas berhasil ditambahkan!")
    }

    fun lihatDaftarTugas() {
        if (tugasList.isEmpty()) {
            println("Daftar tugas kosong. Tambahkan tugas terlebih dahulu.")
        } else {
            println("Daftar Tugas:")
            for (tugas in tugasList) {
                println("${tugas.namaTugas} (Deadline: ${tugas.deadline}, Status: ${tugas.status})")
            }
        }
    }

    fun ubahStatusTugas(nama: String, status: String) {
        val tugas = tugasList.find { it.namaTugas == nama }
        if (tugas != null) {
            tugas.status = status
            println("Status tugas '${tugas.namaTugas}' berhasil diubah menjadi '$status'.")
        } else {
            println("Tugas dengan nama '$nama' tidak ditemukan.")
        }
    }

    fun isTugasExist(namaTugas: String?): Boolean {
        return tugasList.any { it.namaTugas == namaTugas }
    }
}