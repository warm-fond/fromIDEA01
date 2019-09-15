package cn.itcast.git;

public class Second {

    public static void main(String[] args) {

        System.out.println("新建一个分支dev");
        //在工程下，原先是master分支，新建一个dev分支，创建一个Second类属于dev分支，
        //再切换为master分支时，此时对该工程下是没有Second类的
        //在master分支里作修改不影响dev分支，同理，dev分支做修改也不影响master分支

    }




}
