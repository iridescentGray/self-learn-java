package com.learn.runner.image;

import com.learn.util.file.FileHighLevelUtil;
import com.learn.util.image.ImageUtil;

/**
 * @author learn
 * @date 2022/3/13
 */
public class ImageTest {

    public static void main(String[] args) {


        FileHighLevelUtil.doWithFileUnderPath("/Users/learn/Desktop/test"
                , file -> ImageUtil.compressFile(file, 0.30f)
                , ImageUtil.IMAGE_FILTER);

    }

}
