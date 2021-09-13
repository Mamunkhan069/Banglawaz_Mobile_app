package com.mamun.banglawaz;

import androidx.annotation.NonNull;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {


    //====================================================================

    private void addVideos(){
        // We will add all videos here

        //Video Details Here Here
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "TWsiLsMNehM");
        hashMap.put("vdo_title", "ডঃ খোন্দকার আব্দুল্লাহ জাহাঙ্গীর এর জীবনী ");
        hashMap.put("vdo_desciption", "ডঃ খোন্দকার আব্দুল্লাহ জাহাঙ্গীর এর জীবনী | Biography Of Dr.Khandaker Abdullah Jahangir In Bangla.");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>

        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "d_zEPKQs_KU");
        hashMap.put("vdo_title", "বাংলাদেশের সর্বকালের সেরা বক্তা!");
        hashMap.put("vdo_desciption", "বাংলাদেশের সর্বকালের সেরা বক্তা! ডাঃ আব্দুল্লাহ জাহাঙ্গীরের জীবন কাহিনী। Dr Abdullah Jahangir");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "fviXH6fJ0mk");
        hashMap.put("vdo_title", "নবর্তমান প্রজন্মের আলেমদের চোখে, কেমন ছিলেন তিনি ");
        hashMap.put("vdo_desciption", "ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর (রাহিমাহুল্লাহ) এর জীবনীর উপর স্মৃতিচারণমূলক আলোচনা। ড. আবু বকর মোহাম্মদ জাকারিয়া, শাইখ হাসান জামিল, শাইখ আলী হাসান তৈয়ব, শাইখ উসামা খোন্দকার, ড. হাফিজ হিজবুল্লাহ, শাইখ মামুনুন হক, শাইখ লাবিব আব্দুল্লাহ, শাইখ গাজী সানাউল্লাহ।");
        arrayList.add(hashMap);



        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "0Ax2XIABqC8");
        hashMap.put("vdo_title", "প্রশ্ন করুন নিজের সংশোধনের জন্য, অন্যের নয়। (প্রশ্নোত্তর পর্ব)");
        hashMap.put("vdo_desciption", "প্রশ্ন করুন নিজের সংশোধনের জন্য, অন্যের নয়। (প্রশ্নোত্তর পর্ব), জীবনঘনিষ্ঠ কিছু প্রশ্নের উত্তর জেনে নিন। ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর (রাহিমাহুল্লাহ)");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>


        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "DrU8E4zCGP8");
        hashMap.put("vdo_title", "প্রচলিত মিলাদের গুপ্ত রহস্য !!");
        hashMap.put("vdo_desciption", "মিলাদ মাহফিলের গুপ্ত রহস্য ! (Milader rohosho)");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>


        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "MuRGaCjUTic");
        hashMap.put("vdo_title", "আমি সূরা পড়তে পারি না আমার সালাত কি কবুল হচ্ছে?");
        hashMap.put("vdo_desciption", "আমি সূরা পড়তে পারি না আমার সালাত কি কবুল হচ্ছে? Ami sura porte partina, amar salat ki kobul hocce?");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>



        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "4-g-H5NcXi8");
        hashMap.put("vdo_title", "পীর ধরা কি ফরয? pir dhora ki foroz?");
        hashMap.put("vdo_desciption", "পীরের হাতে বায়াত না করলে জান্নাতে যাওয়া যাবে না, কথাটা কতটুকু সত্য ? ");
        arrayList.add(hashMap);



        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "AbFUh1UE8TI");
        hashMap.put("vdo_title", "তাকওয়া বৃদ্ধির সবচেয়ে বড় অস্ত্র !!");
        hashMap.put("vdo_desciption", "তাকওয়া বৃদ্ধির উপায় | তাকওয়া বৃদ্ধির সবচেয়ে বড় অস্ত্র !");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        //------------->>>>>>>>>>>>>>>>>

        hashMap.put("vdo_id", "dulqUO2FNp4");
        hashMap.put("vdo_title", "তাওহীদ ও শিরক সম্পর্কে এক অসাধারণ আলোচনা।");
        hashMap.put("vdo_desciption", "এর চেয়ে সহজ করে আর কে বোঝাবে Abdullah Jahangir আপনার দোয়ায় ভাল আছি এই কথা বালাম মানে আপনাকে অপমান করা তাওহীদ ও শিরক সম্পর্কে এক অসাধারণ আলোচনা। এর চেয়ে সহজ করে আর কে বোঝাবে");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "uv9wM5PtrpY");
        hashMap.put("vdo_title", "নামাজ সম্পর্কে শ্রেষ্ঠ আলোচনা ");
        hashMap.put("vdo_desciption", "নামাজ সম্পর্কে শ্রেষ্ঠ আলোচনা || শায়খ ডঃ খন্দকার আবদুল্লাহ জাহাঙ্গীর রহঃ || ");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_W1aa4d2nkc");
        hashMap.put("vdo_title", "হানাফী ও সালাফী সেমিনারে ড. আব্দুল্লাহ জাহাঙ্গীরের মুসলিম উম্মার ঐক্যের ডাক !");
        hashMap.put("vdo_desciption", "হানাফী ও সালাফী সেমিনারে ড. আব্দুল্লাহ জাহাঙ্গীরের মুসলিম উম্মার ঐক্যের ডাক !");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "4Rh_ALwwdc0");
        hashMap.put("vdo_title", "দ্বীনের নামে জালিয়াতি");
        hashMap.put("vdo_desciption", "দ্বীনের নামে জালিয়াতি | শায়খ ডঃ খন্দকার আবদুল্লাহ জাহাঙ্গীর রহঃ |");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "2RpSuW6QCHI");
        hashMap.put("vdo_title", "সুন্নতের বাইরে গেলেই ফেতনা   ");
        hashMap.put("vdo_desciption", "সুন্নতের বাইরে গেলেই ফেতনা    | শায়খ ডঃ খন্দকার আবদুল্লাহ জাহাঙ্গীর রহঃ !");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "2-c1q7h9Uc4");
        hashMap.put("vdo_title", "বিতর নামায কখন কি ভাবে পড়তে হয়।");
        hashMap.put("vdo_desciption", "তাকওয়া বৃদ্ধির উপায় | শায়খ ডঃ খন্দকার আবদুল্লাহ জাহাঙ্গীর রহঃ !!");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "iEgRxsViXSY");
        hashMap.put("vdo_title", "কবর জিয়ারতের সুন্নাত পদ্ধতি ।");
        hashMap.put("vdo_desciption", "কবর জিয়ারতের সুন্নাত পদ্ধতি | শায়খ ডঃ খন্দকার আবদুল্লাহ জাহাঙ্গীর রহঃ ! !");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Llz7nqY3emA");
        hashMap.put("vdo_title", "তমুনাজাত বিদআত, ইলিয়াসী তাবলিগ বিদআত, মিডিয়া বিদআত নয় কেন?!");
        hashMap.put("vdo_desciption", "মুনাজাত বিদআত, ইলিয়াসী তাবলিগ বিদআত, মিডিয়া বিদআত নয় কেন?|ায়খ ডঃ খন্দকার আবদুল্লাহ জাহাঙ্গীর রহঃ ! !");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "nqEb-u6-Wgs");
        hashMap.put("vdo_title", "ততাবিজ ঝুলানো কি শিরক ? Tabij Jhulano ki shirik?!");
        hashMap.put("vdo_desciption", "তাবিজ ঝুলানো কি শিরক ? Tabij Jhulano ki shirik? | ায়খ ডঃ খন্দকার আবদুল্লাহ জাহাঙ্গীর রহঃ !!");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "VD4ArjEbuAM");
        hashMap.put("vdo_title", "ফরজ সালাতের পর সুন্নাত যিকির");
        hashMap.put("vdo_desciption", "ফরজ সালাতের পর সুন্নাত যিকির |শায়খ ডঃ খন্দকার আবদুল্লাহ জাহাঙ্গীর রহঃ !!");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "RIYhSeosseU");
        hashMap.put("vdo_title", "যে পাপ ক্ষমা চাইলেও আল্লাহ ক্ষমা করবেন না।!");
        hashMap.put("vdo_desciption", "যযে পাপ ক্ষমা চাইলেও আল্লাহ কক্ষনো ক্ষমা করবেন না। সে পাপ কি? Answered by Dr. Khondokar Abdullah Jahangir. বর্তমান সময়ের উপযোগী ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর (রহিমাহুল্লাহ) এর অতীব গুরুত্বপূর্ণ এবং তথ্যবহুল এই প্রশ্নোত্তরটি প্রতিটি মুসলিম নারী পুরুষকে অবশ্যই জেনে রাখা উচিৎ।");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "CpjFgneV0jM");
        hashMap.put("vdo_title", "দুখুলুল মসজিদ খুতবার সময় পড়া যাবে কি?!");
        hashMap.put("vdo_desciption", "মসজিদে প্রবেশ করে দুখুলুল মসজিদ নামাজ পড়া সুন্নাত। দুখুলুল সমজিদ বা তাহিয়্যাতুল মসজিদ এই সুন্নাত নামাজ গুলোর গুরুত্ব অনেক। সুন্নাত জানার পরে কেউ যদি অবজ্ঞা করে তাহলে ইমানের ক্ষতি হবে। তাই সুন্নাত জানার পর আমল করতে না পারলেও অবজ্ঞা কখনোই করা ঠিক না।");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "vFSLNkMpICM");
        hashMap.put("vdo_title", "আল্লাহ এক নবী এক মাযহাব চার কেন?");
        hashMap.put("vdo_desciption", "আল্লাহ এক নবী এক মাযহাব চার কেন? ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর রহ.");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "b6dX-Oig_pI");
        hashMap.put("vdo_title", "তহজ্জে গিয়ে যে গুনাগুলো করে থাকে !");
        hashMap.put("vdo_desciption", "তহজ্জে গিয়ে যে গুনাগুলো করে থাকে -ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর!");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>

        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "6qr_e7q0RuY");
        hashMap.put("vdo_title", "দারুস সালাম মাহফিল ২য় দিন ২০১৪ !");
        hashMap.put("vdo_desciption", "দারুস সালাম মাহফিল ২য় দিন ২০১৪ ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর!");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "maOHiwZwjrw");
        hashMap.put("vdo_title", "আমাদের আল্লাহর প্রিয় হতেই হবে!");
        hashMap.put("vdo_desciption", "আমাদের আল্লাহর প্রিয় হতেই হবে ! ড. আব্দুল্লাহ জাহাঙ্গীর!");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>


        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "o1DUyeH9CxA");
        hashMap.put("vdo_title", "আমাদের সকল কিছু সুন্নতের মধ্যে থাকা দরকার !");
        hashMap.put("vdo_desciption", "পকিছু আলেম পৃথিবী চেয়ে জ্ঞান বিতরণ করেন আর কিছু আখিরাত নিশ্চয়ই যে যেমনটা চেয়েছে আল্লাহ তাকে তেমনটা দিয়ে দিবেন। ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর (রাহিমাহুল্লাহ)");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>


        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "i0SBlh5axQE");
        hashMap.put("vdo_title", "আমরা কেন ইসলাম হারিয়ে ফেলেছি !");
        hashMap.put("vdo_desciption", "মআমরা কেন ইসলাম হারিয়ে ফেলেছি ড. আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>


        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "EJQCqyOi5kI");
        hashMap.put("vdo_title", "দুপচাঁপিয়া বগুড়া মাহফিল !");
        hashMap.put("vdo_desciption", "দুপচাঁপিয়া বগুড়া মাহফিল ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর (রাহিমাহুল্লাহ)");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>



        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "tK3Px8h8gcU");
        hashMap.put("vdo_title", "নুতন কোটপাড়া মাহফিল 2015");
        hashMap.put("vdo_desciption", "নুতন কোটপাড়া মাহফিল 2015 ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর (রাহিমাহুল্লাহ)");
        arrayList.add(hashMap);



        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "IFaPOtdBtfA");
        hashMap.put("vdo_title", "১০০টি জীবন ঘনিষ্ঠ গুরুত্বপূর্ণ প্রশ্নোত্তর│100 Question & Answer│Dr. Khondokar Abdullah Jahangir!");
        hashMap.put("vdo_desciption", "আলহামদুলিল্লাহ। ১০০টি জীবন ঘনিষ্ঠ গুরুত্বপূর্ণ প্রশ্নোত্তর। 100 Question & Answer by Dr. Khondokar Abdullah Jahangir. বর্তমান সময়ের উপযোগী ডঃ খন্দকার আব্দুল্লাহ জাহাঙ্গীর (রহিমাহুল্লাহ) এর অতীব গুরুত্বপূর্ণ এবং তথ্যবহুল এই ১০০টি জীবন ঘনিষ্ঠ গুরুত্বপূর্ণ প্রশ্নের উত্তর প্রতিটি মুসলিম নারী পুরুষকে!");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ppUrZCAYXBw");
        hashMap.put("vdo_title", "!প্র-উ 480! ");
        hashMap.put("vdo_desciption", "ইশরাক,চাশত,দোহা, আওয়াবিন এই নামায কখন-কিভাবে পড়তে হয়,একই নামাজ সুন্নত আবার নফল হয় কিভাবে");
        arrayList.add(hashMap);



        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "FFAS4s0ppVY");
        hashMap.put("vdo_title", "!প্র উ 390!");
        hashMap.put("vdo_desciption", "!প্র উ 390!মৃত পিতার নামে বদলি হজ্জ,মৃত্যুর সময় বাবার কাছে ক্ষমা চাইতে পারিনি,শুক্রবার মৃত্যুর ফজিলত");
        arrayList.add(hashMap);



        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "GVhvRuVTAiU");
        hashMap.put("vdo_title", "প্র উ 999! ");
        hashMap.put("vdo_desciption", "!আমার জীবনে কোন সুখ নেই, আমি অনেক কষ্টে পড়ে আল্লাহকে গালি দিয়েছি, এখন কিভাবে তাওবা করবো");
        arrayList.add(hashMap);



        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "g045WX52Ric");
        hashMap.put("vdo_title", "!প্র উ 568!");
        hashMap.put("vdo_desciption", " মহিলাদের জন্য মসজিদে যাওয়ার হুকুম কি,মহিলারা মসজিদে গিয়ে সালাত আদায় না করলে কি গুনাহ হবে");
        arrayList.add(hashMap);



        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Mceuv67Gngk");
        hashMap.put("vdo_title", "!প্র-উ 59!✔");
        hashMap.put("vdo_desciption", " ️ ইমাম মাহাদি, দাজ্জাল ও কেয়ামতের আলামত নিয়ে ভ্রান্ত ধারনার বিস্তারিত Abdullah Jahangir");
        arrayList.add(hashMap);



        //------------->>>>>>>>>>>>>>>>>




    }

    //=======================================================
    //====================================================================
    //====================================================================

    TextView tvDate;
    LinearLayout layoutContainer;
    FloatingActionButton fabButton;
    RelativeLayout _rootLay;
    AdView mAdView;
    InterstitialAd mInterstitialAd;
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer myYoutubePlayer;
    MyPlaybackEventListener myPlaybackEventListener;
    LinearLayout layPlayer;
    ImageView imngClosePlayer, imgPlayPause, imgPrevious, imgNext;

    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;
    int PLAYING_NOW = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        tvDate = findViewById(R.id.tvDate);
        layoutContainer = findViewById(R.id.layoutContainer);
        fabButton = findViewById(R.id.fabButton);
        mAdView = findViewById(R.id.mAdView);
        _rootLay = findViewById(R.id._rootLay);
        youTubePlayerView = findViewById(R.id.youTubePlayerView);
        layPlayer = findViewById(R.id.layPlayer);
        imngClosePlayer = findViewById(R.id.imngClosePlayer);
        imgPlayPause = findViewById(R.id.imgPlayPause);
        imgNext = findViewById(R.id.imgNext);
        imgPrevious = findViewById(R.id.imgPrevious);

        // Load Admob Ads
        loadBannerAd();
        loadFullscreenAd();


        //init Youtube Player View
        youTubePlayerView.initialize("ABCD", MainActivity.this);
        myPlaybackEventListener = new MyPlaybackEventListener();


        //Set Date For Cover Section
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd, YYYY", Locale.US);
        formatter.setTimeZone(TimeZone.getDefault());
        Date date1 = new Date();
        String s_date = formatter.format(date1);
        tvDate.setText(s_date);


        //Calling addVideos method by which we will make a video list
        addVideos();
        makeListView();






        //Fab Button onClick
        fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "Check "+getString(R.string.app_name)+" app ♥ It's awesome! \n" + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

            }
        });

        imngClosePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closePlayer();
            }
        });

        imgPlayPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (v!=null && v.getTag()!=null){
                    String tag = v.getTag().toString();
                    if (tag.contains("PLAYING")){
                        if (myYoutubePlayer!=null) myYoutubePlayer.pause();
                        else Toast.makeText(MainActivity.this, "Please wait...", Toast.LENGTH_LONG).show();

                    }else if (tag.contains("PAUSED")){
                        if (myYoutubePlayer!=null) myYoutubePlayer.play();
                        else Toast.makeText(MainActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
                    }
                }


            }
        });

        imgNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playNextVideo();
            }
        });

        imgPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playPreviousVideo();
            }
        });





    } // End of onCreate Bundle





    private void makeListView(){

        ListView listView = new ListView( MainActivity.this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(150, 10);
        layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
        listView.setBackgroundColor(Color.WHITE);
        listView.setLayoutParams(layoutParams);

        //Adding ListView into our view
        layoutContainer.addView(listView);
        //------------
        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);
        //-----------


        try{
            setListViewHeightBasedOnChildren(listView);
        } catch(Exception e ){
            e.printStackTrace();
        }

        layoutContainer.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in));

    }

    ///==============================================
    ///==============================================



    ///==============================================
    ///==============================================


    private void loadBannerAd(){
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
                loadBannerAd();
            }
        });

    }
    ///==============================================
    ///==============================================


    //==============================================
    private void showInterstitial() {
        // Show the ad if it's ready.
        if (mInterstitialAd != null ) {
            mInterstitialAd.show(this);
        }
    }
    //============================================


    // loadFullscreenAd method starts here.....
    private void loadFullscreenAd(){

        //Requesting for a fullscreen Ad
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,getString(R.string.admob_INTERSTITIAL_UNIT_ID), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;

                //Fullscreen callback || Requesting again when an ad is shown already
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        //User dismissed the previous ad. So we are requesting a new ad here
                        loadFullscreenAd();
                    }

                }); // FullScreen Callback Ends here


            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                mInterstitialAd = null;
            }

        });

    }

    // loadFullscreenAd method ENDS  here..... >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


    ///==============================================
    ///==============================================


    ///==============================================
    ///==============================================










    ///==============================================
    ///==============================================


    private class MyAdapter extends BaseAdapter {
        private LayoutInflater inflater;

        public MyAdapter(){
            this.inflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = inflater.inflate(R.layout.video_item, parent, false);

            TextView tvTitle = convertView.findViewById(R.id.tvTitle);
            TextView tvDescription = convertView.findViewById(R.id.tvDescription);
            ImageView imgThumb = convertView.findViewById(R.id.imgThumb);
            RelativeLayout layItem = convertView.findViewById(R.id.layItem);

            HashMap<String, String> hashMap = arrayList.get(position);
            String vdo_id = hashMap.get("vdo_id");
            String vdo_title = hashMap.get("vdo_title");
            String vdo_desciption = hashMap.get("vdo_desciption");

            tvTitle.setText(vdo_title);
            tvDescription.setText(vdo_desciption);

            // Youtube thumnail link is like
            //https://i.ytimg.com/vi/<VIDEO ID>/0.jpg
            String thumb_link = "https://i.ytimg.com/vi/"+vdo_id+"/0.jpg";
            Picasso.get().
                    load(""+thumb_link)
                    .placeholder(R.mipmap.ic_launcher)
                    .into(imgThumb);

            layItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //Play Video
                    PLAYING_NOW = position;
                    playVideo(vdo_id);

                    //Show Fullscreen ad
                    showInterstitial();

                }
            });




            return convertView;
        }
    }



    //================================================
    private void playVideo(String video_id){

        if(myYoutubePlayer!=null){
            layPlayer.setVisibility(View.VISIBLE);
            layPlayer.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in));
            myYoutubePlayer.loadVideo(video_id);
            myYoutubePlayer.play();
        }else{
            Toast.makeText(MainActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
        }
    }
    //================================================
    private void closePlayer(){
        if(myYoutubePlayer!=null && myYoutubePlayer.isPlaying()) myYoutubePlayer.pause();
        layPlayer.setVisibility(View.GONE);
        layPlayer.clearAnimation();
    }







    //==============================================
    private final class MyPlaybackEventListener implements YouTubePlayer.PlaybackEventListener {
        public void onBuffering(boolean arg0) {
            //updateLog("onBuffering(): " + String.valueOf(arg0));
            if (imgPlayPause != null ){
                imgPlayPause.setImageResource(R.drawable.buffer);
                imgPlayPause.setTag("BUFFERING");
            }
        }

        public void onPaused() {
            //updateLog("onPaused()");

            if (imgPlayPause != null ){
                imgPlayPause.setImageResource(R.drawable.icon_play);
                imgPlayPause.setTag("PAUSED");
            }

            //Toast.makeText(getApplicationContext(), "Paused", Toast.LENGTH_SHORT).show();
        }

        public void onPlaying() {
            //updateLog("onPlaying()");
            // Toast.makeText(getApplicationContext(), "Paying", Toast.LENGTH_SHORT).show();

            if (imgPlayPause != null ){
                imgPlayPause.setImageResource(R.drawable.icon_pause);
                imgPlayPause.setTag("PLAYING");
            }

        }

        public void onSeekTo(int arg0) {
            //updateLog("onSeekTo(): " + String.valueOf(arg0));
        }

        public void onStopped() {

            if (imgPlayPause != null ){
                imgPlayPause.setImageResource(R.drawable.icon_play);
            }

        }

    }

    //*******************************************************************



    //=================================================================




    private final class MyPlayerStateChangeListener implements YouTubePlayer.PlayerStateChangeListener {

        public void onAdStarted() {
            //updateLog("onAdStarted()");
        }

        public void onError(
                com.google.android.youtube.player.YouTubePlayer.ErrorReason arg0) {
            //updateLog("onError(): " + arg0.toString());
            Toast.makeText(getApplicationContext(), ""+arg0.toString(), Toast.LENGTH_SHORT).show();
            //Log.d("loveRana", ""+arg0.ordinal());

            /*
            if (arg0.toString().contains("NOT_PLAYABLE") && YOUTUBE_PLAYER ){
                webViewPlayer();
            }
            else if (arg0.toString().contains("INTERNAL_ERROR") && YOUTUBE_PLAYER ){
                webViewPlayer();
            }

             */



        }

        public void onLoaded(String arg0) {
            //updateLog("onLoaded(): " + arg0);
        }

        public void onLoading() {
            //updateLog("onLoading()");
        }

        public void onVideoEnded() {
            // Toast.makeText(getApplicationContext(), "ended", Toast.LENGTH_LONG).show();
            playNextVideo();


        }


        public void onVideoStarted() {
            //updateLog("onVideoStarted()");
        }

    }
    //==============================================================



//=================================================
    private void playNextVideo(){
        if(PLAYING_NOW >= (arrayList.size()-1))
            PLAYING_NOW = 0;
        else PLAYING_NOW++;

        HashMap<String, String> hashMap = arrayList.get(PLAYING_NOW);
        String vdo_id = hashMap.get("vdo_id");
        playVideo(vdo_id);
    }


    private void playPreviousVideo(){
        if(PLAYING_NOW > 0){
            PLAYING_NOW--;
            HashMap<String, String> hashMap = arrayList.get(PLAYING_NOW);
            String vdo_id = hashMap.get("vdo_id");
            playVideo(vdo_id);
        }else{
            Toast.makeText(MainActivity.this, "Playing the first video", Toast.LENGTH_LONG).show();
        }

    }






    ///==============================================
    ///==============================================
    //===================================================

    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }

        int totalHeight = 0;
        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(),
                View.MeasureSpec.AT_MOST);
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight
                + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
        listView.requestLayout();
    }

    //==========================================================================
//==========================================================================





    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        myYoutubePlayer = youTubePlayer;
        myYoutubePlayer.setPlaybackEventListener(myPlaybackEventListener);

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        myYoutubePlayer = null;
    }




    ///====================================================
    private static final int TIME_INTERVAL = 2000; // # milliseconds, desired
    private long mBackPressed;

    // When user click bakpress button this method is called
    @Override
    public void onBackPressed() {
        // When user press back button

        if (layPlayer.getVisibility()==View.GONE) {

            if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {

                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            } else {

                Toast.makeText(getBaseContext(), "Press again to exit",
                        Toast.LENGTH_SHORT).show();
            }

            mBackPressed = System.currentTimeMillis();

        } else{
            closePlayer();
        }


    } // end of onBackpressed method

    //#############################################################################################




    ///==============================================
}