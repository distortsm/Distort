package net.distortsm.api.main;

import net.fabricmc.api.ModInitializer;
import java.util.ArrayList;
import java.util.UUID;

public class Main implements ModInitializer {

public static final String starmadeDirectory = "../";
public static final String modsFolder = starmadeDirectory + "mods";
public static ArrayList<Mod> mods = new ArrayList<Mod>();

@Override
  public void onInitialize() {
    System.out.println("Distort API is ready!");
  }
}
