package com.example.myapplication.base.view;

import android.view.View;

/**
 * Description: View基类
 * Detail:
 * Create Time: 2018/8/8
 *
 * @author LiuFangQiang
 * @version 1.0
 * @see ...
 * History:
 * @since Since
 */
public interface AbstractView {

    void showNormal();

    void showError();

    void showLoading();

    void showEmpty();

    void showNeteaseLoading();

    void reload();

    void setVisible(View... view);

    void setInvisible(View... view);

    void setGone(View... view);

}
