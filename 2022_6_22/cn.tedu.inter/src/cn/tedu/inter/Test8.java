package cn.tedu.inter;

public class Test8 {

    public static void main(String[] args) {

       //������̬�������

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

//2���ӿںͽӿ�֮����Է����̳й�ϵ�����ҿ��Զ�̳У��ö��Ÿ���

interface inter3 extends inter1,intera{

    void add();

}

 

//3��ʵ���࣬���Լ̳е�ͬʱ��ʵ��

//class Ext extends Object implements inter2,inter1{

//}

 

//1���ӿں�ʵ����֮����Է���ʵ�ֹ�ϵ�����ҿ��Զ�ʵ�֣��ö��Ÿ���

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