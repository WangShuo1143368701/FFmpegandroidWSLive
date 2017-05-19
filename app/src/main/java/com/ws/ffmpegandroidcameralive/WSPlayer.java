package com.ws.ffmpegandroidcameralive;

/**
 * Created by Shuo.Wang on 2017/4/18.
 */

public  class WSPlayer {
    static {
        System.loadLibrary("avutil-54");
        System.loadLibrary("swresample-1");
        System.loadLibrary("avcodec-56");
        System.loadLibrary("avformat-56");
        System.loadLibrary("swscale-3");
        System.loadLibrary("postproc-53");
        System.loadLibrary("avfilter-5");
        System.loadLibrary("avdevice-56");
        System.loadLibrary("native-lib");
    }

    public static native int initialize(int width,int height,String url);
    public static native int start(byte[] cameraData);
    public static native int stop();
    public static native int close();
}
