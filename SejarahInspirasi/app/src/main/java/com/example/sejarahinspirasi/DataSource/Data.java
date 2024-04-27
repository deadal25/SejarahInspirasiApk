package com.example.sejarahinspirasi.DataSource;

import com.example.sejarahinspirasi.Model.Category;
import com.example.sejarahinspirasi.Model.Sejarah;
import com.example.sejarahinspirasi.R;
import java.util.ArrayList;
import java.util.List;

public class Data {
    public static List<Sejarah> sejarah1 = generateDataSejarahDummies();


    public static List<Category> categories = generateDataCategoriesDummies();
    public static int idCount = 12;

    private static List<Sejarah> generateDataSejarahDummies() {
        List<Sejarah> sejarah1 = new ArrayList<>();
        sejarah1.add(new Sejarah(1, "Sejarah Albert Einstein",
                "Albert Einstein lahir pada 14 Maret 1879 di Ulm, Kerajaan Württemberg, Kekaisaran Jerman. Dia adalah seorang fisikawan teoritis Jerman-Swiss yang dikenal karena mengembangkan teori relativitas khusus dan umum, yang mengubah pandangan tentang waktu, ruang, dan gravitasi.\n"
                , "Pencapaian",
                "Pada tahun 1905, Einstein menerbitkan empat makalah penting, termasuk teori relativitas khusus dan penjelasan fenomena efek fotolistrik. Karyanya memberikan landasan bagi banyak perkembangan fisika modern, seperti fisika partikel dan fisika nuklir."
                      ,
                R.drawable.ab, 2));
        sejarah1.add(new Sejarah(2, "Sejarah Marie Curie",
                " Marie Curie lahir pada 7 November 1867 di Warsawa, Polandia (sekarang Polandia). Dia adalah fisikawan dan kimiawan Polandia-Francis yang terkenal karena penelitiannya dalam radioaktivitas.",
                "Pencapaian",
                "Marie Curie adalah orang pertama yang menerima dua Penghargaan Nobel dalam dua bidang ilmu yang berbeda (Fisika pada tahun 1903 dan Kimia pada tahun 1911) atas penemuannya dalam radioaktivitas dan isolasi unsur-unsur radium dan polonium.",
                R.drawable.marie, 2));
        sejarah1.add(new Sejarah(3, "Sejarah Isaac Newton",
                "Isaac Newton lahir pada 25 Desember 1642 di Woolsthorpe, Inggris. Dia adalah seorang fisikawan dan matematikawan Inggris yang sangat berpengaruh dalam sejarah sains.",
                "Pencapaian",
                "Newton dikenal karena hukum geraknya dan hukum gravitasi universal, yang dijelaskan dalam karyanya \"Philosophiæ Naturalis Principia Mathematica\" pada tahun 1687. Karya ini membuka jalan bagi pemahaman modern tentang fisika.",
                R.drawable.in, 2));
        sejarah1.add(new Sejarah(4, "Sejarah Nabi Muhammad SAW",
                "Latar belakang Nabi Muhammad SAW mencakup aspek-aspek yang mencerminkan perjalanan kehidupan yang luar biasa, yang membentuknya menjadi figur yang sangat berpengaruh dalam sejarah manusia. \n" +
                        "\n" +
                        "Nabi Muhammad SAW lahir pada tahun 570 M di Mekkah, sebuah kota penting di Semenanjung Arab, pada masa di mana wilayah tersebut dipenuhi dengan praktek-praktek keagamaan yang beragam dan seringkali menyimpang. Kehidupan awalnya ditandai oleh berbagai peristiwa yang menunjukkan karakter mulianya bahkan sebelum beliau dipilih sebagai nabi. \n" +
                        "\n" +
                        "Dia kehilangan kedua orangtuanya di usia muda dan dibesarkan oleh kakek dan pamannya. Kehidupan masa muda Nabi Muhammad SAW diisi dengan pekerjaan sebagai pedagang, yang memungkinkannya berinteraksi dengan berbagai kelompok masyarakat dari berbagai latar belakang budaya dan agama. \n" +
                        "\n" +
                        "Karakternya yang jujur, amanah, dan bijaksana telah membuatnya dihormati oleh masyarakat sejak usia muda. Bahkan sebelum menerima wahyu dari Allah, beliau dikenal sebagai Al-Amin (yang dapat dipercaya) dan As-Sadiq (yang jujur) oleh masyarakat Mekkah.\n" +
                        "\n" +
                        "Di usia 40 tahun, ketika berada di gua Hira untuk beribadah, Nabi Muhammad SAW menerima wahyu pertamanya dari Allah melalui Malaikat Jibril. Inilah awal dari misi kenabiannya yang membawa pesan tauhid, atau keesaan Allah, kepada umat manusia.\n" +
                        "\n" +
                        "Meskipun menghadapi berbagai tantangan dan penolakan dari masyarakat pada awalnya, Nabi Muhammad SAW terus menyampaikan pesannya dengan kesabaran, keberanian, dan kasih sayang. Beliau juga mengalami berbagai ujian dan peristiwa penting dalam kehidupannya, seperti hijrah ke Madinah, Perang Badar, Perang Uhud, dan Perjanjian Hudaibiyah.\n" +
                        "\n" +
                        "Selama 23 tahun masa kenabiannya, Nabi Muhammad SAW mengajarkan ajaran Islam kepada umatnya, memimpin mereka dalam pembentukan masyarakat Islam yang berlandaskan moral, etika, dan keadilan, serta menyempurnakan wahyu Allah yang terakhir, Al-Quran. Akhirnya, pada tahun 632 M, Nabi Muhammad SAW wafat setelah memberikan pondasi yang kokoh bagi pengembangan agama Islam dan peradaban yang didasarkan pada nilai-nilai universal kebenaran, keadilan, dan kasih sayang.",
                "Pencapaian",
                "Tentu, mari saya tambahkan informasi yang lebih panjang:\n" +
                        "\n" +
                        "Pencapaian Nabi Muhammad SAW tidak hanya terbatas pada penyebaran Islam di Semenanjung Arab, tetapi juga memiliki dampak yang mendalam pada perkembangan agama, budaya, politik, dan sosial di seluruh dunia. Berikut adalah beberapa pencapaian Nabi Muhammad SAW yang lebih mendetail:\n" +
                        "\n" +
                        "1. Penyampaian Al-Quran: Salah satu pencapaian paling monumental dari Nabi Muhammad SAW adalah penyampaian wahyu Allah dalam bentuk Al-Quran. Al-Quran dianggap sebagai sumber hukum, pedoman moral, dan petunjuk spiritual bagi umat Islam. Keindahan bahasa dan kedalaman maknanya telah mengilhami jutaan orang dari berbagai budaya dan latar belakang.\n" +
                        "\n" +
                        "2. Pembentukan Umat Islam: Nabi Muhammad SAW berhasil menggabungkan berbagai suku dan kelompok etnis di Semenanjung Arab menjadi umat Islam yang satu, tanpa memandang perbedaan latar belakang atau status sosial. Ini menciptakan persatuan yang kuat di antara umatnya, yang menjadi salah satu faktor kunci dalam keberhasilan penyebaran Islam.\n" +
                        "\n" +
                        "3. Pembinaan Masyarakat Adil: Nabi Muhammad SAW menegakkan prinsip-prinsip keadilan sosial dalam masyarakat Islam yang baru terbentuk. Beliau menegaskan pentingnya kesetaraan di hadapan hukum, perlindungan hak-hak individu, dan kesejahteraan sosial bagi semua anggota masyarakat. Hal ini tercermin dalam konstitusi Madinah yang beliau susun, yang menetapkan dasar-dasar hukum Islam yang adil dan inklusif.\n" +
                        "\n" +
                        "4. Pemimpin Spiritual dan Politik: Sebagai pemimpin spiritual dan politik, Nabi Muhammad SAW menggabungkan otoritas keagamaan dan kepemimpinan politik dalam satu figur. Beliau memimpin umat Islam dalam berbagai peristiwa penting, seperti Perang Badar dan Perjanjian Hudaibiyah, sambil terus memberikan bimbingan rohani dan moral kepada pengikutnya.\n" +
                        "\n" +
                        "5. Peningkatan Status Perempuan: Nabi Muhammad SAW memberikan perhatian khusus pada hak-hak perempuan dan meningkatkan status mereka dalam masyarakat Arab yang terdahulu. Beliau melarang praktik-praktik barbar seperti penjualan budak perempuan dan memberikan hak warisan kepada perempuan, yang merupakan langkah revolusioner pada zamannya.\n" +
                        "\n" +
                        "6. Pengembangan Etika dan Moral: Nabi Muhammad SAW menekankan pentingnya akhlak yang baik dan perilaku moral yang benar dalam kehidupan sehari-hari. Beliau menjadi teladan bagi umatnya dengan mempraktikkan kasih sayang, keadilan, kejujuran, dan kesabaran dalam setiap aspek kehidupan, yang mengilhami banyak orang untuk mengikuti jejaknya.",
                R.drawable.nm, 1));
        sejarah1.add(new Sejarah(5, "Sejarah Stephen Hawking",
                "Stephen Hawking lahir pada 8 Januari 1942 di Oxford, Inggris. Dia adalah seorang fisikawan teoretis Inggris yang terkenal karena penelitiannya dalam lubang hitam dan kosmologi teoretis.",
                "Pencapaian",
                "Hawking terkenal karena karyanya dalam menunjukkan bahwa lubang hitam tidak sepenuhnya hitam, tetapi memancarkan radiasi, yang sekarang dikenal sebagai Radiasi Hawking. Karyanya yang paling terkenal adalah bukunya \"A Brief History of Time\", yang menjadi salah satu buku sains terlaris sepanjang masa.",
                R.drawable.sth, 2));
        sejarah1.add(new Sejarah(6, "Sejarah Nabi Ibrahim AS",
                "Nabi Ibrahim AS, juga dikenal sebagai Abraham, lahir pada sekitar abad ke-19 SM di Ur, sebuah kota di wilayah Babilonia, yang sekarang bagian dari Irak. Ia tumbuh dalam lingkungan yang diwarnai dengan praktek-praktek berhala dan penyembahan berhala. Namun, meskipun dalam lingkungan yang demikian, Ibrahim menemukan kebenaran dalam penyembahan kepada satu Tuhan yang maha kuasa.",
                "Pecapaian",
                "Salah satu pencapaian utama Nabi Ibrahim AS adalah keberaniannya dalam mempertahankan kebenaran tauhid dan menentang penyembahan berhala yang dianut oleh masyarakatnya. Ia dipandang sebagai sosok yang memiliki keimanan yang teguh dan keteguhan hati yang luar biasa, sehingga mendapatkan julukan \"Khalilullah\", yang berarti \"sahabat Allah\". Kisah pengorbanannya yang paling terkenal adalah ketika ia bersedia untuk mengorbankan putranya, Ismail, atas perintah Allah, namun Allah kemudian menggantinya dengan seekor domba sebagai tanda penghormatan atas kepatuhannya.\n" +
                        "Selain itu, dalam agama-agama Abrahamik (Islam, Kristen, dan Yahudi), Nabi Ibrahim juga dihormati sebagai leluhur bangsa-bangsa dan pemimpin spiritual yang mengilhami pengikutnya untuk menjalani kehidupan yang taat kepada Allah. Tindakan dan ketekunan Ibrahim dalam mengemban misi kenabiannya menjadi teladan bagi umat-umat yang mengikuti ajarannya, dan kisah hidupnya menjadi bagian integral dari kitab-kitab suci dalam agama-agama tersebut.",
                R.drawable.nabiibrahim, 1));
        sejarah1.add(new Sejarah(7, "Sejarah Nabi Musa AS",
                "Nabi Musa AS, yang juga dikenal sebagai Moses, lahir pada sekitar abad ke-14 SM di Mesir Kuno. Menurut catatan agama-agama Abrahamik, ia lahir di tengah-tengah bangsa Israel yang menjadi budak di Mesir pada masa pemerintahan Firaun. Meskipun dilahirkan di tengah kondisi yang keras dan di bawah ancaman pembantaian anak-anak laki-laki yang baru lahir, ia diselamatkan oleh ibunya yang menaruhnya dalam keranjang dan meletakkannya di sungai Nil, di mana ia kemudian ditemukan oleh putri Firaun dan dibesarkan di istana",
                "Pencapaian",
                "Salah satu pencapaian paling monumental Nabi Musa adalah perannya dalam memimpin bangsa Israel keluar dari perbudakan Mesir menuju ke tanah yang dijanjikan. Kisah keluar dari Mesir, yang dikenal sebagai \"Eksodus\", merupakan salah satu peristiwa paling penting dalam sejarah agama Yahudi dan memiliki dampak besar dalam pembentukan identitas bangsa Israel.Setelah melarikan diri dari Mesir, Musa menerima wahyu dari Allah di Gunung Sinai, di mana ia menerima Taurat, yang merupakan hukum dan ajaran ilahi bagi umat Israel. Taurat, juga dikenal sebagai Pentateukh, membentuk dasar hukum dan moral bagi umat Yahudi dan menjadi bagian penting dari Alkitab Ibrani dan Perjanjian Lama dalam Alkitab Kristen.Selain itu, Musa juga berperan sebagai pemimpin politik dan spiritual bagi bangsa Israel. Ia memberikan petunjuk, arahan, dan pengajaran langsung dari Allah kepada umatnya, serta membimbing mereka melalui berbagai cobaan dan perjuangan selama perjalanan mereka menuju tanah Kanaan.Kisah dan ajaran Nabi Musa AS memainkan peran penting dalam memperkuat keyakinan dan identitas umat Israel, serta menyediakan kerangka moral dan etika yang penting bagi kehidupan mereka. Pada tingkat yang lebih luas, kisah Musa juga memiliki nilai dan makna yang mendalam bagi umat Kristen dan Islam, dan ia dihormati sebagai salah satu nabi besar dalam tradisi agama-agama Abrahamik.",
                R.drawable.nabimusa, 1));
        sejarah1.add(new Sejarah(8, "Sejarah Nabi Isa AS",
                "Nabi Isa AS, yang dikenal dalam agama Kristen sebagai Yesus Kristus, diyakini lahir sekitar tahun 4 SM di Bethlehem, sebuah kota di Palestina yang saat itu merupakan bagian dari wilayah Romawi. Kelahirannya dipercayai sebagai pemenuhan nubuat-nubuat dalam Alkitab Ibrani (Perjanjian Lama) dan dianggap sebagai peristiwa penting dalam agama Kristen. Nabi Isa AS juga diakui sebagai salah satu nabi dalam Islam dan disebutkan dalam Al-Quran.\n"
                       ,
                "Pencapaian",
                "Nabi Isa AS dikenal karena ajaran-ajarannya yang penuh kasih dan penuh kebaikan. Ia mengajarkan tentang cinta kasih, pengampunan, dan kepedulian terhadap sesama. Pengajaran-pengajarannya disampaikan melalui perumpamaan dan kisah-kisah yang menginspirasi, memberikan petunjuk moral, dan menantang pemikiran masyarakat pada masanya.Selain ajarannya, Nabi Isa AS juga terkenal karena melakukan berbagai mukjizat, seperti menyembuhkan orang sakit, menghidupkan orang mati, dan mengusir roh jahat. Mukjizat-mukjizat ini dipandang sebagai bukti atas otoritas dan kebenaran ajarannya, serta sebagai tanda-tanda dari Allah SWT.Meskipun pendiriannya dianggap kontroversial oleh beberapa pihak pada masanya, pengikutnya, yang disebut sebagai murid-muridnya, meneruskan ajaran-ajarannya setelah wafatnya. Ajaran-ajaran tersebut membentuk dasar agama Kristen dan menjadi fondasi bagi keyakinan Kristen yang tersebar di seluruh dunia.Ajaran dan kehidupan Nabi Isa AS memiliki dampak yang luas dan mendalam dalam sejarah agama dan peradaban. Meskipun ia wafat dalam usia muda, warisan spiritualnya terus hidup melalui pengikut-pengikutnya dan telah membawa perubahan besar dalam pemikiran dan budaya di seluruh dunia. Makna dan nilai-nilai ajarannya juga diakui dan dihargai dalam agama-agama lainnya, termasuk dalam Islam, di mana Nabi Isa AS dihormati sebagai salah satu nabi besar dan sebagai figur yang penuh kasih dan bijaksana.",
                R.drawable.nabiisa, 1));
        sejarah1.add(new Sejarah(9, "Sejarah Soekarno",
                "Soekarno lahir pada 6 Juni 1901 di Blitar, Jawa Timur, Hindia Belanda (sekarang Indonesia). Dia adalah salah satu pemimpin kemerdekaan Indonesia dan Presiden pertama Indonesia setelah kemerdekaan dari penjajahan Belanda pada tahun 1945. Soekarno adalah figur sentral dalam perjuangan kemerdekaan Indonesia dan salah satu arsitek utama Republik Indonesia.",
                "Pencapaian",
                " Soekarno memainkan peran penting dalam perjuangan untuk kemerdekaan Indonesia. Ia menjadi pemimpin Proklamasi Kemerdekaan Indonesia pada 17 Agustus 1945 dan kemudian menjadi Presiden pertama Indonesia pada tahun 1945 hingga 1967. Di bawah kepemimpinannya, Indonesia mengalami periode perubahan besar-besaran, termasuk dalam bidang politik, ekonomi, dan sosial. Soekarno juga dikenal karena gagasannya tentang Nasionalisme, Islamisme, dan Marhaenisme (Trisila dan Ekasila), yang membentuk dasar ideologi negara yang dikenal sebagai Pancasila.",
                R.drawable.soekarno, 3));
        sejarah1.add(new Sejarah(10, "Sejarah Mohammad Hatta",
                "Mohammad Hatta lahir pada 12 Agustus 1902 di Bukittinggi, Sumatera Barat, Hindia Belanda (sekarang Indonesia). Dia adalah salah satu tokoh proklamator kemerdekaan Indonesia bersama Soekarno. Hatta adalah ekonom dan politisi yang berperan dalam merumuskan dasar-dasar ekonomi Indonesia pasca-kemerdekaan.","Pencapaian",
                "Mohammad Hatta merupakan Wakil Presiden Indonesia yang pertama dan menjabat pada periode 1945-1956. Sebagai seorang ekonom, Hatta turut merumuskan konsep dan strategi pembangunan ekonomi nasional yang berbasis pada kemandirian dan keadilan sosial. Selain itu, ia juga berperan dalam menjaga stabilitas politik dan ekonomi selama masa transisi Indonesia dari kolonialisme menuju negara merdeka..",
                R.drawable.mh, 3));
        sejarah1.add(new Sejarah(11, "Sejarah Cut Nyak Dhien",
                "Cut Nyak Dhien lahir pada tahun 1848 di Aceh, Indonesia. Ia adalah seorang pejuang wanita Aceh yang dikenal karena perlawanannya terhadap penjajah Belanda selama Perang Aceh pada abad ke-19. Dhien merupakan simbol perlawanan dan keberanian perempuan Indonesia dalam mempertahankan tanah air dari penjajahan.",
                "Pencapaian",
                "Cut Nyak Dhien merupakan salah satu pemimpin perlawanan Aceh terhadap Belanda selama Perang Aceh yang berlangsung dari tahun 1873 hingga 1914. Meskipun mengalami berbagai kesulitan dan kehilangan, Dhien terus memimpin perlawanan melawan penjajah Belanda dengan gigih dan pantang menyerah. Kisah perjuangannya telah diabadikan dalam berbagai karya sastra dan seni budaya Indonesia, menjadikannya salah satu pahlawan nasional yang dihormati.",
                R.drawable.cn, 3));
        sejarah1.add(new Sejarah(12, "Sejarah Sultan Hasanuddin",
                "Sultan Hasanuddin adalah seorang tokoh penting dalam sejarah Indonesia, terutama dalam konteks perlawanan terhadap kolonialisasi Belanda di Sulawesi Selatan. Ia lahir pada tahun 1629 di Kerajaan Gowa, yang pada saat itu merupakan salah satu kerajaan terkuat di Sulawesi Selatan. Hasanuddin merupakan keturunan dari dinasti raja-raja Gowa yang terkenal. Sejak kecil, ia telah terlibat dalam urusan pemerintahan dan militer kerajaan Gowa.Pada masa pemerintahannya, Belanda berusaha memperluas kekuasaannya ke wilayah-wilayah di Indonesia Timur, termasuk Sulawesi Selatan. Hal ini menimbulkan konflik antara Belanda dan Gowa yang dipimpin oleh Sultan Hasanuddin. Konflik tersebut kemudian berkembang menjadi perang yang dikenal sebagai Perang Makassar, yang merupakan salah satu konflik paling penting dalam sejarah Sulawesi Selatan.\n",
                "Pencapaian",
                "Perlawanan Terhadap Penjajah: Sultan Hasanuddin dikenal karena perlawanannya yang gigih terhadap penjajah Belanda selama Perang Makassar. Ia memimpin pasukannya dengan keberanian dan kecerdasan taktis, menghadapi pasukan Belanda yang jauh lebih besar dan lebih modern secara militer. Meskipun Gowa akhirnya kalah dalam perang tersebut, perlawanan yang dipimpin oleh Sultan Hasanuddin menunjukkan kegigihan dan semangat perlawanan yang tinggi terhadap kolonialisasi.\n" +
                        "Kemandirian dan Kebijakan Luar Negeri: Selain perlawanan militer, Sultan Hasanuddin juga aktif dalam upaya untuk memperkuat kemandirian politik dan ekonomi Gowa. Ia menjalin hubungan diplomatik dengan negara-negara tetangga dan bahkan dengan negara-negara Eropa lainnya sebagai bagian dari upaya untuk menjaga kedaulatan Gowa. Kebijakan luar negeri yang bijaksana ini membantu Gowa mempertahankan kemerdekaannya dalam periode yang sulit.\n" +
                        "Pembangunan Budaya dan Ekonomi: Selama masa pemerintahannya, Sultan Hasanuddin juga aktif dalam mempromosikan pembangunan budaya dan ekonomi di wilayahnya. Ia mendukung perkembangan seni dan budaya, serta membangun infrastruktur ekonomi seperti pelabuhan dan pasar untuk meningkatkan perdagangan dan kesejahteraan rakyatnya.\n" +
                        "Sultan Hasanuddin meninggal pada tahun 1670 setelah mengabdikan seluruh hidupnya untuk memperjuangkan kebebasan dan martabat bangsanya. Warisannya sebagai pahlawan nasional Indonesia terus dihargai dan diingat dalam sejarah Sulawesi Selatan, serta menjadi inspirasi bagi generasi-generasi selanjutnya dalam perjuangan untuk keadilan dan kemerdekaan.",
                R.drawable.sh, 3));
        return sejarah1;
    }

    private static List<Category> generateDataCategoriesDummies() {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1, "sejarahnabi"));
        categories.add(new Category(2, "sejarahahlifisika"));
        categories.add(new Category(3, "sejarahpahlawan"));
        return categories;
    }
}
