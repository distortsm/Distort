# Distort Mod Loader

## Setup
1 ) Download and install the Github Desktop App and Gradle onto your computer.

2 ) Open the StarMade installation you want to mod.

3 ) Clone the Distort repository (https://github.com/distortsm/Distort)
to a folder that is ONE DIRECTORY LEVEL ABOVE the directory where the StarMade.jar file is.

4 ) Edit the gradle.properties file and change the following lines:
```
   gradle_path=C:\\Users\\<your_name>\\.gradle\\
   starmade_folder=C:\\<this_folder_path>\\StarMade\\
```

5 ) Navigate to the current directory through command line and run the following command:

Windows:
```
gradlew build --refresh-dependencies
```

Mac/Linux:
```
./gradlew build --refresh-dependencies
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