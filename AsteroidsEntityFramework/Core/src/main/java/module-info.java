module Core {
    requires Common;
    requires CommonBullet;
    requires CommonEnemy;
    requires CommonAsteroids;
    requires java.desktop;
    requires com.badlogic.gdx;
    uses dk.sdu.mmmi.cbse.common.services.IGamePluginService;
    uses dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
    uses dk.sdu.mmmi.cbse.common.services.IPostEntityProcessingService;
}