package net.distortsm.api.main;

import net.fabricmc.api.ModInitializer;
import net.distortsm.api.main.AccessModifier;

public class Main implements ModInitializer {

public static final String starmadeDirectory = "../";
public static final String modsFolder = starmadeDirectory + "mods";


@Override
  public void onInitialize() {
    System.out.println("Distort API is ready!");
  }
}
