package cn.tedu.inter;

public class Test8 {

    public static void main(String[] args) {

       //创建多态对象测试

       intera in = new InterImpl();

       in.delete();

       in.select();

      

    }

}

interface inter1{

    void save();

    void update();

}

interface intera{

    void delete();

    void select();

}

//2，接口和接口之间可以发生继承关系，而且可以多继承，用逗号隔开

interface inter3 extends inter1,intera{

    void add();

}

 

//3，实现类，可以继承的同时多实现

//class Ext extends Object implements inter2,inter1{

//}

 

//1，接口和实现类之间可以发生实现关系，而且可以多实现，用逗号隔开

class InterImpl implements inter1,intera{

    @Override

    public void delete() {

       System.out.println("delete...");

    }

    @Override

    public void select() {

       System.out.println("select...");

    }

    @Override

    public void save() {

       System.out.println("save...");

    }

    @Override

    public void update() {

       System.out.println("update...");

    }
}