package net.distortsm.api.main;

import net.fabricmc.api.ModInitializer;
import java.util.ArrayList;

public class Main implements ModInitializer {

  public final String starmadeDirectory = "../";
  public final String modsFolder = starmadeDirectory + "mods";
  public ArrayList<Mod> mods = new ArrayList<Mod>();

  @Override
  public void onInitialize() {
    System.out.println("Distort API is ready!");
  }
}
