package com.springinaction.springidol;

public class Instrumentalist implements Performer{
	private String song;
	private Instrument instrument;
	
	public Instrumentalist(){
	}
	
	public void perform() {
		System.out.println("Playing " + song + " : ");
		instrument.play();
	}
	
	public void setSong(String song){
		this.song=song;
	}
	
	public String getSong(){
		return song;
	}
	
	public String screamSong(){
		return song;
	}
	
	public void setInstrument(Instrument instrument){
		this.instrument = instrument;
	}
}