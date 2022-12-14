package com.bahri.projecttofigma.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataItem(
    val image: Int,
    val nama: String,
    val desc: String,
    val rating: String,
    val waktu: String
): Parcelable

