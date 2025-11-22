# WaffleCoreNK

WaffleCoreNK is a powerful Nukkit plugin that provides a simple yet robust API for developers to create their own plugins more efficiently. It handles common player events and offers a straightforward way to hook into them.

## Features

-   **Clean Project Structure:** Organized and easy-to-navigate codebase.
-   **GitHub Actions Integration:** Automated build processes for continuous integration.
-   **Simple Event Handling:** Abstracted event listeners for common player actions.
-   **Lightweight and Efficient:** Designed to have minimal impact on server performance.

## Installation

To use WaffleCoreNK in your project, you can easily add it as a dependency using JitPack.

### Step 1: Add the JitPack Repository

Add the following repository to your `pom.xml` file:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

### Step 2: Add the Dependency

Next, add the WaffleCoreNK dependency to your `pom.xml` file. Replace `VERSION` with the latest release tag (e.g., `0.1.0`).

```xml
<dependency>
    <groupId>com.github.Indra87G</groupId>
    <artifactId>WaffleCoreNK</artifactId>
    <version>VERSION</version>
    <scope>provided</scope>
</dependency>
```

## Usage

WaffleCoreNK provides a simple API to listen for various player events. Below are some examples of how to use it.

### Listening to Player Login

You can listen for player login events by creating a class that extends `PlayerLogin` and registering it with the `WaffleAPI`.

```java
import com.indra87g.waffle.WaffleAPI;
import com.indra87g.waffle.events.player.PlayerLogin;
import cn.nukkit.Player;

public class MyPlayerLoginListener extends PlayerLogin {
    @Override
    public void onPlayerLogin(Player player) {
        player.sendMessage("Welcome to the server, " + player.getName() + "!");
    }
}

// In your main plugin class's onEnable() method:
WaffleAPI.registerPlayerLogin(new MyPlayerLoginListener());
```

### Listening to Player Movement

To detect when a player moves, extend the `PlayerMove` class and register it.

```java
import com.indra87g.waffle.WaffleAPI;
import com.indra87g.waffle.events.player.PlayerMove;
import cn.nukkit.Player;
import cn.nukkit.math.Vector3;

public class MyPlayerMoveListener extends PlayerMove {
    @Override
    public void onPlayerMove(Player player, Vector3 from, Vector3 to) {
        if (from.distance(to) > 0) {
            System.out.println(player.getName() + " moved from " + from + " to " + to);
        }
    }
}

// In your main plugin class's onEnable() method:
WaffleAPI.registerPlayerMove(new MyPlayerMoveListener());
```

### Listening to Player Teleport

You can also listen for player teleport events by extending `PlayerTeleport`.

```java
import com.indra87g.waffle.WaffleAPI;
import com.indra87g.waffle.events.player.PlayerTeleport;
import cn.nukkit.Player;
import cn.nukkit.level.Location;

public class MyPlayerTeleportListener extends PlayerTeleport {
    @Override
    public void onPlayerTeleport(Player player, Location from, Location to) {
        player.sendMessage("You have been teleported!");
    }
}

// In your main plugin class's onEnable() method:
WaffleAPI.registerPlayerTeleport(new MyPlayerTeleportListener());
```

## Contributing

Contributions are welcome! If you have any ideas, suggestions, or bug reports, please open an issue or submit a pull request.
