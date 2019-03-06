public class Test {
	 public String EN_DEcrypt(String password, String userid, int flag) {

		    if( password.length()== 0) { return ""; };

		    int  i=0;
		    int  tt=1;
		    int  ys=0;
		    int  aa1[] =  {-1,1,-2,2,-3,3,-4,4,-5,5,-6,6,-7,7,-8,8};
		    int  aa2[] =  {1,-1,2,-2,3,-3,4,-4,5,-5,6,-6,7,-7,8,-8};
		    int  aa3[] =  {8,-8,7,-7,6,-6,5,-5,4,-4,3,-3,2,-2,1,-1};
		    int  aa4[] =  {-8,8,-7,7,-6,6,-5,5,-4,4,-3,3,-2,2,-1,1};
		    int  aa5[] =  {1,-1,3,-3,5,-5,7,-7,2,-2,4,-4,6,-6,8,-8};
		    int  aa6[] =  {-1,1,-3,3,-5,5,-7,7,-2,2,-4,4,-6,6,-8,8};
		    int  aa7[] =  {2,-2,4,-4,6,-6,8,-8,1,-1,3,-3,5,-5,7,-7};
		    int  aa8[] =  {-2,2,-4,4,-6,6,-8,8,-1,1,-3,3,-5,5,-7,7};
		    int  aa9[] =  {1,3,5,7,2,4,6,8,-1,-3,-5,-7,-2,-4,-6,-8};
		    int  aa10[] =  {-1,-3,-5,-7,-2,-4,-6,-8,1,3,5,7,2,4,6,8} ;
		    String ww = "";
		    char ch = '0';

		    int char1=0;
		    int char2=0;
		    int char3=0;
		    int char4=0;
		    if((userid.charAt(0)-48)<0 ||(userid.charAt(0)-48)>9){char1=0;}else{char1=userid.charAt(0)-48; };
		    if((userid.charAt(1)-48)<0 ||(userid.charAt(1)-48)>9){char2=0;}else{char2=userid.charAt(0)-48; };
		    if((userid.charAt(2)-48)<0 ||(userid.charAt(2)-48)>9){char3=0;}else{char3=userid.charAt(0)-48; };
		    if((userid.charAt(3)-48)<0 ||(userid.charAt(3)-48)>9){char4=0;}else{char4=userid.charAt(0)-48; };

		    ys = (1*char1 + 2*char2 + 3*char3 + 4*char4)%10;

		    if(flag==1) tt = -1;

		      switch(ys){
		        case 0:
		          for (i = 0;i<password.length();i++){
		            ch = (char)(password.charAt(i)+aa1[i]*tt);
		            ww = ww + ch;
		          };
		          break;
		        case 1:
		          for (i = 0;i<password.length();i++){
		            ch = (char)(password.charAt(i)+ aa2[i]*tt);
		            ww = ww + ch;
		          };
		          break;
		        case 2 :
		          for (i = 0;i<password.length();i++){
		            ch = (char)(password.charAt(i)+ aa3[i]*tt);
		            ww = ww + ch;
		          };
		          break;
		        case 3 :
		          for (i = 0;i<password.length();i++){
		            ch = (char)(password.charAt(i)+ aa4[i]*tt);
		            ww = ww + ch;
		          };
		          break;
		        case 4:
		          for (i = 0;i<password.length();i++){
		            ch = (char)(password.charAt(i)+ aa5[i]*tt);
		            ww = ww + ch;
		          };
		          break;
		        case 5 :
		          for (i = 0;i<password.length();i++){
		            ch = (char)(password.charAt(i)+ aa6[i]*tt);
		            ww = ww + ch;
		          };
		          break;
		        case 6 :
		          for (i = 0;i<password.length();i++){
		            ch = (char)(password.charAt(i)+ aa7[i]*tt);
		            ww = ww + ch;
		          };
		          break;
		        case 7 :
		          for (i = 0;i<password.length();i++){
		            ch = (char)(password.charAt(i)+ aa8[i]*tt);
		            ww = ww + ch;
		          };
		          break;
		        case 8 :
		          for (i = 0;i<password.length();i++){
		            ch = (char)(password.charAt(i)+aa9[i]*tt);
		            ww = ww + ch;
		          };
		          break;
		        case 9 :
		          for (i = 0;i<password.length();i++){
		            ch = (char)(password.charAt(i)+ aa10[i]*tt);
		            ww = ww + ch;
		          }
		          break;
		      }

		    return ww ;//return password
		  }		
		  
		  public static void main(String[] args) {
			Test cl =new Test();
			//System.out.println(cl.EN_DEcrypt("0:72355", "chenqiang",1)); //1990629
			
			//System.out.println(cl.EN_DEcrypt("043419", "yuwy",1)); //135246
			
			//System.out.println(cl.EN_DEcrypt("031629", "zhouchennj",1)); //123456
			
			//System.out.println(cl.EN_DEcrypt("815235", "caowei",1)); //907062
			
			System.out.println(cl.EN_DEcrypt("031", "lihong",1)); //123
		}
}
