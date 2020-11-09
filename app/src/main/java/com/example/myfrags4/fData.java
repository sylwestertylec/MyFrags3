package com.example.myfrags4;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class fData extends ViewModel {

    public final MutableLiveData<Integer> counter = new MutableLiveData<>(0);
}