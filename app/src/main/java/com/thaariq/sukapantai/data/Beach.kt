package com.thaariq.sukapantai.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Beach (
    var name : String = "",
    var location : String = "",
    var detail : String = "",
    var image : Int = 0
):Parcelable
