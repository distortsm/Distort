package net.distortsm.api.main;

import net.fabricmc.api.ModInitializer;
import net.distortsm.api.main.AccessModifier;

public class Main implements ModInitializer {

public static final String starmadeDirectory = "../";

@Override
  public void onInitialize() {
    AccessModifier.main();
    System.out.println("Distort API is ready!");
  }
}
