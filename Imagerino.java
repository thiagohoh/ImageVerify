package FisrtCode;
import java.awt.image.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.*;
import java.io.File;


public class Imagerino {
	public void Ibage(String c){
		String constant = c;
		try{
		BufferedImage	img =  ImageIO.read(new File(constant));
		
		
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	public int GetH(String c){
		int jota;
		try{
			BufferedImage	img =  ImageIO.read(new File(c));
			
			jota =  img.getHeight();
			return jota;
		}catch (IOException e){
			e.printStackTrace();
			return -1;
		}
	}
		
	
		
	public int GetW(String x){
		int jota;
		try{
			BufferedImage	img =  ImageIO.read(new File(x));
			
			jota =  img.getWidth();
			return jota;
		}catch (IOException e){
			e.printStackTrace();
			return -1;
		}
	}
}
