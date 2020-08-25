package com.example.spinneradapter

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CustomDataClass(
    val id: Int,
    val title: String
): Parcelable