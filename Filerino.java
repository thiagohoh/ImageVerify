package FisrtCode;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
//all String must contain " ";
public class Filerino {
	
	public void Creatfile(String cs){
		String c = cs;
		try{
			File file = new File(c);
			boolean fvar = file.createNewFile();
		if(fvar){
			System.out.println("Created successfully");
			
		}
		else{
			System.out.println("Noope");
		}
		}catch(IOException e){
			System.out.println("Exception");
			e.printStackTrace();
		}
		
	}
	
	
	public void Reador(String re){
		BufferedReader br = null;
		String r = re;
		try{
			br = new BufferedReader(new FileReader(r));
			String contentLine = br.readLine();
			while ( contentLine != null){
				System.out.println(contentLine);
				contentLine = br.readLine();
			}
		}catch (IOException ioe){
			ioe.printStackTrace();
		}
		finally{
			try{
				if(br != null){
					br.close();
				}
			}catch(IOException ioe){
				System.out.println("no");
			}
		}
	}
	
	public void ReadorSimple(String r){
		String rr = r;
        try (BufferedReader br = new BufferedReader(new FileReader(rr))) {
            String contentLine = br.readLine();
            while ( contentLine != null){
                System.out.println(contentLine);
                contentLine = br.readLine();
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
}
	
	public void Writerino(String w){
		String ww = w;
		BufferedWriter bw = null;
		Getrino geter = new Getrino();
		
		try{
			String content = geter.GetString();
			File faile = new File (ww);
			
			if(!faile.exists()){
				Creatfile(ww);
			}
			
			FileWriter fw = new FileWriter(faile);
			bw = new BufferedWriter(fw);
			bw.write(content);
				System.out.println("File writado com suscces");
		}catch (IOException ioe){
			ioe.getStackTrace();
		}
		finally{
			try{
				if(bw!= null){
					bw.close();
				}
			}catch(IOException ioe){
					ioe.getStackTrace();
					
				}
			}
		}
		
	 public void WriterinoSimple(String w){
		 String ww = w;
		    Getrino geter = new Getrino();
		   
		    try{
		      String content = geter.GetString();
		      File faile = new File (ww);
		     
		      if(!faile.exists()){
		        Creatfile(ww);
		      }
		     
		      try (FileWriter fw = new FileWriter(faile); BufferedWriter bw = new BufferedWriter(fw)) {
		        bw.write(content);
		        System.out.println("File writado com suscces");
		      }
		    }catch (IOException ioe){
		      ioe.getStackTrace();
		    }
		  }
	 
	 public void WriterinoSimpleAppend(String w){
		 String ww = w;
		    Getrino geter = new Getrino();
		   
		    try{
		      String content = geter.GetString();
		      File faile = new File (ww);
		     
		      if(!faile.exists()){
		        Creatfile(ww);
		      }
		     
		      try (FileWriter fw = new FileWriter(faile,true); BufferedWriter bw = new BufferedWriter(fw)) {
		        bw.write(content);
		        System.out.println("File writado com suscces");
		      }
		    }catch (IOException ioe){
		      ioe.getStackTrace();
		    }
		  }
	 
	 
	 
	  public void FileDeleter(String d){
		  String dd= d;
		  try{
			  File faile = new File(dd);
			  if(faile.delete()){
				  System.out.println(faile.getName() + "\tDOOOM!!!!!!!!!!!!!!!!!");
			  }
			  else{
				  System.out.println("Delete failed");
			  }
		  }catch(Exception e){
			  e.printStackTrace();
		  }
	  }
	 
	  public void Renamerino(String old,String neo){
		  String oldi= old;
		  String ne = neo;
		  File faile = new File(oldi);
		  File neofaile = new File(ne);
		  boolean flag = faile.renameTo(neofaile);
		  if(flag){
			  System.out.println("It was a susccess");
		  }
		  else{
			  System.out.println("DANM YOU FOOL");
		  }
	  }
	 
	  
	  
	  
	  public void DirectoryCreat(String d,String name){
		  String dd=d;
		  String n = name;
		  File dik = new File(d + n);
		  if(!dik.exists()){
			  if(dik.mkdir()){
				  System.out.println("Directory is born");
			  }
			  else{
				  System.out.println("no diretory");
			  }
		  }
	  }
	  
	  public void WriterinoSimple2(int a,int r,int b,int g,String d){
		  
		    
		   
		    try{
		      
		      File faile = new File (d);
		     
		      if(!faile.exists()){
		        Creatfile(d);
		      }
		     
		      try (FileWriter fw = new FileWriter(faile); BufferedWriter bw = new BufferedWriter(fw)) {
		    	bw.write(" ");  
		        bw.write(a);
		        bw.write(" ");
		        bw.write(r);
		        bw.write(" ");
		        bw.write(b);
		        bw.write(" ");
		        bw.write(g);
		        bw.write("\n");
		        System.out.println("File writado com suscces");
		      }
		    }catch (IOException ioe){
		      ioe.getStackTrace();
		    }
		  }
	  
	  
	  public void WriterinoSimpleAppend2(int a,int r,int b,int g,String c){
		    
		   
		    try{
		    
		      File faile = new File (c);
		     
		      if(!faile.exists()){
		        Creatfile(c);
		      }
		     
		      try (FileWriter fw = new FileWriter(faile,true); BufferedWriter bw = new BufferedWriter(fw)) {
		    	  String aa = Integer.toString(a);
		    	  String rr = Integer.toString(a);
		    	  String bb = Integer.toString(b);
		    	  String gg = Integer.toString(g);
		    	  bw.write(" ");  
			        bw.write(aa);
			        bw.write(" ");
			        bw.write(rr);
			        bw.write(" ");
			        bw.write(bb);
			        bw.write(" ");
			        bw.write(gg);
			        
			        bw.newLine();
		      }
		    }catch (IOException ioe){
		      ioe.getStackTrace();
		    }
		  }
	  
	  public void WriterinoSimpleAppend3(int x,int y,String a){
		    
		   
		    try{
		    
		      File faile = new File (a);
		     
		      if(!faile.exists()){
		        Creatfile(a);
		      }
		     
		      try (FileWriter fw = new FileWriter(faile,true); BufferedWriter bw = new BufferedWriter(fw)) {
		    	  String xx = Integer.toString(x);
		    	  String yy = Integer.toString(y);
		    	  
		    	  bw.write(" ");  
			        bw.write(xx+" X ");
			        
			        bw.write(yy+" Y ");
			        
			        bw.newLine();
		      }
		    }catch (IOException ioe){
		      ioe.getStackTrace();
		    }
		  }
	 }
		
	
	
	
