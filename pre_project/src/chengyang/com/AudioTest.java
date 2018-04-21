package chengyang.com;

import java.io.*;
import javax.sound.sampled.*;

public class AudioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class AudioPlay extends Thread
{
	File f=null;
	
	
	public AudioPlay(File f)
	{
		
		this.f=f;
		
		AudioInputStream ais=null;
		
		try {
			ais=AudioSystem.getAudioInputStream(f);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		AudioFormat af=ais.getFormat();
		SourceDataLine sdl=null;
		//DataLine.Info info=new DataLine.Info(SourceDataLine, arg1)

	}
	
	
	public void run()
	{
		
	}
}