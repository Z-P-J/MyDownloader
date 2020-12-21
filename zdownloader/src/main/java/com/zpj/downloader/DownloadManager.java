package com.zpj.downloader;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public interface DownloadManager {

    List<DownloadMission> ALL_MISSIONS = new ArrayList<>();

    interface DownloadManagerListener {
        void onMissionAdd(DownloadMission mission);

        void onMissionDelete(DownloadMission mission);

        void onMissionFinished(DownloadMission mission);
    }

//    T createMission(String url, String name);

//    int startMission(String url);
//
//    int startMission(String url, String name);
//
//    int startMission(String url, String name, MissionConfig config);

//    void resumeMission(int id);
//
//    void resumeMission(String uuid);
//
//    void resumeAllMissions();
//
//    void pauseMission(int id);
//
//    void pauseMission(String uuid);

    void pauseAllMissions();

//    void deleteMission(int id);
//
//    void deleteMission(String uuid);
//
//    void deleteMission(DownloadMission mission);

    void deleteAllMissions();

//    void clearMission(int i);
//
//    void clearMission(String uuid);

    void clearAllMissions();

    DownloadMission getMission(int id);

    DownloadMission getMission(String uuid);

    int insertMission(DownloadMission mission);

    int getCount();

    Context getContext();

    DownloaderConfig getDownloaderConfig();

//    ThreadPoolConfig getThreadPoolConfig();

    boolean shouldMissionWaiting();

    void loadMissions();

    <T extends DownloadMission> void loadMissions(Class<T> clazz);

    void addDownloadManagerListener(DownloadManagerListener downloadManagerListener);

    void removeDownloadManagerListener(DownloadManagerListener downloadManagerListener);

//    DownloadManagerListener getDownloadManagerListener();

    List<DownloadMission> getMissions();

}