package com.weapon.joker.app.home.api;

import com.weapon.joker.app.home.HomeBean;
import com.weapon.joker.lib.net.ApiManager;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * HomeApi 首页接口api
 * author:张冠之
 * time: 2018/2/20 下午11:03
 * e-mail: guanzhi.zhang@sojex.cn
 */

public interface HomeApi extends ApiManager {
    @GET
    Observable<HomeBean> getHomeListData();
}
