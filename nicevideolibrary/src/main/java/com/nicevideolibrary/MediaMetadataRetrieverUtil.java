package com.nicevideolibrary;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/10/28 0028.
 */

public class MediaMetadataRetrieverUtil {
    /**
     * 根据视频地址获取长度
     *
     * @param mUri
     * @return
     */
    public static String getRingDuring(String mUri) {
        String duration = null;
        android.media.MediaMetadataRetriever mmr = new android.media.MediaMetadataRetriever();

        try {
            if (mUri != null) {
                HashMap<String, String> headers = null;
                if (headers == null) {
                    headers = new HashMap<String, String>();
                    headers.put("User-Agent", "Mozilla/5.0 (Linux; U; Android 4.4.2; zh-CN; MW-KW-001 Build/JRO03C) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 UCBrowser/1.0.0.001 U4/0.8.0 Mobile Safari/533.1");
                }
                mmr.setDataSource(mUri, headers);
            }

            duration = mmr.extractMetadata(android.media.MediaMetadataRetriever.METADATA_KEY_DURATION);
        } catch (Exception ex) {
        } finally {
            mmr.release();
        }
        LogUtil.d("videoLong:\t" + duration);
        return duration;
    }

}
