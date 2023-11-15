package com.sopa.llistaclasseapp

import android.os.Parcel
import android.os.Parcelable

data class Alum(val nom: String, val edat: Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nom)
        parcel.writeInt(edat)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Alum> {
        override fun createFromParcel(parcel: Parcel): Alum {
            return Alum(parcel)
        }

        override fun newArray(size: Int): Array<Alum?> {
            return arrayOfNulls(size)
        }
    }
}