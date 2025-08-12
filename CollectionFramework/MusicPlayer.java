package CollectionFramework;

import java.util.ArrayList;
import java.util.Random;

public class MusicPlayer {
	
	ArrayList<Songs> ms;
	MusicPlayer()
	{
		ms = new ArrayList<Songs>(); 
	}

	void addSongs(Songs s)
	{
		ms.add(s);
	}
	ArrayList<Songs> getALlSongs()
	{
		return ms;
	}
	
	void removeSOng(Songs s)
	{
		ms.remove(s);
	}
	void playRandomSOng()
	{
		Random r = new Random();
		int index = r.nextInt(ms.size()); //[0,1,2]
		
		Songs s = ms.get(index);
		System.out.println(s.getArtist() + " "+ s.getTitle());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MusicPlayer ob = new MusicPlayer();
		Songs s1 = new Songs("tere bina","Arijit Singh");
		Songs s2 = new Songs("abc","xyz");
		Songs s3 = new Songs("fire storm","Str");
		ob.addSongs(s3);
		ob.addSongs(s2);
		ob.addSongs(s1);
		
		for(Songs x: ob.getALlSongs())
		{ 
			System.out.println(x.getTitle() + " "+x.getArtist());
		}
		System.out.println("playing random song");
		ob.playRandomSOng();
		
		ob.removeSOng(s3);
		System.out.println("after removal");
		
		for(Songs x: ob.getALlSongs())
		{ 
			System.out.println(x.getTitle() + " "+x.getArtist());
		}

	}

}
