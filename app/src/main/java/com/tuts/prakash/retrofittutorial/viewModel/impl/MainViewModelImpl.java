package com.tuts.prakash.retrofittutorial.viewModel.impl;

import com.tuts.prakash.retrofittutorial.model.RetroPhoto;
import com.tuts.prakash.retrofittutorial.network.GetDataService;
import com.tuts.prakash.retrofittutorial.network.RetrofitClientInstance;
import com.tuts.prakash.retrofittutorial.viewModel.MainViewModel;

import java.util.List;

import rx.Observable;

/**
 * Created by ahmedabobakr on 7/15/18.
 */

public class MainViewModelImpl implements MainViewModel {
    @Override
    public Observable<List<RetroPhoto>> getAllPhotos() {
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        return service.getAllPhotos();
    }
}
