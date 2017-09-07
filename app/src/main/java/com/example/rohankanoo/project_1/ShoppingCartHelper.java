package com.example.rohankanoo.project_1;

import android.content.res.Resources;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/**
 * Created by Rohan Kanoo on 12-03-2017.
 */
public class ShoppingCartHelper {

    public static final String PRODUCT_INDEX = "PRODUCT_INDEX";

    private static List<Product> catalogFaucets;
    private static List<Product> catalogSink;
    private static List<Product> catalogBath;
    private static List<Product> catalogCistern;
    private static List<Product> catalogPtmt;
    private static List<Product> catalogShowers;
    private static Map<Product, ShoppingCartEntry> cartMap = new LinkedHashMap<Product, ShoppingCartEntry>();

    public static List<Product> getCatalogFaucets(Resources res){
        if(catalogFaucets == null) {
            catalogFaucets = new Vector<Product>();
            catalogFaucets.add(new Product("Bib Cock (Coral)", res
                    .getDrawable(R.drawable.bc_coral),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Bib Cock (Stella)", res
                    .getDrawable(R.drawable.bc_stella),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Bib Cock (Trio)", res
                    .getDrawable(R.drawable.bc_trio),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Bib Cock (Budget)", res
                    .getDrawable(R.drawable.bc_budget),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Bib Cock (Oscar)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Bib Cock (Imperial)", res
                    .getDrawable(R.drawable.bc_imperial),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Bib Cock (Arrow)", res
                    .getDrawable(R.drawable.bc_arrow),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Bib Cock (M-Andy)", res
                    .getDrawable(R.drawable.bc_m_andy),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Bib Cock (Andy)", res
                    .getDrawable(R.drawable.bc_andy),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Bib Cock (Boom)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Bib Cock (M-Cross)", res
                    .getDrawable(R.drawable.bc_m_cross),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Bib Cock (Stick)", res
                    .getDrawable(R.drawable.bc_stick),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Long Body (Coral)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Long Body (Stella)", res
                    .getDrawable(R.drawable.long_body_stella),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Long Body (Trio)", res
                    .getDrawable(R.drawable.long_body_trio),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Long Body (Budget)", res
                    .getDrawable(R.drawable.long_body_budget),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Long Body (Oscar)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Long Body (Imperial)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Long Body (Arrow)", res
                    .getDrawable(R.drawable.long_body_arrow),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Long Body (M-Andy)", res
                    .getDrawable(R.drawable.long_body_m_andy),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Long Body (Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Long Body (Boom)", res
                    .getDrawable(R.drawable.long_body_boom),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Long Body (M-Cross)", res
                    .getDrawable(R.drawable.long_body_m_cross),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Long Body (Stick)", res
                    .getDrawable(R.drawable.long_body_stick),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Pilar Cock (Coral)", res
                    .getDrawable(R.drawable.pc_coral),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Pilar Cock (Stella)", res
                    .getDrawable(R.drawable.pc_stella),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Pilar Cock (Trio)", res
                    .getDrawable(R.drawable.pc_trio),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Pilar Cock (Budget)", res
                    .getDrawable(R.drawable.pc_budget),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Pilar Cock (Oscar)", res
                    .getDrawable(R.drawable.pc_oscar),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Pilar Cock (Imperial)", res
                    .getDrawable(R.drawable.pc_imperial),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Pilar Cock (Arrow)", res
                    .getDrawable(R.drawable.pc_arrow),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Pilar Cock (M-Andy)", res
                    .getDrawable(R.drawable.pc_m_andy),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Pilar Cock (Andy)", res
                    .getDrawable(R.drawable.pc_andy),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Pilar Cock (Boom)", res
                    .getDrawable(R.drawable.pc_boom),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Pilar Cock (M-Cross)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Pilar Cock (Stick)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Angle Cock (Coral)", res
                    .getDrawable(R.drawable.ac_coral),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Angle Cock (Stella)", res
                    .getDrawable(R.drawable.ac_stella),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Angle Cock (Trio)", res
                    .getDrawable(R.drawable.ac_trio),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Angle Cock (Budget)", res
                    .getDrawable(R.drawable.ac_budget),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Angle Cock (Oscar)", res
                    .getDrawable(R.drawable.ac_oscar),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Angle Cock (Imperial)", res
                    .getDrawable(R.drawable.ac_imperial),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Angle Cock (Arrow)", res
                    .getDrawable(R.drawable.ac_arrow),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Angle Cock (M-Andy)", res
                    .getDrawable(R.drawable.ac_m_andy),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Angle Cock (Andy)", res
                    .getDrawable(R.drawable.ac_andy),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Angle Cock (Boom)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Angle Cock (M-Cross)", res
                    .getDrawable(R.drawable.ac_m_cross),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Angle Cock (Stick)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Conceled Stop Cock (Coral)", res
                    .getDrawable(R.drawable.cs_coral),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Conceled Stop Cock (Stella)", res
                    .getDrawable(R.drawable.cs_stella),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Conceled Stop Cock (Trio)", res
                    .getDrawable(R.drawable.cs_trio),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Conceled Stop Cock (Budget)", res
                    .getDrawable(R.drawable.cs_budget),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Conceled Stop Cock (Oscar)", res
                    .getDrawable(R.drawable.cs_oscar),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Conceled Stop Cock (Imperial)", res
                    .getDrawable(R.drawable.cs_imperial),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Conceled Stop Cock (Arrow)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Conceled Stop Cock (M-Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Conceled Stop Cock (Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Conceled Stop Cock (Boom)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Conceled Stop Cock (M-Cross)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Conceled Stop Cock (Stick)", res
                    .getDrawable(R.drawable.cs_stick),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Sink Mixer (Coral)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Sink Mixer (Stella)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Sink Mixer (Trio)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Sink Mixer (Budget)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Sink Mixer (Oscar)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Sink Mixer (Imperial)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Sink Mixer (Arrow)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Sink Mixer (M-Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Sink Mixer (Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Swan Neck P/C (Coral)", res
                    .getDrawable(R.drawable.swan_neck_coral),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Swan Neck P/C (Stella)", res
                    .getDrawable(R.drawable.swan_neck_stella),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Swan Neck P/C (Trio)", res
                    .getDrawable(R.drawable.swan_neck_trio),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Swan Neck P/C (Budget)", res
                    .getDrawable(R.drawable.swan_neck_budget),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Swan Neck P/C (Oscar)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Swan Neck P/C (Imperial)", res
                    .getDrawable(R.drawable.swan_neck_imperial),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Swan Neck P/C (Arrow)", res
                    .getDrawable(R.drawable.swan_neck_arrow),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Swan Neck P/C (M-Andy)", res
                    .getDrawable(R.drawable.swan_neck_m_andy),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Swan Neck P/C (Andy)", res
                    .getDrawable(R.drawable.swan_neck_andy),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Tele Shower (Coral)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Tele Shower (Stella)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Tele Shower (Trio)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Tele Shower (Budget)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Tele Shower (Oscar)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Tele Shower (Imperial)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Tele Shower (Arrow)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Tele Shower (M-Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Tele Shower (Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Non Tele (Coral)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Non Tele (Stella)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Non Tele (Trio)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Non Tele (Budget)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Non Tele (Oscar)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Non Tele (Imperial)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Non Tele (Arrow)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Non Tele (M-Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Non Tele (Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Single Lever L-Bend (Coral)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Single Lever L-Bend (Stella)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Single Lever L-Bend (Trio)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Single Lever L-Bend (Budget)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Single Lever L-Bend (Oscar)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Single Lever L-Bend (Imperial)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Single Lever L-Bend (Arrow)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Single Lever L-Bend (M-Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Single Lever L-Bend (Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Sink Cock (Coral)", res
                    .getDrawable(R.drawable.sink_cock_coral),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Sink Cock (Stella)", res
                    .getDrawable(R.drawable.sink_cock_stella),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Sink Cock (Trio)", res
                    .getDrawable(R.drawable.sink_cock_trio),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Sink Cock (Budget)", res
                    .getDrawable(R.drawable.sink_cock_budget),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Sink Cock (Oscar)", res
                    .getDrawable(R.drawable.sink_cock_oscar),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Sink Cock (Imperial)", res
                    .getDrawable(R.drawable.sink_cock_imperial),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Sink Cock (Arrow)", res
                    .getDrawable(R.drawable.sink_cock_arrow),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Sink Cock (M-Andy)", res
                    .getDrawable(R.drawable.sink_cock_m_andy),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Sink Cock (Andy)", res
                    .getDrawable(R.drawable.sink_cock_andy),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("2-Way B/C (Coral)", res
                    .getDrawable(R.drawable.bc2_coral),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("2-Way B/C (Stella)", res
                    .getDrawable(R.drawable.bc2_stella),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("2-Way B/C (Trio)", res
                    .getDrawable(R.drawable.bc2_trio),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("2-Way B/C (Budget)", res
                    .getDrawable(R.drawable.bc2_budget),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("2-Way B/C (Oscar)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("2-Way B/C (Imperial)", res
                    .getDrawable(R.drawable.bc2_imperial),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("2-Way B/C (Arrow)", res
                    .getDrawable(R.drawable.bc2_arrow),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("2-Way B/C (M-Andy)", res
                    .getDrawable(R.drawable.bc2_m_andy),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("2-Way B/C (Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("2-Way A/C (Coral)", res
                    .getDrawable(R.drawable.ac2_coral),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("2-Way A/C (Stella)", res
                    .getDrawable(R.drawable.ac2_stella),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("2-Way A/C (Trio)", res
                    .getDrawable(R.drawable.ac2_trio),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("2-Way A/C (Budget)", res
                    .getDrawable(R.drawable.ac2_budget),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("2-Way A/C (Oscar)", res
                    .getDrawable(R.drawable.ac2_oscar),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("2-Way A/C (Imperial)", res
                    .getDrawable(R.drawable.ac2_imperial),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("2-Way A/C (Arrow)", res
                    .getDrawable(R.drawable.ac2_arrow),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("2-Way A/C (M-Andy)", res
                    .getDrawable(R.drawable.ac2_m_andy),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("2-Way A/C (Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Centre Hole Basin Mixture (Coral)", res
                    .getDrawable(R.drawable.centre_hole_coral),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Centre Hole Basin Mixture (Stella)", res
                    .getDrawable(R.drawable.centre_hole_stella),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Centre Hole Basin Mixture (Trio)", res
                    .getDrawable(R.drawable.centre_hole_trio),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Centre Hole Basin Mixture (Budget)", res
                    .getDrawable(R.drawable.centre_hole_budget),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Centre Hole Basin Mixture (Oscar)", res
                    .getDrawable(R.drawable.centre_hole_oscar),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Centre Hole Basin Mixture (Imperial)", res
                    .getDrawable(R.drawable.centre_hole_imperial),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Centre Hole Basin Mixture (Arrow)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Centre Hole Basin Mixture (M-Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Centre Hole Basin Mixture (Andy)", res
                    .getDrawable(R.drawable.centre_hole_andy),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Centre Hole Basin Mixture Single Lever (Coral)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Centre Hole Basin Mixture Single Lever (Stella)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Centre Hole Basin Mixture Single Lever (Trio)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Centre Hole Basin Mixture Single Lever (Budget)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Centre Hole Basin Mixture Single Lever (Oscar)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Centre Hole Basin Mixture Single Lever (Imperial)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Centre Hole Basin Mixture Single Lever (Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("3 in 1 Wall Mixture (Coral)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("3 in 1 Wall Mixture (Stella)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("3 in 1 Wall Mixture (Trio)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("3 in 1 Wall Mixture (Budget)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("3 in 1 Wall Mixture (Oscar)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("3 in 1 Wall Mixture (Imperial)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("3 in 1 Wall Mixture (Arrow)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("3 in 1 Wall Mixture (M-Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("3 in 1 Wall Mixture (Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Tele Hand Shower (Coral)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Tele Hand Shower (Stella)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Tele Hand Shower (Trio)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Tele Hand Shower (Budget)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Tele Hand Shower (Oscar)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Tele Hand Shower (Imperial)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Tele Hand Shower (Arrow)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Tele Hand Shower (M-Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Wall Mixture Tele Hand Shower (Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Single Lever Concealed Diverter (Coral)", res
                    .getDrawable(R.drawable.placeholder),
                    "Watchmen by Alan Moore and Dave Gibbons", 14.99));
            catalogFaucets.add(new Product("Single Lever Concealed Diverter (Oscar)", res
                    .getDrawable(R.drawable.placeholder),
                    "Watchmen by Alan Moore and Dave Gibbons", 14.99));
            catalogFaucets.add(new Product("Single Lever Concealed Diverter (Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Watchmen by Alan Moore and Dave Gibbons", 14.99));
            catalogFaucets.add(new Product("Basin Mixture Wall Mounted (Coral)", res
                    .getDrawable(R.drawable.placeholder),
                    "Watchmen by Alan Moore and Dave Gibbons", 14.99));
            catalogFaucets.add(new Product("Basin Mixture Wall Mounted (Oscar)", res
                    .getDrawable(R.drawable.placeholder),
                    "Watchmen by Alan Moore and Dave Gibbons", 14.99));
            catalogFaucets.add(new Product("Basin Mixture Wall Mounted (Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Watchmen by Alan Moore and Dave Gibbons", 14.99));
            catalogFaucets.add(new Product("Spout with Diverter (Coral)", res
                    .getDrawable(R.drawable.placeholder),
                    "Watchmen by Alan Moore and Dave Gibbons", 14.99));
            catalogFaucets.add(new Product("Spout with Diverter (Oscar)", res
                    .getDrawable(R.drawable.placeholder),
                    "Watchmen by Alan Moore and Dave Gibbons", 14.99));
            catalogFaucets.add(new Product("Spout with Diverter (Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Watchmen by Alan Moore and Dave Gibbons", 14.99));
            catalogFaucets.add(new Product("Spout without Diverter (Coral)", res
                    .getDrawable(R.drawable.placeholder),
                    "Watchmen by Alan Moore and Dave Gibbons", 14.99));
            catalogFaucets.add(new Product("Spout without Diverter (Oscar)", res
                    .getDrawable(R.drawable.placeholder),
                    "Watchmen by Alan Moore and Dave Gibbons", 14.99));
            catalogFaucets.add(new Product("Spout without Diverter (Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Watchmen by Alan Moore and Dave Gibbons", 14.99));
            catalogFaucets.add(new Product("Flenge (Jaquar - SS)", res
                    .getDrawable(R.drawable.placeholder),
                    "Watchmen by Alan Moore and Dave Gibbons", 14.99));
            catalogFaucets.add(new Product("Flenge (Jaquar - Brass)", res
                    .getDrawable(R.drawable.placeholder),
                    "Watchmen by Alan Moore and Dave Gibbons", 14.99));
            catalogFaucets.add(new Product("Flenge (M-Queen - SS)", res
                    .getDrawable(R.drawable.placeholder),
                    "Watchmen by Alan Moore and Dave Gibbons", 14.99));
            catalogFaucets.add(new Product("Flenge (Gol - SS)", res
                    .getDrawable(R.drawable.placeholder),
                    "Watchmen by Alan Moore and Dave Gibbons", 14.99));
            catalogFaucets.add(new Product("Flenge (Gol - Brass)", res
                    .getDrawable(R.drawable.placeholder),
                    "Watchmen by Alan Moore and Dave Gibbons", 14.99));
            catalogFaucets.add(new Product("Flenge (Square - SS)", res
                    .getDrawable(R.drawable.placeholder),
                    "Watchmen by Alan Moore and Dave Gibbons", 14.99));
            catalogFaucets.add(new Product("Flenge (Square - Brass)", res
                    .getDrawable(R.drawable.placeholder),
                    "Watchmen by Alan Moore and Dave Gibbons", 14.99));
            catalogFaucets.add(new Product("Nozzle B/C (Coral)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Nozzle B/C (Stella)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Nozzle B/C (Trio)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Nozzle B/C (Budget)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Nozzle B/C (Oscar)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Nozzle B/C (Imperial)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Nozzle B/C (Arrow)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Nozzle B/C (M-Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Nozzle B/C (Andy)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Nozzle B/C (Boom)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Nozzle B/C (M-Cross)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("Nozzle B/C (Stick)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("High Neck P/C (Coral)", res
                    .getDrawable(R.drawable.placeholder),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
            catalogFaucets.add(new Product("High Neck P/C (Oscar)", res
                    .getDrawable(R.drawable.hn_pc_oscar),
                    "Dead or Alive by Tom Clancy with Grant Blackwood", 29.99));
        }

        return catalogFaucets;
    }

    public static List<Product> getCatalogSink(Resources res){
        if(catalogSink == null) {
            catalogSink = new Vector<Product>();
            catalogSink.add(new Product("12X12 (HW)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("14X16 (HW)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BROWN", 24.99));
            catalogSink.add(new Product("14X16 (Silver)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BROWN", 24.99));
            catalogSink.add(new Product("14X16 (Ajanta ISI)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BROWN", 24.99));
            catalogSink.add(new Product("12X15 (HW)", res
                    .getDrawable(R.drawable.placeholder),
                    "The Colour is GRAY", 14.99));
            catalogSink.add(new Product("12X15 (Silver)", res
                    .getDrawable(R.drawable.placeholder),
                    "The Colour is GRAY", 14.99));
            catalogSink.add(new Product("12X15 (Ajanta ISI)", res
                    .getDrawable(R.drawable.placeholder),
                    "The Colour is GRAY", 14.99));
            catalogSink.add(new Product("18X16 (HW)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("18X16 (Silver)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("18X16 (Ajanta ISI)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("18X16 (TATA)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("18X16 (Sonex)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("18X16 (Silver - Coating)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("18X16 (ISI - Coating)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("18X16 (Tata - Coating)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("20X17", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("20X17 (HW)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("20X17 (Silver)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("20X17 (Ajanta ISI)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("20X17 (Silver - Coating)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("20X17 (ISI - Coating)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("21X18 (HW)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("21X18 (Silver)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("21X18 (Ajanta ISI)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("21X18 (Silver - Coating)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("21X18 (ISI - Coating)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("22X18 (HW)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("22X18 (Silver)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("22X18 (Ajanta ISI)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("22X18 (Silver - Coating)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("22X18 (ISI - Coating)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("24X18X8 (Silver)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("24X18X8 (Sonex)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("24X18X8 (Silver - Coating)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("24X18X9 (HW)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("24X18X9 (Silver)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("24X18X9 (Ajanta ISI)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("24X18X9 (Tata)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("24X18X9 (Silver - Coating)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("24X18X9 (ISI - Coating)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("24X18X9 (Tata - Coating)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("24X18X9 (ISI - Coating Imported)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("27X20 (HW)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("37X18 (HW)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("37X18 (Silver)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("37X18 (ISI)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("37X18 (Silver - Coating)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("37X18 (ISI - Coating)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("37X18 (ISI - Coating Imported)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("37X18 - Double Bowl (Silver)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("37X18 - Double Bowl (ISI)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("37X18 - Double Bowl (Silver - Coating)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("37X18 - Double Bowl (ISI - Coating)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("40X20 (HW)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("41X20 (HW)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("42X20 (HW)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("45X20 (HW)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogSink.add(new Product("Triple Bowl", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
        }

        return catalogSink;
    }

    public static List<Product> getCatalogBath(Resources res){
        if(catalogBath == null) {
            catalogBath = new Vector<Product>();
            catalogBath.add(new Product("T Ring", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("T Rod 18\"", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is YELLOW", 24.99));
            catalogBath.add(new Product("T Rod 12\"", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is RED", 14.99));
            catalogBath.add(new Product("T Rod 24\"", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Paste Holder", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Soap Dish", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("T Rack 18\"", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("T Rack 24\"", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Liquid Soap Dispenser", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Grab Bar", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Jali (Net)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Drainage Pipe/Down Pipe", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Basin Waste", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Sink Waste", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Urinal Down Pipe", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Long Bend", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Jet Spray 1 mtr", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Jet Spray 1.5 mtr", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Health Faucet 1mtr/1.5mtr", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Connection Hose/Pipe 18\"", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Connection Hose/Pipe 24\"", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Connection Hose/Pipe 36\"", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("C.P. Extention Nipple Brass", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("C.P. Extention Nipple Steel", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Bracket T Type", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Bracket U Type", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Wall Hang Bracket", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Rack Bolt", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Double Soapdish", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("3 in 1 Soapdish", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Soapdish with Tumbler Holder", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Mirror Cabinet", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Corner Cabinet", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("3pc. Corner Set", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Glass Shelf", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Glass Corner", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("S/S Shelf", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("S/S Shelf with Soapdish and Tumbler Holder", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Ball Valve", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Gate Valve", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Ball Cock", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Hings", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Mixture Leg Pair", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Cloth Dryer", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
            catalogBath.add(new Product("Alluminium Ladder", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is GREEN", 29.99));
        }

        return catalogBath;
    }

    public static List<Product> getCatalogCistern(Resources res){
        if(catalogCistern == null) {
            catalogCistern = new Vector<Product>();
            catalogCistern.add(new Product("Single Flush Cistern (Ajanta ISI)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogCistern.add(new Product("Single Flush Cistern (Silvasa ISI)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogCistern.add(new Product("Single Flush Cistern (Pearl ISI)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogCistern.add(new Product("Double Flush Cistern (Solo ISI)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BROWN", 24.99));
            catalogCistern.add(new Product("Double Flush Cistern (Pearl ISI)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BROWN", 24.99));
            catalogCistern.add(new Product("Sleek Cistern Dual Flush (Ajanta ISI)", res
                    .getDrawable(R.drawable.placeholder),
                    "The Colour is GRAY", 14.99));
            catalogCistern.add(new Product("Sleek Cistern Dual Flush (Pearl ISI)", res
                    .getDrawable(R.drawable.placeholder),
                    "The Colour is GRAY", 14.99));
            catalogCistern.add(new Product("Sleek Square Cistern Dual Flush (Pearl ISI)", res
                    .getDrawable(R.drawable.placeholder),
                    "The Colour is GRAY", 14.99));
            catalogCistern.add(new Product("Concealed Cistern (Pearl ISI)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogCistern.add(new Product("Economic Seat Cover (Pearl)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogCistern.add(new Product("Heavy Seat Cover (Pearl)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogCistern.add(new Product("Heavy Seat Cover (Millennium)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogCistern.add(new Product("Hydraulic Seat Cover (Pearl)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogCistern.add(new Product("Cistern and Seat Cover Fittings (Single Syphon)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogCistern.add(new Product("Cistern and Seat Cover Fittings (Dual Syphon)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogCistern.add(new Product("Cistern and Seat Cover Fittings (Ball Cock Small)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogCistern.add(new Product("Cistern and Seat Cover Fittings (Ball Cock Long)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogCistern.add(new Product("Syphon Washer (Small)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogCistern.add(new Product("Syphon Washer (Big)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
        }

        return catalogCistern;
    }

    public static List<Product> getCatalogPtmt(Resources res){
        if(catalogPtmt == null) {
            catalogPtmt = new Vector<Product>();
            catalogPtmt.add(new Product("B/C (Std.)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("B/C (Royal)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("L/B (Std.)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("L/B (Royal)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Nozzle B/C (Std.)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Nozzle B/C (Royal)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("A/C (Std.)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("A/C (Royal)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Stopcock M/T (Std.)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Stopcock M/T (Royal)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Extention Nipple", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Wall Mixer (Std.)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Wall Mixer (Royal)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Mini Sink Cock (Std.)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Mini Sink Cock (Royal)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Piller Cock (Std.)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Piller Cock (Royal)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("2 Way B/C (Std.)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("2 Way B/C (Royal)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("2 Way A/C (Std.)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("2 Way A/C (Royal)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Push Cock", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Push Cock with Spout", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Mini Swan Neck (Std.)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Mini Swan Neck (Royal)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Swan Neck P/C (Std.)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Swan Neck P/C (Royal)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Sink Cock (Std.)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Sink Cock (Royal)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Stop Cock F/T (Std.)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Stop Cock F/T (Royal)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Sink Mixture (Std.)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Sink Mixture (Royal)", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Washing Machine Faucet", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Waste Coupling F/T, H/T", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Urinal Jet Spray", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogPtmt.add(new Product("Half inch Plug", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
        }

        return catalogPtmt;
    }

    public static List<Product> getCatalogShowers(Resources res){
        if(catalogShowers == null) {
            catalogShowers = new Vector<Product>();
            catalogShowers.add(new Product("4\" Round", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogShowers.add(new Product("4\" Square", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BROWN", 24.99));
            catalogShowers.add(new Product("6\" Round", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogShowers.add(new Product("6\" Square", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BROWN", 24.99));
            catalogShowers.add(new Product("8\" Round", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BLACK", 29.99));
            catalogShowers.add(new Product("8\" Square", res
                    .getDrawable(R.drawable.placeholder),
                    "The colour is BROWN", 24.99));
            catalogShowers.add(new Product("4X6", res
                    .getDrawable(R.drawable.placeholder),
                    "The Colour is GRAY", 14.99));
            catalogShowers.add(new Product("6X8", res
                    .getDrawable(R.drawable.placeholder),
                    "The Colour is GRAY", 14.99));
            catalogShowers.add(new Product("9\"", res
                    .getDrawable(R.drawable.placeholder),
                    "The Colour is GRAY", 14.99));
            catalogShowers.add(new Product("10\"", res
                    .getDrawable(R.drawable.placeholder),
                    "The Colour is GRAY", 14.99));
            catalogShowers.add(new Product("Other Fancy Showers", res
                    .getDrawable(R.drawable.placeholder),
                    "The Colour is GRAY", 14.99));
        }

        return catalogShowers;
    }

    public static void setQuantity(Product product, int quantity) {
        // Get the current cart entry
        ShoppingCartEntry curEntry = cartMap.get(product);

        // If the quantity is zero or less, remove the products
        if(quantity <= 0) {
            if(curEntry != null)
                removeProduct(product);
            return;
        }

        // If a current cart entry doesn't exist, create one
        if(curEntry == null) {
            curEntry = new ShoppingCartEntry(product, quantity);
            cartMap.put(product, curEntry);
            return;
        }

        // Update the quantity
        curEntry.setQuantity(quantity);
    }

    public static int getProductQuantity(Product product) {
        // Get the current cart entry
        ShoppingCartEntry curEntry = cartMap.get(product);

        if(curEntry != null)
            return curEntry.getQuantity();

        return 0;
    }

    public static void removeProduct(Product product) {

        cartMap.remove(product);
    }

    public static List<Product> getCartList() {
        List<Product> cartList = new Vector<Product>(cartMap.keySet().size());
        for(Product p : cartMap.keySet()) {
            cartList.add(p);
        }

        return cartList;
    }
}