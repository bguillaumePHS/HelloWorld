## LibGDX HelloWorld Example

This code is meant to show the basic structure of coding a videogame in LibGDX. It is targeted at AP Computer Science A students, and thus simplifies a few things. 

For instance, rather than making the project using the official LibGDX [Liftoff tool](https://github.com/libgdx/gdx-liftoff) for managing dependencies with Gradle, we simply include a lib folder with the necessary jar files. Also, when possible, only data types and objects taught in the AP CSA course are used (such as double instead of float, and ArrayList instead of the more efficient LibGDX Array class).

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
