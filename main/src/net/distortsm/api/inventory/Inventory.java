package net.distortsm.api.inventory;

import org.schema.game.common.controller.elements.cargo.CargoUnit;
import java.util.UUID;

public class Inventory extends CargoUnit {

	public UUID inventoryUUID;
	public String inventoryName;
	public double cargoSpace;
}
