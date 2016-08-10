package com.kitesquotes.itychanged.kitesquotes.Day;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.kitesquotes.itychanged.kitesquotes.Day.adapter.ListPhotoAdapter;
import com.kitesquotes.itychanged.kitesquotes.Day.model.OPhoto;
import com.kitesquotes.itychanged.kitesquotes.R;

import java.util.ArrayList;
import java.util.logging.LogRecord;

public class DataforDayActivity extends AppCompatActivity implements ListPhotoAdapter.ClickListener{

    RecyclerView rlListView;
    ListPhotoAdapter lvAdapter;
    private ArrayList<OPhoto> arrayList=null;
    InterstitialAd mInterstitialAd;
    private static final long GAME_LENGTH_MILLISECONDS = 95000;

    private CountDownTimer mCountDownTimer;
    private boolean mGameIsInProgress;
    private long mTimerMilliseconds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datafor_day);
        rlListView= (RecyclerView) findViewById(R.id.rlListView);

        ListPhotoAdapter photoAdapter = new ListPhotoAdapter(DataforDayActivity.this, arrayList());
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);
        photoAdapter.setClickListener(this);
        rlListView.setHasFixedSize(true);
        rlListView.setLayoutManager(layoutManager);
        rlListView.setAdapter(photoAdapter);
        MobileAds.initialize(this, getResources().getString(R.string.banner_ad_unit_id));

        // Create the InterstitialAd and set the adUnitId.
        mInterstitialAd = new InterstitialAd(this);
        // Defined in res/values/strings.xml
        mInterstitialAd.setAdUnitId(getResources().getString(R.string.banner_ad_unit_id));

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                startGame();
            }
        });

        // Create the "retry" button, which tries to show an interstitial between game plays.

        startGame();

    }








    //Call displayInterstitial() once you are ready to display the ad.


    private ArrayList<OPhoto> arrayList(){
        arrayList=new ArrayList<>();
        //2015
        arrayList.add(new OPhoto("http://66.media.tumblr.com/8ff0772b7a25c6229291c19ee0557290/tumblr_o04f7ik4Qk1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/de0cf51214b348e63c94fa35cd233855/tumblr_o02lynKDZZ1thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/e3cf3a16734e67a760c394b3ec36cbb4/tumblr_o02lzuypb81thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/d5a32f2bfdd151f1f742851259420dc6/tumblr_nzz30bwL4x1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/5cb15ea0fa82b711f99ba378facc7e7c/tumblr_nzxcoiGpf81sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/a88dbaf06cdcb8608cb397b53fb8cd3b/tumblr_nzxclpRpcl1sxnbwko1_1280.png"));

        arrayList.add(new OPhoto("http://67.media.tumblr.com/de0cf51214b348e63c94fa35cd233855/tumblr_o02lynKDZZ1thiwtjo1_1280.png"));

        arrayList.add(new OPhoto("http://67.media.tumblr.com/de0cf51214b348e63c94fa35cd233855/tumblr_o02lynKDZZ1thiwtjo1_1280.png"));

        arrayList.add(new OPhoto("http://67.media.tumblr.com/29a2a8aaefb392dc7de63df3d5f88f3f/tumblr_nzqy0wPNDG1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/3b2595233df739e51661db820acca821/tumblr_nznsv2DxIK1sxnbwko1_1280.png"));

        arrayList.add(new OPhoto("http://65.media.tumblr.com/3b2595233df739e51661db820acca821/tumblr_nznsv2DxIK1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/c5c51a640a2d8271c9af65868417cd4a/tumblr_nzfy1lnWGO1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/523d9cc99b4b018fcd4998529a54c3e6/tumblr_nze0quGlP91thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/12f9d52c34345a3f4a6e724ced503503/tumblr_nzcqx7D2Ah1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/f921805efc36ce7fc621f763f9197ebc/tumblr_nymrj75YAI1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/e608d46f4ca90ec986ddb821137ea50f/tumblr_nj8t76ksYE1thiwtjo1_r1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/ffe2fc3a523ea2fbda5a81b1538005ec/tumblr_nyja0rutgg1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/a7ce141f531db57d8de5ce2465fd8380/tumblr_ny7fkiPQNT1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/fc1f80c7489934bce21f989ffad4fc13/tumblr_ny7fgqwxPR1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/3d970d8c9362fb7c0d9c68d697581a37/tumblr_ny7d7ipRBM1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/ccd331d573f0b6ac6876ea2ea536ffe1/tumblr_ny7cz3fe0c1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/5fc19109538e1ccc2f8a54b488241129/tumblr_ny7dn0iSYb1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/233b0017eba41395bdb1d3d3936e1906/tumblr_ny7d2fDGOV1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/cb366928db303b496075fd5b77eea231/tumblr_ny7e9dKMx01sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/262dcc87bfb9f8e8777be1aa394eced4/tumblr_ny7jtr39U81thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/ad67835665220658a2eeabe5ea66611e/tumblr_nbdufrqWQd1thiwtjo1_r1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/5c20cd50ae30ee451165a8f2da623686/tumblr_ny78idh9FP1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/b5675eb45627f757244774cae496fb3e/tumblr_ny4a5t9ggu1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/f3c21b3620661bcbc2e706459aaf25f0/tumblr_nikk3i2Wy81sxnbwko1_r1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/1624c4d67aeac07059b5f8b5486677e5/tumblr_ny3g4qNz2Q1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/401462aa92a83408b3313b73e0184306/tumblr_n9rkzuMkHm1sxnbwko1_1280.png"));

        //thang 10-2015
        arrayList.add(new OPhoto("http://67.media.tumblr.com/d17c3f3d698cc90b9de5df48c31894ad/tumblr_nx3f2kcVZ71sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/26f89ce25ce4c178a5818e0fa53438ea/tumblr_nx3dxgH9jc1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/26b9f0cd086fc8ff2761d7fa122c9b3e/tumblr_nmxwao4ibV1sxnbwko1_r1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/3a821deffe69c9bc2cc7b58131ea4265/tumblr_nx1pm3HNNH1thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/e72e6fd921881096f1d04683ae7c1b06/tumblr_nx1oq5LkPm1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/5a5a7c066788af3724644f3c25c755c2/tumblr_nx17wmAdvq1thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/887dd2cff97dda6bee9772a046d8c5f5/tumblr_nwsbm7IgEB1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/4e82f41abb26c25e6d8e16c8bf901f1f/tumblr_nwsauj4Nmb1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/eb34ff9ced41005c13cf9fa47d0d8d51/tumblr_nwsamwWBKD1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/890f14ac12aed42c1385ccc56630a369/tumblr_nx17o2xAGn1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/321a0cdbfe9af995d81a2d9ac51a6441/tumblr_nwsa4wsLCO1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/c42df4d0db01bd8f6e1bec03b4a6f4dd/tumblr_nwtgciBLC71sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/638d3573f33c22a7551edc222ca69e61/tumblr_nwsc88Tual1thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/32f78d367608308b66383e608aa2d722/tumblr_nwsbphSe0Q1thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/30214596127ba8c25ebce8c98bd1fa32/tumblr_nwsaj1cgK31thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/2cb3eeaab6423963ef640a5cd68d1906/tumblr_nwsazcY1KK1thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/5ac6483fe25922f3fa2a5387a3584627/tumblr_nwsbz8VhZl1thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/e7ff908c3a23f3839115f94c7f541bb5/tumblr_nws9v5oQqc1thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/535c5fdffedaf3a95b817d389b24f0ce/tumblr_nhfjgnXUX81sxnbwko1_r1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/b02b1f5512c89de010aebcd383b7b6bb/tumblr_nwrzueRebE1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/89fe7316c102771e6dbb83318dcb5895/tumblr_nwkqgwBHq01thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/b42ea38fdf136de9a7334d3a69893a91/tumblr_nvwosexruh1thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/ea5fd0a2874b739bf7514b6c0a250df6/tumblr_nvuqayYS8h1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/404adfda20c86380ff6fe00b477da477/tumblr_nvu08mKc5e1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/73391f081c68c50d5df7296e7475789d/tumblr_nvv1goigZH1thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/4219ea1e68dc3385d140b1fc860e3677/tumblr_nvsnpdiYfz1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/b59007f9b5985b57095826db6909d1b2/tumblr_nvr7pqlbck1thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/f19997f9ba1344ba71d35a6dbc0d4ddf/tumblr_nvqv0yuANd1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/1ba7aa718e0ca4b7431c718f6f3df12d/tumblr_nvjm4rFueH1thiwtjo1_1280.png"));

        //september
        arrayList.add(new OPhoto("http://66.media.tumblr.com/a503e568708e6ca1f161a365a4f7e00e/tumblr_nmh6jp1J1Q1thiwtjo1_r1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/13ef9a70c29ae7b90f3cf37355d1185c/tumblr_nv9kpc3Mgr1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/768bc537cf88234e28a714cd5a74371a/tumblr_nv9ixdTbMc1thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/9145936246112f38be3da364f6e8c838/tumblr_nv30mbGoKZ1thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/202aa5077b9481a31fa75e512b73e1c9/tumblr_ngqis50F1R1thiwtjo1_r1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/47fd2f84675f7277b0661525eccdcf14/tumblr_nv2z19CNt01sxnbwko1_r1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/d524f6e183aa2a22f299ea3a85ec92e0/tumblr_nnlhwjemBz1thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/e5e84a86fb67fd97b2126504907df077/tumblr_nv2sx5cC151thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/8fa6e00495cfbe39d01e014e117ee5b7/tumblr_nv1a9nbcAP1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/53e24ef21fc6b6a2de794c77ffaeffb2/tumblr_nuwvvb8WZz1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/637faa9ad786c37ed25919b91a5da69a/tumblr_nuwvtpFHRi1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/f16cbf31a73a01bff1705d9a8fb11bdb/tumblr_nuva1c7UVc1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/e58926f47d70879fe9fc97198d1833ae/tumblr_nutlvsbMVb1thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/93674b15ae3d17f59022e890e2a2baaa/tumblr_nus470Vym81thiwtjo1_1280.png"));






        return arrayList;


    }

    @Override
    public void itemClicked(View view, int position) {
    }
    private void createTimer(final long milliseconds) {
        // Create the game timer, which counts down to the end of the level
        // and shows the "retry" button.
        if (mCountDownTimer != null) {
            mCountDownTimer.cancel();
        }


        mCountDownTimer = new CountDownTimer(milliseconds, 50) {
            @Override
            public void onTick(long millisUnitFinished) {
                mTimerMilliseconds = millisUnitFinished;
            }

            @Override
            public void onFinish() {
                mGameIsInProgress = false;
                showInterstitial();
            }
        };
    }
    @Override
    public void onResume() {
        // Start or resume the game.
        super.onResume();

        if (mGameIsInProgress) {
            resumeGame(mTimerMilliseconds);
        }

    }
    @Override
    public void onPause() {
        // Cancel the timer if the game is paused.
        mCountDownTimer.cancel();
        super.onPause();
    }
    private void showInterstitial() {
        // Show the ad if it's ready. Otherwise toast and restart the game.
        if (mInterstitialAd != null && mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            startGame();
        }
    }

    private void startGame() {
        // Request a new ad if one isn't already loaded, hide the button, and kick off the timer.
        if (!mInterstitialAd.isLoading() && !mInterstitialAd.isLoaded()) {
            AdRequest adRequest = new AdRequest.Builder().build();
            mInterstitialAd.loadAd(adRequest);
        }

        resumeGame(GAME_LENGTH_MILLISECONDS);
    }

    private void resumeGame(long milliseconds) {
        // Create a new timer for the correct length and start it.
        mGameIsInProgress = true;
        mTimerMilliseconds = milliseconds;
        createTimer(milliseconds);
        mCountDownTimer.start();
    }
}
