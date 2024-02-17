package com.tvquran.tvquranapp2.model


import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken

@Entity(tableName = "quran_track")
data class QuranEntity(

    @ColumnInfo(name = "id")
    @SerializedName("id")
    @Expose
    val id: Int,

    @ColumnInfo(name = "author_id")
    @SerializedName("author_id")
    @Expose
    val author_id: Int,

    @ColumnInfo(name = "title")
    @SerializedName("title")
    @Expose
    val title: String,

    @ColumnInfo(name = "content")
    @SerializedName("content")
    @Expose
    val content: String,

    @ColumnInfo(name = "views_count")
    @SerializedName("views_count")
    @Expose
    val views_count: Int,

    @ColumnInfo(name = "reciter_name")
    @SerializedName("reciter_name")
    @Expose
    val reciter_name: String,

    @ColumnInfo(name = "reciter_photo")
    @SerializedName("reciter_photo")
    @Expose
    val reciter_photo: String,

    @ColumnInfo(name = "category_name")
    @SerializedName("category_name")
    @Expose
    val category_name: String,

    @ColumnInfo(name = "category_desc")
    @SerializedName("category_desc")
    @Expose
    val category_desc: String,

    @ColumnInfo(name = "path")
    @SerializedName("path")
    @Expose
    val soundPath: String,

    @ColumnInfo(name = "up_votes")
    @SerializedName("up_votes")
    @Expose
    val upVotes: Int,

    @ColumnInfo(name = "track_type")
    val trackType: Int,

    @ColumnInfo(name = "fistOrSecond")
    val fistOrSecond: String,

    @ColumnInfo(name = "isHistory")
    val isHistory: Int,

    @ColumnInfo(name = "isDownloaded")
    val isDownloaded: String,

    @ColumnInfo(name = "downloadedPath")
    val downloadedPath: String,

    @ColumnInfo(name = "order")
    val order: Int,

    @ColumnInfo(name = "is_offline")
    val isOffline: String,

    @ColumnInfo(name = "smart_cache_dire")
    val smartCaheDire: String,

    @ColumnInfo(name = "play_list_id")
    val playListId: Int,

    @ColumnInfo(name = "playList_name")
    val playListName: String,

    @ColumnInfo(name = "last_listend_timeStamp")
    val lastListendTimeStamp: String,

    @ColumnInfo(name = "is_favorit")
    val isFavorite: Boolean,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "unique_id")
    val unique_id: Int,

    @ColumnInfo(name = "duration")
    val duration: Long,

    @ColumnInfo(name = "is_in_smart_cach")
    val isInSmartCach: Boolean,

    @ColumnInfo(name = "listen_count")
    val listen_count: Int

)
