package net.distortsm.api.inventory;

import java.util.UUID;

import org.schema.game.common.controller.elements.cargo.CargoUnit;

public class InventoryHandler extends Inventory {
	
	public Inventory newInventory(String name) {
		Inventory inventory = new Inventory();
		inventory.inventoryName = name;
		inventory.inventoryUUID = UUID.randomUUID();
		inventory.cargoSpace = 100.0;
		return inventory;
	}
	
	public Inventory getInventory(UUID inventoryUUID) {
		
		return inventory;
	}
}
