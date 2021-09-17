package com.Stickers.Classes.Commands;

import java.util.ArrayList;

import com.Stickers.Interfaces.StickerCommands;

public class StickersManager {

	ArrayList<StickerCommands> booked = new ArrayList<>();
	ArrayList<StickerCommands> cancelled = new ArrayList<>();
	ArrayList<StickerCommands> buySecondParty = new ArrayList<>();
	ArrayList<StickerCommands> sellSecondParty = new ArrayList<>();
	
	public void stickerOrder(StickerCommands obj,String command) {
		
		if("booked".equals(command)) {
			booked.add(obj);
		}else if("cancelled".equals(command)) {
			cancelled.add(obj);
		}else if("buy".equals(command)) {
			buySecondParty.add(obj);
		}else if("sell".equals(command)) {
			sellSecondParty.add(obj);
		}
		
	}
	
	public void bookStickerOrder() {
		for(StickerCommands e:booked) {
			e.executeCommand();
		}
	}
	
	public void cancelStickerOrder() {
		for(StickerCommands e:cancelled) {
			e.executeCommand();
		}
	}
	
	public void buyStickerOrder() {
		for(StickerCommands e:buySecondParty) {
			e.executeCommand();
		}
	}
	
	public void sellStickerOrder() {
		for(StickerCommands e:sellSecondParty) {
			e.executeCommand();
		}
	}
	
	public void endProcess() {
		booked.clear();
		cancelled.clear();
		buySecondParty.clear();
		sellSecondParty.clear();
	}
}
