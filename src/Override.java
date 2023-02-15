class A5 {
    int i, j;

    A5(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void show() {
        System.out.println("i j = " + i + " " + j);
    }
}

class B5 extends A5{
    int k;
    
    B5(int i,int j,int k){
    	super(i, j);
    	this.k =k;
    }

    void show() {
    	super.show();
        System.out.println("k = " + k);
    }
}

class Override {
    public static void main(String args[]) {
        B5 b = new B5(1,2,3);
        
        b.show();
    }
}
