package com.xixinfei.tv.launcher.util;

import com.boringkiller.daydayup.R;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Administrator on 2017-7-19.
 */

public class HolderPicUtil {
    private ArrayList<Integer> holderPics = new ArrayList<>();
    private Random random = new Random();
    private HolderPicUtil()
    {
        holderPics.add(R.drawable.bg_color_blue);
        holderPics.add(R.drawable.bg_color_green_1);
        holderPics.add(R.drawable.bg_color_green_2);
        holderPics.add(R.drawable.bg_color_pink);
        holderPics.add(R.drawable.bg_color_purple);
        holderPics.add(R.drawable.bg_color_yellow);
    }
    private static final AtomicReference<HolderPicUtil> INSTATNCE = new AtomicReference<>();
    public static HolderPicUtil getInstance()
    {
        for(;;)
        {
            HolderPicUtil holderPicUtil = INSTATNCE.get();
            if(holderPicUtil!=null)
            {
                return holderPicUtil;
            }
            holderPicUtil = new HolderPicUtil();
            if(INSTATNCE.compareAndSet(null,holderPicUtil))
            {
                return holderPicUtil;
            }
        }
    }

    public Integer getHolderPic()
    {
        return holderPics.get(random.nextInt(5));
    }

}
