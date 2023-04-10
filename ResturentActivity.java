package com.kashbon.foodpanda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.kashbon.foodpanda.adapter.AllResturantsAdapter;
import com.kashbon.foodpanda.adapter.ExclusiveAdapter;
import com.kashbon.foodpanda.adapter.OffersAdepter;
import com.kashbon.foodpanda.models.Allresturentmodels;
import com.kashbon.foodpanda.models.ExclusiveModels;
import com.kashbon.foodpanda.models.OfferModels;

import java.util.ArrayList;
import java.util.List;

public class ResturentActivity extends AppCompatActivity {

    RecyclerView recyclerViewOffers;
    List<OfferModels>offerModels;
    OffersAdepter offersAdepter;

    RecyclerView recyclerViewExclusive;
    List<ExclusiveModels>exclusiveModels;
    ExclusiveAdapter exclusiveAdapter;

    RecyclerView recyclerViewAllResturants;
    List<Allresturentmodels>allresturentmodels;
    AllResturantsAdapter allResturantsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturent);
        getOffers();
        
        getAllResturantData();

        getAllExclusive();
    }

    private void getAllExclusive() {

        recyclerViewExclusive=findViewById(R.id.rec_exc);
        recyclerViewExclusive.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false));
        recyclerViewExclusive.setHasFixedSize(true);

        exclusiveModels=new ArrayList<>();
        exclusiveModels.add(new ExclusiveModels(R.drawable.food1));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food2));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food3));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food4));

        exclusiveModels.add(new ExclusiveModels(R.drawable.food1));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food2));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food3));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food4));

        exclusiveAdapter=new ExclusiveAdapter(exclusiveModels);
        recyclerViewExclusive.setAdapter((exclusiveAdapter));
    }

    private void getAllResturantData() {

        recyclerViewAllResturants=findViewById(R.id.rec_all_res);
        recyclerViewAllResturants.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false));
        recyclerViewAllResturants.setHasFixedSize(true);

        allresturentmodels=new ArrayList<>();
        allresturentmodels.add(new Allresturentmodels(R.drawable.food1));
        allresturentmodels.add(new Allresturentmodels(R.drawable.food1));
        allresturentmodels.add(new Allresturentmodels(R.drawable.food1));
        allresturentmodels.add(new Allresturentmodels(R.drawable.food1));

        allresturentmodels.add(new Allresturentmodels(R.drawable.food1));
        allresturentmodels.add(new Allresturentmodels(R.drawable.food1));
        allresturentmodels.add(new Allresturentmodels(R.drawable.food1));
        allresturentmodels.add(new Allresturentmodels(R.drawable.food1));

        allResturantsAdapter=new AllResturantsAdapter(allresturentmodels);
        recyclerViewAllResturants.setAdapter((allResturantsAdapter));
    }

    private void getOffers() {
        recyclerViewOffers=findViewById(R.id.rec_offers);
        recyclerViewOffers.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false));
        recyclerViewOffers.setHasFixedSize(true);

        offerModels=new ArrayList<>();
        offerModels.add(new OfferModels(R.drawable.img15));
        offerModels.add(new OfferModels(R.drawable.img16));
        offerModels.add(new OfferModels(R.drawable.img19));
        offerModels.add(new OfferModels(R.drawable.img18));

        offersAdepter=new OffersAdepter(offerModels);
        recyclerViewOffers.setAdapter((offersAdepter));
    }
}