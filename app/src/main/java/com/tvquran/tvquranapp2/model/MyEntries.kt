package com.tvquran.tvquranapp2.model

import android.os.Parcel
import android.os.Parcelable

data class MyEntries(
    var id: Int = 0,
    var author_id: Int = 0,
    var title: String? = null,
    var content: String? = null,
    var views_count: Int = 0,
    var reciter_name: String? = null,
    var reciter_photo: String? = null,
    var category_name: String? = null,
    var category_desc: String? = null,
    var soundPath: String? = null,
    var upVotes: Int = 0,
    var isHistory: Int = 0,
    var isDownloaded: Int = 0,
    var downloadedPath: String? = null,
    var order: Int = 0,
    var fistOrSecond: String? = null
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeInt(author_id)
        parcel.writeString(title)
        parcel.writeString(content)
        parcel.writeInt(views_count)
        parcel.writeString(reciter_name)
        parcel.writeString(reciter_photo)
        parcel.writeString(category_name)
        parcel.writeString(category_desc)
        parcel.writeString(soundPath)
        parcel.writeInt(upVotes)
        parcel.writeInt(isHistory)
        parcel.writeInt(isDownloaded)
        parcel.writeString(downloadedPath)
        parcel.writeInt(order)
        parcel.writeString(fistOrSecond)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MyEntries> {
        override fun createFromParcel(parcel: Parcel): MyEntries {
            return MyEntries(parcel)
        }

        override fun newArray(size: Int): Array<MyEntries?> {
            return arrayOfNulls(size)
        }
    }
}
