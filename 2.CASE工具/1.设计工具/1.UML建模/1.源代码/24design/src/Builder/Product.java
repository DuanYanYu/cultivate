package Builder;

public class Product {
	    private String partA;
	    private String partB;
	    private String partC;
	    public void setPartA(String partA)
	    {
	        this.partA=partA;
	    }
	    public void setPartB(String partB)
	    {
	        this.partB=partB;
	    }
	    public void setPartC(String partC)
	    {
	        this.partC=partC;
	    }
	    public void show()
	    {
	        //��ʾ��Ʒ������
	    	System.out.println("��Ʒ��A�����ǣ�"+this.partA);
	    	System.out.println("��Ʒ��B�����ǣ�"+this.partB);
	    	System.out.println("��Ʒ��C�����ǣ�"+this.partC);
	    }
}
