package com.zpj.downloader;

import android.content.Context;

/**
 * 通知拦截器接口
 * @author Z-P-J
 */
public interface INotificationInterceptor {

    void onProgress(Context context, DownloadMission mission, float progress, boolean isPause);

    void onFinished(Context context, DownloadMission mission);

    void onError(Context context, DownloadMission mission, int errCode);

    void onCancel(Context context, DownloadMission mission);

    void onCancelAll(Context context);

}
