package com.codepath.bestsellerlistapp

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class Movie {


    @SerializedName("original_title")
    var movieTitle: String? = null


    @SerializedName("poster_path")
    var imageUrl: String? = null

    @SerializedName("overview")
    var movieDescription: String? = null

}