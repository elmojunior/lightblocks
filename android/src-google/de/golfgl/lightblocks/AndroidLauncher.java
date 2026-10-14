package de.golfgl.lightblocks;

import android.os.Bundle;

import com.badlogic.gdx.Gdx;

import de.golfgl.gdxgameanalytics.AndroidGameAnalytics;
import de.golfgl.gdxpushmessages.FcmMessageProvider;
import de.golfgl.lightblocks.gpgs.MyGpgsClient;

public class AndroidLauncher extends GeneralAndroidLauncher {

    //Google Play Games
    MyGpgsClient gpgsClient;
    private FcmMessageProvider fcm;

    @Override
    protected void initFlavor(LightBlocksGame game) {

        // Disabled for offline mode:
        // gpgsClient = new MyGpgsClient();
        // gpgsClient.initialize(this, true);
        // game.gpgsClient = gpgsClient;

        // fcm = new FcmMessageProvider(this);
        // game.pushMessageProvider = fcm;

        // own donation purchase manager
        game.purchaseManager = new DonationPurchaseManager();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Gdx.app.addLifecycleListener(fcm); // Disabled for offline mode
    }
}
