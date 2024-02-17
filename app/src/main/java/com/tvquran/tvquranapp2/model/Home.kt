package com.tvquran.tvquranapp2.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Home(saveMethod: String, deleteMethod: String, getMethod: String) {

    @SerializedName("sorted")
    @Expose
    var sorted: String? = null

    @SerializedName("reciters")
    @Expose
    var reciterses: List<RecitersEntity>? = null

    @SerializedName("entries")
    @Expose
    var entries: List<QuranEntity>? = null

    init {
        // The server CRUD methods should be provided by the entity sub-classing BusinessObject
    }
}
