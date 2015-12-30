package FisrtCode;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Filerino {
	
	public void Creatfile(){
		try{
			File file = new File("C:\\Users\\Thiago\\Desktop\\Java test\\aipixels.txt");
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
	
	
	public void Reador(){
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader("C:\\Users\\Thiago\\Desktop\\Java test\\opa.txt"));
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
	
	public void ReadorSimple(){
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Thiago\\Desktop\\Java test\\opa.txt"))) {
            String contentLine = br.readLine();
            while ( contentLine != null){
                System.out.println(contentLine);
                contentLine = br.readLine();
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
}
	
	public void Writerino(){
		BufferedWriter bw = null;
		Getrino geter = new Getrino();
		
		try{
			String content = geter.GetString();
			File faile = new File ("C:\\Users\\Thiago\\Desktop\\Java test\\aipixels.txt");
			
			if(!faile.exists()){
				Creatfile();
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
		
	 public void WriterinoSimple(){
		    Getrino geter = new Getrino();
		   
		    try{
		      String content = geter.GetString();
		      File faile = new File ("C:\\Users\\Thiago\\Desktop\\Java test\\opa.txt");
		     
		      if(!faile.exists()){
		        Creatfile();
		      }
		     
		      try (FileWriter fw = new FileWriter(faile); BufferedWriter bw = new BufferedWriter(fw)) {
		        bw.write(content);
		        System.out.println("File writado com suscces");
		      }
		    }catch (IOException ioe){
		      ioe.getStackTrace();
		    }
		  }
	 
	 public void WriterinoSimpleAppend(){
		    Getrino geter = new Getrino();
		   
		    try{
		      String content = geter.GetString();
		      File faile = new File ("C:\\Users\\Thiago\\Desktop\\Java test\\opa.txt");
		     
		      if(!faile.exists()){
		        Creatfile();
		      }
		     
		      try (FileWriter fw = new FileWriter(faile,true); BufferedWriter bw = new BufferedWriter(fw)) {
		        bw.write(content);
		        System.out.println("File writado com suscces");
		      }
		    }catch (IOException ioe){
		      ioe.getStackTrace();
		    }
		  }
	 
	 
	 
	  public void FileDeleter(){
		  try{
			  File faile = new File("C:\\Users\\Thiago\\Desktop\\Java test\\opa.txt");
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
	 
	  public void Renamerino(){
		  File faile = new File("C:\\Users\\Thiago\\Desktop\\Java test\\opa.txt");
		  File neofaile = new File("C:\\Users\\Thiago\\Desktop\\Java test\\opa22.txt");
		  boolean flag = faile.renameTo(neofaile);
		  if(flag){
			  System.out.println("It was a susccess");
		  }
		  else{
			  System.out.println("DANM YOU FOOL");
		  }
	  }
	 
	  
	  
	  
	  public void DirectoryCreat(){
		  File dik = new File("C:\\Users\\Thiago\\Desktop\\Java test\\opa");
		  if(!dik.exists()){
			  if(dik.mkdir()){
				  System.out.println("Directory is born");
			  }
			  else{
				  System.out.println("no diretory");
			  }
		  }
	  }
	  
	  public void WriterinoSimple2(int a,int r,int b,int g){
		    
		   
		    try{
		      
		      File faile = new File ("C:\\Users\\Thiago\\Desktop\\Java test\\aipixels.txt");
		     
		      if(!faile.exists()){
		        Creatfile();
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
	  
	  
	  public void WriterinoSimpleAppend2(int a,int r,int b,int g){
		    
		   
		    try{
		    
		      File faile = new File ("C:\\Users\\Thiago\\Desktop\\Java test\\aipixels.txt");
		     
		      if(!faile.exists()){
		        Creatfile();
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
	  
	  public void WriterinoSimpleAppend3(int x,int y){
		    
		   
		    try{
		    
		      File faile = new File ("C:\\Users\\Thiago\\Desktop\\Java test\\aipixels.txt");
		     
		      if(!faile.exists()){
		        Creatfile();
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
		
	
