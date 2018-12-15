package com.issac.design.pattern.behavioral.templatemethod;

/**
 *
 * author:  ywy
 * date:    2018-12-15
 * desc:
 */
public class FECourse extends ACourse {

    private boolean needWriteArticleFlag = false;

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
