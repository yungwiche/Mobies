package com.example.hoang.mobies.network.rate;

import com.example.hoang.mobies.network.get_movies.MainObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Inpriron on 6/24/2017.
 */

public interface GetRatedMoviesService {
    @GET("guest_session/{guest_session_id}/rated/movies")
    Call<MainObject> getRatedMovies(@Path("guest_session_id") String guess_session_id, @Query("api_key")
            String api_key);

}
