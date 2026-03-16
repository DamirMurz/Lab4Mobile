package com.example.lab4

object AllObjects {
    private val bars = listOf(
        ElementData(
            id = 1,
            nameRes = R.string.place_ronny_name,
            shortDescRes = R.string.place_ronny_short,
            longDescRes = R.string.place_ronny_long,
            imageRes = R.drawable.ronni,
            icon = R.drawable.icon_ronni
        ),
        ElementData(
            id = 2,
            nameRes = R.string.place_archie_name,
            shortDescRes = R.string.place_archie_short,
            longDescRes = R.string.place_archie_long,
            imageRes = R.drawable.dadaarchi,
            icon = R.drawable.icon_dydy_archi
        ),
        ElementData(
            id = 3,
            nameRes = R.string.place_bolivar_name,
            shortDescRes = R.string.place_bolivar_short,
            longDescRes = R.string.place_bolivar_long,
            imageRes = R.drawable.boliver,
            icon = R.drawable.icon_bolivar
        ),
        ElementData(
            id = 4,
            nameRes = R.string.place_jupiter_name,
            shortDescRes = R.string.place_jupiter_short,
            longDescRes = R.string.place_jupiter_long,
            imageRes = R.drawable.jupiter,
            icon = R.drawable.icon_jupiter5
        )
    )

    private val cinemas = listOf(
        ElementData(
            id = 10,
            nameRes = R.string.place_almaz_name,
            shortDescRes = R.string.place_almaz_short,
            longDescRes = R.string.place_almaz_long,
            imageRes = R.drawable.almaz,
            icon = R.drawable.icon_almaz
        ),
        ElementData(
            id = 11,
            nameRes = R.string.place_sigma_name,
            shortDescRes = R.string.place_sigma_short,
            longDescRes = R.string.place_sigma_long,
            imageRes = R.drawable.imperia,
            icon = R.drawable.icon_imperiya_grez
        ),
        ElementData(
            id = 12,
            nameRes = R.string.place_petrovsky_name,
            shortDescRes = R.string.place_petrovsky_short,
            longDescRes = R.string.place_petrovsky_long,
            imageRes = R.drawable.sinema,
            icon = R.drawable.icon_sinema
        ),
        ElementData(
            id = 13,
            nameRes = R.string.place_russia_name,
            shortDescRes = R.string.place_russia_short,
            longDescRes = R.string.place_russia_long,
            imageRes = R.drawable.russia,
            icon = R.drawable.icon_russia
        )
    )

    private val theatres = listOf(
        ElementData(
            id = 20,
            nameRes = R.string.place_drama_name,
            shortDescRes = R.string.place_drama_short,
            longDescRes = R.string.place_drama_long,
            imageRes = R.drawable.dram,
            icon = R.drawable.icon_russia_dram
        ),
        ElementData(
            id = 21,
            nameRes = R.string.place_opera_name,
            shortDescRes = R.string.place_opera_short,
            longDescRes = R.string.place_opera_long,
            imageRes = R.drawable.opera,
            icon = R.drawable.icon_opera_i_balet
        ),
        ElementData(
            id = 22,
            nameRes = R.string.place_puppets_name,
            shortDescRes = R.string.place_puppets_short,
            longDescRes = R.string.place_puppets_long,
            imageRes = R.drawable.kukol,
            icon = R.drawable.icon_kukol
        ),
        ElementData(
            id = 23,
            nameRes = R.string.place_young_name,
            shortDescRes = R.string.place_young_short,
            longDescRes = R.string.place_young_long,
            imageRes = R.drawable.molodoy,
            icon = R.drawable.icon_molodoy
        )
    )

    val allCategories = listOf(
        CategoryData(titleRes = R.string.cat_bars, places = bars),
        CategoryData(titleRes = R.string.cat_cinemas, places = cinemas),
        CategoryData(titleRes = R.string.cat_theatres, places = theatres)
    )
}