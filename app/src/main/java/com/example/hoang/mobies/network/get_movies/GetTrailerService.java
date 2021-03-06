package com.example.hoang.mobies.network.get_movies;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Inpriron on 6/19/2017.
 */

public interface GetTrailerService {
    @GET("movie/{movie_id}/videos")
    Call<MainTrailerObject> getMovieTrailer(@Path("movie_id") int movie_id, @Query("api_key")
            String api_key, @Query("language") String language);

    @GET("tv/{tv_id}/videos")
    Call<MainTrailerObject> getTVTrailer(@Path("tv_id") int tv_id, @Query("api_key")
            String api_key, @Query("language") String language);
}
