package com.Stickers.Main;

import com.Stickers.Classes.Sticker;
import com.Stickers.Classes.Commands.StickersManager;
import com.Stickers.Classes.Commands.StickersOrderBooked;
import com.Stickers.Classes.Commands.StickersOrderBuy;
import com.Stickers.Classes.Commands.StickersOrderCancelled;
import com.Stickers.Classes.Commands.StickersOrderSell;

public class StickersMainClassTest {

	public static void main(String[] args) {
		StickersManager manager = new StickersManager();
		
		Sticker stickerObject = new Sticker();
		
		StickersOrderBooked booked= new StickersOrderBooked(stickerObject);
		
		StickersOrderCancelled cancelled = new StickersOrderCancelled(stickerObject);
		
		StickersOrderBuy buy = new StickersOrderBuy(stickerObject);
		
		StickersOrderSell sell = new StickersOrderSell(stickerObject);
		
		manager.stickerOrder(booked,"booked");
		manager.stickerOrder(cancelled,"cancelled");
		manager.stickerOrder(buy,"buy");
		manager.stickerOrder(sell,"sell");
		
		manager.bookStickerOrder();
		manager.cancelStickerOrder();
		manager.buyStickerOrder();
		manager.sellStickerOrder();
	}
}
