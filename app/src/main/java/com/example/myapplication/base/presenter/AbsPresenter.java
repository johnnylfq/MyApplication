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
public interface AbsPresenter<T extends AbstractView> {

    /**
     * 注入view
     */
    void attachView(T view);

    /**
     * 回收view
     */
    void detachView();

}
