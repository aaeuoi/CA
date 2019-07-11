package com.example.oi.aaeu.ca.actividades;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.content.pm.ActivityInfo;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.oi.aaeu.ca.R;
import com.example.oi.aaeu.ca.fragmentos.FragmentAdapter;
import com.example.oi.aaeu.ca.fragmentos.RRSSFragment;
import com.example.oi.aaeu.ca.modelos.curso;
import com.example.oi.aaeu.ca.modelos.cursos;

public class RRSSActivity extends AppCompatActivity {



    private Button b_play;
    //    private Button b_start;
    private ImageButton ib_play_pause;
    private ImageButton ib_play_pause_01;
    private ImageButton ib_play_pause_02;
    private ImageButton ib_play_pause_03;
    private ImageButton ib_play_pause_04;
    private ImageButton ib_play_pause_05;
    private Button b_end;
    private TextView tv_estado;
    private Spinner spinner_01;
    private Spinner spinner_02;
    private Spinner spinner_03;
    private Spinner spinner_04;
    private Spinner spinner_05;
    /*
    private String [] emisoras = {"Cadena SER (General)","M80 (Pop 40 Classics)","Los 40 (Pop)",
            "MaximaFM (Tunda chún)","Cadena Dial (Pop)","Radio Olé (Música en español)",
            "RNE1 (General)","RNE (Clásica)",
            "RNE3 (Radio3)","RNE5 (Noticias)","RNE Exterior (General)",
            "KissFM (Pop)","Hit FM (Pop)",
            "Onda Cero (General)","Europa FM (Pop Rock)","Melodía FM (Pop)",
            "Q Música (Jazz Soul Blues)","Oasis FM (Top 40 English)",
            "Cadena 100 (Pop Rock)","Rock FM (Pop Rock)","MegaStar (Pop Rock)",
            "Cadena Digital (Pop 40)","Catalunya Música",
            "DiscMusicRadio (Pop hits)","DanceMusicRadio (pop)",
            "Radio7 Santurce (Top40)",
            "RadioTropical (Tropical Music)","KeBuena (Reggaeton)"
    };
*/
    String[] sugerencias = {
            "Los más destacados:",
            "Últimas convocatorias:",
            "Certificaciones en:",
            "Consultoría y Servicios disponibles:"
    };

    String[] v00 = {
            "RRSS 01",
            "RRSS 02",
            "RRSS 03"
    };

    String[] v01 = {
            "tiburon11",
            "tiburon12",
            "tiburon21"
    };

    String[] v02 = {
            "tiburon11",
            "tiburon12",
            "tiburon21"
    };

    String[] v03 = {
            "tiburon11",
            "tiburon12",
            "tiburon21"
    };

    String[] v04 = {
            "tiburon11",
            "tiburon12",
            "tiburon21"
    };

    String[] v05 = {
            "tiburon11",
            "tiburon12",
            "tiburon21"
    };

    String[] v06 = {
            "tiburon11",
            "tiburon12",
            "tiburon21"
    };
    String[] v07 = {
            "formato11",
            "formato12",
            "formato21"
    };
    String[] v08 = {
            "idioma11",
            "idioma12",
            "idioma21"
    };
    String[] v09 = {
            "nivel11",
            "nivel12",
            "nivel21"
    };
    String[] v10 = {
            "nivel11",
            "nivel12",
            "nivel21"
    };
    String[] v11 = {
            "nivel11",
            "nivel12",
            "nivel21"
    };
    String[] v12 = {
            "nivel11",
            "nivel12",
            "nivel21"
    };
    String[] v13 = {
            "documentacion11_kmjggfgg_kmfmrfm_ddfgtkmgvmmgf_mgbmvbmgvbb_mvgbmgvmvfvmed_mmmmm_" +
                    "_mv_m_m_,mlfflgfewgergoearpgrog_kvvfkvovkvvkvkvkopxk_bkbkbkbkbkbkbkb__" +
                    "knnsknkbnks.",
            "documentacion12_quhgeu__hgbwooikb_jgoqi_jgftgioq_ifoe_ikjgvigjg_jiosjgb_igoas_" +
                    "a_nn__oggbnn_gngwbo_ggfng_whhhwhrwrtn_nthbowsnb_ngbgohohghhhi_nnnnnnnn.",
            "documentacion21_bjbwjbjbj_jegbrtjwihog_jgoiwbhjg_gbwjiiiiiiohb_jgjsoij_gboihbgh" +
                    "ms_gogn_n_itoa_jio_ii_j_ioi_ooooooooo_io_iji_oooooooooooooooooooooo_ikio_" +
                    "nnio_io_iio_ioooooooooooooooooooooooooooo_jiooooooooooooooooooooooo_iooooooo"+
                    "jiooooooooooooio"
    };
    String[] v14 = {
            "descripcion11_kmjggfgg_kmfmrfm_ddfgtkmgvmmgf_mgbmvbmgvbb_mvgbmgvmvfvmed_mmmmm_" +
                    "_mv_m_m_,mlfflgfewgergoearpgrog_kvvfkvovkvvkvkvkopxk_bkbkbkbkbkbkbkb__" +
                    "knnsknkbnks.",
            "descripcion12_quhgeu__hgbwooikb_jgoqi_jgftgioq_ifoe_ikjgvigjg_jiosjgb_igoas_" +
                    "a_nn__oggbnn_gngwbo_ggfng_whhhwhrwrtn_nthbowsnb_ngbgohohghhhi_nnnnnnnn.",
            "descripcion21_bjbwjbjbj_jegbrtjwihog_jgoiwbhjg_gbwjiiiiiiohb_jgjsoij_gboihbgh" +
                    "ms_gogn_n_itoa_jio_ii_j_ioi_ooooooooo_io_iji_oooooooooooooooooooooo_ikio_" +
                    "nnio_io_iio_ioooooooooooooooooooooooooooo_jiooooooooooooooooooooooo_iooooooo"+
                    "jiooooooooooooio"
    };
    String[] v15 = {
            "nivel11",
            "nivel12",
            "nivel21"
    };
    String[] v16 = {
            "nivel11",
            "nivel12",
            "nivel21"
    };
    String[] v17 = {
            "nivel11",
            "nivel12",
            "nivel21"
    };
    String[] v18 = {
            "nivel11",
            "nivel12",
            "nivel21"
    };
    String[] v19 = {
            "nivel11",
            "nivel12",
            "nivel21"
    };
    String[] v20 = {
            "nivel11",
            "nivel12",
            "nivel21"
    };


    private ViewPager viewPager;
    private FragmentAdapter pagerAdapter;
    TextView tv = null;

    private Uri uri;
    //private PlayerTask playerTask;
    private String [] fabricantes;
    private String [] areas;
    private String [] categorias;
    private String [] subcategorias;
    private String [] modalidades;

    private boolean prepared = false;
    private boolean started = false;
    private boolean start = false;
    //    private boolean change = false;
    private boolean checked_01 = false;
    private boolean checked_02 = false;
    private boolean checked_03 = false;
    private boolean checked_04 = false;
    private boolean checked_05 = false;

//    private RadioGroup radioGroupButton;
//    private int radioButtonID;
//    private View vRadioButton;
//    private int idx;
//    private int idxFrequency;
//    private RadioButton mRadioButton;

    private int vis = 0;
    private String fabricante;
    private String area;
    private String categoria;
    private String subcategoria;
    private String modalidad;

    private TextView mStatusTextView;


    private Button submit;

    private static curso cur;
    private static cursos curs ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            // pantalla solo horizontal OK
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            setContentView(R.layout.activity_rrss);

// BaseActivity
            if (getLayout() != 0) {
                setContentView(getLayout());
            } else {
                throw new NullPointerException("Provide layout file for the activity");
            }
            //setActionBar();
            //initialize();
// Fin BaseActivity

            // otras variables de control
            /*
            b_play = (Button) findViewById(R.id.button_buscar);
            b_play.setEnabled(false);
            b_play.setEnabled(true);
*/
            pagerAdapter = new FragmentAdapter(getSupportFragmentManager());

            viewPager = (ViewPager) findViewById(R.id.pager);
            pagerAdapter.agregarFragmentos(RRSSFragment.newInstance(v00[0],v01[0],v02[0],
                    v03[0],v04[0],v05[0],v06[0],v07[0],v08[0],v09[0],v10[0],v11[0],v12[0],v13[0],
                    v14[0],v15[0],v16[0],v17[0],v18[0],v19[0],v20[0]));
            pagerAdapter.agregarFragmentos(RRSSFragment.newInstance(v00[1],v01[1],v02[1],
                    v03[1],v04[1],v05[1],v06[1],v07[1],v08[1],v09[1],v10[1],v11[1],v12[1],v13[1],
                    v14[1],v15[1],v16[1],v17[1],v18[1],v19[1],v20[1]));
            pagerAdapter.agregarFragmentos(RRSSFragment.newInstance(v00[2],v01[2],v02[2],
                    v03[2],v04[2],v05[2],v06[2],v07[2],v08[2],v09[2],v10[2],v11[2],v12[2],v13[2],
                    v14[2],v15[2],v16[2],v17[2],v18[2],v19[2],v20[2]));

            viewPager.setAdapter(pagerAdapter);
            /*
            b_play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    loadFragment(new GaleriaFragment());

                    if (started) {

                        curs.setCursos();
                        started = false;
                    }
                }
            });
            */
        } catch (Exception e) {
            Log.e("ERROR", "Error onCreate: " + e);
        }

    }
    // BaseActivity
    private void initialize() {
/*        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M
                && checkSelfPermission(Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(WRITE_EXTERNAL_STORAGE_PERMS, AUDIO_PERMISSION_REQUEST_CODE);
        }
        else {
            setPlayer();
        } */
    }

    private void setActionBar() {
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        /*
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        */
    }

    /*    @Override
        public void onRequestPermissionsResult(
                int requestCode,
                @NonNull String[] permissions,
                @NonNull int[] grantResults) {
            switch (requestCode) {
                case AUDIO_PERMISSION_REQUEST_CODE:
                    if (grantResults.length > 0
                            && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                        //setPlayer(mediaPlayer);
                    } else {
                        this.finish();
                    }
            }
        }
    */
    // Fin BaseActivity

    //@Override
    protected void onDraw(Canvas canvas) {

    }

    /*
    class PlayerTask extends AsyncTask<String, Void, Boolean> {
        @Override
        protected Boolean doInBackground(String... strings) {

            try {
                mediaPlayer.setDataSource(strings[0]);
                mediaPlayer.prepare();
                prepared = true;
                return prepared;
            } catch(IOException e) {
                Log.e("ERROR", "Error doInBackground():" + e);
                e.printStackTrace();
                return false;
            }
        }

    }
    */
    @Override
    protected void onPause() {
        try {
            super.onPause();
/*
            if (isFinishing() && mediaPlayer != null) {
                mVisualizer.release();
                mEqualizer.release();
                mediaPlayer.release();
                mediaPlayer = null;
                System.exit(0);
            }
*/
        } catch (Exception e) {
            Log.e("ERROR", "Error onPause: " + e);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
/*
        if(started) {
            mediaPlayer.start();
        }
        // Load an ad into the AdMob banner view.
        AdView adView = (AdView) getView().findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);
        //initialize views
        initializeViews();
        setInstrumentNames();

        mediaPlayer1.start();
        mediaPlayer2.start();
        mediaPlayer3.start();
        mediaPlayer4.start();
        // Start the songtime thread and remember its object so it can be stopped legally
        play();
        setEqualizer();
        setupKnobButtons();
        */
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // mVisualizer.release();
        //mEcualizador.release();
        //mediaPlayer.stop();
        //mediaPlayer.release();
        //mediaPlayer = null;
        //playerTask.cancel(true);
        //playerTask = null;
    }



    protected int getLayout() {
        return R.layout.activity_cursos;
    }
    /*protected int getLayout() {
        return R.layout.activity_bar_visualizer;
    }*/
// Fin BaseVisulizerActivity

    public void playPause_01(View v) {
//        playPauseBtnClicked_01((ImageButton) ib_play_pause_01 , v);
    }
    public void getCursosActual() {
        curs.getCursos();
    }

}
