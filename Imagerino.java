package FisrtCode;
import java.awt.image.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.*;
import java.io.File;


public class Imagerino {
	public void Ibage  (){
		
		try{
		BufferedImage	img =  ImageIO.read(new File("C:\\Users\\Thiago\\Desktop\\Java test\\Menina Ai Uehara.jpg"));
		
			
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
	}
