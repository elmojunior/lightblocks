package de.golfgl.lightblocks;

import com.badlogic.gdx.pay.android.amazon.PurchaseManagerAndroidAmazon;

import de.golfgl.gdxgameanalytics.AndroidGameAnalytics;

/**
 * AMAZON
 */
public class AndroidLauncher extends GeneralAndroidLauncher {
    @Override
    protected void initFlavor(LightBlocksGame game) {
        LightBlocksGame.gameStoreUrl = "http://www.amazon.com/gp/mas/dl/android?p=de.golfgl.lightblocks";

        // Disabled for offline mode:
        // MyGameCircleClient gsClient = new MyGameCircleClient();
        // gsClient.setAchievementsEnabled(true).setLeaderboardsEnabled(true).setWhisperSyncEnabled(true).intialize(this);
        // game.gpgsClient = gsClient;

        game.purchaseManager = new DonationPurchaseManager();
    }

}
