package net.distortsm.api.mixin;

import org.schema.game.client.controller.GameClientController;
import org.schema.schine.network.client.ClientController;
import org.schema.schine.network.client.ClientState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameClientController.class)
public abstract class DistortAPIMixin extends ClientController {
	private ExampleMixin(ClientState clientState) {
		super(clientState);
	}

	@Inject(at = @At("HEAD"), method = "initialize()V")
	public void init(CallbackInfo info) {
		System.out.println("Distort API Mixin Loaded!");
	}
}
