package stack;

public class ArrayStack {
	int top;
	int capacity;
	Object[] array;
	
	public ArrayStack(){
		this.top=-1;
		this.capacity=1000;
		array=new Object[this.capacity];
	}
	public ArrayStack(int size){
		this.top=-1;
		this.capacity=size;
		array=new Object[this.capacity];
	}

	public void push(Object data) {
		if (isStackFull() != Boolean.TRUE) {
			this.array[++top] = data;
		}
		return;
	}
	public Object pop(){
		Object retData=0;
		if(isStackEmpty()!=Boolean.TRUE){
			retData= this.array[top--];
		}
		return retData;
	}

	public Boolean isStackEmpty() {
		Boolean retVal = Boolean.FALSE;
		if (top == -1) {
			System.out.println("empty stack");
			retVal = Boolean.TRUE;
		}
		return retVal;
	}

	public Boolean isStackFull() {
		Boolean retVal = Boolean.FALSE;
		if (top == capacity) {
			System.out.println("stack overflow");
			retVal = Boolean.TRUE;
		}
		return retVal;
	}

	public Object top() {
		Object retVal = 0;
		if (isStackEmpty() != Boolean.TRUE)
			retVal = this.array[top];
		return retVal;
	}

	public int size() {
		return this.top + 1;
	}

}
