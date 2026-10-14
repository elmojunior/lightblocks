package de.golfgl.lightblocks.multiplayer;

import java.util.Collections;
import java.util.List;

/**
 * Disabled/no-op implementation of INsdHelper for offline mode.
 */
public class DisabledNsdHelper implements INsdHelper {
    @Override
    public void registerService() {
        // Disabled for offline mode
    }

    @Override
    public void unregisterService() {
        // Disabled for offline mode
    }

    @Override
    public void startDiscovery(boolean legacy) {
        // Disabled for offline mode
    }

    @Override
    public void stopDiscovery() {
        // Disabled for offline mode
    }

    @Override
    public List<IRoomLocation> getDiscoveredLegacyServices() {
        return Collections.emptyList();
    }

    @Override
    public List<ServerAddress> getDiscoveredMultiplayerServers() {
        return Collections.emptyList();
    }
}
