package com.devitis.mvp_googlemaps.ui.presenter;

/**
 * Created by Diana on 01.04.2019.
 */

public interface IMapsPresenter<T> {

    void setView(T view);

    void clearView();
}
