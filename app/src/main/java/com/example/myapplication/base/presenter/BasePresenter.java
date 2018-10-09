package com.example.myapplication.base.presenter;

import com.example.myapplication.base.view.AbstractView;

/**
 * Description:
 * Detail:
 * Create Time: 2018/8/10
 *
 * @author LiuFangQiang
 * @version 1.0
 * @see ...
 * History:
 * @since Since
 */
public class BasePresenter<T extends AbstractView> implements AbsPresenter<T> {

    protected T view;
    private int currentPage;


    @Override
    public void attachView(T view) {

    }

    @Override
    public void detachView() {

    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
