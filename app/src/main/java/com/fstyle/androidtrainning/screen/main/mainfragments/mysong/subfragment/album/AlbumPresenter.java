package com.fstyle.androidtrainning.screen.main.mainfragments.mysong.subfragment.album;

/**
 * Created by Administrator on 12/10/17.
 */

public class AlbumPresenter implements AlbumContract.Presenter {

    private AlbumContract.Viewer mViewer;

    @Override
    public void setView(AlbumContract.Viewer view) {
        mViewer = view;
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }
}
