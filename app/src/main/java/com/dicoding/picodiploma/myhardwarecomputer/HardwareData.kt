package com.dicoding.picodiploma.myhardwarecomputer

object HardwareData {
    private val hardwareName = arrayOf("Central Processing Unit",
        "Floppy Disk Drive",
        "Hard Disk Drive",
        "Keyboard",
        "LAN Card",
        "Monitor",
        "Motherboard",
        "Mouse",
        "Power Supply",
        "Random Access Memory")

    private val hardwareDetail = arrayOf(
        "Central Processing Unit adalah sirkuit elektronik di dalam komputer yang menjalankan instruksi yang membentuk program komputer. CPU melakukan operasi aritmatika, logika, pengendalian, dan input/output (I/O) dasar yang ditentukan oleh instruksi dalam program. Industri komputer menggunakan istilah \"unit pemrosesan pusat\" sejak tahun 1955. Secara tradisional, istilah \"CPU\" mengacu pada prosesor, lebih khusus lagi untuk unit pemrosesan dan control unit (CU), yang membedakan elemen inti komputer ini dari komponen eksternal seperti memori utama dan sirkuit I/O.",
        "Floppy disk adalah media diska penyimpanan terdiri dari media penyimpanan magnetis tipis dan fleksibel, disegel dalam plastik berbentuk persegi atau persegi panjang. Cakram liuk populer disebut sebagai disket.",
        "Hard Disk Drive adalah sebuah komponen perangkat keras yang menyimpan data sekunder dan berisi piringan magnetis. Diska keras diciptakan pertama kali oleh insinyur IBM, Reynold Johnson pada tahun 1956. Diska keras pertama tersebut terdiri dari 50 piringan berukuran 2 kaki (0,6 meter) dengan kecepatan rotasinya mencapai 1.200 rpm (rotation per minute) dengan kapasitas penyimpanan 4,4 MB. Diska keras zaman sekarang sudah ada yang hanya selebar 0,6 cm dengan kapasitas 750 GB. Kapasitas terbesar diska keras saat ini mencapai 14 TB dengan ukuran standar 3,5 inci.",
        "Keyboard merupakan sebuah papan yang terdiri atas tombol-tombol seperti huruf alfabet (A-Z) untuk mengetikkan kalimat, juga terdapat angka 1 sampai 9, dan juga 0. Serta simbol-simbol khusus lainnya pada komputer. Dalam komputasi, papan tombol menggunakan susunan tombol atau kunci, untuk bertindak sebagai tuas mekanis atau sakelar elektronik.",
        "LAN Card adalah sebuah kartu yang berfungsi sebagai jembatan dari komputer ke sebuah jaringan komputer. Jenis LAN Card  yang beredar, terbagi menjadi dua jenis, yakni LAN Card  yang bersifat fisik, dan LAN Card  yang bersifat logis. Contoh LAN Card  yang bersifat fisik adalah LAN CardEthernet, Token Ring, dan lainnya; sementara LAN Card yang bersifat logis adalah loopback adapter dan Dial-up Adapter. Disebut juga sebagai Network Adapter. Setiap jenis LAN Card  diberi nomor alamat yang disebut sebagai MAC address, yang dapat bersifat statis atau dapat diubah oleh pengguna.",
        "Monitor adalah salah satu jenis soft-copy device, karena keluarannya adalah berupa sinyal elektronik, dalam hal ini berupa gambar yang tampil di layar monitor. Gambar yang tampil adalah hasil pemrosesan data ataupun informasi masukan. Monitor memiliki berbagai ukuran layar seperti layaknya sebuah televisi. Tiap merek dan ukuran monitor memiliki tingkat resolusi yang berbeda. Resolusi inilah yang akan menentukan ketajaman gambar yang dapat ditampilkan pada layar monitor. Jenis-jenis monitor saat ini sudah sangat beragam, mulai dari bentuk yang besar dengan layar cembung, sampai dengan bentuk yang tipis dengan layar datar (flat).",
        "Motherboard adalah papan sirkuit cetak utama (PCB) di komputer tujuan umum dan sistem lain yang dapat diperluas. Ini memegang dan memungkinkan komunikasi antara banyak komponen elektronik penting dari suatu sistem, seperti unit pemrosesan sentral (CPU) dan memori, dan menyediakan konektor untuk periferal lain. Tidak seperti bidang belakang, papan induk biasanya berisi sub-sistem penting, seperti prosesor pusat, pengontrol input/output dan memori chipset, konektor antarmuka, dan komponen lain yang terintegrasi untuk penggunaan umum.",
        "Mouse adalah peranti penunjuk yang digunakan untuk memasukkan data dan perintah ke dalam komputer selain papan ketik. Tetikus memperoleh nama demikian karena kabel yang menjulur berbentuk seperti ekor tikus.",
        "Power Supply adalah alat listrik yang menyuplai tenaga listrik ke suatu beban listrik. Fungsi utama catu daya adalah untuk mengubah arus listrik dari sumber menjadi tegangan, arus, dan frekuensi yang benar untuk memberi daya pada beban. Akibatnya, catu daya terkadang disebut sebagai konverter daya listrik. Beberapa catu daya adalah bagian peralatan mandiri yang terpisah, sementara yang lain dibuat ke dalam peralatan beban yang diberi daya. Contoh yang terakhir termasuk catu daya yang ditemukan di komputer desktop dan perangkat elektronik konsumen. Fungsi lain yang mungkin dilakukan oleh catu daya termasuk membatasi arus yang ditarik oleh beban ke tingkat yang aman, mematikan arus jika terjadi kesalahan listrik, pengkondisian daya untuk mencegah kebisingan elektronik atau lonjakan tegangan pada input mencapai beban, daya- koreksi faktor, dan menyimpan energi sehingga dapat terus memberi daya pada beban jika terjadi gangguan sementara pada sumber daya (suplai daya bebas gangguan).",
        "RAM adalah sebuah tipe penyimpanan komputer yang isinya dapat diakses dalam waktu yang tetap tidak memperdulikan letak data tersebut dalam memori. Ini berlawanan dengan alat memori urut, seperti tape magnetik, disk dan drum, di mana gerakan mekanikal dari media penyimpanan memaksa komputer untuk mengakses data secara berurutan.")

    private val hardwareImages = intArrayOf(R.drawable.cpu,
        R.drawable.fdd,
        R.drawable.hdd,
        R.drawable.keyboard,
        R.drawable.lan_card,
        R.drawable.monitor,
        R.drawable.motherboard,
        R.drawable.mouse,
        R.drawable.psu,
        R.drawable.ram)

    val listData : ArrayList<Hardware>
        get() {
            val list = arrayListOf<Hardware>()
                for (posisition in hardwareName.indices){
                    val hardware = Hardware()
                    hardware.name = hardwareName[posisition]
                    hardware.detail = hardwareDetail[posisition]
                    hardware.photo = hardwareImages[posisition]
                    list.add(hardware)
                }
                return list
        }
}