package Test_OOP_final;

/**
 * 测试final
 */

public /*final*/ class Animal /*extends Object*/{ //final加到类前意味着该类不能被继承，不能有子类

    public /*final*/ void run(){  //final加到方法前意味着该方法不能被子类重写
        System.out.println("RUN!!");
    }

}


class Reptiles extends Animal {


    @Override
    public void run(){
        System.out.println("Crawl!!");

    }


}