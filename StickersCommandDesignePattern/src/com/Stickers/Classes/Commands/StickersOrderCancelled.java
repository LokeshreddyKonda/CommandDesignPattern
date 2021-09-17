package com.Stickers.Classes.Commands;

import com.Stickers.Classes.Sticker;
import com.Stickers.Interfaces.StickerCommands;

public class StickersOrderCancelled implements StickerCommands{

	private Sticker stickerObject;
	
	public StickersOrderCancelled(Sticker stickerObject) {
		super();
		this.stickerObject = stickerObject;
	}

	@Override
	public void executeCommand() {
		this.stickerObject.cancelOrderOfStickers();
	}
}
