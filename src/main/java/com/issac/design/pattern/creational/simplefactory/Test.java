package com.issac.design.pattern.creational.simplefactory;

/**
 * author:  ywy
 * date:    2018-12-08
 * desc:
 */
public class Test {
//    public static void main(String[] args) {
//
//        Video video = new JavaVideo();
//        video.produce();
//
//    }

    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (video == null) {
//            return;
//        }
//        video.produce();

        // 从一定层面上满足开闭原则
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}
