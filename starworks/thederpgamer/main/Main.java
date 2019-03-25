package starworks.thederpgamer.main;

import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {
@Override
  public void onInitialize() {
    System.out.println("StarWorks API is ready!");
    System.out.println("Note:This mod won't do anything by itself, and will only create new files once another mod using this API tells it to.");
  }
}
