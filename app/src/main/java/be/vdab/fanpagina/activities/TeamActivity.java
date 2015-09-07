package be.vdab.fanpagina.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import be.vdab.fanpagina.R;
import be.vdab.fanpagina.Speler;

/**
 * Created by jeansmits on 3/09/15.
 */
public class TeamActivity extends BaseActivity {

    private List <Speler> spelerList;
    Speler youri=new Speler("Youri Tielemans","CVM , CM , CAM","http://s.weltsport.net/bilder/spieler/gross/245962.jpg");
    Speler dennis=new Speler("Dennis Praet", "CAM , LW","http://s.weltsport.net/bilder/spieler/gross/192450.jpg");
    Speler matias=new Speler("Matias Suarez", "LW , SP","http://www.zerozero.pt/img/jogadores/27/212027_med_matias_suarez.jpg");
    Speler leya=new Speler("Leya Iseka", "SP , CAM","http://img.uefa.com/imgml/TP/players/2008/2015/324x324/250064337.jpg");
    Speler andy=new Speler("Andy Kawaya ", "LW, SP","http://www.footballzz.co.uk/img/jogadores/65/212165_ori_andy_kawaya.jpg");
    Speler leander=new Speler("Leander Dendoncker", "CVM , CV","http://www.footballzz.co.uk/img/jogadores/39/212139_ori_leander_dendoncker.jpg");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        setContentView(R.layout.activity_team);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        spelerList=new ArrayList<>();
        spelerList.add(youri);
        spelerList.add(dennis);
        spelerList.add(matias);
        spelerList.add(leya);
        spelerList.add(andy);
        spelerList.add(leander);
        MyAdapter mAdapter = new MyAdapter(spelerList, this);
        recyclerView.setAdapter(mAdapter);

    }



}
