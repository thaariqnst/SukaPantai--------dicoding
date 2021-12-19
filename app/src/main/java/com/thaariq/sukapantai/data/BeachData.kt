package com.thaariq.sukapantai.data

import android.widget.BaseExpandableListAdapter
import com.thaariq.sukapantai.R

object BeachData {
    private val beachNames = arrayOf(
        "Gili Trawangan",
        "Nihiwatu Beach",
        "Pink Beach",
        "Belitung Island",
        "Derawan Island",
        "Hatta Island",
        "Ora Beach",
        "Weh Island",
        "Raja Ampat Island",
        "Tomini Bay"
    )
    private val beachLocation = arrayOf(
        "Lombok,West Nusa Tenggara",
        "Sumba, East Nusa Tenggara",
        "Komodo Island, East Nusa Tenggara",
        "Bangka Belitung Islands",
        "East Kalmantan",
        "Maluku",
        "Maluku",
        "Aceh",
        "West Papua",
        "North Sulawesi"
    )
    private val beachDetails= arrayOf(
        "Semua gili atau pulau yang berada di sekitar Lombok memang indah. Di antara tiga gili terbesar, Gili Trawangan adalah yang paling populer. Di sini, kamu nggak bakal menemukan kendaraan bermotor. Jika ingin jalan-jalan, kamu bisa menggunakan sepeda!",
        "Keindahan pantai-pantai di daerah Sumba memang nggak perlu diragukan lagi. Salah satunya adalah Nihiwatu Beach, pantai sepanjang 2,5 km ini merupakan salah satu dari 20 pantai terbaik di dunia, lho!",

        "Pantai ini sangat spesial karena pasirnya yang berwarna pink. Pantai seperti ini hanya ada tujuh di dunia, dan yang tercantik tentu ada di Pulau Komodo, Indonesia. Sudah pernah ke sini?",

        "Jika kamu pernah nonton film Laskar Pelangi, sudah pasti tahu pulau ini. Salah satu pantai yang paling terkenal keindahannya di pulau ini adalah Pantai Tanjung Tinggi, karena pernah dijadikan lokasi syuting film tersebut.",

        "Salah satu yang aktivitas unik di Pulau Derawan adalah berenang bersama ubur-ubur. Tenang aja, ubur-ubur di sini nggak beracun kok! Selain itu, kamu juga bisa berenang di bentangan laut biru indah yang sangat luas!",

        "Pulau ini berada di sebelah timur Kepulauan Banda, Maluku Tenggara. Di Pulau Hatta nggak terdapat aliran listrik sama sekali. Kegiatan yang bisa kamu lakukan di sini adalah menikmati keindahan pantai, snorkeling, dan juga diving.",

        "Pantai Ora terletak di bagian utara Pulau Seram, Maluku Tengah. Untuk mencapainya, kamu bisa menaiki kapal ferry dari pelabuhan di Kota Ambon. Keindahan pantainya menyaingi Bora-bora dan juga Maldives!",

        "Pulau ini berada di ujung barat Indonesia. Pulau ini tidak terlalu besar, dan memiliki tiga pantai yang sangat amat indah, yaitu Anoi Itam, Gapang, dan Iboih.",

        "Keindahan alam Raja Ampat sudah terkenal hingga mancanegara. Lautnya yang biru jernih dan alamnya yang indah, pasti bakal bikin kamu ketagihan liburan ke sini deh!",

        "Bagi para pecinta kegiatan diving dan snorkeling, wajib banget mengunjungi Tomini Bay di Sulawesi Utara. Tempat ini belum banyak dijamah, keindahan alamnya sangat terjaga."
    )
    private val beachImages = intArrayOf(
        R.drawable.gili_trawangan,
        R.drawable.nihiwatu_sumba,
        R.drawable.pink_beach,
        R.drawable.pulau_belitung,
        R.drawable.pulau_derawan,
        R.drawable.pulau_hatta,
        R.drawable.pulau_ora,
        R.drawable.pulau_weh,
        R.drawable.raja_ampat,
        R.drawable.tomini_bay
    )

    val listdata: ArrayList<Beach>
        get() {
            val list = arrayListOf<Beach>()
            for (position in beachNames.indices){
                val beach = Beach()
                beach.name = beachNames[position]
                beach.location = beachLocation[position]
                beach.detail = beachDetails[position]
                beach.image = beachImages[position]
                list.add(beach)
            }
            return list
        }
}