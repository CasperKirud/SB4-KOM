package dk.sdu.mmmi.cbse.playersystem;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.player.Player;
import org.junit.jupiter.api.*;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PlayerPluginTest {
    private static GameData gameData;
    private static World world;
    private static PlayerPlugin player;

    @BeforeAll
    static void setUp() {
        gameData = mock(GameData.class);
        world = mock(World.class);
        player = new PlayerPlugin();
    }

    @Test
    @Order(1)
    void addPLayerToWorld() {
        player.start(gameData, world);
        verify(world).addEntity(any(Player.class));
    }

    @Test
    @Order(2)
    void removePlayerFromWorld() {
        player.stop(gameData, world);
        verify(world).removeEntity(any(Player.class));
    }
}