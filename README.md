# Distort Mod Loader

## Setup
1 ) Download and install the Github Desktop App.

2 ) Install Gradle on your computer

3 ) Clone the Distort repository (https://github.com/distortsm/Distort)
to a new folder. This folder will eventually contain the modded StarMade installation, so I recommend changing it from the Github default directory.

4 ) Edit the build.gradle file and change the following lines:
```
   gradle_path=C:\\Users\\<your_name>\\.gradle\\
   starmade_folder=C:\\<this_folder_path>\\StarMade\\
```

5 ) Navigate to your StarMade installation through command line and run the following command:

Windows:
```
gradlew build --refresh-dependencies
```

Mac/Linux:
```
./gradlew build -- refresh-dependencies
```

To start it, run the bat file, or use the following command:

Windows:
```
gradlew runStarMade
```

Max/Linux:
```
./gradlew runStarMade
```
Note: Eventually this process will probably be done through a modloading gui or integrated into the StarMade launcher at some point.