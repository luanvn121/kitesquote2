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
    private static final long GAME_LENGTH_MILLISECONDS = 5000;

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
