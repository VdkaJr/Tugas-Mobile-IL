package com.example.tugas_frontend.model
import com.example.tugas_frontend.R

object FoodData {
    val foodList = listOf(
        Food(
            id = 1,
            name = "Nasi Goreng Spesial",
            description = "Nasi goreng dengan telur, ayam, udang, dan sayuran segar, dilengkapi dengan kerupuk dan acar",
            imageUrl = R.drawable.nasi_goreng,
            price = 25000.0,
            category = "Makanan Utama"
        ),
        Food(
            id = 2,
            name = "Sate Ayam",
            description = "Sate ayam dengan bumbu kacang khas Indonesia, disajikan dengan lontong dan acar",
            imageUrl =  R.drawable.sate_ayam,
            price = 30000.0,
            category = "Makanan Utama"
        ),
        Food(
            id = 3,
            name = "Gado-gado",
            description = "Sayuran segar dengan bumbu kacang, telur, tahu, tempe, dan kerupuk",
            imageUrl =  R.drawable.gado_gado,
            price = 20000.0,
            category = "Makanan Utama"
        ),
        Food(
            id = 4,
            name = "Rendang Sapi",
            description = "Daging sapi yang dimasak dengan rempah-rempah khas Padang hingga empuk",
            imageUrl =  R.drawable.rendang_sapi,
            price = 45000.0,
            category = "Makanan Utama"
        ),
        Food(
            id = 5,
            name = "Soto Ayam",
            description = "Sup ayam dengan kuah kuning, dilengkapi dengan nasi, telur, dan emping",
            imageUrl = R.drawable.soto_ayam,
            price = 25000.0,
            category = "Makanan Utama"
        ),
        Food(
            id = 6,
            name = "Es Teh Manis",
            description = "Teh manis segar dengan es batu",
            imageUrl = R.drawable.es_teh,
            price = 5000.0,
            category = "Minuman"
        ),
        Food(
            id = 7,
            name = "Pisang Goreng",
            description = "Pisang raja yang digoreng dengan tepung crispy",
            imageUrl = R.drawable.pisang_goreng,
            price = 15000.0,
            category = "Cemilan"
        ),
        Food(
            id = 8,
            name = "Mie Goreng",
            description = "Mie goreng dengan telur, sayuran, dan potongan ayam",
            imageUrl = R.drawable.mie_goreng,
            price = 20000.0,
            category = "Makanan Utama"
        ),
        Food(
            id = 9,
            name = "Es Jeruk",
            description = "Jeruk segar diperas dengan es batu",
            imageUrl = R.drawable.es_jeruk,
            price = 8000.0,
            category = "Minuman"
        ),
        Food(
            id = 10,
            name = "Martabak Telur",
            description = "Martabak telur dengan isian daging cincang dan sayuran",
            imageUrl = R.drawable.martabak_telur,
            price = 25000.0,
            category = "Makanan Utama"
        )
    )
}