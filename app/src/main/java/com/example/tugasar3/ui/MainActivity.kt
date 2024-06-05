package com.example.tugasar3.ui
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugasar3.R
import com.example.tugasar3.adapter.PlaceAdapter
import com.example.tugasar3.databinding.ActivityMainBinding
import com.example.tugasar3.model.Place

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val places = arrayOf(
            Place(
                R.drawable.lawangsewu,
                "Lawang Sewu",
                "Lawang Sewu adalah gedung bersejarah milik PT Kereta Api Indonesia (Persero) ",
            ),
            Place(
                R.drawable.sampokong,
                "SAM POO KONG",
                "Kelenteng Gedung Kuno Sam Poo Kong yaitu bekas tempat persinggahan dan " +
                        "pendaratan pertama seorang Laksamana Tiongkok beragama Islam yang bernama " +
                        "Zheng He/Cheng Ho, yang juga dikenal dengan nama Sam Poo.",
            ),
            Place(
                R.drawable.masjidagung,
                "Masjid Agung Jawa Tengah (MAJT)",
                "Masjid Agung Jawa Tengah adalah masjid yang terletak di Semarang, provinsi Jawa Tengah, " +
                        "Indonesia. Masjid ini mulai dibangun sejak tahun 2001 hingga selesai secara keseluruhan " +
                        "pada tahun 2006. Masjid ini berdiri di atas lahan 10 hektare.",
            ),
            Place(
                R.drawable.tugumuda,
                "Tugu Muda Semarang",
                "Tugu Muda adalah sebuah monumen yang dibuat untuk mengenang jasa-jasa para pahlawan " +
                        "yang telah gugur dalam Pertempuran Lima Hari di Semarang. Monumen ini terletak di Jalan " +
                        "Nasional Rute 20 yang mengarah ke Solo.",
            ),
            Place(
                R.drawable.candigedongsongo,
                "Candi Gedong Songo",
                "Candi Gedong Songo adalah nama sebuah kompleks bangunan candi peninggalan budaya Hindu " +
                        "yang terletak di desa Candi, Kecamatan Bandungan, Kabupaten Semarang, Jawa Tengah, " +
                        "Indonesia tepatnya di lereng Gunung Ungaran. Di kompleks candi ini terdapat sembilan " +
                        "buah candi.",
            ),
            Place(
                R.drawable.curug,
                "Air Terjun Curug Lawe Benowo Kalisidi",
                "Air Terjun Curug Lawe Benowo adalah tempat wisata alam yang indah di Kalisidi. " +
                        "Dikelilingi oleh hutan dan pegunungan, air terjun ini menawarkan suasana yang tenang " +
                        "dan pemandangan yang spektakuler.",
            ),
            Place(
                R.drawable.goakreo,
                "Obyek Wisata Goa Kreo",
                "Gua Kreo adalah objek wisata yang terdapat di Kota Semarang. Gua Kreo merupakan Gua " +
                        "yang terbentuk oleh alam dan terletak di tengah-tengah Waduk Jatibarang, sebuah bendungan " +
                        "yang membendung Kali Kreo.",
            ),
            Place(
                R.drawable.mawarcamp,
                "Mawar Camp Area",
                "Mawar Camp merupakan salah satu destinasi wisata terbaik untuk kamu yang ingin bermalam " +
                        "dengan suasana pemandangan di pegunungan. Terletak tak jauh dari lokasi Gunung Ungaran, " +
                        "camping ground ini dijadikan alternatif kamu yang ingin mendaki tapi tidak kuat fisik.",
            ),
            Place(
                R.drawable.museumkereta,
                "Museum Kereta Api Ambarawa",
                "Museum Kereta Api Ambarawa adalah sebuah stasiun kereta api yang sudah dialihfungsikan " +
                        "menjadi sebuah museum serta merupakan museum perkeretaapian pertama di Indonesia. Museum " +
                        "ini memiliki koleksi kereta api yang pernah berjaya pada zamannya. Museum ini secara " +
                        "administratif berada di Desa Panjang, Ambarawa, Semarang.",
            ),
            Place(
                R.drawable.saloka,
                "Saloka Theme Park",
                "Taman hiburan yang fantastis dengan banyak wahana bertema, konsesi, " +
                        "acara & air mancur.",
            ),
            Place(
                R.drawable.kampungpelangi,
                "Kampung Pelangi",
                "Desa yang terkenal dengan inisiatif pelestarian & lebih dari 200 rumah bergambar pelangi.",
            ),
            Place(
                R.drawable.museumronggowarsito,
                "Museum Ronggowarsito",
                "Museum Ronggowarsito adalah museum sejarah dan budaya yang terletak di Semarang. " +
                        "Museum ini menyimpan berbagai koleksi peninggalan sejarah dan budaya dari Jawa Tengah.",
            ),
            Place(
                R.drawable.simpanglima,
                "Simpang Lima",
                "Simpang Lima adalah sebuah alun-alun di pusat kota Semarang yang terkenal dengan " +
                        "keindahan lampu-lampu malam hari dan berbagai aktivitas hiburan yang dapat dinikmati " +
                        "oleh pengunjung.",
            )
        )


        binding.rvPlace.layoutManager = LinearLayoutManager(this)
        binding.rvPlace.adapter = PlaceAdapter(places) { item ->
            val placeIntent = Intent(this, DetailActivity::class.java).apply {
                putExtra(DetailActivity.KEY_TITLE, item.title)
                putExtra(DetailActivity.KEY_DESCRIPTION, item.description)
                putExtra(DetailActivity.KEY_IMAGE, item.image)
            }
            startActivity(placeIntent)
        }
    }
}
