class LogicGates{
	int or_gate(int in1,int in2){
		
		int a,b;
		a=in1;
		b=in2;
		int ans;
		ans = a | b;
		return ans;
	}
	
	int and_gate(int in1,int in2){
		
		int a,b;
		a=in1;
		b=in2;
		int ans;
		ans = a & b;
		return ans;
	}
	
	int not_gate(int in){
		int a,ans;
		a=in;
		ans = ~a;
		return ans;
	}
	 int nor_gate(int in1,int in2){
		 
		 int a,b;
		 int ans;
		 a = in1;
		 b = in2;
		 if(a == 0 && b == 0)
			 ans=1;
		 else 
			 ans = 0;
		 return ans;
	 }
	 int nand_gate(int in1,int in2){
		 
		 int a,b;
		 int ans;
		 a = in1;
		 b = in2;
		 if(a == 1 && b == 1)
			  ans=0;
		 else 
			 ans = 1;
		 return ans;
	 }
	 
	 public static void main(String args[]){
		 int inp1=0;
		 int inp2=0;
		 LogicGates lg = new LogicGates();
		 int result_or = lg.or_gate(inp1,inp2);
		 int result_and = lg.and_gate(inp1,inp2);
		 int result_not = lg.not_gate(inp1);
		 int result_nor = lg.nor_gate(inp1,inp2);
		 int result_nand = lg.nand_gate(inp1,inp2);
		 System.out.println("result_or "+result_or);
		 System.out.println("result_and "+result_and);
		 System.out.println("result_not "+result_not);
		 System.out.println("result_nor "+result_nor);
		 System.out.println("result_nand "+result_nand);
	 }
}