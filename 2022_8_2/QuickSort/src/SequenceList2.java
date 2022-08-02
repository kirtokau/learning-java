import java.util.Iterator;

//顺序表代码
	public class SequenceList2<T> implements Iterable<T>{
		//存储元素的数组
		public T[] eles;
		//记录当前顺序表中的元素个数
		public int N;
	
		//构造方法
		public SequenceList2(int capacity) {
			eles=(T[])new Object[capacity];
			N=0;
		}
		//将一个线性表置为空表
		public void clear() {
			N=0;
		}
        //判断当前线性表是否为空表
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
		public void insert(int i, T t) {
			if(i==eles.length) {
				throw new RuntimeException("当前表已满");
			}
			if(i<0||i>N) {
				throw new RuntimeException("插入的位置不合法");
			}
			//把i位置空出爱，i位置极其后面的元素依次向后移动一位
			for(int index=N;index>i;index++) {
				eles[index]=eles[index-1];
			}
			//把t放到i位置处
			eles[i]=t;
			//元素数量+1
			N++;
		}
		//删除指定位置i处的元素，并返回该元素
		public T remove(int i) {
			if(i<0||i>N-1)
			throw new RuntimeException("当前要删除的元素不存在");
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
		//查找t元素第一次出现的位置
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
		//打印当前线性表的元素
		public void  showEles() {
			for(int i=0;i<N;i++) {
				System.out.println(eles[i]+" ");
			}
			System.out.println();
		}
		@Override
		public Iterator iterator() {			
			return new SIterator();
		}
		

public class SIterator  implements Iterator {
  		

	private int cur;
    	
	public SIterator() {
		this.cur=0;
	}

	@Override
	public boolean hasNext() {
		
		return cur<N;
	}


	@Override
	public Object next() {
		
		return eles[cur++];
	}
	
}
		
		public static void main(String[] args) {
			SequenceList2<String> squence=new SequenceList2<String>(5);
			//测试遍历
			squence.insert(0,"姚明");
			squence.insert(1,"科比");
			squence.insert(2,"麦迪");
			squence.insert(3,"艾佛森");
			squence.insert(4,"卡特");
			
			for(String s:squence) {
				System.out.println(s);
			}
		}
	}
	
	

