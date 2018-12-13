package com.issac.design.pattern.creational.prototype;

/**
 * author:  ywy
 * date:    2018-12-11
 * desc:
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模版");
        System.out.println("初始化mail:" + mail);
        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("姓名" + i + "@issac.com");
            mailTemp.setContent("恭喜你，中奖了");
            MailUtil.sendMail(mailTemp);
            System.out.println("克隆的mailtemp: " + mailTemp);
        }

        MailUtil.saveOriginMailrecord(mail);
    }
}
