package day7p1;

public class MusicSystem {
	
	
	private int musicSource;
	private int musicVolume;
	private int musicControl;
		
	
	public MusicSystem() {
	
	}
	public int getMusicSource() {
		return musicSource;
	}
	public void setMusicSource(int musicSource) {
		this.musicSource = musicSource;
	}
	public int getMusicVolume() {
		return musicVolume;
	}
	public void setMusicVolume(int musicVolume) {
		this.musicVolume = musicVolume;
	}
	public int getMusicControl() {
		return musicControl;
	}
	public void setMusicControl(int musicControl) {
		this.musicControl = musicControl;
	}
	
	public int selectMusicSource(int source) {
		System.out.println("Inside music source"+source);
		if(source == 1) {
			
			System.out.println("Radio/FM/AM");
			
		}
		else if(source == 2) {
			System.out.println("DVD/CD");
			
		}
		else if(source == 3) {
			System.out.println("USB");
			
		}
		else if(source == 4) {
			System.out.println("Bluetooth/Wireless");
			
		}
		return source;
	
	}
	
	public int selectMusicVolume(int level) {
		if(level == 1) {
			System.out.println("Volume is LOW");
		}
		else if(level == 5) {
			System.out.println("Volume is MID");
		}
		else if(level == 10) {
			System.out.println("Volume is HIGH");
		}
		return level;
	}
		
	public int selectMusicControl(int action) {
			if(action == 0) {
				System.out.println("System ON");
			}
			else if(action == 1) {
				System.out.println("System OFF");
			}
			return action;
			
	
		 }
		
	}

	




