package com.tuts.prakash.retrofittutorial.network;

import com.tuts.prakash.retrofittutorial.model.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by praka on 12/24/2017.
 */

public interface GetDataService {

    @GET("/photos")
    Observable<List<RetroPhoto>> getAllPhotos();
}
