package com.tuts.prakash.retrofittutorial.viewModel;

import com.tuts.prakash.retrofittutorial.model.RetroPhoto;

import java.util.List;

import rx.Observable;

/**
 * Created by ahmedabobakr on 7/15/18.
 */

public interface MainViewModel {

    Observable<List<RetroPhoto>> getAllPhotos();
}
