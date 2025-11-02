# BedRespawnDisabler Plugin

A simple Paper plugin for Minecraft 1.21.1 that disables bed respawn points while still allowing players to sleep in beds.

## Features

- Players can still sleep in beds to skip night/storms
- Beds will NOT set respawn points
- Players will respawn at world spawn instead of their bed
- Bypass permission for admins/staff
- Compatible with Paper 1.21.1

## Setup in IntelliJ IDEA

1. Open IntelliJ IDEA
2. Click "Open" and select the `BedRespawnDisabler` folder
3. IntelliJ should automatically detect it as a Maven project
4. Wait for Maven to download dependencies
5. You can now edit the code and build the plugin

## Building the Plugin

1. Open the Maven tab in IntelliJ (usually on the right side)
2. Navigate to `BedRespawnDisabler > Lifecycle > package`
3. Double-click "package" to build the plugin
4. The compiled JAR will be in the `target` folder

Alternatively, use the terminal:
```bash
mvn clean package
```

## Installation

1. Build the plugin using Maven
2. Copy the JAR file from the `target` folder to your server's `plugins` folder
3. Restart your server
4. The plugin will be loaded automatically

## Permissions

- `bedrespawndisabler.bypass` - Allows players to use beds as respawn points (default: op)

## Configuration

No configuration file needed - the plugin works out of the box!

## How it Works

- Players can interact with beds normally and sleep in them
- When a player dies, if they would normally respawn at a bed, they'll respawn at world spawn instead
- Players with the bypass permission can still use beds as respawn points

## Customization

You can modify the package name by:
1. Changing `com.yourserver` to your domain in reverse (e.g., `com.myserver`)
2. Update the package declarations in all Java files
3. Update the `main` field in `plugin.yml`
4. Update the `groupId` in `pom.xml`
