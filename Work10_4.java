import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Work10_4 {
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
 	    System.out.println("请输入出题总数");
  	    int total= sc.nextInt();
   	    System.out.println("请输入只含有一个运算符的题目数量");
 	    int half1=sc.nextInt();
 	    System.out.println("请输入含有两个运算符的题目数量");
  	    int half2=sc.nextInt();
   	    if (total!=(half1+half2)){
    		System.out.println("请输入正确的题目数量值");
        }
		String fileName = "D:\\javalearning\\Exercises.txt";
		FileWriter writer = new FileWriter(fileName);
		String fileName1 = "D:\\javalearning\\Answers.txt";
		FileWriter writer1 = new FileWriter(fileName1); 
		int[]  A = new int[total];
  	    int[]  B = new int[total];
   	    int[]  C = new int[total];
    	for(int i = 0;i<total;i++){
     	   A[i] = (int)(Math.random()*100+1);
      	   B[i] = (int)(Math.random()*100+1);
       	   C[i] = (int)(Math.random()*100+1);
     	   System.out.println(A[i] + "\t" + B[i] + "\t" + C[i]);
    	}
    	//在0到100间生成随机数填入数组ABC中
    	int[]  D1 = new int[half1];
    	int[]  D2 = new int[half2];
    	int fuhao = 0;
    	//int i=0;
    	int j=0;
    	int k=0;
    	System.out.println( "i");
    	for(int i = 0;i < half1;i++){
    		fuhao = (int)(Math.random()+0.5);
      	    //System.out.println(fuhao);
       	    if (fuhao==1){
        	    D1[i] = A[i] + B[i];
         	}else if (fuhao==0){
          	    D1[i] = A[i] - B[i];
           	}//出题
        	if (i>=2){
         	   for (j = 0;j < i;j++){
          	    	if (D1[i]==D1[j]){
        	    	   if (A[i] == A[j]||(A[i]==B[j]&&B[i]==A[j])){
            	    		A[i] = (int)(Math.random()*100 + 1);
             	    	    B[i] = (int)(Math.random()*100 +1);
              	  	        fuhao = (int)(Math.random() + 0.5);
               	  	   		if (fuhao==1){
                    			D1[i] =A[i] + B[i];
                     		}else if (fuhao == 0){
                      	    	D1[i] =A[i] - B[i];
                   			}	
						j=0;
            	    	}
            		}
        			
           	 	 }
            	}//判断是否有重复的题目，并重新出一道题
			if(fuhao == 1){
				int a = A[i];
				int b = B[i];
				String s1 = Integer.toString(a) + " + ";
				String s2 = Integer.toString(b) + " = ";
				writer.write(s1);
				writer.write(s2);
				writer.write('\n');
				writer.flush();
				
			}else if(fuhao == 0){
				int a = A[i];
				int b = B[i];
				String s1 = Integer.toString(a) + " - ";
				String s2 = Integer.toString(b) + " = ";
				writer.write(s1);
				writer.write(s2);
				writer.write('\n');
				writer.flush();
			}//io流写入题目文本
			if(fuhao == 1){
				int a = A[i];
				int b = B[i];
				int c = D1[i];
				String s1 = Integer.toString(a) + " + ";
				String s2 = Integer.toString(b) + " = ";
				String s3 = Integer.toString(c);
				writer1.write(s1);
				writer1.write(s2);
				writer1.write(s3);
				writer1.write('\n');
				writer1.flush();
				
			}else if(fuhao == 0){
				int a = A[i];
				int b = B[i];
				int c = D1[i];
				String s1 = Integer.toString(a) + " - ";
				String s2 = Integer.toString(b) + " = ";
				String s3 = Integer.toString(c);
				writer1.write(s1);
				writer1.write(s2);
				writer1.write(s3);
				writer1.write('\n');
				writer1.flush();
			}//io流写入答案文本
           	/*if(fuhao == 1){
            	System.out.println(A[i] + "+" + B[i] + "=" + D1[i]);
            }else if(fuhao == 0){
            	System.out.println(A[i] + "-" + B[i] + "=" + D1[i]);
            }*/
   		}//对只有一个运算符的部分题目
    //System.out.println("aaaaaaaaaa");
    	int fuhao2 = 0;
    	j = half1 - 1;
  	 	for(int i = 0;i  <  half2;i++){
   	        fuhao = (int)(Math.random()*1+0.5);
    	    fuhao2 = (int)(Math.random()*1 + 0.5);
     	    if (fuhao==1&&fuhao2==1){
               D2[i] = A[j] + B[j] + C[j];
   	           System.out.println(A[j] + "+" + B[j] + "+" + C[j] + "=" +  D2[i]);
       	    }else if (fuhao==0&&fuhao2==1){
         	    D2[i] = A[j] - B[j] + C[j];
                System.out.println(A[j] + "-" + B[j] + "+" + C[j] + "=" + D2[i] );
        	}else if(fuhao==1&&fuhao2==0){
           	    D2[i] = A[j] + B[j] - C[j];
                System.out.println(A[j] + "+" + B[j] + "-" + C[j] + "=" + D2[i]);
            }else if(fuhao==0&&fuhao2==0){
         	    D2[i] = A[j] - B[j] - C[j];
                System.out.println(A[j] + "-" + B[j] + "-" + C[j] + "=" + D2[i]);
            }//出题
            if (i>=2){
         	   for (k = 0;k < i;k++){
         	  		if (D2[i]==D2[k]){
           	  	  	 if ((A[i] == A[k]&&B[i] == B[k]&&C[i]==C[k])
            	    	    	||(A[i]==B[k]&&B[i]==A[k]&&C[i]==C[k])
             	        	    ||(A[i]==C[k]&&B[i]==B[k]&&C[i]==A[k])
              	            	||(A[i]==A[k]&&B[i]==C[k]&&C[i]==B[k])
                  	            ||(A[i]==B[k]&&B[i]==C[k]&&C[i]==A[k])
               	    	        ||(A[i]==C[k]&&B[i]==A[k]&&C[i]==B[k])){
         		  	    A[j] = (int)(Math.random()*100 + 1);
          	  		    B[j] = (int)(Math.random()*100 +1);
                	    C[j] = (int)(Math.random()*100 + 1);
                     	fuhao = (int)(Math.random()*1+0.5);
  						fuhao2 = (int)(Math.random()*1 + 0.5);
    			      	if (fuhao==1&&fuhao2==1){
      			       	    D2[i] = A[j] + B[j] + C[j];
        			   	}else if (fuhao==0&&fuhao2==1){
       					 	D2[i] = A[j] - B[j] + C[j];
        	  		  	}else if(fuhao==1&&fuhao2==0){
        				 	D2[i] = A[j] - B[j] + C[j];
  					  	}else if(fuhao==0&&fuhao2==0){
   					  	    D2[i] = A[j] - B[j] + C[j];
        	    	    }
     	    	    	k = 0;
                 		  	}
               		 	}
    			 	}
        	    }//判断是否有重复，并且重出一道题目
				if (fuhao==1&&fuhao2==1){
					//D2[i] = A[j] + B[j] + C[j];
					int a = A[j];
					int b = B[j];
					int c = C[j];
					String s1 = Integer.toString(a) + " + ";
					String s2 = Integer.toString(b) + " + ";
					String s3 = Integer.toString(c) + " = ";
					writer.write(s1);
					writer.write(s2);
					writer.write(s3);
					writer.write('\n');
					writer.flush();
				 	//System.out.println(A[j] + "+" + B[j] + "+" + C[j] + "=" +  D2[i]);
		   		}else if (fuhao==0&&fuhao2==1){
				    //D2[i] = A[j] - B[j] + C[j];
					int a = A[j];
					int b = B[j];
					int c = C[j];
					String s1 = Integer.toString(a) + " - ";
					String s2 = Integer.toString(b) + " + ";
					String s3 = Integer.toString(c) + " = ";
					writer.write(s1);
					writer.write(s2);
					writer.write(s3);
					writer.write('\n');
					writer.flush();
					//System.out.println(A[j] + "-" + B[j] + "+" + C[j] + "=" + D2[i] );
		   		}else if(fuhao==1&&fuhao2==0){
			 		//D2[i] = A[j] + B[j] - C[j];
					int a = A[j];
					int b = B[j];
				    int c = C[j];
					String s1 = Integer.toString(a) + " + ";
					String s2 = Integer.toString(b) + " - ";
					String s3 = Integer.toString(c) + " = ";
					writer.write(s1);
					writer.write(s2);
					writer.write(s3);
					writer.write('\n');
					writer.flush();
			   		//System.out.println(A[j] + "-" + B[j] + "+" + C[j] + "=" + D2[i]);
		  		}else if(fuhao==0&&fuhao2==0){
			 		//D2[i] = A[j] - B[j] - C[j];
					int a = A[j];
					int b = B[j];
					int c = C[j];
					String s1 = Integer.toString(a) + " - ";
					String s2 = Integer.toString(b) + " - ";
					String s3 = Integer.toString(c) + " = ";
					writer.write(s1);
					writer.write(s2);
					writer.write(s3);
					writer.write('\n');
					writer.flush();
					//System.out.println(A[j] + "-" + B[j] + "-" + C[j] + "=" + D2[i]);
		   		}//io流写入题目文本
			   	if (fuhao==1&&fuhao2==1){
					//D2[i] = A[j] + B[j] + C[j];
					int a = A[j];
					int b = B[j];
					int c = C[j];
					int d = D2[i];
					String s1 = Integer.toString(a) + " + ";
					String s2 = Integer.toString(b) + " + ";
					String s3 = Integer.toString(c) + " = ";
					String s4 = Integer.toString(d);
					writer1.write(s1);
					writer1.write(s2);
					writer1.write(s3);
					writer1.write(s4);
					writer1.write('\n');
					writer1.flush();
				 	//System.out.println(A[j] + "+" + B[j] + "+" + C[j] + "=" +  D2[i]);
		   		}else if (fuhao==0&&fuhao2==1){
				    //D2[i] = A[j] - B[j] + C[j];
					int a = A[j];
					int b = B[j];
					int c = C[j];
					int d = D2[i];
					String s1 = Integer.toString(a) + " - ";
					String s2 = Integer.toString(b) + " + ";
					String s3 = Integer.toString(c) + " = ";
					String s4 = Integer.toString(d);
					writer1.write(s1);
					writer1.write(s2);
					writer1.write(s3);
					writer1.write(s4);
					writer1.write('\n');
					writer1.flush();
					//System.out.println(A[j] + "-" + B[j] + "+" + C[j] + "=" + D2[i] );
		   		}else if(fuhao==1&&fuhao2==0){
			 		//D2[i] = A[j] + B[j] - C[j];
					int a = A[j];
					int b = B[j];
				    int c = C[j];
					int d = D2[i];
					String s1 = Integer.toString(a) + " + ";
					String s2 = Integer.toString(b) + " - ";
					String s3 = Integer.toString(c) + " = ";
					String s4 = Integer.toString(d);
					writer1.write(s1);
					writer1.write(s2);
					writer1.write(s3);
					writer1.write(s4);
					writer1.write('\n');
					writer1.flush();
			   		//System.out.println(A[j] + "-" + B[j] + "+" + C[j] + "=" + D2[i]);
		  		}else if(fuhao==0&&fuhao2==0){
			 		//D2[i] = A[j] - B[j] - C[j];
					int a = A[j];
					int b = B[j];
					int c = C[j];
					int d = D2[i];
					String s1 = Integer.toString(a) + " - ";
					String s2 = Integer.toString(b) + " - ";
					String s3 = Integer.toString(c) + " = ";
					String s4 = Integer.toString(d);
					writer1.write(s1);
					writer1.write(s2);
					writer1.write(s3);
					writer1.write(s4);
					writer1.write('\n');
					writer1.flush();
					//System.out.println(A[j] + "-" + B[j] + "-" + C[j] + "=" + D2[i]);
		   		}//io流写入答案文本
            j++;
    	       //IO流写入文本
   	 	}
		writer.close();
		writer1.close();
	  }
	}

	/*题目重复判断：首先判断结果数组D中是否重复
				      若重复
  	                			判断加减号数目是否一致
   	               若一致
    	              			判断ABC数组中是否都相同
     	              若相同则判断重复
      	             重出一题再次判断是否重复
	*/	
