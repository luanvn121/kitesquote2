package com.kitesquotes.itychanged.kitesquotes.Day;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.kitesquotes.itychanged.kitesquotes.Day.adapter.ListPhotoAdapter;
import com.kitesquotes.itychanged.kitesquotes.Day.model.OPhoto;
import com.kitesquotes.itychanged.kitesquotes.R;

import java.util.ArrayList;

public class DataforDayActivity extends AppCompatActivity implements ListPhotoAdapter.ClickListener {

    RecyclerView rlListView;
    ListPhotoAdapter lvAdapter;
    private ArrayList<OPhoto> arrayList = null;
    InterstitialAd mInterstitialAd;
    private static final long GAME_LENGTH_MILLISECONDS = 95000;

    private CountDownTimer mCountDownTimer;
    private boolean mGameIsInProgress;
    private long mTimerMilliseconds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datafor_day);
        rlListView = (RecyclerView) findViewById(R.id.rlListView);

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


    private ArrayList<OPhoto> arrayList() {
        arrayList = new ArrayList<>();
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


        //December 12 2014
        arrayList.add(new OPhoto("http://66.media.tumblr.com/eead820610ccaeb7ed5ad1d39f9420a5/tumblr_nhfq9ao6tv1sxnbwko1_1280.jpg", "“Mắt không thấy, tâm không phiền.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/8dedc23d9b8ad24d64612f543c805301/tumblr_nhfjbxnNQj1thiwtjo1_1280.jpg", "“Là con gái nên nhớ, có thể khóc, có thể hận, nhưng không thể không kiên cường. Bởi vì vẫn luôn có một nhóm người ở đó để đợi xem chuyện cười của bạn.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/1d27d2dfde6a1cced8b675e89ea10be0/tumblr_nhg79qQrLf1sxnbwko1_1280.jpg"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/1e2830fb96284bc34008f370fdd007d6/tumblr_nhfjctj6Zr1thiwtjo1_1280.jpg","“Đừng nói tất cả những điều bạn biết, cũng đừng tin tất cả những gì bạn nghe.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/e944e6c23196f8383a84ae2bf0ca59cd/tumblr_nhfizyGA1I1sxnbwko1_1280.jpg","“Một ngày nào đó, mùa xuân của cuộc đời đi qua, người không còn, ai sẽ thương ai?”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/a9b8ca7de6559569dccb2f604bc541d3/tumblr_nhfiz2zoS41sxnbwko1_1280.jpg","“Mình không có lười. Chỉ là do mình đang trong chế độ tiết kiệm năng lượng thôi!”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/fcf93e583bb43fba97bff6bd363cbe65/tumblr_nhfitmBxzW1sxnbwko1_1280.jpg","“Bi thương là thứ không nhìn thấy,không thể nói,thậm chí không thể hình dung,nhưng trọng lượng của nó lại rất nặng nề.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/70a36fdde253ff468ce73e92aabc1fa0/tumblr_nhfis4yZ6b1sxnbwko1_1280.jpg","“Thành thực mà nói thì chẳng có ai sợ yêu. Người ta chỉ sợ phải lòng, nhớ nhung, chờ đợi, ghen tuông, hờn giận, và chia ly mà thôi.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/691f242394960150c165b7aa7a383bd0/tumblr_n1nikuhnFv1sxnbwko1_1280.png","“Hóa ra yêu nhưng không nhất định có thể mãi mãi ở bên nhau…”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/ef7c618fd71adcd910e68db0df90fe64/tumblr_n4zvj5h1n31sxnbwko1_1280.png","“Thế giới này đúng là đã thay đổi rồi, phụ nữ không những phải tranh đàn ông với phụ nữ, còn phải tranh đàn ông với đàn ông nữa…”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/7d92aeb0fdaa2569f98069e2aac7adc9/tumblr_n0sclnRQuu1sxnbwko2_1280.png","“Không có đóa hoa nào nở rộ mãi, không có cơn mưa nào rơi mãi, thế thì, cũng chẳng có hồi ức nào tồn tại mãi mãi, đến lúc đặt dấu chấm hết rồi.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/48f3422f433e27046799bcb3e97aaf41/tumblr_n0xnr6yTWk1sxnbwko1_1280.png","“Trên đời này còn tồn tại một sức mạnh gọi là số phận, chúng ta chỉ có thể chấp nhận mà không thể thay đổi.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/b42cb7d893a5c037725f73cca2731d6b/tumblr_n3razf8xMI1sxnbwko1_1280.png","“Nắm lấy tay nàng, che đi nửa đời điên loạn,\n" +
                "Hôn lên mắt nàng, che nàng nửa kiếp lênh đênh…”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/8b8d401ba50dc3215117f64d82737db3/tumblr_n4bzyuUkUm1sxnbwko1_1280.png","“Em là em, độc nhất vô nhị, không cần so sánh với ai khác.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/05125cfa943f3d0fbf1dcb1d032df2ab/tumblr_n5tbbxyKVs1sxnbwko1_1280.png","“Có được có mất mới gọi là cuộc sống.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/aab212d4beb4ce845264b2d4f14b1fcf/tumblr_n6n8n09r3y1sxnbwko1_1280.png","“Con gái, khi ở cùng nhau sẽ nói chuyện về ai?\n" +
                "Nói về đàn ông.\n" +
                "Nếu chưa có đàn ông?\n" +
                "Nói về bản thân. \n" +
                "Nếu chuyện bản thân đã nói đến thời quấn tã?\n" +
                "Nói chuyện người ta.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/9ac8f1470731db41ceed903a3c044561/tumblr_n7xr3rCbFY1sxnbwko1_1280.png","“Bất cứ lúc nào đều không được từ bỏ sự nghiệp của mình. Sự nghiệp và tiền bạc vĩnh viễn sẽ không phản bội bạn, càng không bao giờ biết ngoại tình. Khi nói đến li hôn, một người có tiền, có sự nghiệp sẽ luôn tự tin hơn. Khi bàn luận đến chuyện li hôn của bạn, những người xung quanh cũng chỉ mắng kẻ còn lại là ngu ngốc.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/434796ccfd353cdb172863fe46bc8454/tumblr_nhacusqmr71sxnbwko1_1280.jpg","“Thế giới vẫn kỳ thị những người thuộc giới tính thứ ba, nhưng họ không có tội.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/d42f76a14c90f3ebe9ef242e6b3be1c8/tumblr_n88g8docg41sxnbwko1_1280.png","“Vận mệnh một tay sắp đặt cuộc gặp gỡ như vậy. Cuộc đời thật không phải lúc nào cũng giữ lại chỗ dư.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/370bb7253248fcbcd8ac515ff3c87ba3/tumblr_nck11qpvfs1sxnbwko1_1280.jpg","“Phụ nữ sau 25 tuổi không khác gì quạt điện giữa mùa đông, để đâu cũng thấy không hợp. Ngay cả bố mẹ đẻ cũng chê mình chiếm chỗ trong nhà”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/404a755a4ed6f5d005ab56d53c13715d/tumblr_nd4ojmyIW41sxnbwko1_1280.jpg","“Người con gái dùng tình yêu để huỷ diệt một người con trai, cùng lắm cũng chỉ làm huỷ diệt đi lòng tin vào tình yêu của họ. Còn con trai cũng dùng tình yêu để huỷ diệt một người con gái, có thể sẽ huỷ diệt mọi thứ của họ, bao gồm lòng tin vào tình yêu, lòng tin vào cuộc sống, lòng tin vào con người.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/f4f57d13c24df20ffc280ca935618165/tumblr_nhbugmSVj41sxnbwko1_r2_1280.png","“Trên đời có nhiều người lạ lắm, chỉ thấy cái sai của người khác chứ không thấy rác trên đầu mình.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/dd5a9d8a21a1c65be2ec604df7e5fa0b/tumblr_nhactudVZC1sxnbwko1_1280.jpg","“Coi vợ là công chúa, vậy bạn chính là hoàng tử; coi vợ là hoàng hậu, vậy bạn chính là hoàng đế; coi vợ mình là bảo mẫu, vậy bạn chính là bảo an; coi vợ là a hoàn, vậy bạn chính là thái giám. Vậy nên, muốn làm hoàng đế hay thái giám, phải xem cách đối xử của bạn đối với vợ của mình thôi!”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/fa409b516ccca7a099ea6448cb2975ed/tumblr_nha1k8UUmg1sxnbwko1_1280.jpg","“Có nhiều người rất ngộ, cái gì cũng giỏi cái gì cũng biết nhưng có mỗi biết điều là không?”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/3e0c7632e8c79344ea3c43a71bc19a1a/tumblr_nh8z1pw9G11sxnbwko1_r1_1280.png","“The only thing we’re allowed to do is to believe that we won’t regret the choice we made.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/15e15ccd3ec53c5bf732801b2c2b5fab/tumblr_nh4o34nckG1sxnbwko1_r1_1280.png","“The world is merciless and it’s also very beautiful.\n" +
                "Thế giới này thật tàn nhẫn, nhưng cũng thật tươi đẹp.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/c1a51fdb3fa2e5fd3cf4fb043756384d/tumblr_nh8z0nelFW1sxnbwko1_1280.jpg","“Ước chi tiền có thể từ trên trời rơi xuống.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/330f1a04e991c146bc0042f4085f3707/tumblr_nh8yzskKsE1sxnbwko1_1280.jpg","“Trong bóng tối, tôi thấy trái tim mình, \n" +
                "Úa tàn tựa một đóa hoa.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/7b1ccfe37c034d632f55b8eec03efa45/tumblr_nh8yxldqbs1sxnbwko1_1280.jpg","“If you win, you live.\n" +
                "If you lose, you die.\n" +
                "If you don’t fight, you can’t win!”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/13193f069920c5d70dc7d1d59c9cecd6/tumblr_nh35rixUq31sxnbwko1_1280.jpg","“Não tôi là một cái máy lọc rất tinh vi. Nó hoạt động như túi trà lipton: chỉ giữ lại cặn bã còn tinh hoa thì chảy hết ra ngoài.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/30ad58654aedd4b8aecd176dbbafeade/tumblr_nh2zwelLpd1thiwtjo1_1280.jpg","“Trong những ngày lễ, người hạnh phúc sẽ càng hạnh phúc, người cô đơn sẽ càng cô đơn”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/d03407793f5db9b0a8a95656612052fc/tumblr_nh2zkc7jLD1sxnbwko1_1280.jpg","“Trên đời không có loại tình yêu nào hoàn toàn giống nhau cả, chỉ có nỗi đau trong đó là không hề khác.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/030f2a47e6712d1e0d775d61d718726f/tumblr_nh2zb8Fr7M1thiwtjo1_1280.jpg","“Ôm nỗi bực tức trong lòng giống như tự mình uống thuốc độc rồi hy vọng người khác chết.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/d6b175dbab944bf5ddb9a990a5c08436/tumblr_nh0se8eZZ21thiwtjo1_1280.jpg","“Thế giới sẽ không vì sự mệt mỏi của bạn mà dừng lại bước chân của nó. Ngày hôm nay bạn không tận lực để đi, thì ngày mai bạn sẽ phải dùng hết sức mình để chạy.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/a4184fb125f009487ea8b1154470a423/tumblr_ngzmuzA33d1thiwtjo1_1280.jpg","“Bạn gửi cho mẹ mình một tin nhắn, bà không trả lời, bạn thường sẽ không băn khoăn. Bạn gửi cho đối phương một tin nhắn, người đó không trả lời, bạn liền trở nên bối rối. Lý do cơ bản là bởi, bạn chắc chắn rằng mẹ yêu mình, nhưng bạn lại không thể biết chắc đối phương có yêu mình hay không.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/df768e26bbf966ca378e4eec9935f4e3/tumblr_ngzmtjUan41thiwtjo1_1280.jpg","“Có một điều đáng tiếc rằng, những người yêu nhau mà không yêu được nỗi cô đơn của nhau. Thậm chí còn chưa từng chạm tới. Và cũng chưa bao giờ biết yêu nỗi cô đơn của chính mình.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/cf07228a12eade4cf1c8225733bcbe6a/tumblr_ngzmslt6rz1thiwtjo1_1280.jpg","“Trên đời này có một số người phải chờ đến khi trải qua rất nhiều chuyện mới bắt đầu biết quay đầu, phải chời tới khi trôi dạt khắp nơi mới bắt đầu hiểu được quý trọng, chờ tới khi cảnh còn người mất mới bắt đầu hoài niệm.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/7a73cded18d4872beb232c7486979021/tumblr_nh0sk7x7VO1sxnbwko1_r1_1280.png","“Đừng bao giờ níu kéo những thứ không thuộc về mình… mà phải giật nhiệt tình chừng nào thuộc về mình thì thôi”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/d04af48f6a3e600607e66d12c1d8a002/tumblr_nh0sc4nX3K1thiwtjo1_1280.jpg","“Ta mặc cả từng đồng cho kỳ thích\n" +
                "Chợt ngước sang nhìn người bán giật mình\n" +
                "Tay bà cụ rụn nhận từng bạc lẻ\n" +
                "Suýt nữa ta mua cả sự vô tình.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/3f260e7c4313038a66035b2b08d26219/tumblr_nh0sb3QhaA1thiwtjo1_1280.jpg","“Cuộc sống, một nửa là thực, một nửa là mơ. Tình yêu, một nửa là số phận, một nửa là do mình tự nắm lấy.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/5c9fead9c68c03fc45430befd0b07827/tumblr_ngzmz4S8LA1thiwtjo1_1280.jpg","“Thích một người không mấy thích mình sẽ rất khổ, nhưng biết làm sao? Rút chân lại đã quá muộn."));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/56ee70d3bfaba6a82b020699197fd3ce/tumblr_ngzmrqXMax1thiwtjo1_1280.jpg","“Suy cho cùng chẳng có một điều gì xấu khi gặp lại người yêu cũ, cái tồi tệ là phát hiện bản thân mình vẫn còn yêu.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/b68bfb0cd19dfdf28f46f59463811372/tumblr_ngzlfitJ411sxnbwko1_1280.jpg","“Tất cả những gì đã cũ nhất định phải cho nó qua đi. Dù rằng bản thân chẳng bao giờ gặp lại điều gì đó đẹp đẽ như thế lần nào nữa trong đời.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/ca0703246dde34c5b49621f5c9f28c9f/tumblr_ngvlskNgMY1thiwtjo1_1280.jpg","“Laugh and the world laughs with you. Cry, and you cry alone.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/082e5cb81fe5c5796dbbfb430894fa1f/tumblr_ngvldi5V6y1thiwtjo1_1280.jpg","“Người không muốn biểu lộ tâm sự của mình cho người khác, đa phần đều biểu lộ tình cảm bằng con chữ. Cuộc đời mỗi con người ai cũng có một cách để giải tỏa, bất luận là là ôm búp bê khóc lóc hay đấm tay vào tường, đều giống nhau.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/8b747a0b3da37d524df0c8605d30e1eb/tumblr_ngvlek2e1L1thiwtjo1_1280.jpg","“Có những điều mà ngay cả một đứa trẻ lên hai lên ba còn hiểu và làm được, vậy mà người lớn chúng ta lại không? Như việc khi vui thì cười, lúc buồn cứ khóc chẳng hạn.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/8efc2facf7b6e054cf30ba3b2f1aa10f/tumblr_ngvlfd8oDJ1thiwtjo1_1280.jpg","“Tìm kiếm nhau dù xa xôi.\n" +
                "Thì có nhau được bao lâu?”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/44e041991d4cefe3d8297b24db71271e/tumblr_ngvlrmJARf1thiwtjo1_1280.jpg","“Nếu mai quên tất cả\n" +
                "Ta sẽ chừa người ra\n" +
                "Như bão đêm chừa lại\n" +
                "Thật mong manh nhánh hoa.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/46978f02a30fb2a15193c14ce1920439/tumblr_n0vmhfAgMV1sxnbwko1_1280.png","“Ta là gió, mà gió phải được tự do.\n" +
                "I am the wind. The free wind”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/05654da96d1ac1495c16c65402046464/tumblr_ngvejv2U8i1sxnbwko1_1280.jpg","“Thực ra tình bạn đơn giản lắm. Mỗi khi ăn đồ ngon chợt nhớ đến nó, vội vàng rút máy ra chụp lại, gửi cho nó xem…”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/cd5cd2694b029faad11ab1ced6cdd502/tumblr_nbyanaXDHA1sxnbwko1_1280.jpg","“I am not crazy! My reality is just different than yours.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/d67fc2139834161315d2202c3e5b13a6/tumblr_ngtzkv6OUT1sxnbwko1_1280.jpg"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/24f958c019c867b0d0f5e438a26126be/tumblr_ngq50p1eSq1sxnbwko1_1280.jpg"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/025320bd93b36640c23ffc98ab64f2f1/tumblr_ngq4zndnqQ1sxnbwko1_1280.jpg","“Mấy ngày hôm nay tôi mới phát hiện ra, hóa ra có thể giả vờ là mình không online. Thật nhân tính, cho dù là trên mạng, chúng ta cũng cần mặt nạ.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/96615edbb2da5c422ba0036d4c422af2/tumblr_n2l7axW1vl1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/7d59ae414690c945937479c65ed7fc96/tumblr_n7kegskJOo1sxnbwko1_1280.png","“Khi người khác nói rằng bạn có vẻ luôn bình tĩnh và dửng dưng, chỉ có bản thân bạn biết, sự bình tĩnh và dửng dưng lúc này đã đổi bằng bao nhiêu nước mắt; sóng yên phẳng lặng giờ này phút này đã từng bị đắm chìm bởi bao nhiêu con sóng. Tất cả thất bại và đau đớn, tất cả trải nghiệm trong cuộc đời đều là để đào tạo, rèn luyện bạn. Đừng nói năm tháng tàn nhẫn, kỳ thực nó đã rất dịu dàng đối với bạn.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/30d1ad2aac8c5f0a214c6303541bb565/tumblr_ngq4yq5c7G1sxnbwko1_1280.jpg","“Đến một độ tuổi nào đó, người ta chẳng thể làm gì khác hơn ngoài sự im lặng. Buồn bã cũng im lặng, hân hoan cũng im lặng. Thi thoảng, chỉ muốn ngồi ở một góc quán quen, thấy khổ hạnh nào rồi cũng nhẹ nhàng như mây trời. Cuộc đời cứ thế mà biên niên cô đơn.\n" +
                "\n" +
                "…..Nhớ một câu đã đọc ở đâu đó “Chúng ta ngay cả bạn bè cũng không được, và gặp gỡ hóa ra là chuyện rất buồn”. Vô số lần nào đó, mình đã lặng lẽ rời đi, dẫu lòng mình vô cùng thương mến ai đó. Có lẽ bởi vì chúng ta chẳng đủ duyên để làm một người bạn, để làm một người tình đắm say thì thôi, thà làm một người dưng để thi thoảng giữa cuộc đời tất bật có lúc quay quắt nhớ về nhau.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/c580784d5c449a1381fae85467c55853/tumblr_ngnrlaOZF61sxnbwko1_1280.jpg","“-An Tử Yến, cậu xem liệu chúng mình có thể đợi tới ngày thế giới này không còn kì thị tình yêu của hai ta không? Tình yêu này hoàn toàn chẳng khác gì so với những tình yêu khác, nhưng đi đến đâu chúng ta cũng đều nhận lấy những ánh mắt soi mói.\n" +
                "-Bọn họ đang ngưỡng mộ cậu đấy. Còn nhớ lời tớ nói với cậu hồi trước không? Dù cậu là nam thì tớ vẫn yêu.”\n"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/99d157594996532dcb02e3fd224b551f/tumblr_ngnqqnx3Ke1thiwtjo1_1280.jpg","“Tôi không phải một cô gái nổi bật,nói đến ưu điểm,chắc là yên tĩnh,có bổ sung thêm thì may ra được cái tính tình hiền lành tốt bụng.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/0aab09b5f332c314e6edf1439522759d/tumblr_n5mcglqTtB1sxnbwko1_1280.png","“Bạn mụn yêu dấu.\n" +
                "Nếu bạn muốn ở lâu dài cùng tui, bạn nên suy nghĩ lại, giá mặt tiền hơi cao đấy.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/2b25d8a610069268f6461b491a960966/tumblr_ngmz7d5LCp1thiwtjo1_1280.jpg","“Trên thế giới này có một loại người như vậy: Bọn họ ra vẻ thoải mái hòa nhã với bạn, ra vẻ cực kì hiểu bạn, cuối cùng khi có chuyện xảy ra, lại cách biệt một trời một vực so với ước nguyện ban đầu của bạn, trong một thời gian ngắn gây ra tổn thương không lường, không cách nào cứu vãn được nữa. Bạn tức giận, bạn bất lực, lại không có cách nào đối phó với họ. Bạn chỉ hi vọng thời gian trôi qua, đau thương chậm rãi được chữa lành.”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/324bd1619d9ec5b5a720881b2d8f32fe/tumblr_ngmd9crRKR1thiwtjo1_1280.jpg"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/c6b68ffaa53da8e47b119695eae0bb98/tumblr_ngmdc87oDR1thiwtjo1_1280.jpg","“Có những từ, chỉ thích hợp giữ lại trong tim, có những nỗi đau, chỉ thích hợp để quên đi trong im lặng. Khi đã qua đi rồi, bạn trưởng thành lên, bản thân mới biết như vậy cũng tốt. Rất nhiều thay đổi, bản thân bạn chẳng cần nói ra, người khác sẽ nhìn thấy thấu đáo.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/337a07321d0b09f3b07d9c63a8222c64/tumblr_n32sywTdIs1sxnbwko1_1280.png","“Đàn ông nói: “Anh sẽ điện thoại cho em” và rồi không làm điều đó, hắn không quên, hắn không làm mất số điện thoại và hắn cũng không chết, đơn giản vì hắn không muốn mà thôi.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/b194d3a32c4dcdffc684c2b6b3ba8666/tumblr_ngmw04tojH1thiwtjo1_1280.jpg","“Thằng chồng tương lai của em giờ này chắc đang tí tởn với bạn gái của nó và nghĩ rằng chúng nó sẽ hạnh phúc dài lâu này nọ… Ờ được rồi, hẹn gặp cưng trong vài năm nữa hén.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/738bd23e01782ce95e94ad3de6dfa3b0/tumblr_ngmfnmF0kE1sxnbwko1_r1_1280.png","“Lục Hải Không trước giờ chưa từng nắm được Tống Vân Tường, càng không có tư cách bàn chuyện có nên buông tay nàng hay không.”\n"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/fafaa5f0379a4cef754fdb1e007e4e3d/tumblr_ngmd8ex13q1thiwtjo1_1280.jpg","“Trong dòng thời gian thấm thoát trôi qua, sẽ luôn có một vài thứ, một vài cảnh tượng chỉ cần một cái liếc mắt đã đủ để lại ấn tượng trong lòng, dẫu năm tháng có chảy trôi thế nào thì mỗi lần nhớ tới, kỉ niệm ấy vẫn mãi vẹn nguyên.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/30d60fe8ac1c7637de9c0c2fe94037f7/tumblr_ngmcruuVp01sxnbwko1_1280.jpg","“Đừng hỏi em có sao không. Chỉ cần bước tới, ôm lấy em và nói \"Có anh ở đây” là được rồi.“"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/b821ac3267b13f9149ca158382f9c32d/tumblr_ngmcqtz5nY1sxnbwko1_1280.jpg","“Có phải ngẫu nhiên hay không thì có sao?\n" +
                "Điều quan trọng nhất là chúng ta đã gặp nhau”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/bc5e04ced16663dbf6c00ff0cc1aa1ac/tumblr_ngkasoNtGQ1thiwtjo1_1280.png","“Đột nhiên bắt đầu hoài niệm thuở bé khi muốn tìm bạn đi chơi không cần gọi điện thoại, không cần nhắn tin, chỉ cần ở dưới nhà bạn gào lên một tiếng là được.”\n"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/c68d41cf8c5dbc5e6452234f7dfff2ee/tumblr_ngka06k3lg1thiwtjo1_1280.jpg","“…Không biết bắt đầu từ khi nào, tôi tập cho mình thói quen chịu đựng. Mọi thứ. Ừ, mọi thứ. Những khổ đau buồn thương chẳng ai biết được. Tôi luôn khoe ra bộ mặt tươi cười hớn hở, và mọi thứ khác để tự mình ôm lấy, tự mình giải quyết. Cuộc đời của chính mình, nếu không tự giải quyết cho mình, thì ai, ai sẽ giải quyết giùm. Không một ai. Cuộc đời của họ – của mỗi người đều có vấn đề của riêng mình, đừng để họ phải lo lắng, bất an về mình.\n" +
                "Vì thế, khi buồn, tôi muốn một mình.\n" +
                "Một góc.\n" +
                "Không nói.\n" +
                "Đừng hỏi…”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/017606ff4ea7ae5b1ff258b4b9944ffc/tumblr_ngka7f5eKj1thiwtjo1_1280.jpg","“Con người là vậy đấy, có những chuyện bạn càng giải thích thì người khác càng nghĩ rằng bạn đã bị nói trúng tim đen. Nhưng nếu không giải thích họ lại cho rằng nói đúng nên bạn chẳng còn gì để nói.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/bf7f0c11f2f5666facf0ac960223a415/tumblr_n3p5e4gguy1sxnbwko1_1280.png","”- Tôi phải đi con đường nào ?\n" +
                "- Cô muốn đi đâu ?\n" +
                "- Tôi không biết.\n" +
                "- Thế thì cô đi đường nào cũng vậy thôi.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/26ba62e5f4b451cd9c461db1b82e7629/tumblr_n0l1da8xRd1sxnbwko1_1280.png","“Từng có một khoảnh khắc tôi hi vọng thời gian mãi mãi dừng lại. Chỉ vì dù thế nào đi nữa tôi cũng không muốn nghe một câu nói.”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/b800b4397ce0b6e5d498093d04f6b85a/tumblr_ngicf3TzB81sxnbwko1_1280.jpg","“Chỉ cần anh gọi tên, em sẽ đứng lại\n" +
                "Giữ em đi và nói yêu em.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/a2ae78d266dd36408c3231ac2bd23e6c/tumblr_ngiuldj7SR1thiwtjo1_1280.jpg","“Không có gì là mãi mãi, cũng chẳng có gì sẽ dài lâu.\n" +
                "Chỉ cần tìm được một cái cớ, bất cứ ai cũng có thể rời đi.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/2c18cbb7bde389fe8469c8720549b552/tumblr_ngiumg1aX31thiwtjo1_r1_1280.jpg","“Tự dưng thấy rất mệt. Cảm giác muốn khóc. Chẳng biết tại sao.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/ee549e0dcd1af801ad774dd3ec786d5f/tumblr_n0l1jxoRRn1sxnbwko1_1280.png","“Con người, dù biết là mình sẽ chết nhưng họ vẫn cố gắng sống. Dù biết là một lúc nào đó phải chia lìa, nhưng khi yêu, họ sẽ yêu như không còn gì để mất. Làm những việc trẻ con như vậy, chính là con người. Khi thời gian trôi đi, rốt cuộc mọi thứ cũng sẽ ổn cả thôi. Nó cũng sẽ trở thành việc chưa bao giờ xảy ra. Thế nhưng, tuy sau này thì cũng quan trọng, nhưng không phải hiện tại cũng quan trọng sao?”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/a1ec3bce4c7253e5dea5b1acc4c1add8/tumblr_n1wjyvDrpk1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/4ed1ffd58db6e75cbf99cce9368c07e0/tumblr_n0mwyzaAyW1sxnbwko1_1280.jpg","“Chắc nó chừa mình ra”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/473b97accb7cf28cd50eb91fa0153526/tumblr_n5o3ts4mkw1sxnbwko1_1280.png","“Chuyện đời nhiều kì lạ lắm, rất nhiều chuyện không thể dự tính trước được. Một giây đi qua không biết giây tiếp theo sẽ như thế nào, chuyện tình cảm còn khó nói hơn. Cứ tưởng là sẽ kết hôn sinh con, ai ngờ chia tay là chia tay, cứ tưởng 2 người là không thể nào, ai ngờ lại ở bên nhau, tất cả mọi chuyện đều có thể xảy ra.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/2b34a69a4740eb3afc2997ca9ef2dcbe/tumblr_nax8yrXfsU1sxnbwko1_1280.jpg","“Chỉ cần nhờ giúp đỡ được một lần thì sẽ có lần hai, lần ba, tiếp tục cầu cạnh, nhờ vả người khác. Đây chính là con người ta ở đời. Và còn nữa, “ngày nào đó sẽ báo đáp” ư, không có đâu. Đời không dài đến thế, để cho con người ta đủ hiểu chuyện!”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/95930258ec7124d496c2e4d2a364770e/tumblr_ngf2jvDzfK1thiwtjo1_1280.jpg","“Ai cũng tìm một nửa của mình còn thiếu nhưng riêng tôi thì không!\n" +
                "Bởi vì tôi không bị đứt đôi người. Tôi quá hoàn hảo.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/f16c27a89e093df1fd3d8fc83175fc72/tumblr_ngf2e0RxPc1sxnbwko1_1280.jpg","“Trời đất bao la, dạ dày lớn nhất.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/8f46c7ebcad4d21896c2c02b7c6f297e/tumblr_ngi6ftN0ah1sxnbwko1_1280.jpg","“Tình yêu, không phải là vấn đề thích hợp hay không thích hợp, đó là một loại cảm giác, tựa như uống một ly rượu mạnh, có khổ đau, có say mê, có nóng bỏng, cũng có chua xót, đau đớn cũng là mãnh liệt.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/9fb9655d24a6b6f7f51e0b091c38723f/tumblr_ngf2hdi2qz1sxnbwko1_1280.jpg","“Không ai sướng hơn ai. Mỗi người đều có một nỗi khổ.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/bb399fdfbc78eb8141500c3f951b5fcb/tumblr_ngf2gjlhxj1sxnbwko1_1280.jpg","“Yêu nhau không khó, kết hôn cũng không khó, nhưng khó khăn nhất là để cho đối phương cảm nhận được điều đó hàng ngày. Trên thế gian này, hỏi có ai không muốn được yêu thương?”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/5773505f9c72e4788926d08789679768/tumblr_ngf2db4Zbd1sxnbwko1_1280.jpg","“Sợ hãi thế nào đi chăng nữa thì cũng vẫn phải thích nghi thôi, người ta sống được vậy thì sao tôi lại không chứ.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/1792b656d05f4f961c022a7efaf0c3a1/tumblr_ngf2cczDPu1sxnbwko1_1280.jpg","“It’s easier to fake a smile than to explain why you’re sad.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/ec17741e9a0928151abc2419d8c20cc9/tumblr_ngf2b7ELr31sxnbwko1_1280.png","“Chưa có nỗi buồn nào buồn bằng việc giữa tháng hết tiền.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/06c60a94fc706d438e6630ec392ea085/tumblr_ngf2al3UCd1sxnbwko1_1280.jpg","“Khi bạn không thể nhìn thấy toàn bộ sự thật với những mảnh ghép đã tìm ra, đó chính là sự nghi ngờ. Nếu bạn loại bỏ hết mọi nghi ngờ, sự thật sẽ biến mất. Những gì bạn thấy chưa phải là tất cả.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/848a4742e811d9caa9f0ec94900636c9/tumblr_ngf29qyU2q1sxnbwko1_1280.jpg","“Anh làm gì cũng giỏi, giỏi nhất là làm tổn thương em.”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/51ef8c2c3bd33a46fd6a51800ef839db/tumblr_n3avoqy9U71sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/fd8d67b93cbd7db97b8a1b3e536745d0/tumblr_ngauq1Z1bu1sxnbwko1_1280.jpg","Khi nghe đứa nào nói “thật mong đợi những bất ngờ sẽ đến” thì tát thẳng vào mặt nó rồi nói “bất ngờ này thích không cưng?”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/20fe24cb7e0abdb591efb78236a2be16/tumblr_ngauj3h2Gz1sxnbwko1_1280.jpg"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/c33e18ae86d157ed4d47ce4ec1951f40/tumblr_n5in8d8QkG1sxnbwko1_1280.png","“Thuê bao quý khách vừa gọi hiện đang buồn\n" +
                "Xin quý khách vui lòng quan tâm đến thuê bao này nhiều hơn.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/703f5b94dc588a36c56235394cc1df5f/tumblr_ngauhyviGj1sxnbwko1_1280.jpg","“Bởi nhiều khi ta cũng chẳng thể thấu hiểu cảm giác của kẻ khác, cái cảm giác mà cả thế giới mưa nhưng chỉ có mình mình bị ướt.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/40fab8b70c2d6cf37c1675e8fd4d993f/tumblr_n9f85chGss1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/8f21e512338c1fce753db7c38827a39f/tumblr_ngaugwkXzM1sxnbwko1_1280.jpg","“Người đời thường tỏ ra tức giận khi chân tướng bị bại lộ để che đậy nỗi xấu hổ trong lòng.”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/c1c673c8a881418c32cbd5c8fea2312a/tumblr_ngaug2n1gW1sxnbwko1_1280.jpg","“Tôi cứ nghĩ rằng mình là người cực kì tự tin.\n" +
                "Nhưng lúc đó mới phát hiện ra, thì ra đứng trước người con gái mình thích, tôi là một kẻ nhát gan.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/27f0f18c0f3e4133234f0bda06ebdfce/tumblr_n1fke4jwTX1sxnbwko1_1280.png","“Khói thuốc là thứ độc hại. Cả thế giới đều biết rõ điều đó. Tình yêu cũng là một thứ độc hại. Hai phần ba thế giới có đôi ba lần trong đời nghĩ đến điều đó. Nhưng thuốc lá vẫn bán chạy dù có tăng giá. Và ai ai cũng muốn được đắm đuối yêu đương.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/8d2409b0335b88c3371325edad33384b/tumblr_n3gi63Eh711sxnbwko1_1280.jpg","“Tôi vốn thích tất cả mọi chuyện chỉ có mình tôi biết.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/f66cae62df15cd560759cbc07cd87c06/tumblr_n0o3xyH53o1sxnbwko1_1280.jpg","“Tớ đã nghĩ rằng cậu sẽ thực sự bỏ rơi tớ, rằng cậu không muốn gặp một đứa như tớ nữa, vì khi đó tớ chỉ có mình cậu thôi, nếu những lời đó phát ra từ miệng cậu, tớ sẽ không còn chỗ để quay về nữa, không còn gì cả.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/477f033af4be960cc87bc32d9ac430c2/tumblr_ngauf2alt71sxnbwko1_1280.jpg","“Anh ơi không phải anh kì cục mà là vì anh không giống người khác thôi.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/d2fed4a6c8a2a2f10af72de01addf6b0/tumblr_ng7bsfIKHy1sxnbwko1_1280.jpg","“Hóa ra tiếc nuối lớn nhất trên đời này không phải là không đến được với nhau, cũng không phải là không thể bên nhau trọn đời trọn kiếp, mà là bỏ lỡ nhau khi ngỡ như đã ở gần trong gang tấc.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/9bb0aceb27e4502b97a5679137bb089c/tumblr_ng445buHri1sxnbwko1_1280.jpg","“Vào lúc ta thất bại, có thể được nghe ai đó nói câu \"Về nhà thôi”, hẳn sẽ cảm thấy tốt hơn nhiều lắm.“"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/649750d6b967140d7c0e5d011f21c2fd/tumblr_ng2eprUgDJ1thiwtjo1_1280.jpg","“Tôi thua rồi, bao nhiêu năm trôi qua, tôi vẫn thua em…”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/249057d74aa4ff37c383133fe78ec7d5/tumblr_ng2a576SRW1sxnbwko1_r1_1280.jpg","“Hãy nói cho tôi biết, em yêu tôi…”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/255f141e99806360994b33f45e9e3ba7/tumblr_ng442oNDE91sxnbwko1_1280.jpg","“Đời người đâu đâu cũng có sân khấu, thế giới rộng lớn đều là bối cảnh.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/523539337f0df0e887a429377c718f5c/tumblr_nfy2vdC7r51sxnbwko1_1280.jpg","“Tôi đang đi lạc giữa cuộc sống này và ôm khư khư những nỗi trăn trở của riêng mình!”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/ea443e3f79a8aab07acee9e6f101391d/tumblr_ng1hhvvIOv1sxnbwko1_1280.jpg","“Sẽ có lúc bạn buồn mà chẳng biết tại sao. Cảm giác giống như đã đánh rơi thứ gì đó rất quan trọng nhưng chẳng thể nhớ đó là gì.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/956181901604a6c8722e1f1c60efe948/tumblr_nfynz35Ip81thiwtjo1_1280.jpg","“Khi quá khứ gọi giật từ phía sau, đâu có nghĩa là bạn phải quay đầu lại.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/d1ad1ac47780b25cb6c31687b0fe2d78/tumblr_nfy2tmw1v11sxnbwko1_r1_1280.jpg","“I’m tired of getting close to people and then watching them walk out of my life.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/fa5378d65edc2eab52869214cd3c5312/tumblr_nfwnaae86b1thiwtjo1_1280.jpg"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/baa3d588444886f6b7d25911a1d8a5ae/tumblr_nfyo1n0WLC1thiwtjo1_1280.jpg","“Nỗi cô đơn làm người ta thu mình. Nhưng càng thu mình, người ta càng đơn độc. Đơn độc dần dần trở thành chiếc áo quen thuộc người ta phải khoác lên mình mỗi ngày, cởi bỏ nó cũng giống như mất đi một Thế giới an toàn.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/15509145417921853fb9491705c983fc/tumblr_ng0icf2Bvd1sxnbwko1_1280.jpg","“Telling people you’re tired when in reality you’re just sad.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/a38cb83348b0f70735b6a3357ba951c6/tumblr_nfy2wn6PEr1sxnbwko1_r1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/c1e59ec497bfd1d59a6c4bfb7da96e97/tumblr_nfwj8lyZqY1thiwtjo1_1280.jpg","“Ai cũng bảo con gái không nên quá mạnh mẽ, quá độc lập, quá lợi hại, nếu không sẽ chẳng mấy người thích. Thế nhưng, nếu tôi không kiên cường, không độc lập, không lợi hại, lúc tôi bất lực nhất ai sẽ vươn tay cứu giúp tôi?”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/aeccaea568dfc6680772dfc683d22375/tumblr_nfwjdw9I9J1sxnbwko1_1280.jpg","“Có những người ở bên mình rất lâu, ấm áp và gần gũi như thể mãi mãi là điểm tựa cho mình những khi mỏi mệt, cô đơn. Nhưng tất cả chỉ dừng lại thế thôi. Không đi xa hơn được. Đôi lúc thấy tình cảm cũng tàn nhẫn quá. Rõ ràng là không yêu, nhưng cũng chẳng muốn đánh mất một mối quan hệ như thế, ích kỷ và tham lam cố giữ cho mình một hơi ấm dự phòng. Có những người rất tốt nhưng chẳng cách nào yêu được. Bởi vì tình yêu đâu có phân biệt tốt xấu, đâu cần lý lẽ ra sao. Nó chỉ như con ngựa bất kham chạy cho đến kiệt cùng thương nhớ.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/2ebc5461293412063450591a486eae71/tumblr_nfwjbiEFAD1thiwtjo1_1280.jpg","“Biết về đâu khi tim chia thành hai nửa\n" +
                "Nửa muốn cận kề, nửa lại muốn buông xuôi.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/f4dfab1e3258b12fd6389faf7490d99d/tumblr_nfwjdavabb1sxnbwko1_1280.jpg","“Sometimes you make choices in life, and sometimes choices make you.”"));
        //December 12 2014
        //November 11 2014
        arrayList.add(new OPhoto("http://66.media.tumblr.com/aef5f792273f4b6c79a7ba6c03294505/tumblr_nfut62lp9K1thiwtjo1_1280.jpg","*Có những tình bạn có vẻ như sẽ kéo dài mãi mãi, và một số lại kết thúc quá sớm. Không phải tình bạn nào cũng kéo dài cả đời người, điều kéo dài mãi mãi là nỗi đau khi người đó bỏ đi.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/42e838913977cc83df26af942338d368/tumblr_nfurrrJ9i61thiwtjo1_r1_1280.jpg","*Dù bạn là đứa trẻ chậm nhất trong lớp thể dục hay là người nhanh nhất còn sống cũng không thành vấn đề. Tất cả chúng ta đều đang chạy. \n" +
                "Còn sống nghĩa là còn chạy, chạy khỏi thứ gì đó, chạy đến thứ gì đó, hay ai đó. Dù bạn chạy nhanh đến đâu cũng có những thứ bạn không thể chạy thoát, có những thứ luôn tìm cách bắt kịp bạn.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/559ad1fc23152b4681b1e31d5b4aed20/tumblr_nfuruknpqv1thiwtjo1_r1_1280.jpg","*Một vài người khi bản thân suy sụp, ta không thể hàn gắn họ lại như trước. Nhưng lại có những người khi lành vết thương thậm chí còn mạnh mẽ hơn.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/88d2f49992cbc1aa6e320b1fd4dd33a0/tumblr_nfurpwTLfS1thiwtjo1_1280.jpg","“Cố gắng giải thích với những người không tin mình, chính là tự chà đạp lên tự trọng của bản thân.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/1b7a7280a43b4c4977f00b8d4615a7d2/tumblr_nfurycty2d1sxnbwko1_1280.jpg","“Cơ hội luôn dành cho những người đã âm thầm chuẩn bị\" \n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/3d3a360aa979dbd6f7df6462b4fdd3d7/tumblr_nfurxn4dq11sxnbwko1_1280.jpg","“Em có thể một mình ca hát, một mình uống cafe, một mình đi du lịch, một mình đi lang thang trên đường, một mình lảm nhảm, một mình xem tivi,…Chỉ có yêu anh, một mình em không làm được.”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/77199bec20339ec071f09a893ca603d1/tumblr_nfurwuJVwp1sxnbwko1_1280.jpg","“Mỗi người chỉ có một trái tim, tự đau cho mình còn chưa xuể, chỉ có em là ngốc nghếch. Chẳng có ai đáng để em phải vì họ mà làm thế.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/248886624d58d4a6e7c82929e3c4f6aa/tumblr_nfu697CDxA1sxnbwko1_1280.jpg","“Giang hồ hiểm ác không bằng mạng lag thất thường.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/574dc4b6f00291ed20a3a54a84be537e/tumblr_nfu66a3RMj1thiwtjo1_r1_1280.jpg","“Đọc câu chuyện của người khác, rơi nước mắt của chính mình. Qua niềm vui và nỗi buồn của người khác, hiểu được suy nghĩ của chính mình.\n" +
                "Bắt đầu từ lúc nào chúng ta không tin vào tình yêu, bắt đầu từ lúc nào chúng ta không dám nói đến chuyện ở bên nhau mãi mãi…”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/76b8e92ee7422c6eecb466422ff9593d/tumblr_nfu639giOR1thiwtjo1_1280.jpg","“Đến một ngày gió bỗng hận mây\n" +
                "Xua mây đi khắp chân trời góc bể\n" +
                "Mây chỉ buồn, và lặng im, không nói\n" +
                "Để đêm về lặng lẽ hóa thành mưa.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/1a718fcbba94fa44b6f62b1aa4fec389/tumblr_nfu653MDs31thiwtjo1_1280.jpg"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/e7250a5fc334b710b7a4b4c8d31798ad/tumblr_nft34oqwWT1thiwtjo1_1280.jpg","“Nhiều năm sau khi nhớ lại những năm tháng trẻ trung, nông nổi ấy, tôi mới phát hiện ra có rất nhiều thứ bản thân từng cố gắng kiên trì giữ lấy đến giờ cũng không còn quan trọng nữa.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/4be387d170ca2c4a4e5ed2e5ff61513c/tumblr_nfsxlcRLcQ1thiwtjo1_1280.jpg","“Giật mình, tháng 11 qua, đông sẽ đến..\n" +
                "Lạnh đôi tay kìa\n" +
                "Hay để đôi tay này nắm nhé\n" +
                "Giữ ấm cho nhau\n" +
                "Giữ cho hạnh phúc mãi êm đềm.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/c84d6edf092d988fd13ccf893c87c2ae/tumblr_n5o7dxJ0061sxnbwko1_1280.png","“Rồi cũng có lúc, phải chấp nhận chỉ có ai đó trong trái tim chứ không phải trong cuộc đời này.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/3f7edbb73964fcd0336d8719d2479f82/tumblr_n5o6wdslzh1sxnbwko1_1280.png","“Toán thân mến, tớ phát ốm vì lúc nào cũng đi tìm \"x” cho cậu. \n" +
                "Hãy chấp nhận sự thật là người ấy đã đi quá xa rồi, được không?”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/b90dbc5211ec0e1a3d0a271b436529b6/tumblr_n5f0u6ce5T1sxnbwko1_1280.png","“Hít thật sâu, thở thật mạnh. Chỉ là một ngày không vui thôi mà, cuộc sống đâu tệ hại đến thế.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/9acb6088f6a21203515d136e7840234c/tumblr_n42cfznkqq1sxnbwko1_1280.png","“Trích dẫn hay không nhất thiết phải dùng từ hoa mĩ. Chỉ đơn giản là nói đúng tim đen người đọc mà thôi.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/27025028cde16c5e03e5d5ba48231a43/tumblr_n0mxq0Lob51sxnbwko1_1280.png","“Nước mắt đâu có nghĩa đã thất bại.\n" +
                "Vừa mới ngáp xong đó trời ạ.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/0ffefce0fe6d91da2970911b6d1e6706/tumblr_n37egqUmXk1sxnbwko1_1280.png","“Vấn đề của riêng mình không thể trút lên đầu kẻ khác, dù dưới bất kỳ vỏ bọc nào.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/c65ffabc3730fd0abcbc11f78d0d21df/tumblr_n2437f07cX1sxnbwko1_1280.png","“Khi bạn hỏi một người : “Anh có yêu em không?” hoặc là “Anh yêu em hay yêu cô ta”, anh ta trả lời rằng : “Em cho anh một chút thời gian”. Như vậy anh ta đã trả lời bạn rồi đó.\n" +
                "\n" +
                "Một cô gái nói rằng, người yêu hẹn tuần này sẽ gọi điện thoại cho cô, hôm nay là ngày cuối cùng rồi mà chẳng thấy anh ta tìm cô. Anh ta nói sẽ nói với cô quyết định của mình. Anh cần phải quyết định chọn 1 trong 2 cô hoặc bạn gái cũ.\n" +
                "\n" +
                "Cô nói : “Anh ta không gọi cho tôi, điều đó có lẽ nào là anh ta đã chọn cô ta?”. Cô gái này khờ quá, một tuần trước anh ta đã nói “Cho anh thời gian một tuần để anh suy nghĩ” thì anh ta đã chọn người con gái khác rồi. Anh ta cần thêm chút thời gian chỉ vì anh ta không dám nói lời chia tay mà thôi.\n" +
                "\n" +
                "Nếu bạn yêu một người sao lại cần thời gian? Bạn làm sao có thể nói “Chủ nhật này anh sẽ tìm em, đến lúc đó anh sẽ trả lời em”. Bạn không yêu người ta mới kéo dài thời gian như vậy.\n" +
                "\n" +
                "Dù cho câu đó được nói thế nào, dù cho anh ta nói : “Mấy ngày nữa anh sẽ tới tìm em” hoặc “Đợi điện thoại của anh” thì ý nghĩa chỉ có một. Anh ta biết rõ khi anh ta đưa ra thời hạn, bạn sẽ lo lắng đợi chờ anh ta, bạn sẽ nhớ anh ta đến phát điên, thế mà anh ta vẫn cứ để bạn đợi. Anh ta nỡ để bạn đợi chờ và đau khổ, vậy thì có khác gì anh ta bảo rằng “Em đừng đợi anh nữa”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/4f92ff68b0103c16bb770f465cdcfdd2/tumblr_n29f7zNKp21sxnbwko1_1280.png","“Từng có khi nào, bạn đã về đến nhà, bạn bè gọi điện tới rủ đi chơi, bạn không nói một lời, lập tức khoác áo ra ngoài. Nhưng bây giờ bạn uể oải nói: “Đã về nhà rồi, không đi đâu, đang mệt”. Thời khắc này, cuối cùng bạn đã hiểu, mình đã già.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/1f38ba98de98471c8697fe2e4e37a309/tumblr_n73n71l6yF1sxnbwko1_1280.png","“Phụ nữ không có độ tuổi kết hôn thích hợp, chỉ có tâm trạng phù hợp để kết hôn mà thôi. Chẳng có luật pháp nào quy định rằng 30 tuổi thì nhất định phải lấy chồng. Nếu còn chưa đủ chín chắn, thái độ đối với tình cảm cũng chưa chín chắn, thì chưa vội kết hôn vẫn hơn. Kết hôn rồi phụ nữ mới thấy hôn nhân không giống như những gì họ tưởng tượng. Chi bằng chờ đến khi trải nghiệm nhiều thêm chút nữa rồi hãy kết hôn có hơn không.”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/3760adb9c25c41366d771aa4e6358df8/tumblr_nfst4eF0TR1sxnbwko1_1280.jpg","“Người ngồi trước, người ngồi sau…\n" +
                "Áo sơ mi của cậu trai bắt đầu xuất hiện vết mực xanh…\n" +
                "Quay đầu lại…\n" +
                "Nụ cười của cô gái khiến cho cậu trai mê mẩn thần hồn suốt 8 năm ròng, ràng buộc cả một đời…”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/ce373c8fa966c1dd51657eb840bfc60f/tumblr_nfqys1ZFaN1sxnbwko1_1280.jpg","“Nếu bạn sống dựa vào bố mẹ, bạn sẽ chỉ là công chúa. Nếu bạn sống dựa vào tình yêu của một người con trai, bạn sẽ là hoàng hậu của anh ấy. Nhưng sống dựa vào chính mình, bạn mới thực sự là nữ hoàng.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/8790116223e495692e180a53c1b5de07/tumblr_nfqvy1R9fa1thiwtjo2_r1_1280.jpg","*Cháu có biết đối với bọ cạp, gia đình là thế nào không? Chính là một cơn lốc. Mọi bọ cạp đều trung thành với cơn lốc của mình. Chỉ cần một thành viên bị tấn công thì cả gia đình cũng sẽ liều mạng. Và tất cả chúng ta chính là một cơn lốc.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/d144a8d8a4097deef7176261ed20185a/tumblr_nfqvw26USc1thiwtjo1_1280.png","“When nothing goes right\n" +
                "go left.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/d1bcfdc715c3500b75208e4f91dead82/tumblr_nfnj6cZHI51thiwtjo1_1280.jpg","“Thế giới tưởng rộng lớn, hóa ra lại bé nhỏ, người với người cứ thế gặp nhau.\n" +
                "Thế giới tưởng bé nhỏ, hóa ra lại rộng lớn, người với người tìm mãi chẳng thấy nhau.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/ff3bce25a80e971dc4187c67a6d68ff1/tumblr_nfnjjftqYg1thiwtjo1_1280.jpg","“Yêu anh từ rất lâu, chờ đợi anh cũng đã rất lâu. Giờ thì em muốn rời bỏ anh, thời gian còn lâu hơn cả rất rất lâu nữa.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/6a836400c733bceaa7859d8f36b60ede/tumblr_nfnjk5ravf1thiwtjo1_1280.jpg","“Không có được không đáng sợ, điều đáng sợ chính là có được nhưng không giữ được.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/39444070478bdcac72edc2564361149f/tumblr_nfqvtqAWrx1sxnbwko1_1280.png","“Trong cuộc sống đôi lần chúng ta bị xô ngã nhưng phải biết đứng dậy để đập vào đứa vừa xô mình.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/b3b0342265d9c3eede8f81bf807fd014/tumblr_nfqvt25vUB1sxnbwko1_1280.jpg","“Thế giới này rộng lớn là thế, đi đến cùng trời cuối đất cũng không gặp được anh; nhưng đồng thời thế giới cũng quá ư là nhỏ bé, gặp ai, cũng thấy giống anh.”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/c3aec9ccb27e9c95f2c6514e74180554/tumblr_nfqvs9lltR1sxnbwko1_1280.jpg","“Tuổi trẻ thật buồn, tìm nhau giữa bảy tỉ người, chạm nhẹ một cái, buông hờ, rồi thôi.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/1dd7fd00bb864e6d554903ca6cb2d1a1/tumblr_nfp8lzwRSN1sxnbwko1_1280.jpg","“Cuộc sống không hề có đường vòng, nên hãy cứ mạnh mẽ mà đương đầu thách thức.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/3fab66431fa1485f0b68b50eaea2f559/tumblr_nfp8lgaCv71sxnbwko1_1280.jpg","“Tức giận chính là liều thuốc độc. Nó sẽ tiêu diệt bạn từ bên trong. Chúng ta vẫn luôn cho rằng bản thân có thể dùng sự hận thù như một vũ khí để tấn công những người đối xử không tốt với mình nhưng lại không biết rằng nó là con dao hai lưỡi. Ta làm tổn thương người khác, thực sự cũng là làm thương chính mình.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/6e3def348dbf2a14aed54425f9f8ff08/tumblr_nfp8k6F3VU1sxnbwko1_1280.jpg","“Có khi, bạn nói với một người rằng, bạn sẽ ở bên cạnh người đó cho dù có bất cứ việc gì xảy ra. Nhưng bạn quên mất một điều, chưa chắc người đó đã cần bạn.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/d97611cc3d457cd0bb32282f5b58612c/tumblr_nfnba9hOxD1sxnbwko1_1280.jpg","‘Tâm sự’ có thể chia ra làm ba loại: loại thứ nhất là bí mật giấu kín tận đáy lòng, không muốn để cho người khác biết; loại thứ hai là bí mật dù trong lòng muốn bộc bạch nhưng cũng đành phải im lặng; còn loại thứ ba là bí mật không tự mình nói ra nhưng lại muốn có người hỏi tới để được nói ra."));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/02ce02e29fba342fc0b1101e2442f22f/tumblr_nfnb93qUdR1sxnbwko1_1280.jpg","“Hồi còn nhỏ,hạnh phúc chính là khi có được một món đồ yêu thích. Lớn lên,hạnh phúc chính là khi đạt được một mục tiêu nào đó. Trưởng thành rồi,phát hiện ra hạnh phúc vốn dĩ là một trạng thái tâm lý. Khi bạn đã hiểu rõ tường tận mọi thứ bạn sẽ hạnh phúc. Thời khắc cô đơn nhất chính là khi bạn biết rõ mình muốn gì,thế nhưng lại phải cắn răng giả ngốc mà lờ đi.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/60e96b1830bac2f77d25651b2b123625/tumblr_nfnb8ieYnv1sxnbwko1_1280.jpg","“Đừng sống một cuộc sống với trái tim tràn ngập sự thù hận. Rốt cuộc thì chính bản thân bạn mới là kẻ mà bạn căm ghét nhiều hơn, chứ không phải là những người mà bạn ghét.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/296ca3f950521f1d75c8d203cf7efd90/tumblr_n22kqiji9n1sxnbwko1_1280.jpg","“Vô tình cùng chạm vào chung một cuốn sách tại thư viện, hay bỗng dưng ai đó trú nhờ bên cạnh dưới một chiếc ô bé nhỏ… Tôi đã từng nghĩ tình yêu sẽ thật sự là một điều đặc biệt khó quên nhất, nhưng dường như nó không như tôi vẫn tưởng tượng. "));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/856e4b4ecf0da7b49a9ddca4f3411ee2/tumblr_n1noevsb4e1sxnbwko1_1280.png","“Con người ta khi yêu chỉ nhìn điều họ muốn nhìn, chỉ nghe điều họ muốn nghe và chỉ tin điều họ muốn tin.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/76695e003c84c58e4ee8e9152f1d713f/tumblr_n63alwnkWk1sxnbwko1_1280.png","“Cậu có biết trở thành người lớn là như thế nào không? Nghe nói nụ cười sẽ ngày càng ít đi.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/eb02cc3d963f2cdddf6c1b87c200b3d7/tumblr_n6hwf5SwrS1sxnbwko1_1280.png","“Hai chữ “đã từng” này giống như bi kịch của con người vậy.\n" +
                "Đã từng vui vẻ, đã từng hạnh phúc, đã từng giàu có.\n" +
                "Khi con người ta nói ra hai chữ “đã từng”, nghe có vẻ đau khổ. Nó giống như tất cả chỉ còn là quá khứ, vĩnh viễn không lặp lại nữa.”\n"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/a5aeed96ce5fd8e37737f14c3884c1e7/tumblr_n77zsbfU721sxnbwko1_1280.png","“Bảo là phải quên nhưng vẫn cứ nhớ, bảo là phải nhớ thì trong khoảnh khắc nào đó lại quên không còn vết tích, đây chính là lòng người.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/3b9ea1e3c40739ef992b0c3d195c790f/tumblr_n8pbpuzc801sxnbwko1_1280.png","“Thế giới này, lời nói phát ra từ miệng của con người trong một ngày quả thật quá nhiều. Việc gì mình phải để ý đến những lời nói của người mà mình không quan tâm chứ.\n" +
                "Chỉ cần người quan tâm mình hiểu mình là được rồi.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/122c7275400dda67f942dcfff07ee8de/tumblr_n8yzh03Rue1sxnbwko1_1280.png","“Sau một thời gian sống trong xã hội này, tôi hiểu được rằng…\n" +
                "Khi đọ số mặt nạ với đối phương, người nào có nhiều mặt nạ hơn sẽ là người chiến thắng.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/aea35f4dc03015ad3d01c63adde8f68e/tumblr_nfmu3jOu761sxnbwko1_1280.jpg","“Mỗi người đều từng có khoảng thời gian bồng bột ấy, khoảng thời gian mà mọi cậu con trai cùng thích một cô gái trong lớp, đi qua tháng ngày với những trò nghịch ngợm ngây ngô. Thế rồi tuổi thanh xuân lặng lẽ qua đi…”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/0a951fc527c6ff2e39395f42ce6cee22/tumblr_n766zbXy9l1sxnbwko1_1280.png","“Bạn không có cách nào đánh thức một người chỉ giả vờ ngủ, cũng như không có cách nào làm cảm động một người không hề yêu bạn.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/fd9cb19d5f6a92598b3e305af322d2ba/tumblr_n75x1zHX4e1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/44d809dc147ef57fe12bedc32ec85034/tumblr_n7os2zJqdg1sxnbwko1_1280.png","\"Hình như Thượng đế cũng đang khóc than\n" +
                "Lặng lẽ em ngước nhìn bầu trời kia\n" +
                "Khẽ cảm nhận dòng nước mắt đang rơi\n" +
                "Kết thúc thật lặng lẽ, hết rồi, không còn cơ hội nào cho chúng ta\n" +
                "Trái tim anh sao tàn nhẫn và lạnh lùng đến vậy\n" +
                "Giờ thì em đã hiểu từ điểm bắt đầu em luôn là số không\n" +
                "\n" +
                "Và anh sẽ nhẫn tâm cướp đi tất cả\n" +
                "Trái tim em, anh có thể làm vỡ nát\n" +
                "Tất cả, tình yêu của em vỡ tan như pha lê\n" +
                "Nhầu nát tựa tờ giấy mỏng manh\n" +
                "Vậy còn gì nữa đâu, anh hãy tiếp tục đi\n" +
                "Còn em sẽ đứng lên từ mảnh đất hoang tàn này\n" +
                "Vững chãi và nguyên vẹn như tòa nhà kia.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/14937d3ee1556952ca19ce0455d58ec9/tumblr_n7s3hxqEut1sxnbwko1_1280.png","“Tôi thích ngày mưa! Tôi sẽ cuộn tròn thân mình trong chăn ấm, đọc một chút gì đó dễ chịu, nghe một chút gì đó dễ chịu… Và tha hồ nghe tiếng của lòng mình.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/500de9db42ff0c40edefba2987db64a9/tumblr_n3ats83GOX1sxnbwko1_1280.png","“Những hoài niệm đã ngủ quên đôi khi trở dậy nhức nhối vô cùng.\n" +
                "Là con gái, chẳng ai không khát khao một chỗ dựa ấm áp tận sâu trong đáy lòng… Dù là Hà Nội lạnh giá hay Sài Gòn nắng cháy thịt da.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/18037ba5348b86f394b8e399d4c00710/tumblr_n1wysbb37M1sxnbwko1_1280.png","“Con gái sinh ra đã có sẵn một đặc ân, đó là quyền nhờ vả và dựa dẫm mà không ai nỡ lòng từ chối.\n" +
                "Thế nên không nhờ được thì vả, không dựa được thì dẫm biết chưa con gái.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/33cd138f97c9fe3d079fdf1e6d45f489/tumblr_n90vmbO7881sxnbwko1_1280.png","“Tại sao con được bố mẹ nuôi dưỡng bao nhiêu năm trời mà con lại phải về chăm sóc cho những người dưng xa lạ.\n" +
                "Con cảm thấy sợ hãi trước những mối quan hệ hôn nhân, bộn bề trước lo toan cuộc sống cơm áo gạo tiền, lo lắng trước những mối quan hệ ngoài luồng… Tại sao con gái cứ phải lấy chồng hả mẹ?”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/4022df79d8e94de7b342c750b96aa55c/tumblr_n7ks6t09T11sxnbwko1_1280.png","“Rất nhiều phụ nữ mơ mộng và tin rằng khi tìm được người đàn ông của mình, đồng nghĩa họ sẽ có chỗ dựa về sau. Nhưng sống càng lâu tôi càng nhận thấy, chẳng ai có thể làm chỗ dựa cho mình mãi mãi, trừ chính bản thân mình. Suy cho cùng các mối quan hệ đều được kết nối bởi một sợi dây rằng buộc, sợi dây ấy vô cùng mỏng manh, đứt lúc nào không hay, không phải như tình thân, nối nhau bởi dòng máu chảy trong người.\n" +
                "\n" +
                "Vậy nên thay vì chờ đợi chỗ dựa, thay vì sẽ có một ngày gục ngã vì dựa nhầm, vì mất chỗ dựa, trước tiên chúng ta hãy tự đứng bằng đôi chân của mình, dựa vào chính sức mình.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/3256109d4b8bac56492bb61d63aeda25/tumblr_nfl5xkREAl1sxnbwko1_1280.jpg","“Rất nhiều người có thể an ủi bạn, nhưng chỉ có số ít người chạm được vào nỗi đau của bạn và xoa dịu chúng mà thôi.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/f7682ca34bd73e09b1787ed5210e35e3/tumblr_nfjqjvb2Cy1sxnbwko1_1280.jpg","“Chúng ta đều như vậy, lướt qua cuộc sống của nhau chỉ như một bản nhạc, bỗng được chơi trong một ngày đầy gió."));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/40681204bf6ba17553f94df361b8ca8a/tumblr_nfjqj3V6FZ1sxnbwko1_1280.jpg","“Nếu có một người đàn ông yêu gương mặt không trang điểm của bạn, bạn gầy đi người đó sẽ đau lòng, bạn béo lên người đó sẽ mừng vui. Vậy thì người đàn ông đó chính là cha của bạn, chỉ có thể là cha của bạn mà thôi.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/a8900acb8bb6603fdda403aaecea976a/tumblr_nfjqifDd5p1sxnbwko1_1280.jpg","“Chúng ta yêu một người, rốt cuộc là vì lẽ gì? Vì người ấy có vẻ đáng thương, vì một nụ cười, vì một lời nói, một sự việc? Hay đơn giản chỉ vì đó là chính người ấy, không phải một ai khác?”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/0ad740eee17c554a00c42566836edaf4/tumblr_nfjqhqX2JF1sxnbwko1_1280.jpg","“Sống như là đọc một cuốn sách, cần phải biết lật sang một trang mới khi cần thiết…”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/cc3837ef8743324aef4a0747ef165a10/tumblr_nfjqh0APk81sxnbwko1_1280.jpg","“I don’t wanna be alone. Stay with me, please.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/b054d6b87f9de5206fd62f0641c29e81/tumblr_nfhof0B1Ed1sxnbwko1_1280.jpg","“Hãy nói xin lỗi với chính mình, bởi vì đã từng yêu một người đến nỗi quên cả bản thân.Hãy nói xin lỗi với chính mình, bởi vì đã từng vì người khác mà làm khó bản thân.Hãy nói xin lỗi với chính mình, bởi vì phải cố gắng giả vờ làm cho bản thân mệt đến không chịu nổi.\n" +
                "\n" +
                "Hãy nói xin lỗi với chính mình, bởi vì có rất nhiều chuyện bản thân đã không học được thế nào là quý trọng.Hãy nói xin lỗi với chính mình, bởi vì đã từng quá cố chấp đến nỗi làm tổn thương bản thân.\n" +
                "\n" +
                "Dù thế nào thì cuộc sống vẫn phải tiếp diễn, chỉ có điều phải xin lỗi bản thân vì đã không còn tìm lại được bản chất vốn có của mình.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/f8c9093eb47f110e235a6c7118a3aa6f/tumblr_nfhodyH1a71sxnbwko1_1280.jpg","“Ngày cuối năm trung học mọi người ai nấy ôm nhau và khóc, riêng tôi chỉ cười vì nghĩ lên đại học chúng tôi sẽ lại gặp nhau. Sau này tôi mới biết mình đã sai rồi. Chúng tôi ở những năm đại học không còn là chúng tôi của những năm trung học nữa. Xin lỗi vì ngày đó đã không khóc, xin lỗi đã không biết đó là lần cuối cùng chúng ta gặp nhau.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/25465e6d2aa8657cf45168d903c388a1/tumblr_nfhbpxEKTr1sxnbwko1_1280.jpg","“Người ta vẫn nói cái đẹp tâm hồn mới là quan trọng, nhưng vẻ bề ngoài lại quyết định đối phương có kiên nhẫn ở lại tìm hiểu vẻ đẹp tâm hồn hay không.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/020c7cd5ad60a2a406d4234c4267d94f/tumblr_nfh5mhAXC51sxnbwko1_r1_1280.png","“Nếu có quyền lựa chọn thì con gái tốt nhất hãy giống như loài mèo, dịu dàng vừa đủ và biết sử dụng móng vuốt khi cần.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/8de789072564445675327678f9ed338b/tumblr_nfg27taDkL1sxnbwko1_1280.jpg","“Anh ấy kể cho tôi một cách rất đáng yêu về việc không yêu tôi. Và tôi thì lắng nghe một cách quá vô tư. Rồi khóc.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/937e672092018ddfabc4b9984ba30c1f/tumblr_nffo4sk5aS1sxnbwko1_1280.png","“Nhiều lúc thử buông coi người ta có nắm lại không\n" +
                "Ai ngờ người ta buông luôn.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/1373cd7af39f1f352c6670a255d5a5ae/tumblr_nffntjsDLn1thiwtjo1_1280.jpg","“Nhiều người lạ lắm, chỉ cần họ biết bạn dành tình cảm cho họ nhiều hơn một chút, họ sẽ lại lạnh nhạt đi với bạn một chút.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/80654b9d2830c3a2e555ccb8dbb74ce3/tumblr_nffnn250Ss1sxnbwko1_1280.jpg","“Tôi nhận ra vì sao mình lạc đường, không phải vì tôi không có bản đồ, mà vì tôi không có một điểm đến.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/c8d1a97d9c5b42768770b0692549bf30/tumblr_nffnlxqK9q1sxnbwko1_1280.jpg","“Đã gọi là hi vọng thì không thể nói đâu là thực, đâu là hư. Cũng giống như những con đường đi trên mặt đất; kì thực trên mặt đất vốn làm gì có đường. Người ta đi mãi thì thành đường thôi.”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/d0a56b527894f18c51accec8c3c8b821/tumblr_nffng6m1Eh1thiwtjo1_1280.jpg"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/e6c5a27b2f525974795c2fa8d1b4cb37/tumblr_nffncxi9UU1thiwtjo1_1280.jpg","“Bạn muốn biết cái gì là cô đơn gấp đôi không?\n" +
                "Hãy yêu một người không yêu mình.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/7f54bc67bf1ed312c4e6fa47efecde81/tumblr_nfeajz7RWO1sxnbwko1_1280.jpg","“Đừng phí thời gian cho việc giải thích. Người ta chỉ nghe những gì họ muốn nghe mà thôi.”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/2a36d62ef158838baf0f39342fb31c88/tumblr_nfc496Pc081sxnbwko1_1280.jpg","“Tôi rất hiếm khi có cảm giác tin tưởng một ai đó. Những người sống một mình quá lâu sẽ đều như tôi. Không phải vì đa nghi hay khó tính, mà là vì không thấy an toàn. Thế giới này rất rộng lớn và xa lạ, người có thể khiến chúng ta gửi gắm lại rất nhỏ bé…”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/3b3b5eadccf62705167a8eb87d692466/tumblr_nfalllGEQV1sxnbwko1_1280.jpg","Nhưng sao đột nhiên đến giờ cậu mới để lộ thực lực?\n" +
                "Bởi vì tôi thích cậu."));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/083abff03b7676889154295a1d92ef32/tumblr_nfalc1AZus1sxnbwko1_1280.jpg"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/f00467df7ba2fc50a66240a932cf68bc/tumblr_nf6lw7inS11sxnbwko1_1280.jpg","“Trái tim đã luôn miệt mài đập từ ngày ta chào đời. Đừng hành hạ nó vì những người không xứng đáng. Nó cũng biết mệt, biết đau…”\n"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/11f0c3da5a27307cf7b6c30ed69e4834/tumblr_nf1grx5HWx1sxnbwko1_1280.jpg","“So với nói dối, lời nói thật lòng có công hiệu an ủi người khác tốt hơn rất nhiều.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/1a3e22c807f0853a6b4c7efd9cb47199/tumblr_nf333hk5be1sxnbwko1_1280.jpg","“Hãy cẩn thận nếu bạn muốn đá ai đó khỏi đường đi của mình. Vì có thể họ sẽ quay lại và đá bạn một cú đau gấp đôi.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/e903efa8f8a9988d186d7aee22ad3fef/tumblr_nf2v3v3vCU1sxnbwko1_1280.jpg","“Khi ngày hôm nay trở thành ngày hôm qua, khi yêu trở thành đã từng yêu, thời gian đã thổi bay tuổi thanh xuân của bạn.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/98e5dab2b7daadc5cac6bce34b94af02/tumblr_nf1grgMFh11sxnbwko1_1280.jpg","“Chung quy thì tuổi trẻ của mỗi người đều không thoát khỏi một cuộc tình. Trong cuộc tình này, có yêu, có thương, có vui, có mừng chỉ đơn giản không có thứ gọi là mãi mãi.”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/221e3f09337407d1012ae51770fdf925/tumblr_nexcveRLhF1thiwtjo1_1280.jpg","“Trái đất tròn lòng người góc cạnh.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/461c55c02142c9d345fcb07c60a1cb6f/tumblr_neik8p81wl1sxnbwko1_1280.jpg","“You never really understand a person. Until you consider things from his point of view. Until you climb into his skin and walk around it.\" "));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/8a4cd68cc426182221da65d70ea55d5d/tumblr_neer3zHnYS1thiwtjo1_1280.jpg","“Quá khứ quả thực rất đáng sợ.\n" +
                "Có người vì nó mà ghen tuông, một số vì nó mà hờn giận, có người cố che giấu thật kĩ, lại có kẻ, vì nó mà nhung nhớ suốt một đời…”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/94a9366497462ac613b309ac1e34558e/tumblr_negwlpHkeQ1sxnbwko1_1280.jpg","“Chuyện đáng sợ thứ nhất trong cuộc đời, đó là kiên trì thứ không nên kiên trì, bỏ qua những thứ không nên bỏ qua.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/d24f0f785b1f8734627b1781437a471b/tumblr_nebjywOSLg1thiwtjo1_1280.jpg"));
        //11 2014
        //10 2014
        arrayList.add(new OPhoto("http://65.media.tumblr.com/ed628625fda1cd260fcb987d3088aa65/tumblr_nebi23OlvD1thiwtjo1_1280.jpg","“Tháng Mười khép lại, dẫu vẫn nhớ một người không dám chắc có nghĩ tới mình nữa không, dẫu vẫn thấy chênh chao một nỗi buồn xám xịt giữa ngày tháng ủ ê vơ vẩn. Dẫu vẫn chưa thanh thản, vẫn chưa dũng cảm để không còn nắm những thứ nên để nó rơi đi…”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/f69db5c778e3898de88508bd667cecf8/tumblr_n72ehwSYJv1sxnbwko1_1280.png","“Hồi ức luôn khiến người ta cảm thấy mệt mỏi. Mặc dù thời gian trôi qua cũng rất lâu rồi nhưng mỗi khi nghĩ lại nó vẫn khiến người ta thấy đau lòng. Bởi từ giây phút đó, bạn sẽ không quay trở lại được nữa. Dù bạn có muốn hay không thì hào quang đó cũng không còn thuộc về bạn nữa rồi…”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/a0ac42b4a4e8a13c1a1c16fae36b0d89/tumblr_n9b4mi7MKL1sxnbwko1_1280.png","“Để có động lực thành công, trong đời con phải gặp những kẻ rất tệ với con, vì cuộc sống là thế, nếu con không muốn tệ như họ thì phải sống khác họ đi.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/5ad57214378856f1eef83b802a7b989b/tumblr_n75chikjsA1sxnbwko1_r1_1280.png","“Mình cảm thấy rất buồn vì xã hội có nhiều người xấu và mình là một trong số đó.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/5a41fe64908ed52edf1a31793b48967b/tumblr_nebesu9zqP1sxnbwko1_1280.jpg","“Có buồn cười không. Người ta lớn hơn chỉ để nhận ra, thì ra mình rất yếu, thì ra mình rất kém, thì ra, mình sợ rất nhiều thứ.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/a9b5bb20616bcc88338592194b9b6f75/tumblr_neam2tihxZ1thiwtjo1_1280.jpg","“Yêu một người chưa bao giờ là lỗi lầm nhưng ảo tưởng rằng người ta cũng yêu mình thì có!”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/78fa66d3f0e84abe88ce0e3eff2f8f0a/tumblr_neajqmTKy21sxnbwko1_1280.jpg","“Nếu không có kẻ trộm thì làm sao có cảnh sát? Nếu không có những người thi lại như tôi thì những học bổng kia lấy ở đâu ra?”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/b6db3820be654fba1eec96fdad370f49/tumblr_ne9gujHgJN1thiwtjo1_1280.jpg","“Rốt cuộc rồi cũng sẽ là mưa \n" +
                "Sau rất nhiều ngày tạnh\n" +
                "Rốt cuộc em cũng sẽ biết mắt người thì lạnh\n" +
                "Và tay người chỉ ấm đôi khi”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/1b011b7dc1a5488754fe402011d4427f/tumblr_ne9gz75itr1thiwtjo1_1280.jpg","“Có khi, tình ta như cánh hồng, lay nhẹ trong sương gió .\n" +
                "Sợ khi nắng mưa, sợ khi giá rét, sẽ héo và tàn theo năm tháng.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/c9596b02816acb8c237dd52b6a9d6d11/tumblr_ne9gioScza1sxnbwko1_1280.jpg","“Chúng ta chẳng thể nào yêu một người hoàn toàn không hợp với chúng ta ở bất cứ điểm nào.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/7c82e70c3e26bfac2f2ed18d9a3a4bcb/tumblr_ne944rz6521thiwtjo1_1280.jpg","“Có những ngày mà điều duy nhất chúng ta có thể làm chỉ là ngước lên nhìn trời rồi cam chịu cười nhạt bằng thứ cảm xúc khiên cưỡng, xong thở dài: \"Thôi kệ, tới đâu thì tới, chuyện đó đã không còn quan trọng nữa!”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/b7a212bcd6c987c4ee37e8c75f95267c/tumblr_ne92pd9IN31sxnbwko1_1280.jpg","Cuộc đời này rất bận. Bận đến nỗi ai cũng có việc của riêng họ, và chẳng người nào rảnh rỗi để ngày ngày quan tâm đến cảm xúc bạn đâu.“\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/4c84b1c83f4e7ad1f72e6e357c45b420/tumblr_ne92ok23cJ1sxnbwko1_1280.jpg","“Chúng ta thường mòn mỏi kiếm tìm hạnh phúc cho bản thân nhưng thực ra trong rất nhiều trường hợp, hạnh phúc chính là yếu tố cuối cùng mà ta xét tới.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/bd53ba1cc80e07822ec265d8330e8814/tumblr_ne92nuKrDW1sxnbwko1_r1_1280.jpg","“Mõi người sinh ra đều có hai mặt \"hiền và ác”, khi mà cái “hiền” bị dẫm nát cũng là lúc cái “ác” bộc phát lên ngôi.“"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/959f450629863d0702166cd2b36e831c/tumblr_ne8x7l96VB1thiwtjo1_1280.jpg"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/5d0bef8fb9a1c33bbd184d293956ba3c/tumblr_n416weal8I1sxnbwko1_1280.png","“Tôi nhớ một người không nhớ tôi\n" +
                "Một người đâu đó ở chân trời\n" +
                "Ở nơi xa đó người đâu biết\n" +
                "Trong lòng tôi chỉ chua chát thôi\n" +
                "Tôi nhớ một người không nhớ tôi\n" +
                "Hoàng hôn cháy rớt ở lưng đồi\n" +
                "Ừ thì cũng biết là buồn đó\n" +
                "Mà sao kỳ lạ lệ không rơi.\n" +
                "\n" +
                "Tôi nhớ một người không nhớ tôi\n" +
                "Nhiều khi cũng bảo nhớ chơi chơi\n" +
                "Trái tim nhoi nhói đau chút chút\n" +
                "Dường như đăng đắng ở trên môi.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/c0c4e489b31eb8fd3a9b2d23fde82f0d/tumblr_n9k2fx3pzf1sxnbwko1_1280.png","“Yêu một người phụ nữ, tự hào nhất là gì? Đó là khi vợ hết tiền cầu xin vợ tiêu tiền của mình, khi vợ giận hiến thân cho vợ xử, vợ kể chuyện cười \"thiếu muối” một tẹo vẫn lăn ra cười như được mùa, ăn cơm bao giờ vợ cũng là người gọi món, mùa đông ngủ lên giường ủ ấm chăn sẵn sàng chờ vợ. “\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/1839916271be5c8c8814a0ccb7667460/tumblr_ne7r3chohf1thiwtjo1_1280.jpg"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/12e7a38b0af3e587aa089ec88c0a5230/tumblr_ne7hwtZ2aS1thiwtjo1_1280.jpg"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/12e20019060ce2921b4637f5712ef24d/tumblr_n4osicYgRz1sxnbwko1_1280.png","“ Độc thân là mỉm cười với những người đi ngang qua cuộc đời mình, biết ai sẽ thuộc về mình và mình thuộc về đâu. Còn “ế” là chỉ nhìn họ đi qua, từ bỏ cơ hội để yêu thương dù biết rằng mù quáng…\n" +
                "- Độc thân là tự tin, còn “ế” là ghen tị xếp chồng nhau và loay hoay không biết hài lòng với cuộc sống…\n" +
                "- Độc thân là biết chờ đợi tình yêu nhưng không bị động, còn “ế” là vội vã và cuống quýt với những thứ vốn sinh ra đã không dành cho mình…\n" +
                "- Độc thân là biết kiêu hãnh với chính mình, còn “ế” ngoài tự bi lụy bản thân ra, thì chẳng còn gì khác…\n" +
                "- Độc thân là biết lúc nào “cần” yêu và “nên” yêu, còn “ế” chỉ biết ngồi nhìn tình yêu đi qua và tiếc rẻ!\n" +
                "- Độc thân là lựa chọn, còn “ế” là vì “không thể khác”!\n" +
                "- Độc thân là khôn ngoan, “ế” là ngơ dại! Hay cùng vì ngơ dại, nên bạn “ế”, dễ hiểu thôi!"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/5bb06fbd80861820f967e2aa148655e2/tumblr_n876uvWzEf1sxnbwko1_1280.png","“Ta là cây nến vàng, chẳng cần cây nến xanh\n" +
                "không thèm cây nến hồng, riêng ta vẫn lung linh\n" +
                "la là lá la la, chưa muốn lập gia đình…”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/c4c57498146c795cba8a65ffe7f02081/tumblr_ne6ste5wFA1thiwtjo1_1280.jpg","“Trên thế giới có hai kiểu người: những người thích buồn giữa những người khác, và những người thích buồn một mình.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/0f1f97f516351cb1560e9cd317c6ad62/tumblr_ne6sxsUvtg1thiwtjo1_1280.jpg","“Mênh mông quá khoảng trống này ai lấp\n" +
                "Khi thanh âm cũng bất lực như lời”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/9551366316db75c14ac88a14d3e7d438/tumblr_ne6syyPulU1thiwtjo1_1280.jpg","“Tôi không bao giờ trông mong một tình yêu đẹp như mơ, vì sẽ rất đau lòng khi người ta tỉnh mộng”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/b566b6d1eb59748f6d1f6a9b0b71d8e6/tumblr_ne6tavp5va1sxnbwko1_1280.jpg","Có người, được nắm chặt tay người yêu mỗi sáng thức dậy, đó đã là bình yên.\n" +
                "Có người, được đứng trên đỉnh cao tiền tài, danh vọng, đó đã là bình yên.\n" +
                "Có người, được quay về nhà sau một ngày dài mệt mỏi, đó đã là bình yên.\n" +
                "Có người, được ngồi ăn cùng nhau một bữa cơm gia đình, đó đã là bình yên.\n" +
                "Và có người, thấy mọi chuyện xảy ra đúng như mỗi ngày vẫn trải qua, đó đã là bình yên.\n" +
                "\n" +
                "Nhưng, có bình yên nào không đổi bằng xót xa?"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/2a78e091576905fdba959567fa814222/tumblr_n157piURV51sxnbwko1_1280.png","“Yêu thì bảo là yêu, không yêu thì bảo là không yêu! Tại sao lại rắc rối đến vậy?”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/e95053555e05075a6a59bfe0267e38f7/tumblr_n1a53leJUN1sxnbwko1_1280.png","“Người xấu hơn em trên thế gian này có rất nhiều, người đẹp tốt hơn em trên thế gian này lại càng không thiếu, nhưng người giống như em thì cả vũ trụ này hoàn toàn không có. Chỉ cần nhớ rõ điều đó, là có thể tiếp tục sống vui, chứ không phải sống vùi trong tuyệt vọng.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/5f44f423e2618555bf3defad6a1328b2/tumblr_n1a96uWh8j1sxnbwko1_1280.png","“Nếu các người thành tâm muôn biết,thì chúng tôi sẵn lòng trả lời.\n" +
                "Để đề phòng thế giới bị phá hoại, để bảo vệ nền hòa bình thế giới. \n" +
                "Chúng tôi đại diện cho những nhân vật phản diện, đầy khả ái và ngây ngất lòng người. \n" +
                "Musha - Kochiro \n" +
                "Chúng tôi là Đội hỏa tiễn, \n" +
                "Bảo vệ dải ngân hà, \n" +
                "Một tương lai tươi sáng đang chờ đợi chúng tôi."));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/c46365f3e7f7b6d0c4a18e69501368ac/tumblr_n1bze00WcA1sxnbwko1_1280.png","“Nếu tiền không làm bạn hạnh phúc\n" +
                "Vậy hãy đưa nó cho tôi.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/8166b812f62ca93aef8faffb6ac69726/tumblr_n1gc3gKv4I1sxnbwko1_1280.png","“Tôi đã chạy rất lâu trên con đường kiếm tìm hạnh phúc\n" +
                "Mọi mệt mỏi cũng có thể hóa thành nụ cười\n" +
                "Trên con đường kiếm tìm hạnh phúc tôi đã chịu đựng rất lâu\n" +
                "Vậy nên một ngày nào đó vạn vật sẽ tỏa sáng.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/91f7e2fdfc436a450945a1ab3ce25c18/tumblr_n1hocyGYTG1sxnbwko1_1280.png","“Đưa một đôi giày đúng cỡ cho một cô gái, cô ấy có thể chinh phục cả thế giới này.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/3d774a64991460952b19dd4cb0818117/tumblr_n2h5m4oaix1sxnbwko1_1280.png","“Khoảnh khắc cô độc nhất là khi bạn phải tự nói với chính mình: Mình thương mình mà, có phải không?”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/90a7d6405484abfed1cb9da05ed40fd9/tumblr_n333r2NVQr1sxnbwko1_1280.png","“Những người mà bạn khó buông bỏ nhất thật ra chính là những người chưa bao giờ thuộc về bạn.”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/5bae5c00388a97a7697306f6c509fb18/tumblr_n3936wiGSY1sxnbwko1_1280.png","“Một số người chỉ như là đám mây đen trong cuộc đời bạn. Họ mang mưa tới và khi đi khỏi rồi, nhất định bầu trời sẽ lại trong xanh.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/e4f8f61b1a82157da39907983bd55faa/tumblr_ne59vpdCox1thiwtjo1_1280.jpg","Nhiều người ôm giấc mơ giàu sang, vài người ôm giấc mơ bình yên, em cần an trú, em cần yêu thương.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/9f3e4ca88945e57828ff6bf1f3b667f3/tumblr_n6zlejPdtE1sxnbwko1_1280.png","“Lý do tôi độc thân:\n" +
                "\n" +
                "1. Không kiếm đâu ra người như trong truyện.\n" +
                "2. Không tìm thấy nhân vật như trong phim.\n" +
                "3. Không thấy ở đâu thú vị hơn internet.\n" +
                "4. Các giai xinh/gái đẹp quanh tôi đều có nơi có chỗ hết rồi.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/edf655c383c7550d030ca7233c70cd15/tumblr_ne57bmXus81sxnbwko1_1280.jpg","“Thuộc tính của ký ức chính là chỉ nhớ thứ mình muốn nhớ. Hình ảnh mà ký ức gợi lại xen lẫn trong cuộc sống của chúng ta, bởi vậy đừng tin ký ức của ta hay của ai đó là chuyện thực đã xảy ra”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/24ddc9b47084bf6eda4ef3ba23ec37b4/tumblr_ne57aiqmPI1sxnbwko1_1280.jpg","“Mình có tính xấu là mình mà đã ghét đứa nào thì hẳn là ngoài danh sách đen, nó còn nằm trong danh sách đỏ. Có nghĩa là có thể bị bắn bỏ bất cứ lúc nào.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/9ebef1f1fe178cdc29c72d0ef11d9e36/tumblr_ne3zmxbLEh1thiwtjo1_1280.jpg","“Khi ta ủ ê mình quá nhiều, nỗi sầu muộn sẽ dần đóng kén thành nỗi cô liêu.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/f0009e54664a2b5de73e585500f77dc9/tumblr_ne3zlxafHM1thiwtjo1_1280.jpg","“Nhất thời để lỡ, là sẽ lỡ cả đời, đời người có rất nhiều chuyện không có cơ hội quay đầu làm lại.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/b13ccc347a640d26dab7897273136d76/tumblr_ne29mtaiB51thiwtjo1_1280.jpg","Con người càng trưởng thành sẽ càng thấm thía được, trên thế gian này có một thứ tốt nhất, chính là “không có được”.\n" +
                "Mới bắt đầu, cậu chính là bí mật của mình. Mình sợ cậu biết được, cũng sợ cậu sẽ mãi không biết được. Lại sợ cậu biết rồi nhưng lại giả vờ như chưa biết gì cả. Mình không nói ra, cậu không nói ra, càng xa lại càng gần. \n" +
                "Vậy hiện tại… hãy để mình dựa trên danh nghĩa là bạn bè, để tiếp tục yêu cậu\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/d3522e68bb69e805ccb341c359de9c3d/tumblr_n9uajcGVVb1thiwtjo1_r1_1280.jpg","5 nguyên tắc cần nhớ trong cuộc sống\n" +
                "\n" +
                "1. Tiền không mua được hạnh phúc, nhưng ngồi khóc trong một chiếc mercedes vẫn sướng hơn là trên một cái xe đạp.\n" +
                "2. Tha thứ cho kẻ thù, nhưng vẫn phải ghi tên nó vào sổ đen.\n" +
                "3. Giúp đỡ người khác khi họ găp khó khăn, và họ sẽ luôn nhớ đến bạn mỗi khi lại vướng vào một rắc rối khác.\n" +
                "4. Không nhờ bắn người bừa bãi là phạm pháp thì nhiều đứa không còn sống được tới giờ này.\n" +
                "5. Rượu không giải quyết được vấn đề gì cả và hiển nhiên sữa cũng vậy.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/4043481666409ebf31119c78229762c3/tumblr_n3a95jCQaQ1sxnbwko1_1280.png","“10 nguyên tắc hẹn hò với con gái tôi\n" +
                "\n" +
                "1. Có công ăn việc làm.\n" +
                "2. Chấp nhận sự ghẻ lạnh của tôi.\n" +
                "3. Tôi ẩn dật khắp nơi đấy.\n" +
                "4. Con bé buồn thì cậu cũng không vui với tôi đâu.\n" +
                "5. Về trước giờ giới nghiêm 30 phút.\n" +
                "6. Nên chuẩn bị sẵn một luật sư thì tốt hơn đấy.\n" +
                "7. Gian dối cỡ nào thì tôi cũng tìm ra chân tướng sự việc thôi.\n" +
                "8. Con bé là công chúa bé bỏng của tôi, không phải chiến lợi phẩm của cậu.\n" +
                "9. Tôi không ngại ngồi nhà đá bóc lịch đâu.\n" +
                "10. Cậu đối xử với con bé thế nào thì tôi cũng sẽ trả lại cậu y chang như thế.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/95672b90a85d627ecbdf98ef6a93d37b/tumblr_ne1i7jcZfv1thiwtjo1_1280.jpg","“Nếu em biến mất, liệu có ai đó sẽ ngước nhìn lên bầu trời thành phố mà nhớ đến em không?”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/c13844aff24caae2a42fa0ab68c52fd7/tumblr_ne1hsja1sX1thiwtjo1_1280.jpg","“Bỗng một ngày ngoảnh lại.\n" +
                "Con đường dài, chẳng còn ai.\n" +
                "Chỉ một mình tôi với chiếc bóng.\n" +
                "Dắt díu nhau hết đời tàn.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/8af862319209aafc193c1c14e3de83e2/tumblr_ne1htocsdn1thiwtjo1_1280.jpg","“Tình yêu thực chất là một mối quan hệ bình đẳng hơn bất cứ mối quan hệ nào. Chính là, ai cũng có quyền bỏ người kia lại mà đi.”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/4a8e7130898c41be85d08a1c10dd32b3/tumblr_ne1huoCfwp1thiwtjo1_1280.jpg","“Quá khứ có thể là một địa điểm đẹp để nhìn ngắm, chứ chưa bao giờ là nơi tốt đẹp để đắm chìm ở lại.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/752f305c21d2b46f8bdfb3dab1b2423f/tumblr_ne1hvqH5ix1thiwtjo1_1280.jpg","“Có vài người bạn biết mấy chục năm cũng không cách nào tâm sự thật lòng. Nhưng có vài người chỉ gặp đôi lần đã có thể dốc hết ruột gan.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/7c4d85ccc477658541b4a116f6af3538/tumblr_ne1hwz8dVy1thiwtjo1_1280.jpg","Nếu bạn đang độc thân thì cũng đừng mất kiên nhẫn. Bởi vì ông trời vẫn đang dõi theo bạn. Người nói: “Ta muốn gửi một người thật đặc biệt tới cho cô gái này”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/740ea2c2d77226a8a3cd3d18807ba91b/tumblr_ne1hxwobDv1thiwtjo1_1280.jpg","“Người ta buồn nhất, cô đơn nhất là khi ngủ dậy. Và khi ngoài trời nắng ráo mà không biết phải đi đâu, về đâu.”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/33df0d26e120d6e3562cb996d2647db3/tumblr_ne1hjw5CSk1sxnbwko1_1280.jpg","Cái nắm tay đầu tiên với người mình yêu là cái nắm tay gói trọn một đời những gửi gắm và tin yêu, rằng ai cũng đã từng tin cái nắm tay đầu tiên ấy sẽ đưa họ đi đến tận cuối đường. \n" +
                "Nhưng có bao nhiêu người khi chia tay nhìn vào những khoảng trống trên kẽ tay mình để nghĩ lại, một thời họ đã từng tin và hẹn thề nắm tay người mình yêu đi đến tận cuối đời?\n" +
                "Một cái buông tay không tốn nhiều công sức, nhưng một cái nắm tay thì cần rất nhiều sự cố gắng và đồng lòng.\n" +
                "Nên nếu một ngày nào đó, trước khi buông tay người mình yêu, hãy nhìn vào những khoảng trống trên kẽ tay để thử tìm lại một lần nữa, hơi ấm đã từng có hôm nào…"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/4189b727a778a02cd7aa6fa5bad80805/tumblr_ne00p8YUMn1sxnbwko1_1280.jpg"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/3fe5987a7ac6b02fedf4e41b3dfb402d/tumblr_ne00o6RinI1sxnbwko1_r1_1280.png","“Đừng cười khi cậu muốn khóc.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/c0ce2159b30d03380ce926fb042ce010/tumblr_ndzd227xgO1thiwtjo1_1280.jpg","“Tuỳ” là một từ dễ nói, dễ nghe và dễ làm tổn thương người khác. \n" +
                "Cứ thấy mình như phế vật, không là gì, không quan trọng và không đáng để lưu tâm."));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/ad6c6965432cb9f3db78aa3617cf13b6/tumblr_ndzd4d0HJR1sxnbwko1_1280.jpg","“Nguyên tắc để sống lâu trong Running man :\n" +
                "1/ Không được chạy lung tung\n" +
                "2/ Đi đến nơi có nhiều người phải để ý không khí xung quanh để còn biết mà quay lại.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/eab002b30dda81a335dcc9b046dcb200/tumblr_ndzd3bqHqA1sxnbwko1_1280.jpg","“Cuộc sống này chính là như vậy, bạn cố chấp nhớ một người, thế nhưng người ấy có lẽ đã quên bạn rồi.”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/98d675fb29e2842003fbdb8a3dd38711/tumblr_ndxqjs3Hk71thiwtjo1_1280.jpg","“Có những ngày bệnh và cô quạnh, chỉ cần nghe một tiếng động thôi cũng đủ rùng mình.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/91ce5d798891337dae3706a876c2a496/tumblr_ndup34U3ax1sxnbwko1_1280.jpg","“Ngôi sao không thể sáng lấp lánh nếu không có bầu trời đêm. Nhưng không có anh, em vẫn có thể sống được. Yên tâm.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/5d7de6b5b835398bb16735d2953e730c/tumblr_ndw0wi1lDy1thiwtjo1_1280.jpg","Trong tiếng Yaghan có từ mamihlapinatapai, được liệt kê trong Sách kỷ lục Guinness là từ ngắn gọn nhất nhưng có nghĩa khá dài dòng.\n" +
                "Nó có nghĩa là: “Hai người nhìn vào mắt nhau, mỗi người hy vọng rằng người thứ hai sẽ tiến 1 bước tới việc mà cả hai đều ước muốn, nhưng không ai trong họ muốn là người tiên phong bắt đầu”. "));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/837a5382bb6b16ec39951a27abac5adc/tumblr_ndw0u98Oij1thiwtjo1_1280.jpg","“Trên đời không có nhiều hoàng tử cưỡi ngựa trắng đến rước chúng ta đi như vậy cho nên phụ nữ nhất định phải có một đôi giày tốt, để bản thân có thể tự tin bước đi trên đôi chân của mình.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/d3c9b0aa1bda9e6e2ff739c29cc3b0e5/tumblr_ndxqkwXidk1thiwtjo1_1280.jpg","“Thỉnh thoảng, em lại nghĩ về cái cách mình đã vượt qua nỗi buồn của bản thân như thế nào. Cũng có lúc yếu đuối tiêu cực, có lúc chán chường mỏi mệt. Nhiều khi sự tức giận khiến em không thể thở được. Thế rồi cũng qua. Thế rồi cũng nhạt. Bây giờ nhìn lại thấy mình trẻ con và nông nổi. Đúng là trải nghiệm của một thời huyên náo. Em nhận ra mình càng cố tìm cách để vượt lên nó thì càng bị dìm xuống. Nhưng thời gian sẽ đẩy nó trôi qua nhanh hơn.\n" +
                "Thỉnh thoảng, trời vẫn đẹp, cây vẫn xanh, hoa vẫn nở, chim vẫn hót…”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/8a644127fbbaec14a6ba3b09c87bf500/tumblr_ndxqmfNc9H1thiwtjo1_1280.jpg","“Cậu biết đau lòng là cảm giác gì không ?\n" +
                "Đau lòng chính là nhìn thấy vòng tay người đã từng ôm mình lại đi nắm tay người khác.\n" +
                "Đau lòng chính là đêm nào mình cũng mơ thấy cậu, khi tỉnh lại thì chỉ là bóng đêm vô tận.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/90ca71527bd464f377b5c1a9a6ddaa38/tumblr_n0z7vkCu541sxnbwko1_1280.png","Có một câu mà người nào đang vui nhìn thấy sẽ buồn và người nào đang buồn nhìn thấy sẽ vui: “Tất cả điều đó rồi sẽ qua đi”.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/8a57ff738b38e25e6c5626fe2d50748f/tumblr_ndw0y3382i1sxnbwko1_1280.jpg","“Yêu ai, lấy ai, bản thân mình hoàn toàn có quyền định đoạt, chỉ nên xem lời nói của người khác như một kênh tham khảo mà thôi. Cho dù ngày mai em chết đi, hôm nay em mới tìm được người mà mình yêu thương, hoặc cho dù em có phải sống cô quạnh suốt cả quãng đời còn lại đi chăng nữa, em cũng mãn nguyện, vì đó là sự lựa chọn của em.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/91ce5d798891337dae3706a876c2a496/tumblr_ndup34U3ax1sxnbwko1_1280.jpg","“Ngôi sao không thể sáng lấp lánh nếu không có bầu trời đêm. Nhưng không có anh, em vẫn có thể sống được. Yên tâm.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/4d21d5db97f8638fda1d9b08a37754d6/tumblr_ndsm1rVhH11thiwtjo1_1280.jpg","“Có những điều khó nghe đến mức ta không thể phản ứng gì khác ngoài cười.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/537cabc7537e5a5e806b2e8d63580499/tumblr_ndr3cgprGp1thiwtjo1_1280.jpg","“Chỉ cần trong tích tắc không kịp giải thích, hiểu lầm có thể khiến ai đó rời khỏi cuộc đời ta mãi mãi.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/24652de18d30ce5436b3c367e020a3b0/tumblr_ndqztixFdr1thiwtjo1_1280.jpg","“Năm hai mươi tuổi, bạn đã làm những gì?\n" +
                "Bạn đã chín chắn chưa?\n" +
                "Đã lập gia đình chưa?\n" +
                "Có nhớ về năm tháng vội vã đó của bạn hay không?\n" +
                "Có bật khóc vì những cuộc chia tay không thể tránh khỏi trong cuộc đời mình hay không?\n" +
                "Bạn vẫn còn nhớ?\n" +
                "Hay là đã quên?\n" +
                "Có còn lưu giữ hình ảnh của những con người ấy trong trái tim mình hay không?\n" +
                "Đã vơi lòng… trước tuổi xuân hay chưa?”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/e689264861d4eabacedb31d938762eb1/tumblr_ndqttu1cEO1thiwtjo1_1280.jpg","“Chúng ta đã rất lâu không liên lạc với nhau rồi. Cảm giác rằng suốt đời này sẽ không bao giờ gặp lại bạn nữa. Một số điều, không nói ra sẽ là kết thúc. Nói ra rồi sẽ thành vết sẹo. Có những bí mật không thể tiết lộ, nên mãi mãi chúng ta cũng không có lý do để gặp lại nhau. Đôi lúc cũng nghĩ, nhiều năm về sau, nếu như bạn và tôi, rất lâu không liên hệ, bất chợt có một ngày, đứng giữa đám đông nhộn nhịp và hối hả, chợt nhìn thấy nhau, câu đầu tiên nói ra chắc phải cần can đảm nhiều lắm.”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/5ae44384adfa63124657b28fd55b26c0/tumblr_ndqopw2ydQ1thiwtjo1_1280.jpg"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/99ef4dd1df6f5086ce0ef42e75521920/tumblr_n4zx0cMmoH1sxnbwko1_1280.png","“Trong những ngày lễ, người hạnh phúc sẽ càng hạnh phúc, người cô đơn sẽ càng cô đơn.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/aaec677384ee37d7c80f9213468bbf32/tumblr_n0w38fshgr1sxnbwko1_1280.jpg"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/fef538b5debb55f5ed81b46b5a3c17d5/tumblr_n3rmvqlkkL1sxnbwko1_1280.png","“Trên đời này, không có các chòm sao không hợp, chỉ có những con người không hợp nhau mà thôi.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/3e042c069819378d71ed95bcfb2853f6/tumblr_ndqbt33HXE1thiwtjo1_1280.jpg"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/85ab23993922bcaafb35a2108c91afb2/tumblr_ndqbmblb6v1sxnbwko1_1280.jpg","“Hãy trân trọng những người thân bên cạnh bạn…Bởi chỉ những ai có duyên phận mới trở thành người thân của nhau…”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/2e33a5b1b5355a51275178629edb0393/tumblr_n51mzhWah71sxnbwko1_1280.png","“Trong đời người ta sẽ bị ném đá một vài lần, đau lắm lắm nhưng chết vì mấy cục đá đó thì lãng quá…”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/4022df79d8e94de7b342c750b96aa55c/tumblr_n7ks6t09T11sxnbwko1_1280.png","“Rất nhiều phụ nữ mơ mộng và tin rằng khi tìm được người đàn ông của mình, đồng nghĩa họ sẽ có chỗ dựa về sau. Nhưng sống càng lâu tôi càng nhận thấy, chẳng ai có thể làm chỗ dựa cho mình mãi mãi, trừ chính bản thân mình. Suy cho cùng các mối quan hệ đều được kết nối bởi một sợi dây rằng buộc, sợi dây ấy vô cùng mỏng manh, đứt lúc nào không hay, không phải như tình thân, nối nhau bởi dòng máu chảy trong người.\n" +
                "\n" +
                "Vậy nên thay vì chờ đợi chỗ dựa, thay vì sẽ có một ngày gục ngã vì dựa nhầm, vì mất chỗ dựa, trước tiên chúng ta hãy tự đứng bằng đôi chân của mình, dựa vào chính sức mình.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/d54bb108221c09e43f6e74915977e378/tumblr_n331cdM9fu1sxnbwko1_1280.png","“Nếu có một ngày, cậu bước vào thế giới nội tâm của tớ, cậu sẽ khóc…vì nơi ấy…tất cả đều là cậu…\n" +
                "Và nếu một ngày, tớ bước vào thế giới nội tâm của cậu, tớ cũng sẽ khóc…vì nơi ấy…tớ không hề tồn tại”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/db74691c734927a80f05838a09db9fa2/tumblr_n2ki762TSy1sxnbwko1_1280.png","“Tôi và Đêm là hai kẻ cô đơn, vô tình thành tri kỉ ”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/ec0c584f69a0ee50f7417b1bd0ed6f74/tumblr_n2u719eFnU1sxnbwko1_1280.png","“Ai cũng có một khoảng trống mà suốt một đời không một ai có thể chạm vào.”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/8f76ebb08a2d83fadf9d9a3577a8493f/tumblr_n331fdeme91sxnbwko1_1280.jpg","“Ngày yêu nhau bao nhiêu câu nói yêu thương cũng không đủ.\n" +
                "Ngày chán nhau một câu nói đủ làm đau xé lòng.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/a78f767c515f39ce761d0b0a321ec9ce/tumblr_ndow70TZpQ1thiwtjo1_1280.jpg","“Ai cũng biết mình muốn gì nhưng bao nhiêu người hiểu mình cần gì?”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/2a3490141996c131db810d8890e8422e/tumblr_ndow2nH6MK1thiwtjo1_1280.jpg","“Xung quanh có nhiều người như vậy, có nhiều việc phải lo đến thế mà sao lòng vẫn cô đơn, trống trải?”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/253d52a64dc9d41d7ac0ffffa9312e96/tumblr_n6okwrQ5MR1sxnbwko1_1280.png","“Có lẽ chỉ khi màn đêm buông xuống, một chiếc giường, một tấm chăn ấm áp cùng một giấc mơ đẹp, mới có thể an ủi được cuộc sống mỗi ngày đều có quá nhiều chuyện không như ý của chúng ta.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/94f96dd76636deff857e0a1ad8cb85d7/tumblr_n4qtl1IdpM1sxnbwko1_1280.png","“Thiên hạ không có nuôi bạn lớn ngày nào, lúc bạn khổ thiên hạ cũng không ở cạnh lo cho bạn, đau cho nỗi đau của bạn. Lúc bạn vui thiên hạ lại càng không quan tâm chưa kể là còn phần ganh ghét. Vậy hà cớ gì mà nhiều bạn cứ bận tâm lo sợ chuyện thiên hạ đánh giá cuộc đời của mấy bạn quá vậy? Kì chưa?"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/bfb345c2432ad571142ce6f6bc2a4b8c/tumblr_n31jo6Rhqx1sxnbwko1_1280.png","“Nghĩ đến ai đó vì đang cô đơn hay cô đơn chỉ vì lúc nào cũng nghĩ đến một ai đó?”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/b675cf7b890c60462ecf55f5198152ed/tumblr_n7f9rhD5xs1sxnbwko1_1280.png","“Có những khi đột nhiên không muốn nói chuyện với những người xung quanh. \n" +
                "Có những khi luôn kiên trì theo đuổi một điều gì đó, chỉ trong một đêm mọi thứ đều biến mất. \n" +
                "Có những khi muốn buông thả bản thân, phát điên một lần. \n" +
                "Có những khi cảm thấy bản thân vừa như có được cả thế giới, nhưng đồng thời cũng chẳng có gì.\n" +
                "Có những khi ước mơ thì rất nhiều, nhưng lực bất tòng tâm. \n" +
                "Có những khi phát hiện bản thân chỉ qua một đêm đã trưởng thành lên rất nhiều, nhưng lại chẳng thể nhìn thấy được tương lai. \n" +
                "Có những khi, đột nhiên cảm thấy quá đỗi mệt mỏi…”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/01e1007a99579cf7372577dd2335efb9/tumblr_ndoi2w8GEL1thiwtjo1_1280.jpg","“Có khoảng cách dài từ rơm đến lửa\n" +
                "Chỉ chạm vào hai đứa cháy thành tro.”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/6b474bcd49c2aca43c67a5a46c83a486/tumblr_ndoi1crVwY1thiwtjo1_1280.jpg","“Qua cách họ ra đi, bạn có thể biết họ đến với bạn vì điều gì.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/9f9484f315e51b46ae7ef89fe84bc901/tumblr_ndovgqFp8T1sxnbwko1_1280.jpg","“Bi ai nhất là khi trong lòng bạn luôn tâm niệm một người. Thế nhưng trong mắt người ấy, bạn hoàn toàn không tồn tại.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/88cb00ffdc40bd79f8398066efdc8bdf/tumblr_ndovg3SPNT1sxnbwko1_1280.jpg","“Ai mà chẳng có phần giả tạo, ai mà chẳng thay đổi, ai cũng không phải là ai của ai. Vậy cớ gì bạn phải quan trọng hóa một người, hay một chuyện gì đó tới nhường ấy?”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/f28e6bc50f1fbab7e82eece7b1a5ef22/tumblr_n2hcybYRci1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/89370bf42b50c4fcd67bcf90d3421f66/tumblr_ndohzmxIDt1thiwtjo1_1280.jpg"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/e1a6416d0c8da27bf5c7b213a46cff87/tumblr_ndohwyC9751thiwtjo1_1280.jpg"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/4db024417205e392d9bfea54492f9a21/tumblr_ndklkjFDIA1sxnbwko1_1280.jpg","“Yêu không nhất thiết phải tỉ lệ thuận với được yêu, lúc đau khổ nhất cũng là lúc ta nên buông tay.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/e102e3d7238ed4add7f89b79f21778bc/tumblr_ndklmi6Yxj1sxnbwko1_r1_1280.jpg"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/43f684b30f2e1668508d6662ccdc7a71/tumblr_ndlnuyegDe1sxnbwko1_1280.jpg","“Khi tất cả mọi người đều nói anh ấy thích bạn, chỉ duy nhất mình anh ta chưa nói ra, có lẽ chuyện đấy không phải là thật.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/94494984ac5d4597d0c0df16da996c82/tumblr_ndohtoBkkH1thiwtjo1_1280.jpg","“…Tôi không thích bất cứ thứ gì, bất cứ ai.\n" +
                "Bởi vì tôi luôn cảm thấy cái thế giới này là của người khác. Nó không thuộc về tôi. Mọi vật, mọi người trên thế gian này đều không liên quan gì đến tôi cả. Tôi không biết ngày mai ở đâu, cũng không biết mình sống vì cái gì.\n" +
                "Ngày qua ngày, tôi luôn muốn chạy trốn đi thật xa nhưng lại vô cùng sợ thế giới bên ngoài.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/ba41fb087a223bfa67b375e6258dd718/tumblr_ndoi443ye41thiwtjo1_1280.jpg"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/831411b86742d3f225bc1b973ac87251/tumblr_ndc6cyiLXb1thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/fac213c59185d0fd5d5ede4143c02e53/tumblr_ndc6l9y09k1thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/9ed943f78c818b8af4a28f9d69f6e2de/tumblr_ndbo48tfWZ1sxnbwko1_1280.jpg","“Có những người chỉ để nhớ, chứ không để yêu.\n" +
                "Có những yêu thương chỉ để cất đi, chứ không để thể hiện.\n" +
                "Và, có những tình yêu, chỉ là của riêng một con người.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/46607973b119967b970ce0c2d30f16a9/tumblr_ndbo4yng8S1sxnbwko1_1280.jpg","“Trong trái tim của người phụ nữ chỉ có số 0 và số 1, nếu anh ta không là riêng là nhất là tất cả thì sẽ không là gì hết.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/3ea7f49e876848326afc444972dd529c/tumblr_nda0ixoOu21sxnbwko1_1280.jpg","“Cho dù bạn có tuyệt vời đến đâu, cho dù có bao nhiêu người ngưỡng mộ bạn thì sẽ luôn có một người bạn yêu mà bạn không thể có họ. Dù bạn yêu đến đâu bạn cũng không thể có họ. Nhưng cũng chính nhờ người này, bạn mới bắt đầu hiểu hơn về cái người ta vẫn gọi là tình yêu.”\n"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/4b31d1d30626498f998cd6f0806b767b/tumblr_nda0i4oSH91sxnbwko1_1280.jpg","“Có những sự im lặng đến đáng sợ. Đó là lúc con người ta đã đau lòng đến mức không thể nói thành lời.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/097791a997e76e05517d534647a0a556/tumblr_n2zjx5BHCK1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/9baebd860b78581a6d85c75a7c30a733/tumblr_n3gmebfap81sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/1dc021f6047b0919c732daf197b07448/tumblr_n1fvgu3u1e1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/61df190ff2857cdde45916872bbd0c03/tumblr_n1ninlM6Xd1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/d2e90f7cb6dc65f424f35a062cffeca8/tumblr_n2968r0yUx1sxnbwko1_1280.jpg","“Có một số người mãi mãi nén vết thương ở trong lòng, đến tận khi chết cũng không chịu hở ra cho người khác xem, cho dù đó là bạn thân, là bạn tốt nhất. Có một số vết thương, dù có chia sẻ thì cũng rất đau. Vì thế, biện pháp tốt nhất là giữ nó lại trong lòng, mãi mãi không để lộ ra.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/39a23dcf32b9ff6127aa0bd6c9c4b974/tumblr_n0v98yE4fQ1sxnbwko1_1280.png","“Đời người mệt mỏi nhất là khi cứ cố chấp với những điều vốn dĩ cần tỉnh ngộ, cứ níu kéo những thứ mà buộc phải buông tay. Có điều, nói thì dễ, mấy ai làm được?”\n"));
        //10 2014

        //9 2014
        arrayList.add(new OPhoto("http://66.media.tumblr.com/9d05ae870d3684f739912984f8ce81ab/tumblr_ncq14mD8Dc1thiwtjo1_1280.png","“Càng trưởng thành, sẽ có lúc bạn nhận ra rằng tranh luận đúng sai hơn thua với người khác đôi khi không còn trở nên quan trọng nữa. Quan trọng hơn cả là chỉ muốn bình yên.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/b148e1c89ba3002a26e8c702852321e8/tumblr_ncq187PSD51thiwtjo1_1280.jpg","“Bao nhiêu năm trôi qua, thực sự tôi vẫn là đứa trẻ có tính cách cô độc. Bất luận vẻ ngoài có thế nào, trong lòng tôi vẫn chưa từng thay đổi.\n" +
                "Đằng sau vô số chiếc mặt nạ mỉm cười hớn hở và lạc quan yêu đời, việc tôi thích làm nhất và hay làm nhất vẫn là ngồi một mình trong góc khuất, lặng lẽ vẽ vòng tròn trong tim.\n" +
                "Mặc dù vẫn cảm thấy ít nhiều không hợp với xã hội này nhưng cũng may, tấm áo giáp của tôi đến giờ vẫn ứng phó được.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/4671ddbafb02a1f6152936768a6d7323/tumblr_nco4ivVAU91sxnbwko1_1280.jpg","“Chờ đợi mà người ấy không đến không có nghĩa là bị bỏ rơi. Chỉ là đối phương vẫn đang trên đường đến.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/d66d6b38f412eb80c9c47624799c5c54/tumblr_ncpolyGUDe1thiwtjo1_1280.jpg","“Mèo thích ăn cá, nhưng mèo không thể xuống nước. Cá thích ăn giun, nhưng cá lại chẳng thể lên bờ. Ông trời đã cho bạn quá nhiều cám dỗ, nhưng không cho phép bạn dễ dàng có được. Để đạt được, chúng ta phải tự đấu tranh. Cuộc sống cũng giống như những bông bồ công anh, trông có vẻ tự do tự tại, nhưng lại không được bay theo ý mình. Nếu không có cái gọi là “nếu như” thì cũng không có cái gọi là “kết quả”. Vậy nên hãy sống theo cách riêng, cố gắng hết mình cũng đã là tốt rồi.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/5eb8417d4f005812edab1c119cbd1329/tumblr_nco4g0WEN41sxnbwko1_1280.jpg","“Trong cuộc sống con người ai cũng phải chịu đựng một gánh nặng nào đó, dù ít hay nhiều. Thế nhưng ta vẫn phải sống và chống chọi, cố gắng vượt qua nó. Không được nghĩ rằng mình là kẻ bất hạnh. Nếu nhận thức được rằng, còn có những người bất hạnh hơn mình nhiều, ta sẽ càng thêm bền bỉ.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/8536a55be46199c05309ad7a4005d910/tumblr_ncmiq68TzV1sxnbwko1_1280.jpg"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/140536c6812380cf26090cb9c89d3788/tumblr_n2go9oOQVK1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/610391a49d7ea3c7f47e3d84a2a4aeef/tumblr_n0w1tgeKtZ1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/22fb6db1e08e58f0156c0fbe03d156e0/tumblr_n10vtbllue1sxnbwko1_1280.png","“Tình cảm của con người giống như đan áo len vậy, lúc xây dựng thì một dây một chỉ, cẩn thận và lâu dài, nhưng tới khi đổ vỡ chỉ cần kéo một đường nhè nhẹ…”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/b73cc579480ef72f61157086e7d3c7af/tumblr_n16fhoRqa21sxnbwko1_1280.png","“Cuộc sống này ngắn ngủi lắm. Đừng bận tâm đến những việc ngu ngốc nữa. Cười thật tươi, yêu thật nhiều và tha thứ thật nhanh.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/e2c2f831c3bb3828b0bde72a9d0ba1c5/tumblr_n15795kIZ91sxnbwko1_1280.jpg","“Cuộc đời như một vở kịch, mỗi người chưa chắc có thể được diễn vai diễn mình mong muốn.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/0eff529a5f98d37e197790f3771854a9/tumblr_n14vlcJbJ81sxnbwko1_1280.png","“Có buồn cười không, khi giữa thời đại thông tin, khoảng cách ngàn dặm cũng được rút ngắn lại trên màn hình máy tính, hay một cuộc điện thoại xuyên lục địa. Thế nhưng muốn cầm điện thoại lên, hay bật máy tính lên, để được trò chuyện với \"một người”, mà lại chẳng biết gọi ai cả.\n" +
                "\n" +
                "Vậy là dù máy tính đã nối sẵn mạng, điện thoại có cả vài chiếc bày sẵn ra đấy, người ta vẫn cứ cô đơn trong cái thế giới câm lặng của chính mình.”\n"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/9ea3d96a32c0fb1446f4e7fad8a1e855/tumblr_n12q23vacl1sxnbwko1_1280.png","“Em chọn làm Gái Ngoan hay Gái Hư?\n" +
                "\n" +
                "Tôi muốn em hãy là gái hư!\n" +
                "Là Hư chứ không phải là Hỏng!\n" +
                "Là hư vừa phải chứ không phải hư đốn!\n" +
                "Là em biết nghe lời chứ không phải biết vâng lời! Nghe lời cha mẹ và người lớn rồi tuỳ việc đúng sai mà chọn làm hay không làm!\n" +
                "Sống biết điều với mọi người chứ không phải sống vừa lòng mọi người!\n" +
                "Sẵn lòng nổi loạn một tí nếu lòng muốn nổi loạn! Miễn là điều đó không tổn hại đến ai!\n" +
                "\n" +
                "Gái hư không chọn Thiên Đường để tới mà biến những nơi mình tới thành Thiên Đường, biến chính bản thân thành Thiên Đường với ai đó mình yêu!\n" +
                "\n" +
                "Gái hư không chọn việc làm vui lòng đàn ông mà là sở hữu lòng đàn ông! Gái hư lấy chồng vì chính bản thân mình chứ không lấy chồng để vui lòng cha mẹ!\n" +
                "\n" +
                "Gái ngoan có một cuộc đời sạch sẽ như lau như ly, một thời thiếu nữ rõ như sách giáo khoa! Gái hư thì khác, cuộc đời họ giữ rất nhiều bí mật! Không chừng có cả những bí mật động trời, những bí mật mà chẳng ai có thể tưởng tượng ra!\n" +
                "\n" +
                "Chọn làm gái ngoan hay gái hư là tuỳ ở em thôi! Tôi chỉ là đề xuất em hãy làm gái hư để cuộc đời em thêm nhiều màu sắc! Bởi làm gái hư cũng cần nhiều can đảm và mơ ước lắm! Chẳng phải cô gái nhỏ nào muốn cũng làm được đâu!”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/ca31bc09a5e087b956846990c4966017/tumblr_n11ep3QPGv1sxnbwko1_1280.png","“Người ta ngày càng tinh ranh, che giấu suy tính trong đầu bằng nét mặt tươi cười có vẻ rất chân thật…Cho nên bạn hay tôi đừng hỏi vì sao đã có thể làm bạn 5, 6 năm trời, vào sinh ra tử, đồng cam cộng khổ, khóc cười có nhau… lại có thể quay lưng phủi tay và làm những chuyện có hại cho nhau như thế! Bởi tình không đo bằng năm, mà đo bằng bản chất con người.\n" +
                "\n" +
                "Nếu bản chất con người đó là trọng tình nghĩa, thì quen nhau 2, 3 ngày cũng đủ để người ta hết lòng vì bạn. Còn nếu bản chất là lợi dụng và lừa dối, thì quen nhau 10 năm cũng có thể sẵn sàng “đá” nhau khi có dịp.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/3f3d7e7500f3bcd48ccf2def0b3b3f3b/tumblr_n0vmaoo3OF1sxnbwko1_1280.png","“Thỉnh thoảng. Như bây giờ. Như lúc này. Mình chỉ ước giá như ngày mai là ngày cuối cùng. Không còn ai nữa. Không còn điều gì nữa. Mình sẽ có đủ dũng cảm để vứt hết tất cả mà giữ lấy Anh.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/c2ea5474eb21c3b5dfe9daecebfed9c0/tumblr_n0rj1mlQo61sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/4843ea878f1b9e33ecbeb38492fa1c34/tumblr_n0scplOMe61sxnbwko1_1280.png","“Tình bạn sau tình yêu đôi khi là cái cớ để một người có thể gặp một người, để một người vẫn có thể quan tâm chia sẻ với một người… ”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/d406cebb214dd9398945b86cc289c34b/tumblr_n0v8stRpfb1sxnbwko1_1280.png","“Nếu bạn yêu ai đó, và đã làm mọi cách mà người đó vẫn không cảm nhận được thì…hãy dẹp đi. Bạn không thể yêu một đứa ngu như vậy được.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/0a4497631837621b53b55975eb564f51/tumblr_ncmioxLelU1sxnbwko1_1280.jpg","“Nếu người ta thương mình, người ta sẽ tự biết tìm về. Mình chỉ ra đón, cớ sao phải đi tìm.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/2017158c2030800a07c1b8b9d268bbbc/tumblr_n205laI5SH1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/6e639eb9d1a8f41e28636aaa5b1ddb65/tumblr_ncmi38d2xv1sxnbwko1_1280.jpg","Tiểu Thu, tình yêu của em sâu đậm như vậy à? Sáu năm cũng không đủ để em quên đi sao?”\n" +
                "“Không đủ, một ngàn năm cũng không đủ! Em không quên được, tại sao em phải quên!”\n" +
                "“Em lớn lên một chút được không? Khi em còn sống, có vài thứ phải ra đi, nhất định phải biến mất, let it go!”\n" +
                "“Em không muốn mất anh.”\n" +
                "“Đúng vậy, em sợ mất anh, nhưng em đã mất rồi. Em phải đối diện với kết thúc này.” Anh nói “Khi em được đọc một quyển sách hay nhất, gặp được một người đàn ông đẹp nhất, hoặc là tới một thành phố xinh đẹp. Em hãy nói với chính mình, em đã gặp được thứ tốt nhất trên đời, em khiến những thứ đó làm bạn với em trên đường đời. Nhưng không được bao lâu, lại có những điều mới xảy ra, em lại đọc được một quyển sách hay hơn, gặp được một người đàn ông đẹp hơn, đi tới một thành phố đẹp hơn. Một cuộc sống khác lại bắt đầu.”\n" +
                "Anh tiếp tục nói, khóe miệng kèm theo ý cười tàn nhẫn : “Đừng sợ kết thúc. Kết thúc chỉ là một ảo ảnh mà thôi. Tất cả kết thúc, đều ý nghĩa cho một bắt đầu mới."));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/f1efff0f7681f5511912b8e342031074/tumblr_ncmi1rPETn1sxnbwko1_1280.jpg","“Em muốn trở về thuở ban đầu\n" +
                "Để không phải biết anh\n" +
                "Ngày đầu ta gặp gỡ\n" +
                "Em muốn tránh sự tình cờ ấy\n" +
                "Vờ như ta chưa từng quen\n" +
                "Vờ rằng tình yêu vốn không hề tồn tại\n" +
                "Chúng ta xa cách còn hơn người dưng vô tình\n" +
                "Mong rằng dù có gặp lại, ta cũng sẽ không nhận ra nhau\n" +
                "Sẽ cứ mãi đuổi theo những nẻo đường riêng\n" +
                "Đừng quay lại, cũng đừng hỏi han em\n" +
                "Hãy cứ để hình bóng em trở thành dấu hỏi vấn nghi\n" +
                "Chuyện hai ta đã đi xa hết mức có thể\n" +
                "Đơn giản là nhòa phai mà chẳng chút tiếc thương\n" +
                "Giống như những mùa đã đi qua đời ta…”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/05d221f01238d9a22be9ceb9748dfb4c/tumblr_ncmhvozsA21sxnbwko1_1280.jpg"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/5e7283349dd158454dbb53858b714372/tumblr_ncmc275hZm1thiwtjo1_1280.jpg","“Có một số điều không thể nào nói với người khác. \n" +
                "Có một số điều không cần phải nói cho người khác.\n" +
                "Có một số điều chỉ đơn giản là không cách nào nói cho người khác.\n" +
                "Và thậm chí có một số điều…nếu nói với người khác, bạn sẽ phải hối hậnsớm thôi.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/340edeeffb3f7c69e6e8926c64e10d1e/tumblr_n49qlyjsV41sxnbwko1_1280.png","“Có những ngày chỉ muốn trở về quê\n" +
                "Nằm nghe gió rít qua hàng song cửa\n" +
                "Nói với mẹ: Con không đi làm nữa\n" +
                "Mẹ nuôi con đọc sách hết đời, nghe?”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/4db114367110f0bb077e4ebb21ac227e/tumblr_ncd1yri52K1thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/91041d444873dbdaddb106e8cea7a8f0/tumblr_ncipzoV8Bn1thiwtjo1_1280.jpg","“Cái cảm giác một người cứ mãi trong tầm mắt, cứ mãi nằm trong tim nhưng không bao giờ ở trong vòng tay mình thật tệ.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/834395c78facb409ec4bc79567642759/tumblr_ncabi9QcW51thiwtjo1_r1_1280.jpg"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/d919d4f059057c61ef17b82eabf4e866/tumblr_nc7j8ejUOU1thiwtjo1_1280.jpg"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/1ca69a95b76d1a85ab1920833aaa028f/tumblr_ncm33wwKyQ1thiwtjo1_r1_1280.jpg","“Bạn buồn, rủ mình đi ra quán\n" +
                "Chiều mưa lất phất dọc bờ kè\n" +
                "Chán nỗi rượu bia mình dị ứng\n" +
                "Bạn ngồi độc ẩm, có người nghe\n" +
                "\n" +
                "Bạn kể mình nghe chuyện tình yêu\n" +
                "Mình nghe cũng chẳng hiểu bao nhiêu\n" +
                "Chỉ biết đại khái rằng: tan vỡ\n" +
                "Và nay bạn vẫn nhớ thương nhiều\n" +
                "\n" +
                "Bạn uống tràn ly rồi bạn say\n" +
                "Bạn khóc, bạn cười như dại ngây\n" +
                "Mình lau nước mắt trên mặt bạn\n" +
                "Thương quá là thương những lúc này\n" +
                "\n" +
                "Mình ước gì mình cũng biết say\n" +
                "Cũng khóc cười như thể dại ngây\n" +
                "Nghe bạn, mình bỗng đau chuyện cũ\n" +
                "Đau suốt từ xưa, đau đến nay\n" +
                "\n" +
                "Bạn dựa vai mình, ngẩn nhìn mưa\n" +
                "Con kênh đen đục chảy lờ đờ\n" +
                "Nước mắt bạn khô, vai mình ướt\n" +
                "Mình tỉnh mà say, say bất ngờ.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/7a3c8cc466793025c4489df8cba12a32/tumblr_ncly6o0aoq1sxnbwko1_1280.jpg","“Không phải tôi khóc vì đau lòng\n" +
                "Mà là vì gió thổi.\n" +
                "Bởi vì mắt cay.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/d980afefd0a8136bd692b32416e85c37/tumblr_ncly3ayuUf1sxnbwko1_1280.jpg"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/ac1eec2cd417432f3eaa2bdac52533dc/tumblr_ncly2wcrYf1sxnbwko1_1280.jpg"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/fa29c052349f2b0681e588a2d2b27606/tumblr_nclxwr55Ep1sxnbwko1_r1_1280.png","“Nếu biết bài hát nào nghe vào sẽ buồn thương, thì có thể không nghe nữa. Vậy nếu như biết rõ yêu một người sẽ rất đau lòng, có thể khiến bản thân mình không yêu nữa được không?”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/f6c19e2905120a9bb25e1c14d6ec55d0/tumblr_nck182XDdk1sxnbwko1_1280.jpg"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/559218d1865d4abc4bdf5f648c07e43f/tumblr_nck17iVY791sxnbwko1_1280.jpg","“Hà Nội cực kỳ nhiều xe máy, giống như huyết mạch của thành phố, mỗi giây mỗi phút đều chảy. Dòng chảy ấy ngay sát bên tay, tôi đưa máy mở máy, chụp được dòng người lưu động ấy…”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/d30d18af4a36c9ff1397d6aee308bfa6/tumblr_nck16oRJhO1sxnbwko1_1280.jpg"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/9c3a77da5004990339f0f654b7fd50ef/tumblr_nck15rB5Mp1sxnbwko1_1280.jpg","“Bao giờ mi thấp được bằng ta rồi thì mới nói chuyện tiếp nhá!”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/2a2d0a63aee4bdc5660def739d4af6e5/tumblr_nck155z2uq1sxnbwko1_r1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/fde07c24b2519e6441e084bbf617a061/tumblr_nck14dg9CN1sxnbwko1_1280.jpg","“Đừng nói lời yêu một cách dễ dàng, bởi lời hứa đã nói ra sẽ trở thành một món nợ khó trả.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/7cd6fa4d5d9d55c77172dd4d464ee97c/tumblr_nck13n7e9P1sxnbwko1_1280.jpg"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/afc273bec57e543c2abf3783f9392675/tumblr_nce674khPg1sxnbwko1_1280.jpg","“Everything that kills me makes me feel alive\n" +
                "…Everything that drowns me makes me wanna fly”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/65eb88a53d14209a413919ae54d1d1f2/tumblr_nck134Yeyn1sxnbwko1_1280.png","“You don’t know shit about what happened to me.\n" +
                "So shut the fuck up.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/a6c59df1cb48f443d19429a8893a2b9e/tumblr_nck12cUG6o1sxnbwko1_1280.jpg","“Có khó khăn mới có thành công.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/370bb7253248fcbcd8ac515ff3c87ba3/tumblr_nck11qpvfs1sxnbwko1_1280.jpg","“Phụ nữ sau 25 tuổi không khác gì quạt điện giữa mùa đông, để đâu cũng thấy không hợp. Ngay cả bố mẹ đẻ cũng chê mình chiếm chỗ trong nhà”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/f31d8198a1e0b78ccae459848f0f0c45/tumblr_nc8tvnXaMy1sxnbwko1_1280.jpg","“Cùng với sự dễ thương của em ấy và vẻ đẹp trai của em, nhất định sẽ trở thành một đôi ăn ý."));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/96c951fc201a2febdc57074c88cc80f8/tumblr_nce669KEHu1sxnbwko1_1280.jpg","“Bạn thân là đứa khi đi chơi với, bao nhiêu chuyện buồn, tâm tư sẽ bị lãng quên từ bao giờ mà không hay biết.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/cd1007bca4211e7860fc25f846c11a8e/tumblr_nce65qiwmZ1sxnbwko1_1280.jpg","“Tôi không cần biết chúng tôi đến từ hai thế giới khác nhau, tôi chỉ cần biết chúng tôi đứng cùng một nơi và cùng nhìn về một hướng.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/a2057ae8c4ac7f30e87aad07d14799ed/tumblr_nc8tul3SKR1sxnbwko1_1280.jpg"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/8c09d6c815286b171e2017332c955dad/tumblr_ncck0lwmdk1sxnbwko1_1280.jpg","“Những người làm đau ta, nếu có, theo tôi luôn là thiểu số đối với những người yêu thương ta thật sự. Vì vậy đừng để thiểu số ấy che khuất phần tốt đẹp còn lại của thế giới. Cũng như những vết gai cào chảy máu không thể ngăn ta ngắm cảnh đẹp bên đường trong một chuyến du ngoạn giữa rừng đầy thú vị. Và thật chẳng xứng đáng nếu chỉ vì một lần bị phản bội mà ta từ chối hết mọi cơ hội được yêu. Nếu em không thể “nhảy múa như không có ai nhìn ngó, yêu như chưa từng bị tổn thương” thì ít nhất, em cũng đừng khép cửa tim mình lại.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/67c335b8c069161681134913b13589cf/tumblr_n5txsv2wcP1sxnbwko1_1280.jpg","“Ngực lép thì đã sao? Ngực lép của tôi là niềm kiêu hãnh vì quốc gia mà tiết kiệm vải vóc.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/58c537c81802c80c0bf692c1c7bfd812/tumblr_nbxgha7fSX1thiwtjo1_1280.jpg","“Life is like a multiplication table. If you’re a zero, you’ll end up at zero regardless of the man you’re with.\n" +
                "Cuộc sống cũng như bảng cửu chương vậy. Nếu bạn là con số 0, tất cả đều kết thúc là con số 0 kể cả người đàn ông bên cạnh bạn”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/a11def8a94c6a806e945e022b3f0ce54/tumblr_ncb9ouifyF1sxnbwko1_1280.jpg","“Suy nghĩ càng lâu,quyết định càng ngu!”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/c5b84f8a7459c523c2ed160419c43b42/tumblr_nbyas2VPxH1sxnbwko1_1280.jpg","“Sometimes you just need a break. In a beautiful place. Alone. To figure everything out.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/1db8e6d58339a0586463f29e468bdb25/tumblr_nc8tsy44Ar1sxnbwko1_1280.jpg","“Kỷ niệm càng ngọt ngào, nỗi đau càng nhức nhối. Mật ngọt trong quá khứ đã hóa thành thạch tín, không mùi không vị, nhưng giết chết mọi tế bào cảm xúc, một cách vô tình…”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/1d8f1d2c7612dfab04322297fd75205d/tumblr_nc8swzkw2K1thiwtjo1_540.jpg","“Bao nhiêu năm nay em ở đâu vậy? Nếu có cỗ máy thời gian thì tốt quá. Anh sẽ lập tức quay ngược về lúc em còn học mẫu giáo lớn và ở bên em ngay từ lúc đó. Cứ có thằng nào ve vãn xung quanh, anh sẽ đá bay chúng ngay lập tức. Anh nói với bọn nó rằng, nhìn thấy không, đứa bé này, sau khi lớn lên sẽ là vợ tao. Vì thế nên, mối tình đầu của em, nụ hôn đầu của em, đêm đầu tiên của em sẽ đều là của anh.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/a1d254188dcdfeb8592fed8cb9e0bb79/tumblr_nbyarhnuKA1sxnbwko1_1280.jpg","“Nỗi đau từ tình yêu, đa phần đều do con người tự nguyện gắn bó với nó. Yêu một người, rất cần sự cố chấp.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/92bb125f7457d21ea30eac2d6321a20b/tumblr_nc8l5g57kF1thiwtjo1_1280.jpg","“Trong cuộc đời chúng ta thường xuất hiện những khoảnh khắc như thế này. Ở một lúc nào đó, tại một nơi nào đó, chúng ta gặp một người. Cô ấy mang theo thứ ánh sáng chói lòa, như thần tiên, hạ xuống trước mắt bạn. Sau đó có một thứ âm thanh đột nhiên vang lên từ sâu trong lòng bạn. "));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/bd814971095fcdfa47d6959506ba7751/tumblr_nc8q6gXwrj1sxnbwko1_1280.jpg","“Ác độc là bản tính của phụ nữ! Dù cho có nói bao nhiêu lời tuyệt tình đi chăng nữa, vẫn hi vọng đối phương vẫn yêu mình.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/265c4e627acfb371aa45cc26e97c506f/tumblr_nc8q5qBniM1sxnbwko1_1280.jpg","“Đời là thế, ngày là thế sao phải ức chế.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/147a5ce8d93e1f52f793bbbf04096cfa/tumblr_nc8q581LXz1sxnbwko1_1280.jpg","“Phải đi kiếm ăn mệt lắm đúng không? Nhưng không chỉ mình em vậy đâu, con người cũng vậy. Kiếm sống qua ngày là vất vả nhất. Chính vì vậy phải cứng cỏi lên! Đừng vì đồ ăn của người khác cho mà mất hết ý chí đấy nhé.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/d5b051253fc11ce953b097abd8357f7a/tumblr_nbyakoVJMg1sxnbwko1_1280.jpg","“Muốn biến bài hát yêu thích thành một bản nhạc đáng ghét? Hãy cài nó làm nhạc chuông báo thức.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/623378dd50281d708828f1512a7b916f/tumblr_nc6tjrd3KP1sxnbwko1_1280.jpg","“Nhiều năm trước, đầu tóc rối bời, bề ngoài có vẻ ngốc nghếch, bản thân cũng khờ khạo một chút, chỉ muốn sau một đêm ngủ dậy liền trưởng thành.\n" +
                "Nhiều năm trước, chưa biết thế nào là yêu, cũng chưa thật sự yêu ai, chỉ muốn hàng ngày gặp được người làm cho mình vui vẻ.\n" +
                "Nhiều năm trước, thích viết về chuyện tình cảm, chuyện độc thân đượm buồn, cô đơn. \n" +
                "Bây giờ, lại thích bản thân của mình nhiều năm về trước.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/b49870442e2e5bde523ec1d54b50e47b/tumblr_nbyaor69lB1sxnbwko1_1280.jpg","“Đẹp gái yêu ai cũng được.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/cd89da56662060067fac411094c2fb90/tumblr_nc3uaooJ6h1thiwtjo1_1280.jpg","“Tuổi trẻ nào có lẽ cũng thật nhiều mất mát. Mất đi chút niềm tin vì những điều bất công còn đầy rẫy. Mất đi chút yêu thương vì tan vỡ. Mất đi chút hồn nhiên vì tính nghi ngờ. Mất đi những gì thân quen vì chủ động biến nó thành xa lạ. Mất đi sự mạo hiểm vì mong đợi an toàn. Và mất đi rất nhiều lạc quan vì nỗi buồn nhiều khi có sức mạnh nhiều hơn ta vẫn nghĩ. Phải làm sao để thôi mất mát? Và quan trọng nhất, sự say mê, một ngày đã biến mất. Ai mang nó đi rồi. Thiếu say mê, con người ta trở nên bi lụy, chán nản và nhạt nhòa. Thiếu say mê, ta chẳng thiết tha một nụ hôn sâu hay một cái ôm lâu nữa. Nó giống như việc bạn chơi một bản nhạc, đầy kĩ thuật, nhưng thiếu tâm hồn.\n" +
                "Tất cả các dòng sông sẽ chảy mãi. Như là cuộc đời. Chỉ là ta chọn cách xuôi theo nó, hoặc mượn sức nó để bơi về phía trước nhanh hơn mà thôi. Chưa ai chọn cách bơi ngược dòng cuộc đời mà thành công. Chưa ai tìm thấy hạnh phúc quá nhiều ở quá khứ. Ừ, thì vì tuổi trẻ vốn chẳng nhiều nhặn gì, nên hãy cứ sống theo cách mình mong muốn. Lúc nào cũng sẽ có quà cho người biết kiên trì và chờ đợi.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/2e9e7d66d3ed3ea43ef07727f808bd3b/tumblr_nbyao3Xo7J1sxnbwko1_1280.jpg","“Xấu gái nên chẳng ai yêu.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/1289fbd5fc22f7e506dba826da1ea49c/tumblr_nc5ddhNUDN1sxnbwko1_1280.jpg","“Hà Nội không phải nơi để mơ. Có nhiều giấc mơ chẳng thể lớn lên ở Hà Nội. \n" +
                "Nhưng Hà Nội là nơi để chờ. Hà Nội là nơi để mà thân quen, để mà mong nhớ.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/9052511e1af0c418ffe463e1d69bc7c2/tumblr_nbyam9z37R1sxnbwko1_1280.jpg","“Trong cuộc đời có rất nhiều việc không muốn làm mà vẫn phải làm đó chính là trách nhiệm.\n" +
                "Trong cuộc đời có rất nhiều việc muốn làm mà không thể làm đó chính là số phận.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/bf68ac68f52b7ad5809cb9fab7ce82cb/tumblr_nb2avoWMdJ1thiwtjo1_1280.jpg","“Người ta hy sinh bản thân để có được tất cả. Rồi khi có được tất cả người ta lại hối hả tìm lại bản thân mình.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/861817c0e45eb559d049bcab40f27a75/tumblr_nc3uadVaNQ1thiwtjo1_1280.jpg"," “Mỗi người đều hy vọng bản thân sẽ gặp được một người như vậy: \n" +
                "Khi bạn bị hàm oan, anh ta tin tưởng bạn. \n" +
                "Khi bạn bị nói xấu, anh ta che chở cho bạn.\n" +
                "Khi bạn thất vọng, anh ta luôn bên cạnh bạn.\n" +
                "\n" +
                "Nhưng tiếc thay, cuộc sống này không đẹp như thế, nó chỉ có thể mang đến cho bạn một người thế này :\n" +
                "Khi bạn bị hàm oan, anh ta nghi ngờ bạn. \n" +
                "Khi bạn bị nói xấu, anh ta lạnh lùng với bạn.\n" +
                "Khi bạn thất vọng, anh ta rời xa bạn.\n" +
                "\n" +
                "Trên đời này, khoảng cách xa nhất chính là “Là thật sao?”. Nhưng khoảng cách gần nhất chính là “Anh tin em”."));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/a2217da124f7a6d54419a3542f8e4244/tumblr_nc3tnnQo3S1thiwtjo1_r1_1280.jpg","“Đôi khi vô tình biết được một vài sự thật ẩn giấu đằng sau mà bản thân không nên biết miệng mỉm cười và nói không sao cả là để che đậy hết thảy mọi thứ đang vụn vỡ tận sâu trong lòng.”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/b31f345da8c6cfb74b1cfb5da7d762b2/tumblr_nbdufrqWQd1thiwtjo1_1280.jpg","“Ngay từ bé chúng ta đã được dạy dỗ rằng đừng tin người lạ. Nhưng còn việc đừng tin ngày cả người quen thì mãi sau này lớn lên chúng ta mới tự học được.”\n"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/6de52ff7de7b756803e0160a8e2e316c/tumblr_nbyajiN8jR1sxnbwko1_1280.jpg","“Chỉ là làm hay không, đừng có nói thử”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/755b92aaf6bb1420cbf62b2bbfc7103b/tumblr_nc3b86Mqie1sxnbwko1_1280.png","“Một nửa ổ bánh mì vẫn là cái bánh mì, nhưng một nửa sự thật không còn là sự thật nữa.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/0b1ce1b0e7543eb950a9de0cae773d7c/tumblr_nc2wc0ikGi1thiwtjo1_1280.jpg","“Trái tim của cô gái giống như bông hoa, sẽ vì người trong lòng mà nở rộ, cũng sẽ vì người trong lòng mà héo rũ.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/aa9d6b6adb154b727f6f5d679883e5d0/tumblr_nbj07g6Klg1thiwtjo1_1280.jpg","“Những người mà bạn khó buông bỏ nhất thật ra chính là những người chưa bao giờ thuộc về bạn.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/cf30e6dc35dda243ae56aee4691dfee2/tumblr_nbuo2aV8Bv1thiwtjo1_1280.jpg","“I just feel so alone, even when I’m surrounded by other people.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/13176f2fec8e6e1e39eca48e36a203d7/tumblr_nbyagsfGQe1sxnbwko1_1280.jpg","“If you remember me, then I don’t care if everyone else forgets.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/b4ca8ec3c5421a270b203ca68838bc86/tumblr_nbvo34qAvI1thiwtjo1_1280.jpg"," ”The world is not a wish-granting factory.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/927285c83096aa04cc981ba96544466b/tumblr_nbvyxtBTTN1thiwtjo1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/bb87367e3eaf461edc10bc0e1106011b/tumblr_nbya2amyrI1sxnbwko1_1280.jpg"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/535cd7f70a3aff16573ecebe536622c8/tumblr_nbyacq6rMB1sxnbwko1_1280.jpg","“Có dạng người, để quên anh ấy đi bạn cần thời gian dài đến ba năm, nhưng để nhớ, chỉ cần ba giây là đủ. Bạn hận anh ấy, buồn anh ấy, liên tục trong ba năm, nhưng anh ấy muốn trêu bạn cười cũng chỉ ba giây là đủ.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/d278202a0160b447d29ceb0dc1adf016/tumblr_nbyaanL0Mw1sxnbwko1_r1_1280.png","“Mọi vật đều có thời điểm của mình. Em đừng cố rút ngắn thời gian. Nếu trái chưa chín thì đừng nên hái. Nếu nhộng chưa chín thì đừng phá vỡ kén tằm. Nếu chưa gặp được tâm hồn đồng điệu thì đừng gửi trao trái tim. Đừng để thế giới này tác động. Xuân qua Hè tới. Đông sang thu về.\n" +
                "Đừng nôn nóng khi nhìn thấy những loài cây khác đã khoe lá khoe hoa. Hãy cứ bình tâm. Hãy đợi thời điểm của mình, em nhé. Hãy tận dụng những khoảng lặng này để bồi đắp cho chính mình và học cách khám phá điều sẽ xảy ra. Nếu em biết suy tư, khoảng thời gian chờ đợi không bao giờ là vô nghĩa.\n" +
                "Vì thế, dù cuộc sống có trôi nhanh biết mấy, em nhớ để dành trong đời mình những khoảng lặng thời gian cho sự đợi chờ. Không chỉ như chờ đèn xanh bật sáng ở ngã tư, mà như chờ rượu chín rồi hãy uống.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/0f223cf6c110aa66cd06225c233c0295/tumblr_nby9wkNdSs1sxnbwko1_1280.jpg","Ceci: Anh có thể tiết lộ một bí mật của mình cho mọi người biết không?\n" +
                "Donghae: Bí mật không thể bật mí, sao tôi kể được chứ. Nhưng thật ra tôi cũng chả có bí mật gì vì cái gì tôi cũng kể hết cho Eunhyuk nghe rồi.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/9da01ce1187c5e9372cc20f8aee45be5/tumblr_nbya33p9aZ1sxnbwko1_1280.jpg","“Học hành như cá kho tiêu, kho nhiều thì mặn học nhiều thì ngu.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/c3d9f9ebde3b7ed39eebc2d8f2006234/tumblr_nbyadl59Vn1sxnbwko1_1280.jpg","“Cảm ơn đời mỗi sáng mai thức dậy. Ta thấy mình vẫn còn sống nhăn răng.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/0d408638893e872ae94bba62de7ded6e/tumblr_nc04cvqknc1thiwtjo1_1280.jpg","“Đào sâu vị trí của mình trong lòng một ai đó, những điều bạn nhận được đôi khi là thất vọng nhiều hơn niềm vui.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/8572372542d9657dd0e2b9f6822672cf/tumblr_nbyaenovCk1sxnbwko1_r1_1280.png","“Hạnh phúc như chiếc khuy rơi xuống ghế xô pha —khi để tâm tìm kiếm nó, thì lại không tìm ra, khi lãng quên mất nó, thì nó lại xuất hiện trước mắt.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/437f873157ea628e4eb31d60535c2300/tumblr_n11ekbnKrd1sxnbwko1_1280.png","“Lý do cho việc thích đi học :\n" +
                "Một là có rất nhiều bạn, có nhiều bạn thì có thể rủ chúng nó chơi đủ trò hoặc thậm chí trốn học tập thể.\n" +
                "Hai là đi học mới biết chữ. Biết chữ mới có thể đọc truyện tranh.\n" +
                "Hết rồi, thực sự chỉ có bấy nhiêu lý do thôi. Nếu có được thêm lý do nào chứng minh việc học rất hay và bổ ích, thì đó là của bố mẹ tôi, chứ không phải tự tôi thấy thế.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/edf7dff9277b882620f5db70cc1598ae/tumblr_nbyb1pbhGt1thiwtjo1_1280.jpg"," “Trong đêm tối, tôi thích hồi tưởng lại những chuyện chôn sâu tận đáy lòng, những thứ đã từng có được, từng đánh mất, từng vui, rồi cũng từng buồn. \n" +
                "Tôi cũng đã quen với chuyện chỉ có một mình, một mình uống trà, một mình ca hát, một mình dạo phố… Nếu có thêm một người bên cạnh, chỉ là thêm một chỗ ngồi, người ấy cũng chỉ mang đến cho tôi những thứ như thế thôi. \n" +
                "Tôi không cao ngạọ, cũng không liều lĩnh, chỉ là tôi không thích ỷ lại vào người khác.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/be5d7fd3cd6b364bd255327fd4608bee/tumblr_n5tblfQB8I1sxnbwko1_1280.png","“Ở đây, tôi muốn nói, với trẻ con, đi học giống như uống sữa và đi chơi giống như uống Coca vậy. Ai cũng hiểu đi học là tốt nhưng mấy ai thích.Mà nếu thích cũng ở mức vừa phải thôi, chứ không thể thích nổi khi bị nhồi nhét. Sữa sẽ ngon nếu một tuần chỉ uống chừng ba hộp thôi, đi học sẽ vui nếu một tuần đi chừng ba buổi thôi, và một năm nên nghỉ hè chừng chín tháng.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/7792b1888a2ba7388356c0eda4ea2129/tumblr_n8m1evKUJq1sxnbwko1_1280.png","“Ngôi trường bạn học, danh phận bạn mang chẳng có nghĩa lý gì cả. Như một con cá dù sống ở nước đục hay trong… miễn là vẫn tiếp tục bơi tới trước, thì nó chắc chắn sẽ lột xác và trưởng thành.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/52d5fc9dd2d9501541671be58f893fa8/tumblr_nby8euqIh01thiwtjo1_1280.jpg","“Trước đây tôi đã từng chờ, sau dần dần hiểu ra, tình yêu không phải yêu đủ sâu chờ đủ lâu thì sẽ được báo đáp.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/3f4059f7ec6ad82612887bb90b6b7073/tumblr_nbya0rpdvu1sxnbwko1_1280.jpg","“Sông có thể cạn, núi có thể mòn…\n" +
                "Nhưng những người lùn không bao giờ cao lên được.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/d3e1c9f0dfa9482e25b6a9c62d8d4ab0/tumblr_nbxvopYD3L1sxnbwko1_1280.jpg","“Khi không còn những thằng như tao! Ai sẽ cần đến mày chứ người hùng?”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/819c6fc552151f1ec6d97aa3bab15549/tumblr_nbya058GyJ1sxnbwko1_1280.jpg","“Nếu bạn cảm thấy cuộc sống của mình không có lối thoát và không cảm nhận đâu là hạnh phúc. Hãy dần dần bắt đầu và cố gắng từ bỏ những thói quen cũng như một vài người nào đó ra khỏi cuộc sống của bạn.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/6f3975bab261db12c40ef7002b74a842/tumblr_nbuefxetSN1sxnbwko1_1280.jpg","“Cậu không nói dối, cậu chỉ nói trước sự thật thôi.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/052d44eec523e2ffd31219836cef7d16/tumblr_nbueem4omw1sxnbwko1_1280.jpg","“Để yêu một người đã khó, để đá nó càng khó hơn.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/c3815ab88c1f83cf843a98e1f326f109/tumblr_nbwcpvx85K1sxnbwko1_1280.jpg","“Anh muốn làm em cười, nhưng anh không biết phải làm gì để em cười. Anh muốn ôm em, nhưng anh không thể. Trông anh không còn quyến rũ nữa rồi, phải không?” "));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/09e5d2b41e5e1671148ee71cfb49f603/tumblr_nbxh2tOTLY1sxnbwko1_1280.jpg","“Không có gì vui hơn khi bỗng dưng tìm thấy tiền trong túi quần lâu rồi không mặc.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/cddc12ef1d0926455880815917ec04d4/tumblr_nbw86kPPBA1thiwtjo1_1280.jpg","“Có khi nào chúng ta cũng quên luôn rằng bản thân chúng ta mới cần phải trân trọng nhất hay chưa? Đợi chờ lâu như vậy, đến bản thân mình còn không trân trọng thì hy vọng ai sẽ trân trọng chúng ta. \n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/4e7d45049a978df82810d13be0e4b175/tumblr_nbueo5AdO21thiwtjo1_1280.jpg","“Năm hai mươi tuổi tôi hoang tưởng\n" +
                "Đem hết yêu thương gửi nắng vàng\n" +
                "Chiều muộn cuống cuồng tôi đòi lại\n" +
                "Nắng tắt mặc tôi đứng bẽ bàng.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/63fe2013ae39688dab130a86a8f44135/tumblr_nbr2ottfZu1sxnbwko1_1280.jpg","“Enjoy your youth. You’ll never be younger than you are at this momment.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/34c5161e9e96c8ab348cd57ff3277241/tumblr_nbr2s22XwK1sxnbwko1_r1_1280.png","“Con người sinh ra không ai đã sẵn biết mình mạnh mẽ, chỉ khi trải qua những thất bại, những vấp ngã người ta mới học cách trở nên mạnh mẽ hơn. Đừng nhìn vào một người con gái mạnh mẽ và phán xét rằng họ lạnh lùng hay đáng sợ, bởi vì những người con gái ấy mới chính là những người dễ bị tổn thương, cũng như nếm trải qua tổn thương mới mạnh mẽ đứng dậy mà bước tiếp…”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/fa06f35331809970f63719433564bb2e/tumblr_nbr2npYmED1sxnbwko1_1280.jpg","“- Tối qua mình đã mơ thấy cậu đấy.\n" +
                "- Aaa thiệt hả?\n" +
                "- Ừ, lúc đó cậu chết mất tiêu.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/d2275361fbf9fb53c96ce7242283bafc/tumblr_nbr2koRGBi1sxnbwko1_1280.jpg","“Nếu phân ly là khổ, bạn sẽ mang phân ly thổ lộ cùng ai?\n" +
                "Nếu hứa hẹn là khổ, tình thật thà nên ngỏ với người chăng?\n" +
                "Nếu si mê là khổ, lẽ nào yêu là lầm lạc?\n" +
                "Nếu yêu nhau là khổ, trên thế gian nào biết tìm đâu chân tình?”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/c1c275b4ac9088bb373fe543efa4223d/tumblr_nbubylXfU01sxnbwko1_r1_1280.png","“1. Nếu họ chê bai rằng cái váy của bạn không đẹp, chiều cao của bạn khiêm tốn quá, gương mặt bạn trang điểm kém xinh, mũi bạn thấp lè tè… vân vân và vân vân mà mục đích là \"đâm chọt” nhiều hơn góp ý xây dựng thì bạn đừng vội buồn. Họ khó chịu với những thứ trái nghịch với mắt họ thì đó là chuyện của họ, không phải chuyện của bạn. Việc của bạn là tự tin vào chính mình!\n" +
                "\n" +
                "2. Với những kẻ chuyên đi nói xấu sau lưng bạn, đâm bị thóc chọc bị gạo khi bạn không có mặt thì hãy mỉm cười và “bơ” chúng đi nào. Cả đời họ chỉ có thể đứng sau lưng bạn mà thôi.\n" +
                "\n" +
                "3. Rồi sẽ có lúc bạn bị chính bạn bè của mình phản bội, làm tổn thương. Đừng dằn vặt, dù có tiếp tục trở lại làm bạn hay không thì cũng hãy cố gắng tha thứ cho họ. Tha thứ không phải để trở nên vĩ đại, mà là để hạnh phúc hơn. Việc bạn dằn vặt, mắng chửi, thù ghét người khác cũng đồng thời gây tổn thương cho chính bạn.\n" +
                "\n" +
                "4. Tập sống thật với chính mình. Vui thì cười, buồn thì khóc, thương ai đó thì nói cho họ nghe, ghét ai đó thì góp ý để họ trở nên đáng yêu hơn. Đừng giữ buồn phiền trong lòng quá lâu kẻo bị “ung thư tâm hồn” nha các ấy!\n" +
                "\n" +
                "5. Cuộc sống không phải lúc nào cũng êm đềm. Những kẻ không ưa bạn sẽ chực chờ sơ hở để làm bạn buồn, bạn khóc, bạn tổn thương và mục đích là khiến bạn không gượng dậy được. Đó là những lúc bạn cần mạnh mẽ hơn bao giờ hết. Nếu người ta làm bạn buồn 1, hãy tự tạo niềm vui cho mình gấp 10 lần như thế. Chỉ có niềm vui, sự hạnh phúc và cuộc đời rộn rã tiếng cười của bạn mới là cách “trả thù” tốt nhất.\n" +
                "\n" +
                "6. Cách tốt nhất để kết thúc một cuộc tranh cãi là im lặng. Nếu cả hai cùng gân cổ lên để cãi như hai chiếc loa phát thanh, không ai nhường ai thì câu chuyện sẽ kết thúc một cách rất tồi tệ, tình cảm sẽ sứt mẻ. Hãy thử im lặng nghe họ trút hết bực dọc trước. Bạn sẽ có thời gian để suy nghĩ ai đúng ai sai và giải quyết mâu thuẫn êm thắm hơn hẳn.\n" +
                "\n" +
                "7. Trong cuộc đời của mỗi người, có 4 từ được nói nhiều nhất: Xin chào, Tạm biệt, Cám ơn và Xin lỗi. Hãy nói xin chào với những người bạn mới, những điều tốt đẹp. Nói Tạm biệt với những mối quan hệ xấu, những điều không vui. Hãy cám ơn những người, những điều khiến bạn hạnh phúc. Và, hãy gạt bỏ tự ái để có thể nói xin lỗi một cách chân thành nếu bạn cảm thấy có lỗi.“"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/8b21a257101db3c18efe0d8c58fb2132/tumblr_nbuel61klH1thiwtjo1_r1_1280.png","“I sometimes think that I don’t have purpose in this world.\n" +
                "I am simply useless and wandering.”\n"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/4b88482b954ab7a1df4255b7e4352706/tumblr_nbtyb2QPYq1sxnbwko1_1280.jpg","“Rốt cuộc thì chúng ta học cách mỉm cười đến nỗi trở thành một người không dám khóc.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/3c45eb96eaf186d41046e4bb7753ac06/tumblr_nbr2h08Js31sxnbwko1_1280.jpg","“Tiền không thành vấn đề, vấn đề là không có tiền.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/dae2feabaf3aa92da61f3f75b798bbeb/tumblr_nbqmrhMU6X1sxnbwko1_1280.jpg","“Vì sao bạn chưa tìm thấy Mr/Ms. Right của mình? Nhiều khả năng là vì chính bạn cũng chưa tìm thấy mình. Đó là lý do vì sao ở tuổi mười lăm thường có nhiều chàng trai yêu thích chỉ một cô gái, hoặc quá nhiều các cô gái yêu thích chỉ một chàng trai. Và vì sao những mối tình đầu thường hay tan vỡ. Người ta bảo không nên lao vào tình yêu khi còn quá trẻ, vì nhiều lý do, và lý do chính đáng nhất, theo tôi, là khi đó ta chưa định hình được bản thân: “ta là ai?”, “ta muốn gì?”. Ta không thể biết mình cần gì khi chưa xác định được điều mình thiếu…”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/d536697577770483e43a13806a18be3c/tumblr_nbq9flzDii1sxnbwko1_1280.jpg","“Có một số thứ không thể nào có được, chỉ có thể từ bỏ. \n" +
                "Có một số chuyện đã qua, hạnh phúc hay đau xót, chỉ có thể chôn xuống đáy lòng.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/3c470b0f48dbc62510ce109fa13acfa2/tumblr_nbowvczk6H1sxnbwko1_1280.jpg","“Hãy cho tôi một điểm tựa, tôi mỏi lắm rồi.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/0c1300f697acc409dc680399b65eeb21/tumblr_nbr2j9tYPH1sxnbwko1_1280.jpg","“Điều đáng sợ trong tình yêu không phải là lúc con người ta yêu thương đã mất đi\n" +
                "Mà chính là tình yêu ấy không hề giống như ta tưởng tượng\n" +
                "Con người ấy không hề giống như ta vẫn biết\n" +
                "Trái tim ấy không hề giống như trái tim ta nằm bình yên trong ngực.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/05abdff0a5a741ac786bf9dae482771f/tumblr_nbr2hsMQ401sxnbwko1_1280.jpg","“Mất đi một người yêu thương, thế giới chợt vắng hơn”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/7208cfd895c1806cbb659c8e352777e2/tumblr_nblbyxma2p1sxnbwko1_1280.jpg","“Yêu một người là như thế đó, lúc nào cũng muốn người mình yêu được sống tốt, người mình yêu được sống tốt, thì bản thân cũng vui vẻ. Đây chính là điều kỳ diệu của tình yêu, cho dù chịu tội, chịu khổ, nếu như trong lòng đã có hình bóng một người, thì nỗi khổ sáng ngang trời đấy cũng chỉ là một sự giày vò ngọt ngào mà thôi.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/1a55af840f21ba46f258cc0b481b7635/tumblr_nblbbrT1WC1sxnbwko1_1280.jpg","“Tại sao anh lại thích cắt, nghiền, rồi xát muối, rồi đôi lúc lại bỏ đường, bột ngọt và cuối cùng mang trái tim tôi đi chiên là sao?”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/bcc4c1424d5744c95e462be4d7e20893/tumblr_nblakr07Fk1sxnbwko1_1280.jpg","“Có lúc đau khổ chính là một cột mốc phải vượt qua trên con đường trưởng thành của mỗi người.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/d73d9cd8be7d234eb5f42ffc4d581298/tumblr_nblaltABce1sxnbwko1_1280.jpg","“Tại sao không thể nắm tay nhau đi trọn một con đường?”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/0bfff285455bddeb38a20d87e3441077/tumblr_nbla14HwmN1sxnbwko1_1280.jpg"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/d5c36b8fdc23b24c1125167ed6acb557/tumblr_nblcmhP4nT1sxnbwko1_1280.jpg","“Moving on doesn’t mean forgetting. It means you choose happiness over hurt.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/ccf25079b8b1638fb5beaa7ee27019be/tumblr_nblc1zGPR81sxnbwko1_1280.jpg","“Bạn đã từng trải qua thời khắc này chưa? Không biết mình là ai, không biết phía trước là điều gì, hướng ra ngoài thăm dò thế giới, không có kết quả; hướng vào trong thăm dò tâm hồn của mình, cũng không có kết quả. Có người gọi nó là hoang mang, nhưng tôi gọi nó là thống khổ.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/3e1d89f1e558afff8d5a2601cf5e613d/tumblr_nbkzfaYmF01sxnbwko1_1280.jpg","“Em chỉ muốn lắp trong tim một cái công tắc, như vậy khi nào em muốn yêu anh thì yêu. Không muốn yêu anh, thì sẽ không yêu nữa”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/6dca49be48f2771dfb3171e69becfb7b/tumblr_n0l2vkQavY1sxnbwko1_1280.png","“Thì ra làm người ta tổn thương lại khiến người ta càng nghĩ về đối phương nhiều hơn. Vậy nên nếu muốn đối phương không quên được mình thì chỉ cần khiến đối phương tổn thương là được.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/c4fc30635b556f8ab24f92c73ca5a187/tumblr_n54201O9Bt1sxnbwko1_1280.png","“Có người trời sinh ăn nhiều cũng chẳng mập, có người tuy ngày ngày uống nước lã cũng vẫn có thể phát phì.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/38e1b7deb4fded59c295a24789872067/tumblr_nbhajaVGQn1sxnbwko1_1280.jpg","“Khi bạn đau lòng, đừng ngại rơi nước mắt…”"));
        //9 2014
        //8 2014
        arrayList.add(new OPhoto("http://67.media.tumblr.com/0510900fee234982a84b96e3c4e05097/tumblr_nb5in9Vcvt1sxnbwko1_r1_1280.jpg","“We can’t communicate with the public, we have different languages but we’re able to communicate through music.\n" +
                "*Tạm dịch: Chúng tôi không thể trò chuyện với các bạn chỉ vì bất đồng ngôn ngữ, nhưng nhờ âm nhạc mà chúng ta sẽ hiểu được nhau.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/37a44c20785e6a6b8779905727d86bd5/tumblr_nb6082CPgC1sxnbwko1_1280.jpg","“Người sống ở trên đời kiểu gì cũng có thể tiếp tục sống, vì đây là số mệnh.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/c85f35bcccbeec8ae0acf11bbbbb2f84/tumblr_nb5ipkCCwu1sxnbwko1_1280.jpg","“Dù họ có thất bại, tôi nghĩ trong trí óc tôi, họ vẫn luôn giữ được hình ảnh đẹp… Dù là năm hay hai người, họ đã là thần tượng khi tôi còn trẻ, và là biểu tượng của niềm vui và hạnh phúc. Đó là hạnh phúc khi tôi được cười đùa với bạn mình về TVXQ, cùng chia sẻ album của họ, tiết kiệm tiền tiêu vặt để mua album, dán hình của họ trong hộp bút… Có lẽ chỉ cần vậy thôi cũng đủ khiến tôi nghĩ mình nhận được rất nhiều từ năm người họ, và tôi sẽ luôn nghĩ về họ khi tôi trở thành fan của những nghệ sĩ khác. Đừng buồn vì các anh đã bị lãng quên và xóa đi… Hãy cười lên khi nghĩ tới những kỉ niệm ấy…”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/3df113490fe2f6d84d4609f89d31ad6c/tumblr_nb5ii8vMCy1sxnbwko1_1280.jpg","“Nhiều người sợ nỗi buồn. Nhưng tôi không sợ. Tôi chỉ sợ một cuộc sống không buồn không vui, nói chung là nhạt nhẽo. Đôi khi chúng ta cũng cần có nỗi buồn làm bạn, nhất là lúc cuộc sống bỗng dưng trống trải và cảm giác cô độc xâm chiếm ta từng phút.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/d7abbd49cc4a92390eb5c5d565cd38b9/tumblr_nb3ks7Us6o1sxnbwko1_1280.png","“Khi bạn mang trong mình hi vọng, kì tích sẽ xảy ra.“"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/1586156596f3947033ef8fe635a4979d/tumblr_nb5i1r57n61sxnbwko1_1280.jpg","“Bỏ lỡ 1 vở kịch, 1 bộ phim là chuyện bình thường. Nhưng nếu bỏ lỡ nhân duyên thì lại là chuyện lớn, bởi vì nhân duyên thì ảnh hưởng đến cả đời. Gặp sai, chọn sai… thế là bỏ lỡ cả một đời.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/8759747da17280cdcf8ceff1b619ebf5/tumblr_nb5i0iQcOH1sxnbwko1_1280.jpg","“Bạn bè có phúc cùng chia ,có hoạ… trốn sạch ở nơi phương nào?”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/c250ceb35a05da2076cd9a54d113d8d1/tumblr_nb4felRqUv1sxnbwko1_1280.jpg","“Before, we always wanted to win 1st place & get the big awards, but now we’re just happy to promote & work with good people.\n" +
                "\n" +
                "*Tạm dịch: Trước đây chúng tôi luôn muốn là người đứng đầu và giành đươc những giải thưởng lớn, nhưng bây giờ được làm việc và hợp tác cùng những cộng sự tốt mới thật sự là hạnh phúc.“ "));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/7862cc885dae853c9b5f50fe00205223/tumblr_nb44k7YAS81sxnbwko1_1280.jpg","“Khi bạn yêu một người, bạn sẽ tình nguyện hi sinh hạnh phúc của mình, lí trí của mình, linh hồn của mình vì anh ấy. Bởi vì bạn sẽ phát hiện, có những thứ so với lòng tự trọng của bạn càng quan trọng, càng to lớn hơn.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/fe2d13be925c493a8a4ac8e9f6395cd7/tumblr_nb2i3fHdsa1sxnbwko1_1280.jpg","“Học nhiều quên nhiều, học ít quên ít, không học khỏi quên!!!”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/2eed9a629dbf9d964c5bc7c1c45944b4/tumblr_nb3kllRhek1sxnbwko1_1280.jpg","“Quay đầu là bờ mà bơi sang bên kia…. cũng là bờ.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/ac40a4987154a07a4e861018def1432a/tumblr_nb2i2khgHc1sxnbwko1_1280.jpg","“Miệng lưỡi người nào ai quản nổi? Họ nói những gì họ thích và làm những điều họ muốn, chẳng bao giờ quan tâm tới những \"nạn nhân” của “thú vui” ấy, rồi sẽ sống như thế nào đây?“\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/af33844597214aceb78e93b037ad1f4a/tumblr_nb2fxvUksz1sxnbwko1_1280.jpg","“Cậu đừng che giấu vết thương của bản thân. Mình đang dõi theo cậu đó.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/4c94df56bf73df0d07d18a74690d0ace/tumblr_nb2abaLTwo1sxnbwko1_1280.jpg","“Có một ngày nào đó một người hỏi một người thế nào là yêu thương\n" +
                "một người kề sát tim một người và trả lời - Không biết!\n" +
                "Có một ngày nào đó một người hiỏ một người thế nào là hối tiếc\n" +
                "một người nắm lấy tay một người và nói - Đừng bước đi!\n" +
                "Có một ngày nào đó một người hỏi một người thế nào là chia tay?\n" +
                "Và mùa đông ấy trở thành mùa đông ấm nhất…”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/3d4cd1ab175981dbc2872a9537bcc5d5/tumblr_nb24z0F6M51sxnbwko1_1280.jpg","“Cố gắng giải thích với những người không tin mình, chính là tự chà đạp lên tự trọng của bản thân.”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/56c073955471bb1b6890b73d1daadef9/tumblr_nb1y1fftuW1sxnbwko1_1280.jpg","“Sinh mệnh là do suy nghĩ tạo thành. Chẳng có việc gì ép bạn phải không vui hay phiền não, tất cả đều từ chính bản thân mình.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/151e2b16f50ef646f086c2b58d763593/tumblr_nb1tuctlrr1sxnbwko1_1280.jpg","“Lời nói chẳng mất tiền mua, lựa lời mà nói cho đừng đập nhau.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/0a7703a338ae0ed87768afc7835f6c59/tumblr_nb04l0qugr1sxnbwko1_1280.jpg","“Dù đã xảy ra gì thì quá khứ cũng đã là quá khứ, thực sự không cần thiết phải lãng phí thời gian và tâm trạng một cách vô ích.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/a089be48904f479238e47861df97fd2f/tumblr_n5f0lwE12f1sxnbwko1_1280.png","“Đàn ông lúc nào cũng quan niệm \"Đàn bà là ở trong bếp”. Mà quên mất rằng trong bếp toàn để dao\""));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/f440d774fb2ec3903b14c7a5507194b0/tumblr_n0l6eo5WHo1sxnbwko1_1280.png","“Hôn nhân là một cuốn tiểu thuyết mà nhân vật chính đã chết ngay từ chương đầu.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/481feacd8fbde25f655f26e79ae5b77f/tumblr_n0l0emrcpU1sxnbwko1_1280.png","“Từng có một khoảnh khắc tôi hy vọng thời gian mãi mãi ngừng trôi. Đó chính là khoảnh khắc mà người tôi yêu gần kề với cái chết.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/27f0f18c0f3e4133234f0bda06ebdfce/tumblr_n1fke4jwTX1sxnbwko1_1280.png","“Khói thuốc là thứ độc hại. Cả thế giới đều biết rõ điều đó. Tình yêu cũng là một thứ độc hại. Hai phần ba thế giới có đôi ba lần trong đời nghĩ đến điều đó. Nhưng thuốc lá vẫn bán chạy dù có tăng giá. Và ai ai cũng muốn được đắm đuối yêu đương.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/d1bc75967e6a1769822af92b86aa314c/tumblr_n1hhzpfxeG1sxnbwko1_1280.png","“Behind my smile is everything you’ll never understand”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/88f7ee027c97d1d0c57f9264fac79155/tumblr_n0topfvGMb1sxnbwko1_1280.png","“Có những người mà sự tồn tại của họ giống như không khí, êm dịu, nhẹ nhàng, chỉ khi họ mất đi người ta mới nhận ra họ quan trọng nhường nào. Mình muốn trở thành một sự tồn tại như thế.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/57e964193d2121e6a4f53a70a953ead6/tumblr_nax9oiG3TR1sxnbwko1_1280.jpg","“Có những thứ sẽ không bao giờ quay trở lại cho dù ngươi có nỗ lực thế nào đi chăng nữa, và cũng có những cảm giác tuyệt vọng mà ngươi vĩnh viễn sẽ không bao giờ có thể rũ bỏ”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/c82c459802161fd8c3aff1f97380e4e2/tumblr_nayvosszLf1sxnbwko1_1280.jpg","“3 điều tui học được từ thời đi học: nhắn tin không cần nhìn, ngủ không ai biết và làm việc nhóm khi kiểm tra.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/b0dce1943c50c22e6635cdebae5168cc/tumblr_nayvlbxQrv1sxnbwko1_1280.jpg","“Sau này tôi mới biêt bọn con gái khi buồn khổ thường ăn nhiều. Có đứa nhờ thất tình mà mập lên. Có vẻ như khi không còn dịp nói những lời yêu thương, cái miệng đã hồn nhiên quay lại với chức năng nhai và nuốt. Nhiều cô bạn vừa ly hôn nói với tôi: Ăn vậy thôi, chẳng thấy ngon lành gì, nhưng cơ thể cứ đòi hỏi phải ăn. Hay thức ăn là thứ có thể lấp đầy nỗi buồn chăng?”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/a83215bb4ce52b0830137120a3437489/tumblr_naynvhDGXV1thiwtjo1_1280.jpg","“Người ta không thất bại vì lựa chọn sai mà thất bại vì phân vân không đúng lúc.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/8e66ef99ea3254596de034f9f5c65600/tumblr_nax9ejbNnx1sxnbwko1_1280.jpg","“Thật khó mà tin ai đó khi không biết người đó thật sự là ai.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/8eafcb3faac7fe4f18e16a870d10d3ab/tumblr_nax9kzHMLy1sxnbwko1_1280.png","“Không cần biết chúng ta ở xa nhau thể nào. Thứ tình yêu tớ cảm nhận được vào ngày hôm ấy. Tớ sẽ không bao giờ quên.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/d219ad79d4570d8e960d448e9f62377a/tumblr_nayei1MHOy1sxnbwko1_1280.jpg","“Con trai thường thì hôm qua nói có nhưng hôm nay lại bảo không có. Nhưng vấn đề ở đây là cả 2 lời nói đó đều là lời thật lòng.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/f970a6d1e76c70e2f3faa85e4f4344e3/tumblr_nax993BXrZ1sxnbwko1_1280.jpg","“Khi thật lòng yêu thích ai đó, lòng tham của chúng ta sẽ không ngừng lớn dần lớn dần. Đến nỗi, một phút, một giờ, một ngày, một tuần, một tháng, một năm, rồi cả một đời ở bên cạnh đối phương cũng vĩnh viễn không cho là đủ. \n" +
                "Mãi mãi, là khi yêu đến không thể yêu hơn, một ai đó, thực lòng.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/d930077dbf392d325b4030a2095efc60/tumblr_nax946eXV81sxnbwko1_1280.jpg","“Nhìn lên thì chẳng bằng ai, nhìn xuống thì chẳng ai thèm nhìn mình.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/2b34a69a4740eb3afc2997ca9ef2dcbe/tumblr_nax8yrXfsU1sxnbwko1_1280.jpg","“Chỉ cần nhờ giúp đỡ được một lần thì sẽ có lần hai, lần ba, tiếp tục cầu cạnh, nhờ vả người khác. Đây chính là con người ta ở đời. Và còn nữa, “ngày nào đó sẽ báo đáp” ư, không có đâu. Đời không dài đến thế, để cho con người ta đủ hiểu chuyện!”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/7b3106b23b612709190cac9a7f32b46b/tumblr_nawwm3Lz281sxnbwko1_1280.jpg","“Mất ngủ cũng có cái thú vui của nó đấy. Đêm lạ lắm. Nó chỉ là khoảnh khắc vụt qua đối với những người ngủ sớm, nhưng dài như cả một cuộc đời đối với những người thức trắng. Không ngủ, tôi thấy mình được thêm nhiều thứ.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/d44c99386610d4e4c613bb3b8f241486/tumblr_n1m3ur7JcP1sxnbwko1_1280.png","“Bản thân vốn mang tâm trạng nhuốm màu cô đơn thì cảnh sắc dù là ở nơi đâu cũng đều như nhau cả.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/33570cdfb84d9c651c9c49687d2aac5e/tumblr_n1hye8CicO1sxnbwko1_1280.png","“Có hạnh phúc nào giá rẻ đâu em!”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/e495d427ba0027b66b902ff9156c57f1/tumblr_n1hpgnzcsI1sxnbwko1_1280.png","“Chuyện đau khổ nhất ở đại học, là điểm danh mà lại không đi, càng đau khổ hơn, là đi học mà lại không điểm danh.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/cae33c23d2b368c192618e4fb6b0b970/tumblr_n4c8xdYV681sxnbwko1_1280.png","“Vất vả 5 năm tiểu học, cần cù 4 năm cơ sở, quên ăn quên ngủ 3 năm trung học, vào trường thì cố gắng lấy được cái bằng đại học, giờ bằng đại học là cái quái gì chứ? Lơ mơ học hành 4 năm, lấy chứng nhận tiếng anh cấp 4, chứng nhận tin học, có bằng tốt nghiệp, giấy chứng nhận học vị nhưng chẳng thể tìm được công việc như ý, thậm chí có người còn không tìm được việc, vừa tốt nghiệp thì thất nghiệp. 4 năm trời cầm trong tay vài cái bằng, cảm giác như bị lừa vậy, sinh viên bây giờ đáng mấy đồng chứ?”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/6dc69e916100cc0cec57c52242d048ce/tumblr_navdqfVEtC1sxnbwko1_1280.jpg","“Even when I’m missing home, all I can do is miss.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/c3dad027277ec52b849d3ee842ac1462/tumblr_navdh6MipV1sxnbwko1_1280.jpg","“Phép màu không đến tự nhiên, nó chỉ là thành quả của nỗ lực. Kể cả mà đêm bao phủ, giấc mơ đẹp vẫn hiện hữu”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/5d8bdf4764615fef69c1ffc5da174fac/tumblr_nawlyoE4As1thiwtjo1_1280.jpg"," ”Nếu như một người chỉ đi giật lùi thì có thể khiến thời gian quay trở lại được không?\n" +
                "Nếu như thời gian quay ngược trở lại, bạn muốn quay về năm nào?”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/26f62f3c2c87b565aa354c73229e8004/tumblr_nawcbjwJGg1sxnbwko1_1280.jpg"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/cab99a0ede24b2863326b7834a19d639/tumblr_naqz22SP9v1sxnbwko1_1280.jpg"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/bbd6aef9b76465514b3de43da3e41e25/tumblr_nauk5m7omF1sxnbwko1_1280.jpg","“Bạn bè có cãi nhau mới là bạn bè tốt.\n" +
                "Giận nhau nhưng vẫn không đánh mất đi tình bạn đó mới chính là bạn bè thực sự.”\n"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/1aa2f13c15f2d4985dc09cacbd8b9e3f/tumblr_naqyv8cXDE1sxnbwko1_1280.jpg","“Trên thế gian ai là người giỏi toán\n" +
                "Giải giùm tôi bài toán của lòng anh\n" +
                "Giả thiết rằng tôi rất yêu anh ấy\n" +
                "Chứng minh rằng anh ấy cũng yêu tôi.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/cd3565ffe2188c769d4998bd6b1ba17c/tumblr_naps5b5lnt1sxnbwko1_1280.jpg","“Không có gì đau khổ bằng đi tìm điện thoại khi nó ở trong chế độ im lặng.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/3d6a0f34ce8362c08ff22ca7a938935f/tumblr_naujtp1plU1sxnbwko1_1280.jpg","“Tớ chẳng thể hứa là cậu sẽ có cơ hội nếu không từ bỏ, nhưng nếu cậu từ bỏ, thì tất cả sẽ kết thúc!”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/53d7cc968200c95245ba491de47338dc/tumblr_narneyaNxW1thiwtjo1_1280.jpg","“Có lẽ con người luôn có một chuyện gì đó dù có muốn quên cũng không thể quên được.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/406051f22cb675e38f514f592e21c77d/tumblr_napsnnQrXO1sxnbwko1_1280.jpg","“Anh muốn trở thành bầu trời. Không phải dòng sông mà là bầu trời cao xanh. Có như thế thì lúc nào anh cũng biết em đang ở nơi đâu. Nếu có ai tổn thương em, anh bay đến và giải quyết hắn. Anh có thể bảo vệ em.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/f50abfefce048f619b4d0dc4e4821254/tumblr_napshr4c6w1sxnbwko1_1280.jpg","“Chúng tôi có chung một ước mơ, có sân khấu của riêng mình, và có thể hát những ca khúc của chính mình.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/f016af4265fc19c597dbf9f5adee9cc0/tumblr_napsh2hAUT1sxnbwko1_1280.jpg","“Tôi đang mơ dù đôi mắt vẫn mở. Tôi dành hết sức trẻ của mình cho con đường thành công.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/2904429780664d7f53b6a8ededd4f5fd/tumblr_napsdbMrkz1sxnbwko1_1280.jpg","“Khi bạn mang một chiếc mặt nạ quá lâu, bạn quên đi chính bạn là ai dưới nó.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/32893cb7332317c71a4be589f8c6020a/tumblr_naqyt3FFkz1sxnbwko1_1280.jpg","“Hôm nay, chúng ta đi đăng kí kết hôn thế nào?”\n" +
                "“…Nếu em nhất định phải kết hôn thì anh không có ý kiến.”\n" +
                "“Qua loa như vậy à? Không quỳ chân sau gì gì đó à?”\n" +
                "“Người ta chỉ có một chân…em thông cảm chút đi mà.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/82efaae3a56f4f05ba80bd97cd6e5101/tumblr_naps8dmR9i1sxnbwko1_r1_1280.jpg","“Một phút dài bao lâu?\n" +
                "Đứng chờ ở nhà vệ sinh thì biết!”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/2904429780664d7f53b6a8ededd4f5fd/tumblr_napsdbMrkz1sxnbwko1_1280.jpg","“Khi bạn mang một chiếc mặt nạ quá lâu, bạn quên đi chính bạn là ai dưới nó.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/79f9700e607780e6133fcd3db1ad2bf5/tumblr_nasptzu4KH1thiwtjo1_1280.jpg","Chờ đợi không đáng sợ. Cái đáng sợ nhất chính là không biết phải chờ đến bao giờ."));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/659d301c4d3d2762bea34aac96d526be/tumblr_napq6b5sQ31sxnbwko1_1280.jpg","“Người ta nói nỗi buồn, niềm đau chính là giai điệu với người nghệ sĩ nhưng ta hi vọng nàng sẽ lấy tình yêu và sự chân thành làm giai điệu của chính mình.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/45a9c3433084bb69ada2a66324ec16c6/tumblr_nar6zpgbaE1sxnbwko1_1280.jpg","“This is how I’m gonna remember you. Pink cheeks, two left feet, heartbeat\" "));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/1268df189f44919ee5503389653276f3/tumblr_nappckB25H1sxnbwko1_1280.jpg","“Kết cục của sự phản bội chính là sự phản bội lớn hơn thế nữa!”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/52af829b81f6ba4c31f202aadebe8046/tumblr_napp9y0t6F1sxnbwko1_1280.jpg","“Đừng bao giờ yêu một người đối xử với bạn như những người bình thường khác.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/7c05fb4adf1e6ca34638f11f37de3c52/tumblr_napp72lwc41sxnbwko1_1280.jpg","“Tình yêu là một cuộc rượt bắt nhưng trong nhiều trường hợp ta cố rượt theo người này nhưng rốt cuộc lại bắt được người khác.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/7d2f4f059cc9663aff075db7cdd92f53/tumblr_napovq47cv1thiwtjo1_1280.jpg","Có những người, từng giờ bạn đều mong mình nhanh chóng quên họ đi, nhưng lại cầu mong họ đừng bao giờ quên bạn"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/89a6235d07ecf1210af29c79fd5b7726/tumblr_napozyi0rV1sxnbwko1_1280.jpg","“Tôi rất muốn mua một chiếc máy ảnh, loại bình thường thôi, dẫu sao cũng chỉ để ghi dấu lại những cảm xúc thoáng qua trong cuộc đời này. Nhưng rồi điều đó không bao giờ đến, bởi tôi biết điều đẹp nhất sẽ đọng lại trong chúng ta, dù có được ghi dấu lại thành hình ảnh hay không. Chiếc máy ảnh là không cần thiết để lưu nhớ những điều đẹp không tên. Tôi chỉ còn muốn vui mỗi ngày. Mỗi ngày một niềm vui nho nhỏ, đủ để mỉm cười, đủ để thấy ngày hôm nay sống đáng. Và để thấy dẫu mỗi người bạn sẽ qua đi, thì vẫn còn một dư âm ở lại, vang vọng như những tiếng gọi của thời gian, khắc họa chính mình.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/d9e0e9b2ac2e13ec867b3697f0b228db/tumblr_nanwbfQpd31sxnbwko1_1280.png","“Everyday I try to look my past\n" +
                "Even though inside I’m such a mess\n" +
                "Why do I always feel invisible?”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/35d0a84f182aa989039e469538a61aee/tumblr_nanwmgJOTA1sxnbwko1_1280.png","“If we go to war, we could lose all we’ve built. Home. Family. Future.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/5ca4c30187309af2d35c5d44f04bf379/tumblr_nanwrtjxbb1sxnbwko1_1280.png","“Đừng khóc một cách đáng xấu hổ như thế, khóc cũng chẳng được gì. Thế giới này chẳng đối xử tốt với ai cả.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/7ecb31471e1f110c69b98382987b3d1c/tumblr_nap08xkEYF1thiwtjo1_1280.jpg","Nếu không thể ở bên, chi bằng tạm biệt vĩnh viễn."));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/23888845fd01434d459adda4cc8f26e0/tumblr_naotlqHUxq1thiwtjo1_1280.jpg","“Stress (xì trét/danh từ)\n" +
                "Trạng thái rối loạn tinh thần mà bạn thậm chí có thể tát vỡ mồm người mà mình yêu thương nhất khi nó cứ lảm nhảm mấy chuyện nhảm nhí bên tai bạn.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/540988a5040f4200aa168a9446ebf1a5/tumblr_nanz2fYPF81thiwtjo1_1280.jpg","“Tất cả chúng ta đều thay đổi. Chỉ là nhanh đến chóng mặt hoặc chậm đến mức không nhận ra. \n" +
                "Ai rồi cũng khác.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/08d443256e7e034171d09ebd917f71d1/tumblr_nanwokHIiq1sxnbwko1_1280.png","“Chỉ cần ngươi ở trước mặt ta, chỉ cần trong mắt ta có ngươi, thế là đủ rồi. Đủ để ta vứt bỏ mọi thứ vì ngươi, đủ để ta cùng ngươi đi đến sông cạn đá mòn.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/87dd1385ebef85b183ead30e45f9944c/tumblr_nalzplY4kI1sxnbwko1_1280.jpg","“Đôi khi ta tránh làm người mình yêu tổn thương theo cách khiến họ tổn thương nhất. Đó là im lặng.“"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/1c40dc2f33eac97e46cf935d717e2ba0/tumblr_nan9uz8usf1sxnbwko1_1280.png","“Bố ở đây cả đời cũng không sao. Chỉ cần con đến thăm bố là được mà. Con sẽ không giận đâu, bố đừng đi đến nơi tốt đẹp đó.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/71c3c567c2bb7b7a9d0f58f1ec18dbe7/tumblr_nam0xr2dw01sxnbwko1_1280.png","“Nhưng nếu cậu thật lòng thích một người, cứ giữ mãi trong lòng như thế, có chịu được không?”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/b7e1e1dceffdf2cac9b5baad1b59fa1c/tumblr_nam10o25H51sxnbwko1_1280.png","“Hôm nay đẹp trời ,không bằng em gả cho anh đi.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/c48de962129a37c54f2bbf73b4c54b11/tumblr_nama75aKi11thiwtjo1_1280.jpg"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/9d74ababdbbcd38306b6bb1170b43c7f/tumblr_nam15uzGjT1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/56425e9507bb5f63f6b73283265bf6e7/tumblr_nam05c0PNG1thiwtjo1_1280.png","Một thời vùng vẫy, quằn quại, mình mẩy xác xơ, tim chắp vá, đầu nguội lại, lòng trơ trọi. Một thời từ đau khổ này qua đau khổ kia. Rồi một ngày, bạn thấy mình lớn lên. Và bạn biết ơn tuổi trẻ với những đau khổ ấy biết dường nào.\n" +
                "\n" +
                "Có rất nhiều loại đau khổ, mà để trưởng thành, bạn nhất quyết phải trải qua\n" +
                "\n" +
                "1. Loại đau khổ thấy đấng sinh thành rơi nước mắt\n" +
                "\n" +
                "Bất hiếu là bất nhân. Trên đời này, thứ tình yêu vĩnh viễn, trinh nguyên, cao thượng và vô điều kiện chỉ tồn tại giữa cha mẹ và con cái. Bạn nhất định phải một lần nhói lòng vì làm cha mẹ buồn, xấu hổ khi làm cha mẹ thất vọng. Nhất định phải nếm được vị đắng của giọt mồ hôi rơi xuống từ bờ vai gầy của cha mẹ. Thậm chí, phải dằn vặt bản thân vì chưa làm được gì cho cha mẹ. Nếu lớn lên mà hờ hững với những người vì bạn mà vất vả, vì bạn mà rơi nước mắt, bạn sẽ đánh mất trái tim của mình.\n" +
                "\n" +
                "2. Loại đau khổ bị người yêu hơn cả bản thân phản bội\n" +
                "\n" +
                "Mối tình đầu, mối tình thứ hai, mối tình thứ ba, đơn phương, tay ba, hay vòng vo không dứt, dù là mối tình thế nào, một lần thất tình là cần thiết. Trái tim nếu không biết đau, sao có thể quý trọng hạnh phúc. Cõi lòng nếu không cô đơn, sao có thể biết tin vào sự bền vững, sao đôi chân có thể dừng lại, sao có thể biết đến thế nào là giá trị của sự tin tưởng?\n" +
                "\n" +
                "3. Loại đau khổ lòng tự tôn bị chà đạp, cái tôi bị xé nát\n" +
                "\n" +
                "Tuổi trẻ như gió, chỉ thích bay cao, cái tôi như hổ, không chịu khuất phục thứ gì. Chính vì cái ngạo mạn vô tận của đứa trẻ đang lớn, nên mới cần một lần té thật đau. Trong chuyện tình cảm, học tập, công việc, bạn bè, chúng ta đều vì một chữ ‘sĩ’ mà ít nhiều làm sai, ít nhiều làm đau người khác, làm đau bản thân. Té một thật đau, khóc một lần khô cạn cả lòng, thấy cái tôi của mình bị tổn thương nghiêm trọng, rồi nhận ra mình bé nhỏ lắm, thế giới rộng lớn lắm, nhất định phải biết mình biết ta. Tới một ngày nào đó, có thể cúi đầu nói ra câu em còn kém lắm, xin hãy giúp đỡ”, có thể cảm nhận được sự khiêm tốn hình thành, khi đó, ắt hẳn đã trưởng thành.\n" +
                "\n" +
                "4. Loại đau khổ thấy mình vô dụng, thất bại chồng chất\n" +
                "\n" +
                "Nhìn thấy người khác cứ vượt lên trên, bỏ xa mình một khoảng cách dài, bạn cố chạy theo nhưng chỉ thấy thấy bại, thấy vấp ngã. Bạn hối hận vì ngày đó không cố gắng học tập, hối hận vì ngày đó để cơ hội trôi đi, thất bại vì đã chọn điều này chứ không chọn điều kia. Bạn cảm thấy bản thân chẳng có gì để tự hào.Nhưng một ngày kia bạn cảm thấy mình thất bại quá nhiều, mà vẫn còn chưa bỏ cuộc, thì bạn mạnh mẽ hơn bạn tưởng đấy. Cuộc đời rải đầy hoa hồng thì chẳng có thử thách nào rèn dũa và trao cho bạn cơ hội thể hiện nghị lực cả. Nhìn thấy cuộc đời không dễ dàng mới một lòng phấn đấu. Bạn biết đấy, thành công không dành cho người sớm bỏ cuộc.\n" +
                "\n" +
                "5. Loại đau khổ vì tự ti, quá xấu, quá nghèo, quá ngu\n" +
                "\n" +
                "Ghen tị có thể bào mòn trái tim người ta rất ghê gớm. Bạn sinh ra không được xinh đẹp, không gia thế, không khôn ngoan? Chỉ cần so sánh, ắt sẽ sinh ra đau khổ. Nhưng cuộc đời không phải một cuộc đua, không phải cứ ai bắn phát súng bên tai thì mình phải chạy, ai cũng có cái đích của bản thân, hạnh phúc của người khác chắc gì khiến tim bản thân mình vui? Chẳng ai hoàn hảo, mọi người đều tự sâu bên trong có điều gì đó khiến họ tự ti, thậm chí, càng lớn lên người ta càng có quá nhiều điều để so sánh, càng có nhiều điều để tự ti. Một lần đau khổ một tuổi trẻ vì nghèo, vì xấu, vì ngu rồi, thì hãy hạnh phúc vì những gì mình đang có nhé.\n" +
                "\n" +
                "6. Loại đau khổ không hiểu vì sao mình phải bị sinh ra\n" +
                "\n" +
                "Có tới hàng ngàn người trải qua cảm giác muốn cứa một đường dài vào cổ tay, muốn đẩy cửa nhảy xuống từ tầng lầu cao nhất. Loại đau khổ tột bật thống khổ nhất là cảm thấy không còn thiết sống nữa. Loại đau khổ hình thành khi mọi thứ đã tận, chỉ còn bế tắc. Nhất là tuổi trẻ khám phá ra cuộc đời chỉ là một mớ hỗn độn, rất nhiều người thay vì đối mặt với nó thì lẩn trốn. Nếu bạn đã gặp cảm giác bi thương này thì coi như sẽ chẳng còn thống khổ nào hơn nữa, từ đây, bạn có thể đối mặt với tất cả rồi. Coi như, cuộc đời, dù chỉ là một mớ hỗn độn,vẫn có thể níu chân bạn từ tầng nhà ấy, tình yêu, dù chỉ là cổ tích, vẫn có thể khiến bạn muốn tin thêm lần nữa, thành công, dù xa vời biết bao nhiêu, vẫn có thể khiến bạn muốn thử.\n" +
                "\n" +
                "Ly vỡ tất nhiên không thể lành, nhưng con người không phải thủy tinh, không phải đá, không phải gỗ, con người có sức bền bỉ rất khủng khiếp, tuổi trẻ có thể hồi phục rất mạnh mẽ. Một thời vùng vẫy, quằn quại, mình mẩy xác xơ, tim chắp vá, đầu nguội lạnh, lòng trơ trọi. Một thời từ đau khổ này qua đau khổ kia. Rồi một ngày, bạn thấy mình lớn lên. Và bạn biết ơn tuổi trẻ với những đau khổ ấy biết dường nào.Bạn nhìn thấy mình hôm nay là một phần của hôm qua, và hạnh phúc ươm mầm vì bạn hiểu thế nào là đau khổ. \n" +
                "\n" +
                "Quan trọng là, hãy tin, và hãy yêu."));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/51fdcadc2d61e446f146cf70588a98ef/tumblr_najrz9s0Nf1thiwtjo1_1280.jpg","Có chuyến đi dài hơn đất trời và không thể đến nơi."));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/bffb30406641b04e4b4c661d46e0eb6c/tumblr_naltrmxtNp1sxnbwko1_1280.png","“Dù các bạn là fan, chúng tôi không thể lo cho cuộc đời của các bạn, cũng như các bạn không cần lo cho cuộc đời của chúng tôi. Hãy tự chịu trách nhiệm đối với chính mình. Các bạn chỉ nên coi chúng tôi là một phần của cuộc sống, chứ không phải là tất cả.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/922c82557dbdbbc7d428ccf1e3815f15/tumblr_nak8acqIAU1sxnbwko1_1280.jpg","“Tại sao em lại ghen à? \n" +
                "Vì anh và em đã thôi làm bạn bè từ lâu lắm rồi.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/2d601c6e8b965bcd6e10e2cebae6c453/tumblr_nak88cb1uw1sxnbwko1_1280.png","“Nếu có ai đó đột nhiên không tốt đẹp như những gì bạn vẫn thường nghĩ về họ, thì cũng chưa chắc là họ đã thay đổi,mà có thể là bạn đã đánh giá sai về họ ngay từ đầu, họ vốn chưa bao giờ tử tế.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/aadd710d8e25862aad55a86205418dc1/tumblr_nagpseGudO1thiwtjo1_1280.jpg","Cảm giác không cam tâm nhưng vẫn nén lòng dứt bỏ một người.\n" +
                "Hẳn đau."));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/aaef3894ff219070d98240c7265b2eea/tumblr_nak85mKwoF1sxnbwko1_1280.png","“Tôi sẽ giữ trái tim tôi có từ ngày debut, cho các hoạt động tương lai của mình. Hy vọng rằng mọi người sẽ tin vào những quyết định của chúng tôi, và ủng hộ chúng tôi.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/7a02daf858750d3c3d0b282dd0e49e31/tumblr_nai8uiOtSr1sxnbwko1_1280.png","“Anh dựa vào cái gì mà xông vào thế giới của em? khuấy động tất cả mọi thứ lên, rồi sau đó biến mất không thấy hình bóng. Anh dựa vào cái gì?”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/b8724262f0e79f0bb35426795bd524cf/tumblr_naghkpc9Dd1sxnbwko1_1280.png","“Anh yêu em, đây là quyền lợi của anh, em chỉ có quyền cự tuyệt chứ không có quyền ngăn cấm!”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/7ed869ae97e48101f3f8a5c98126dfdd/tumblr_naghf8FRat1sxnbwko1_1280.png","“Ai rồi chẳng đổi thay\n" +
                "Cỏ xanh thành cỏ dại\n" +
                "Biết chẳng gì mãi mãi\n" +
                "Nhưng dễ gì buông tay…”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/5a5ea5834d2ebf619f57fbf9c9afd0d9/tumblr_naghpgq18j1sxnbwko1_1280.png","“Cuộc đời thì ngắn mà năm tháng dài rộng lại chẳng đợi chờ ai cả, dù bạn không muốn nhưng ngày hôm qua vẫn đi mất rồi. Hãy đứng ở ngày hôm nay, chào tạm biệt ngày hôm qua và chuẩn bị sẵn sàng cho ngày mai!”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/e408fd221e08b04b0e08345616ffc694/tumblr_nagf38Caxr1sxnbwko1_1280.png","“Hình như người đó không hề nhớ đến tôi\n" +
                "Hình như chỉ có một mình tôi đau khổ\n" +
                "Hình như người đó đã hoàn toàn quên rằng\n" +
                "Đã từng có một người như tôi, mà sống rất hạnh phúc.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/b68662e9be61e95c27ac5f99333e5a70/tumblr_nag6oc13yr1thiwtjo1_1280.png","“Nếu phân tích từ góc độ tâm lí học của các em, thì trong quá trình giao tiếp con người sẽ đối diện với ba nỗi sợ lớn là: sợ sự xa lạ, sợ người có địa vị cao và sợ đám đông. Mức độ sợ hãi mỗi người mỗi khác, tùy vào trải nghiệm của từng người, nhưng đều không thể tránh khỏi chúng. Khi các em phỏng vấn xin việc, phỏng vấn khi thi cao học, phỏng vấn khi thi công chức đều bao gồm cả ba nỗi sợ này nên nó mới trở thành trở ngại lớn cho nhiều người như vậy.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/0bd468a20ce4f6a4e5bd486091ec3612/tumblr_nag9xcNzNw1sxnbwko1_1280.png","“Ngốc à, sao phải sợ anh? Cho dù anh giết tất cả mọi người trên thế giới này, anh cũng sẽ không giết em đâu.”"));
        //8 2014
        //7 2014
        arrayList.add(new OPhoto("http://67.media.tumblr.com/250d4431e490df48351647c3859b56ca/tumblr_n9kqs0loFz1sxnbwko1_1280.png","“Mẹ, mẹ đã rời bỏ thế giới này trước con, nhưng mẹ đã ban cho con 8 người chị em . Con muốn cảm ơn mẹ và Thượng đế.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/47bff645c4458f4ca1be38c9ad22034a/tumblr_n9k3q3XL9l1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/9e35be9e61c76ec99c8695db1ead46f0/tumblr_n9kr1t9y1J1sxnbwko1_1280.png","“Tình yêu chỉ đẹp khi mới bắt đầu, còn quá trình duy trì tình cảm đẹp đẽ đó thì sẽ có rất nhiều khó khăn, mãi cho đến khi phát hiện ra sự thật đằng sau lớp vỏ tốt đẹp đó, chính là lúc chia tay.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/f86c6458f1231822fe98841bf100bad7/tumblr_n9kq5i2iys1thiwtjo1_1280.png","“Có những chuyện cũ đã qua không nhất thiết phải kể cho mọi người nghe.\n" +
                "Có những nỗi đau cũng không nhất thiết để mọi người biết.\n" +
                "Có những tâm tình giữ trong lòng, không nhất thiết phải bày tỏ. \n" +
                "Có những tổn thương theo thời gian sẽ dần lành lặn.\n" +
                "Có những thiệt thòi khi đã qua, suy nghĩ thông suốt cũng sẽ trở lại bình thường.\n" +
                "Có những khi đau lòng, nhẫn nhịn vài lần sẽ thành thói quen.\n" +
                "\n" +
                "Thật ra trong cuộc sống, không phải những lúc đau khổ nào cũng có thể la hét, và không phải tình yêu nào cũng đều được thổ lộ.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/abea71aafd54aa5d849842d35b1c8b23/tumblr_n9ke7dMz5J1sxnbwko1_1280.png","“Tôi vốn chỉ là một người bình thường, chẳng qua tôi có một công việc đặc biệt mà thôi. Chính nhờ sự ủng hộ, tình yêu và sự quan tâm của các bạn, tôi mới có thể bước đi trên con đường này.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/69f2a932a9ced06200806a51766095aa/tumblr_n9k3gwZTuv1sxnbwko1_1280.png","“Trên đời ko có nhiều hoàng tử cưỡi bạch mã đến rước chúng ta đi như vậy, cho nên phụ nữ nhất định phải có một đôi giày tốt, để bản thân có thể tự tin bước đi bằng đôi chân của mình.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/5e9e08e7d9fe2ce30d665de4a6771797/tumblr_n9hiqyp88Z1sxnbwko1_1280.png","“I am not crazy! My reality is just different than yours.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/03ede3ab7cc9f1a5a1d7c0bc3dc01ddf/tumblr_n9hikqCFAt1sxnbwko1_1280.png","“Nhận được bao nhiêu thì cho đi bấy nhiêu. Người nào cười với tôi thì tôi cười lại. Ai xúc phạm tôi thì tôi xúc phạm lại”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/f1e73d1914dbdb8c2abb69d4ba3c8d64/tumblr_n9hihl7UmC1sxnbwko1_1280.jpg","“Làm người đừng quá nhạy cảm, suy nghĩ nhiều cũng chỉ làm bản thân tổn thương mà thôi. Người nói vô tâm, người nghe để bụng, một câu nói vô tình cũng làm bản thân nghĩ ngợi quá nhiều thì làm sao mà không phiền chứ. Có rất nhiều chuyện người nói đã sớm quên đi nhưng người nghe thì cứ nhớ hoài.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/9f95e2fe1e06a9591a09311a2769139f/tumblr_n9hdhwrVcf1sxnbwko1_1280.png","“Ta chưa bao giờ ghét bỏ nàng, mà là ta đang nhớ nàng. Ta chưa bao giờ câm hận nàng, chỉ là ta quá yêu nàng sâu đậm mà thôi… “"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/5ab274fad76d904758c6db8a9f07fde7/tumblr_n9h8f9YcPb1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/3439c7fa63d84023e8e0f825dd4b49a8/tumblr_n9h02weeJ01thiwtjo1_r1_1280.jpg","“Ngon hay dở, đẹp hay xấu, xinh hay không xinh, tuyệt vời hay nhảm nhí, sang hay quê, vừa miệng hay không….là các tính từ 100% cảm tính, tức cảm nhận của mỗi cá nhân. Họ có gu thẩm mỹ, văn hóa, giới tính, sự trải nghiệm khác nhau thì sẽ cảm nhận khác nhau. Nên khi tôi nói “ theo ý kiến của riêng tôi”, thì phải được tôn trọng chứ mắc mớ gì cãi lại hay chê bai. Cơ sở nào để mình thì đúng thì người khác thì sai, cơ sở nào cho rằng cảm tính của mình là văn minh còn của người là thấp kém? Còn trích dẫn từ báo chí hay sách vở, thì cũng chỉ là cảm tính của nhà báo đó, quan điểm của tòa soạn đó, của nhà văn đó, của nhà xuất bản đó thôi. Không thể lấy làm chuẩn được.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/e3abc31caf8711d247574d5b94f7cbe8/tumblr_n9gq7in23p1thiwtjo1_1280.png","“Một người yêu bạn hay không bạn có thể tự cảm nhận được. Không cần phải gạt người gạt mình, miễn cưỡng bản thân.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/40fab8b70c2d6cf37c1675e8fd4d993f/tumblr_n9f85chGss1sxnbwko1_1280.png","“Có những ngày buồn hiu như thế\n" +
                "Mưa dầm dề ngoài cửa chẳng thôi\n" +
                "Nằm lăn lóc mặc thời gian trôi\n" +
                "Một mình thôi mà sao buồn thế…”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/6405328012e339096af93c72235da4e6/tumblr_n9giprlGnX1sxnbwko1_1280.png","“Cause you can’t bandage the damage\n" +
                "You never really can fix a heart.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/7158c24b3b107aae81d2ac274cd45517/tumblr_n9fcmrmOcT1sxnbwko1_1280.png","“Ba tháng nghỉ hè đã làm suy giảm trí thông minh của tớ.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/41a9db0e0a3f9f3a2f4b5c29b5515579/tumblr_n9fa6vdo8Z1sxnbwko1_1280.png","“Tôi là một người chỉ sống trong thế giới của riêng mình. Tôi không muốn bước ra ngoài, mà cũng chẳng dám bước ra ngoài. Tôi là một người bên ngoài tỏ ra rất mạnh mẽ, nhưng nội tâm lại rất mềm yếu. Tôi đa sầu đa cảm, nhưng trước mặt người khác lại luôn mỉm cười, khiến ai cũng nghĩ rằng tôi là một cô gái hạnh phúc luôn hiểu thế nào là đủ. Tôi học được cách đối xử tốt với người khác, nhưng lại không học được cách đối xử tốt với chính mình. Tôi học được sự khoan dung, tôi có thể tha thứ cho những người làm tổn thương tôi, nhưng lại chẳng thể tha thứ cho những lỗi lầm đã qua của bản thân.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/6216aa58e1cbe1fe50c6bf4f3eb91cfd/tumblr_n9ezfbrHmF1sxnbwko1_1280.png","“Tất cả những thứ tuyệt diệu nhất đều bắt đầu khi chúng không là gì cả.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/6c06edd8dd03d302555a6b68f10b54bf/tumblr_n9bo7f7Jsy1sxnbwko1_1280.png","“Vì lo lắng cho em nên cảm thấy đau lòng.\n" +
                "Vì không kiềm chế được bản thân nên làm tổn thương lòng tự trọng.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/66d3745f5ebc88b781a22bcbedf28ea8/tumblr_n9bod1WcJz1sxnbwko1_1280.png","“Từ lúc bà ấy mất tích đến giờ, bà có gặp bà ý không?\n" +
                "Mất tích rồi thì gặp sao được?!”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/de8101a252a701ec779e5558f0186ecf/tumblr_n9bohbtdSG1sxnbwko1_1280.png","“Trốn chạy để làm gì? Chẳng phải để người ta tìm kiếm mình ư. Nếu trốn chạy mà không ai tìm kiếm mình thì việc đó cũng chỉ là vô nghĩa mà thôi!”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/02d65c2576a83fd3e57357b9dd3adbf5/tumblr_n0my73v5ex1sxnbwko1_1280.png","“Cách hợp lí nhất để sống trong thế giới này là phá bỏ đi những nguyên tắc.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/604a9de8cd991b2b5b4514944ca19ec6/tumblr_n92mpk6szr1sxnbwko1_1280.jpg"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/b54cf23b397da69b1ac9877957cffbac/tumblr_n0o0tmB2pz1sxnbwko1_1280.png","“Sài Gòn hoa lệ thật! \n" +
                "Hoa cho người giàu và lệ cho người nghèo.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/0969ef529d0a787dcf801ec5a1fbe069/tumblr_n92mlpqqmf1sxnbwko1_1280.jpg","“Bạn hiểu điều ấy không? Bạn gặp một người tuyệt vời ở đời thực, chứ không phải trong sách vở, phim ảnh đâu nhé. Bạn rung động mãnh liệt nhưng hiểu rằng người ấy sẽ không bao giờ là của bạn.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/2d852a309fdd8f761a5116036e78448a/tumblr_n92mfgmb7n1sxnbwko1_1280.png","“Quay đầu lại là hèn nhát. Con người phải nhìn về phía trước.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/3b8aa5fd87dd5f30a6b929d3955f19a8/tumblr_n9620meY5j1sxnbwko1_1280.png","“Điều đó không đẹp sao, khi chúng ta tay trong tay.\n" +
                "Em rất muốn đi, đến thành phố của anh, ngôi nhà của anh va trong vòng tay anh.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/65731c1345794e57f51fdcd0ae3e54b0/tumblr_n95moqLFBK1sxnbwko1_1280.png","“Kể từ khi Ji Hyo trở thành công chúa, trong lòng em đã nghĩ bản thân mình là hoàng tử.”\n"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/988c0036d1d4ee6b2f0b23371a16e025/tumblr_n90wegMM7S1sxnbwko1_1280.png","“Những thứ không nên nghĩ đến thì cũng không nên nghĩ quá nhiều, những thứ không thể có thì cũng đừng đưa tay ra lấy.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/c92d61e295ecb9e26605700bb98089bd/tumblr_n8yzlndjtF1sxnbwko1_1280.png","“Thế giới này thật tàn nhẫn, nhưng cũng thật tươi đẹp.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/4101e2fb38de75b5001bc980a27c9f7f/tumblr_n90w4jHJ3f1sxnbwko1_1280.png","“Dường như lúc nào cô ấy cũng ở bên tôi, nhưng thật ra thì không phải. Cô ấy tự mình bắt đầu cuộc hành trình, và lại quay về bên tôi lúc nào không hay biết. Thế là được rồi, chỉ cần tôi không bị mất dấu cô ấy.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/5c44dd44e68ef0b808f55b4efb8f372a/tumblr_n8v1y3KGlp1sxnbwko1_r1_1280.png","“Cô gái nào phải vật lộn ngoài xã hội đều mơ ước sẽ có được một công việc ổn định, còn có một tình yêu tuy rằng rất bình thường nhưng cũng rất hạnh phúc và cả một tình bạn thật đáng quý nữa.\n" +
                "Nhưng mà, trong số đó tình yêu là thứ không đáng tin nhất. \n" +
                "Bởi vì nó chứa nhiều ảo tưởng nhất.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/1091909aab5470f9718db0ee487cefca/tumblr_n8x3apX9wZ1sxnbwko2_1280.png","“Tình yêu bắt đầu lớn dần trong câu chuyện của đôi ta\n" +
                "Từng chút từng chút một viết lên những chương tình cảm\n" +
                "…\n" +
                "Tình yêu là lời hứa trong gió\n" +
                "Lời đã hứa là mãi mãi\n" +
                "Tuyệt đối sẽ không nuốt lời.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/243bf7e2828b05a26d8311f61e91d01d/tumblr_n8x3g4Isgg1sxnbwko1_1280.png","“Con trai của tôi là phần đẹp nhất và quan trọng nhất của cuộc đời tôi. Đó là danh hiệu đẹp nhất, chiến thắng lớn nhất của tôi.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/fe872cad34e01803a5c6fff0d6224eb1/tumblr_n8wbrgniYi1sxnbwko1_1280.png","“Nắm tay nhau thật chặt, giữ tay nhau thật lâu, hứa với nhau một câu sẽ đi trọn tới cuối con đường.”\n"));
        arrayList.add(new OPhoto("“Nắm tay nhau thật chặt, giữ tay nhau thật lâu, hứa với nhau một câu sẽ đi trọn tới cuối con đường.”\n","“Bạn tốt chỉ là bạn tốt, mãi là bạn tốt, không thể nào chiếm hữu được\n" +
                "Bạn tốt sau khi tình yêu qua đi cũng sẽ chỉ còn một người bước đi vô định, chỉ có thể giữ lại một chút dịu dàng.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/413cc9ee2eb392c1f8c2e15d0570edf9/tumblr_n8ufdyHh0w1sxnbwko1_1280.png","“Nếu cậu thắng, cậu sẽ sống; nếu cậu thua, cậu sẽ chết. Nhưng cậu không thể thắng nếu cậu không đánh.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/d4a9f2d8a6471fe66bc2e56a7eedeffc/tumblr_n8uzm95kPp1sxnbwko1_1280.png","“Tôi đã chạy trốn quá nhiều rồi. Cuối cùng tôi đã tìm được người mà tôi phải bảo vệ…Chính là em đó.”\n"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/2cff8c53c28f83112ab08c0eab6d4c4e/tumblr_n8sjbjB6AN1sxnbwko1_1280.png","“Em có muốn cho tất cả mọi người biết hồ cá này đã bị em bao hết rồi không?”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/dae4ba07b40a8ed58c6ac9f1060a5169/tumblr_n157kgneji1sxnbwko1_1280.png","“Không tiếc nơi gửi mộng, chỉ hận quá vội vàng.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/85e86269dc6ccb511a4e47cf4e253907/tumblr_n16m7oSQoh1sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/cb14c14da41bb60b153e991fef3ed71f/tumblr_n8t1ssxRCZ1sxnbwko1_1280.png","“Có những ngày tôi buồn lắm, chỉ biết ngồi thu lu một xó, không ra ngoài, không nói chuyện. Rồi những ngày ấy, tôi cần lắm một cái ôm, cần lắm một bàn tay, cần lắm một bờ vai cho tôi dựa!”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/e6b9fb49d53b2e2baee5883b180d0b4a/tumblr_n8rds5bizI1sxnbwko1_1280.png","“Bởi vì yêu anh mà rơi vào sự cô đơn.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/d75c22d6749872d7371ccfde787d446a/tumblr_n8psth27Bh1sxnbwko1_1280.png","“Tất cả mọi thứ đều có khả năng tái sử dụng trừ người yêu cũ.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/58b945479c737f1de541dc90fd7b95ac/tumblr_n8owozzpWn1sxnbwko1_1280.png","“Những phút giây khi xưa ngày mình bên nhau, chỉ còn những nỗi đau riêng em một mình cố giấu.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/5496b5f5603a54e14ee81da247eed5a3/tumblr_n8k522L0Lo1sxnbwko1_1280.png","“Dù em ở nơi này thật gần, thật gần bên anh. Vậy mà tại sao, tại sao chúng ta chỉ có thể là bạn? Dù cho những cảm xúc của em đối với anh mạnh mẽ. Làm cách nào em bày tỏ được đây. Anh chẳng hề hiểu rằng em rất yêu anh."));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/ab2f844d72e3abb263da3c0cb9d96fc2/tumblr_n8k4qxpmkf1sxnbwko1_1280.png","“Người cứu bệnh nhân là bác sĩ chứ không phải bệnh viện.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/af38b5de1ce307b7a3af5b3aa87bf2f8/tumblr_n8k4ksn6bA1sxnbwko1_1280.png","“Có một số việc thích hợp để lắng xuống đáy biển hơn là kéo lên để làm sáng tỏ. Bởi vì dù có tìm ra được đáp án cũng không nhất định sẽ khiến chúng ta vui…”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/a1f2f059391ae2aed500213a50a2b5b3/tumblr_n45sn8RVi71sxnbwko1_1280.png"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/3bba7bbac9a8297789c343df0d35d12b/tumblr_n8k54hxLCK1sxnbwko1_1280.png","“I do what I like, I like what I do.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/c8e8587210cd82b339a289410d187f58/tumblr_n8k3vkUS6R1sxnbwko1_1280.png","“Có khi bạn nói với một người rằng bạn sẽ ở bên cạnh người đó cho dù có bất cứ chuyện gì xảy ra nhưng bạn đã quên mất rằng chưa chắc người đó đã cần bạn.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/5c979981575ba970c0d6bf28e9f04e48/tumblr_n8j9ooK8Hp1sxnbwko1_1280.png","“Đừng đổ bất kì một lỗi gì lên tình yêu sau khi chia tay, nó vẫn vẹn nguyên như lúc ban đầu chỉ có lòng người là không còn vẹn nguyên mà thôi.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/0b916c6c4434ed8639f2abb63d515cdf/tumblr_n8lgn2t6di1sxnbwko1_1280.png","“Tình bạn cũng là tình yêu.\" "));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/94b69aed4ac7d6710f0d3cb5327c2977/tumblr_n8j9ph0TAA1sxnbwko1_1280.png","“ETC\n" +
                "End of thinking capacity.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/ddf50b9e15e35823320e18e022e13b44/tumblr_n8ggkzK6gf1sxnbwko1_1280.png","“Không phải vì là đồng đội nên mới hỗ trợ lẫn nhau. Mà vì luôn hỗ trợ lẫn nhau nên chúng ta mới là đồng đội.”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/8614f42805ab5f79c3cd92e1617f2151/tumblr_n8dyndZTjV1sxnbwko1_1280.png","“Có đôi khi, niềm hạnh phúc ào tới quá đột ngột sẽ khiến cho người ta có một cảm giác không thật, khiến người ta thật sự sợ hãi chỉ cần xoay người một cái là hạnh phúc sẽ biến mất.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/b8550ec877e4a53634b3a7a21c50ea5f/tumblr_n8f8yhqLQe1sxnbwko1_1280.png","“Dẫu biết rằng cố ăn là sẽ béo\n" +
                "Nên dặn lòng càng béo lại càng xinh.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/e98d6c72671f483233b3f36121c17d8b/tumblr_n8hf91bybc1sxnbwko1_r1_1280.png","“Có đôi khi đoạn ký ức rất ngắn mà vô cùng rõ ràng, rõ ràng tới mức làm người ta không thể nào trốn được.”"));
        arrayList.add(new OPhoto("http://66.media.tumblr.com/13f899ee7998d11aceb298487ff64072/tumblr_n8awubPOdH1sxnbwko1_1280.png","“Trao nhau một cái nhìn yêu thương, cùng nhau chia sẻ một bữa cơm ấm áp…\n" +
                "với tất cả những khoảnh khắc tràn ngập tình yêu và tiếng cười…bạn sẽ luôn\n" +
                "hạnh phúc với những yêu thương không điều kiện như thế.”"));
        arrayList.add(new OPhoto("http://65.media.tumblr.com/241b08125b82d74121f50892b6cd3a4a/tumblr_n8dyjjxIV91sxnbwko1_1280.png","“Và năm tháng trôi đi, làm sao biết được ai có thể trở thành của ai chứ?”"));
        arrayList.add(new OPhoto("http://67.media.tumblr.com/d0034ac63aa3d40d74f6e387c677c545/tumblr_n8ck5eB7721sxnbwko1_1280.jpg","“Một số quan hệ sẽ hạnh phúc, một số khác sẽ trở thành bài học.”"));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));
        arrayList.add(new OPhoto(""));

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
