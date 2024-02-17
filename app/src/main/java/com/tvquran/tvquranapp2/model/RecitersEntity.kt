package com.tvquran.tvquranapp2.model


import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
 import com.google.gson.Gson
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

@Entity(tableName = "reciters_table")
data class RecitersEntity(

    @SerializedName("id")
    @Expose
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int,

    @SerializedName("name")
    @Expose
    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "photo")
    @SerializedName("photo")
    @Expose
    val reciterImage: String,

    @ColumnInfo(name = "language")
    val language: String,

    @ColumnInfo(name = "full_biography")
    @SerializedName("full_biography")
    @Expose
    val reciterDetails: String,

    @ColumnInfo(name = "brief_biography")
    @SerializedName("brief_biography")
    @Expose
    val brief_biography: String,

    @ColumnInfo(name = "recitations_count")
    @SerializedName("recitations_count")
    @Expose
    val recitations_count: String,

    @SerializedName("total_likes")
    @Expose
    @ColumnInfo(name = "total_likes")
    val total_likes: String,

    @ColumnInfo(name = "total_listened")
    @SerializedName("total_listened")
    @Expose
    val total_listened: String,

    @ColumnInfo(name = "is_favorite")
    val isFavorite: Boolean,

    @ColumnInfo(name = "listen_count")
    val listenCount: Int
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readByte() != 0.toByte(),
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(name)
        parcel.writeString(reciterImage)
        parcel.writeString(language)
        parcel.writeString(reciterDetails)
        parcel.writeString(brief_biography)
        parcel.writeString(recitations_count)
        parcel.writeString(total_likes)
        parcel.writeString(total_listened)
        parcel.writeByte(if (isFavorite) 1 else 0)
        parcel.writeInt(listenCount)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<RecitersEntity> {
        override fun createFromParcel(parcel: Parcel): RecitersEntity {
            return RecitersEntity(parcel)
        }

        override fun newArray(size: Int): Array<RecitersEntity?> {
            return arrayOfNulls(size)
        }
    }
}
