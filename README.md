# NoBedRespawn

A simple Paper plugin for Minecraft 1.21.x that disables bed respawn points while still allowing players to sleep in beds.

## Features

- Players can still sleep in beds to skip night/storms
- Beds will NOT set respawn points
- Players will respawn at world spawn instead of their bed
- Bypass permission for admins/staff
- No configuration needed, works out of the box!

## Permissions

- `bedrespawndisabler.bypass` - Allows players to use beds as respawn points (default: op)

## How it Works

- Players can interact with beds normally and sleep in them
- When a player dies, if they would normally respawn at a bed, they'll respawn at world spawn instead
- Players with the bypass permission or OPs can still use beds as respawn points

