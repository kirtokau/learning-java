//顺序表代码
public class SequenceList1<T> {
	//存储元素的数组
	private T[] eles;
	//记录当前顺序表中的元素个数
	private int N;
	//构造方法
	public SequenceList1(int capacity) {
		eles=(T[])new Object[capacity];
		N=0;
	}
	//将一个线性表置为空表
	public void clear() {
		N=0;
	}
	//判断当前表是否为空表
	public boolean isEmpty() {
		return N==0;
		
	}
	//获取线性表的长度
	public int length() {
		return N;
	}
	//获取指定位置的元素
	public T get(int i) {
		if(i<0||i>=N) {
			throw new RuntimeException("当前元素不存在！");
			
		}		
		return eles[i];		
	}

    //向线性表中添加元素t
    public void insert(T t) {
	if(N==eles.length) {
		throw new RuntimeException("当前表已满");		
	}
	eles[N++]=t;
  }
    //在i元素处插入元素t
    public void insert(int i,T t) {
    	if(i==eles.length) {
    		throw new RuntimeException("当前表已满");    		
    	}
    	if(i<0||i>N) {
    		throw new RuntimeException("插入的位置不合法");
    	}
    	//把i位置空出来，i位置极其后面的元素依次向后移动一位
    	for(int index=N;index>i;index--) {
    	    eles[index]=eles[index-1];
    	}
    	//把t位置放到i位置处
    	eles[i]=t;
    	//元素数量+1
    	N++;
    }
    //删除指定位置i处的元素，并返回元素
    public T remove(int i) {
    	if(i<0||i>N-1) {
    		throw new RuntimeException("当前要删除的元素不存在");
    	}
    	//记录i位置处的元素
		T result=eles[i];
		//把i位置后面的元素都向前移动一位
		for(int index=i;index<N-1;index++) {
			eles[index]=eles[index+1];
		}
		//当前元素数量-1
		N--;
		return result;
    }
    //查找T元素第一次出现的位置
    public int indexof(T t) {
    	if(t==null) {
    		throw new RuntimeException("查找的元素不合法");
    	}
    	for(int i=0;i<N;i++) {
    		if(eles[i].equals(t)) {
    			return i;
    		}
    	}
    	return -1;
    }
    //测试代码
  
    	public static void main(String[] args) {
			//创建顺序表对象
    		SequenceList1<String>s1=new SequenceList1<>(10);
    		//测试插入
    		s1.insert("姚明");
    		s1.insert("科比");
    		s1.insert("麦迪");
    		s1.insert(1,"詹姆斯");
    		//测试获取
    		String getResult=s1.get(1);
    		System.out.println("获取索引1处的结果为:"+getResult);
    		//测试删除
    		String removeResult=s1.remove(0);
    		System.out.println("删除的元素是:"+removeResult);
    		//测试清空
    		s1.clear();
    		System.out.println("清空后的线性表中的元素个数为："+s1.length());
		
    }
}