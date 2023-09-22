package com.jdev.minesweeper;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class easyPlay extends AppCompatActivity {
//Variable creation
    //Block
    public Button block1;	public Button block2;	public Button block3;	public Button block4;	public Button block5;	public Button block6;	public Button block7;	public Button block8;	public Button block9;	public Button block10;
    public Button block11;	public Button block12;	public Button block13;	public Button block14;	public Button block15;	public Button block16;	public Button block17;	public Button block18;	public Button block19;	public Button block20;
    public Button block21;	public Button block22;	public Button block23;	public Button block24;	public Button block25;	public Button block26;	public Button block27;	public Button block28;	public Button block29;	public Button block30;
    public Button block31;	public Button block32;	public Button block33;	public Button block34;	public Button block35;	public Button block36;	public Button block37;	public Button block38;	public Button block39;	public Button block40;
    public Button block41;	public Button block42;	public Button block43;	public Button block44;	public Button block45;	public Button block46;	public Button block47;	public Button block48;	public Button block49;	public Button block50;
    public Button block51;	public Button block52;	public Button block53;	public Button block54;	public Button block55;	public Button block56;	public Button block57;	public Button block58;	public Button block59;	public Button block60;
    public Button block61;	public Button block62;	public Button block63;	public Button block64;	public Button block65;	public Button block66;	public Button block67;	public Button block68;	public Button block69;	public Button block70;
    public Button block71;	public Button block72;	public Button block73;	public Button block74;	public Button block75;	public Button block76;	public Button block77;	public Button block78;	public Button block79;	public Button block80;
    public Button block81;	public Button block82;	public Button block83;	public Button block84;	public Button block85;	public Button block86;	public Button block87;	public Button block88;	public Button block89;	public Button block90;
    public Button block91;	public Button block92;	public Button block93;	public Button block94;	public Button block95;	public Button block96;	public Button block97;	public Button block98;	public Button block99;	public Button block100;
    public Button block101;	public Button block102;	public Button block103;	public Button block104;	public Button block105;	public Button block106;	public Button block107;	public Button block108;	public Button block109;	public Button block110;
    public Button block111;	public Button block112;	public Button block113;	public Button block114;	public Button block115;	public Button block116;	public Button block117;	public Button block118;	public Button block119;	public Button block120;
    public Button block121;	public Button block122;	public Button block123;	public Button block124;	public Button block125;	public Button block126;	public Button block127;	public Button block128;	public Button block129;	public Button block130;
    public Button block131;	public Button block132;	public Button block133;	public Button block134;	public Button block135;	public Button block136;	public Button block137;	public Button block138;	public Button block139;	public Button block140;
    public Button block141;	public Button block142;	public Button block143;	public Button block144;	public Button block145;	public Button block146;	public Button block147;	public Button block148;	public Button block149;	public Button block150;


    //Things to change baced on gride dementions
    private int grid_width;
    private int grid_hight;

    //Bombs made
    private int bomb_1;
    private int bomb_2;
    private int bomb_3;
    private int bomb_7;
    private int bomb_4;
    private int bomb_5;
    private int bomb_6;
    private int bomb_8;
    private int bomb_9;
    private int bomb_15;
    private int bomb_10;
    private int bomb_11;
    private int bomb_12;
    private int bomb_13;
    private int bomb_14;
    private boolean bombCheckLoop;
    private int bombCheckInt;


    //Make the position inagers for wheen teh button is pressed
    private int positionHorizontal;
    // For consul log
    private static final String TAG = "easyPlay";

    //USed as the conditional for the buttons output from teh method
    private int bombOrNot;

    //Colors for the onclick listeners of buttons
    private String transparentColor = "#00000000";
    private String playBlue1 = "#0044FF";
    private String playGreen2 = "#59FF00";
    private String playRed3 = "#FF0000";
    private String playPurple4= "#3700FF";

    //Alert dialog
    public AlertDialog.Builder alertDialog;

    public int winTotal;
    public int winOrNot;

    List<Integer> otherPositionArray = new ArrayList<Integer>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_play);


        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;

        //find all of the differnt blocks
        block1 = findViewById(R.id.block1);
        block2 = findViewById(R.id.block2);
        block3 = findViewById(R.id.block3);
        block4 = findViewById(R.id.block4);
        block5 = findViewById(R.id.block5);
        block6 = findViewById(R.id.block6);
        block7 = findViewById(R.id.block7);
        block8 = findViewById(R.id.block8);
        block9 = findViewById(R.id.block9);
        block10 = findViewById(R.id.block10);
        block11 = findViewById(R.id.block11);
        block12 = findViewById(R.id.block12);
        block13 = findViewById(R.id.block13);
        block14 = findViewById(R.id.block14);
        block15 = findViewById(R.id.block15);
        block16 = findViewById(R.id.block16);
        block17 = findViewById(R.id.block17);
        block18 = findViewById(R.id.block18);
        block19 = findViewById(R.id.block19);
        block20 = findViewById(R.id.block20);
        block21 = findViewById(R.id.block21);
        block22 = findViewById(R.id.block22);
        block23 = findViewById(R.id.block23);
        block24 = findViewById(R.id.block24);
        block25 = findViewById(R.id.block25);
        block26 = findViewById(R.id.block26);
        block27 = findViewById(R.id.block27);
        block28 = findViewById(R.id.block28);
        block29 = findViewById(R.id.block29);
        block30 = findViewById(R.id.block30);
        block31 = findViewById(R.id.block31);
        block32 = findViewById(R.id.block32);
        block33 = findViewById(R.id.block33);
        block34 = findViewById(R.id.block34);
        block35 = findViewById(R.id.block35);
        block36 = findViewById(R.id.block36);
        block37 = findViewById(R.id.block37);
        block38 = findViewById(R.id.block38);
        block39 = findViewById(R.id.block39);
        block40 = findViewById(R.id.block40);
        block41 = findViewById(R.id.block41);
        block42 = findViewById(R.id.block42);
        block43 = findViewById(R.id.block43);
        block44 = findViewById(R.id.block44);
        block45 = findViewById(R.id.block45);
        block46 = findViewById(R.id.block46);
        block47 = findViewById(R.id.block47);
        block48 = findViewById(R.id.block48);
        block49 = findViewById(R.id.block49);
        block50 = findViewById(R.id.block50);
        block51 = findViewById(R.id.block51);
        block52 = findViewById(R.id.block52);
        block53 = findViewById(R.id.block53);
        block54 = findViewById(R.id.block54);
        block55 = findViewById(R.id.block55);
        block56 = findViewById(R.id.block56);
        block57 = findViewById(R.id.block57);
        block58 = findViewById(R.id.block58);
        block59 = findViewById(R.id.block59);
        block60 = findViewById(R.id.block60);
        block61 = findViewById(R.id.block61);
        block62 = findViewById(R.id.block62);
        block63 = findViewById(R.id.block63);
        block64 = findViewById(R.id.block64);
        block65 = findViewById(R.id.block65);
        block66 = findViewById(R.id.block66);
        block67 = findViewById(R.id.block67);
        block68 = findViewById(R.id.block68);
        block69 = findViewById(R.id.block69);
        block70 = findViewById(R.id.block70);
        block71 = findViewById(R.id.block71);
        block72 = findViewById(R.id.block72);
        block73 = findViewById(R.id.block73);
        block74 = findViewById(R.id.block74);
        block75 = findViewById(R.id.block75);
        block76 = findViewById(R.id.block76);
        block77 = findViewById(R.id.block77);
        block78 = findViewById(R.id.block78);
        block79 = findViewById(R.id.block79);
        block80 = findViewById(R.id.block80);
        block81 = findViewById(R.id.block81);
        block82 = findViewById(R.id.block82);
        block83 = findViewById(R.id.block83);
        block84 = findViewById(R.id.block84);
        block85 = findViewById(R.id.block85);
        block86 = findViewById(R.id.block86);
        block87 = findViewById(R.id.block87);
        block88 = findViewById(R.id.block88);
        block89 = findViewById(R.id.block89);
        block90 = findViewById(R.id.block90);
        block91 = findViewById(R.id.block91);
        block92 = findViewById(R.id.block92);
        block93 = findViewById(R.id.block93);
        block94 = findViewById(R.id.block94);
        block95 = findViewById(R.id.block95);
        block96 = findViewById(R.id.block96);
        block97 = findViewById(R.id.block97);
        block98 = findViewById(R.id.block98);
        block99 = findViewById(R.id.block99);
        block100 = findViewById(R.id.block100);
        block101 = findViewById(R.id.block101);
        block102 = findViewById(R.id.block102);
        block103 = findViewById(R.id.block103);
        block104 = findViewById(R.id.block104);
        block105 = findViewById(R.id.block105);
        block106 = findViewById(R.id.block106);
        block107 = findViewById(R.id.block107);
        block108 = findViewById(R.id.block108);
        block109 = findViewById(R.id.block109);
        block110 = findViewById(R.id.block110);
        block111 = findViewById(R.id.block111);
        block112 = findViewById(R.id.block112);
        block113 = findViewById(R.id.block113);
        block114 = findViewById(R.id.block114);
        block115 = findViewById(R.id.block115);
        block116 = findViewById(R.id.block116);
        block117 = findViewById(R.id.block117);
        block118 = findViewById(R.id.block118);
        block119 = findViewById(R.id.block119);
        block120 = findViewById(R.id.block120);
        block121 = findViewById(R.id.block121);
        block122 = findViewById(R.id.block122);
        block123 = findViewById(R.id.block123);
        block124 = findViewById(R.id.block124);
        block125 = findViewById(R.id.block125);
        block126 = findViewById(R.id.block126);
        block127 = findViewById(R.id.block127);
        block128 = findViewById(R.id.block128);
        block129 = findViewById(R.id.block129);
        block130 = findViewById(R.id.block130);
        block131 = findViewById(R.id.block131);
        block132 = findViewById(R.id.block132);
        block133 = findViewById(R.id.block133);
        block134 = findViewById(R.id.block134);
        block135 = findViewById(R.id.block135);
        block136 = findViewById(R.id.block136);
        block137 = findViewById(R.id.block137);
        block138 = findViewById(R.id.block138);
        block139 = findViewById(R.id.block139);
        block140 = findViewById(R.id.block140);
        block141 = findViewById(R.id.block141);
        block142 = findViewById(R.id.block142);
        block143 = findViewById(R.id.block143);
        block144 = findViewById(R.id.block144);
        block145 = findViewById(R.id.block145);
        block146 = findViewById(R.id.block146);
        block147 = findViewById(R.id.block147);
        block148 = findViewById(R.id.block148);
        block149 = findViewById(R.id.block149);
        block150 = findViewById(R.id.block150);


        //End finding all of the blocks

        //CHnag bvaced on grid size to change the entire program
        grid_width = 10;
        grid_hight = 16;

        //END CHanges to gride size for level changes

        //Random Number for the position of each bomb

        //Random Number master
        final Random rand = new Random();

        //FIgure out if teh bombs equal eachother
        bombCheckLoop = true;

        //Loop taht loops intill they are equal

        while (bombCheckLoop == true) {
            //Random number for each bomb
            bomb_1 = rand.nextInt(150)+1;
            bomb_2 = rand.nextInt(150)+1;
            bomb_3 = rand.nextInt(150)+1;
            bomb_4 = rand.nextInt(150)+1;
            bomb_5 = rand.nextInt(150)+1;
            bomb_6 = rand.nextInt(150)+1;
            bomb_7 = rand.nextInt(150)+1;
            bomb_8 = rand.nextInt(150)+1;
            bomb_9 = rand.nextInt(150)+1;
            bomb_10 = rand.nextInt(150)+1;
            bomb_11 = rand.nextInt(150)+1;
            bomb_12 = rand.nextInt(150)+1;
            bomb_13 = rand.nextInt(150)+1;
            bomb_14 = rand.nextInt(150)+1;
            bomb_15 = rand.nextInt(150)+1;

            //Going to cheacking method to make tehm not equal
            //Bomb 1
            bombCheckInt = bombCheckInt + bombEqual(bomb_1, bomb_2, bomb_3, bomb_4, bomb_5, bomb_6, bomb_7, bomb_8, bomb_9, bomb_10, bomb_11, bomb_12, bomb_13, bomb_14, bomb_15);
            //Bomb 2
            bombCheckInt = bombCheckInt + bombEqual(bomb_2, bomb_1, bomb_3, bomb_4, bomb_5, bomb_6, bomb_7, bomb_8, bomb_9, bomb_10, bomb_11, bomb_12, bomb_13, bomb_14, bomb_15);
            //Bomb 3
            bombCheckInt = bombCheckInt + bombEqual(bomb_3, bomb_2, bomb_1, bomb_4, bomb_5, bomb_6, bomb_7, bomb_8, bomb_9, bomb_10, bomb_11, bomb_12, bomb_13, bomb_14, bomb_15);
            //Bomb 4
            bombCheckInt = bombCheckInt + bombEqual(bomb_4, bomb_2, bomb_3, bomb_1, bomb_5, bomb_6, bomb_7, bomb_8, bomb_9, bomb_10, bomb_11, bomb_12, bomb_13, bomb_14, bomb_15);
            //Bomb 5
            bombCheckInt = bombCheckInt + bombEqual(bomb_5, bomb_2, bomb_3, bomb_4, bomb_1, bomb_6, bomb_7, bomb_8, bomb_9, bomb_10, bomb_11, bomb_12, bomb_13, bomb_14, bomb_15);
            //Bomb 6
            bombCheckInt = bombCheckInt + bombEqual(bomb_6, bomb_2, bomb_3, bomb_4, bomb_5, bomb_1, bomb_7, bomb_8, bomb_9, bomb_10, bomb_11, bomb_12, bomb_13, bomb_14, bomb_15);
            //Bomb 7
            bombCheckInt = bombCheckInt + bombEqual(bomb_7, bomb_2, bomb_3, bomb_4, bomb_5, bomb_6, bomb_1, bomb_8, bomb_9, bomb_10, bomb_11, bomb_12, bomb_13, bomb_14, bomb_15);
            //Bomb 8
            bombCheckInt = bombCheckInt + bombEqual(bomb_8, bomb_2, bomb_3, bomb_4, bomb_5, bomb_6, bomb_7, bomb_1, bomb_9, bomb_10, bomb_11, bomb_12, bomb_13, bomb_14, bomb_15);
            //Bomb 9
            bombCheckInt = bombCheckInt + bombEqual(bomb_9, bomb_2, bomb_3, bomb_4, bomb_5, bomb_6, bomb_7, bomb_8, bomb_1, bomb_10, bomb_11, bomb_12, bomb_13, bomb_14, bomb_15);
            //Bomb 10
            bombCheckInt = bombCheckInt + bombEqual(bomb_10, bomb_2, bomb_3, bomb_4, bomb_5, bomb_6, bomb_7, bomb_8, bomb_9, bomb_1, bomb_11, bomb_12, bomb_13, bomb_14, bomb_15);
            //Bomb 11
            bombCheckInt = bombCheckInt + bombEqual(bomb_11, bomb_2, bomb_3, bomb_4, bomb_5, bomb_6, bomb_7, bomb_8, bomb_9, bomb_10, bomb_1, bomb_12, bomb_13, bomb_14, bomb_15);
            //Bomb 12
            bombCheckInt = bombCheckInt + bombEqual(bomb_12, bomb_2, bomb_3, bomb_4, bomb_5, bomb_6, bomb_7, bomb_8, bomb_9, bomb_10, bomb_11, bomb_1, bomb_13, bomb_14, bomb_15);
            //Bomb 13
            bombCheckInt = bombCheckInt + bombEqual(bomb_13, bomb_2, bomb_3, bomb_4, bomb_5, bomb_6, bomb_7, bomb_8, bomb_9, bomb_10, bomb_11, bomb_12, bomb_1, bomb_14, bomb_15);
            //Bomb 14
            bombCheckInt = bombCheckInt + bombEqual(bomb_14, bomb_2, bomb_3, bomb_4, bomb_5, bomb_6, bomb_7, bomb_8, bomb_9, bomb_10, bomb_11, bomb_12, bomb_13, bomb_1, bomb_15);
            //Bomb 15
            bombCheckInt = bombCheckInt + bombEqual(bomb_15, bomb_2, bomb_3, bomb_4, bomb_5, bomb_6, bomb_7, bomb_8, bomb_9, bomb_10, bomb_11, bomb_12, bomb_13, bomb_14, bomb_1);



            if (bombCheckInt == 0) {
                break;
            } else {
                bombCheckInt = 0;

            }
        }//End Bomb CHeack loop
        Log.i(TAG, "New set of bombs");
        Log.i(TAG, "Bomb1 Position Hosiontal is:" + bomb_1);
        Log.i(TAG, "Bomb2 Position Hosiontal is:" + bomb_2);
        Log.i(TAG, "Bomb3 Position Hosiontal is:" + bomb_3);
        Log.i(TAG, "Bomb4 Position Hosiontal is:" + bomb_4);
        Log.i(TAG, "Bomb5 Position Hosiontal is:" + bomb_5);
        Log.i(TAG, "Bomb6 Position Hosiontal is:" + bomb_6);
        Log.i(TAG, "Bomb7 Position Hosiontal is:" + bomb_7);
        Log.i(TAG, "Bomb8 Position Hosiontal is:" + bomb_8);
        Log.i(TAG, "Bomb9 Position Hosiontal is:" + bomb_9);
        Log.i(TAG, "Bomb10 Position Hosiontal is:" + bomb_10);
        Log.i(TAG, "Bomb11 Position Hosiontal is:" + bomb_11);
        Log.i(TAG, "Bomb12 Position Hosiontal is:" + bomb_12);
        Log.i(TAG, "Bomb13 Position Hosiontal is:" + bomb_13);
        Log.i(TAG, "Bomb14 Position Hosiontal is:" + bomb_14);
        Log.i(TAG, "Bomb15 Position Hosiontal is:" + bomb_15);



        //Make on clcick lsitener for each of teh buttons
        block1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 1;
//                for(int d= 150; 0<d; d-- ){
//                calculateAround(d);
//                }
                blockClick(positionHorizontal);
            }
        });
        block2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 2;
                blockClick(positionHorizontal);
            }
        });
        block3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 3;
                blockClick(positionHorizontal);
            }
        });
        block4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 4;
                blockClick(positionHorizontal);
            }
        });
        block5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 5;
                blockClick(positionHorizontal);
            }
        });
        block6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 6;
                blockClick(positionHorizontal);
            }
        });
        block7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 7;
                blockClick(positionHorizontal);
            }
        });
        block8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 8;
                blockClick(positionHorizontal);
            }
        });
        block9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 9;
                blockClick(positionHorizontal);
            }
        });
        block10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 10;
                blockClick(positionHorizontal);
            }
        });
        block11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 11;
                blockClick(positionHorizontal);
            }
        });
        block12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 12;
                blockClick(positionHorizontal);
            }
        });
        block13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 13;
                blockClick(positionHorizontal);
            }
        });
        block14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 14;
                blockClick(positionHorizontal);
            }
        });
        block15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 15;
                blockClick(positionHorizontal);
            }
        });
        block16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 16;
                blockClick(positionHorizontal);
            }
        });
        block17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 17;
                blockClick(positionHorizontal);
            }
        });
        block18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 18;
                blockClick(positionHorizontal);
            }
        });
        block19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 19;
                blockClick(positionHorizontal);
            }
        });
        block20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 20;
                blockClick(positionHorizontal);
            }
        });
        block21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 21;
                blockClick(positionHorizontal);
            }
        });
        block22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 22;
                blockClick(positionHorizontal);
            }
        });
        block23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 23;
                blockClick(positionHorizontal);
            }
        });
        block24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 24;
                blockClick(positionHorizontal);
            }
        });
        block25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 25;
                blockClick(positionHorizontal);
            }
        });
        block26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 26;
                blockClick(positionHorizontal);
            }
        });
        block27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 27;
                blockClick(positionHorizontal);
            }
        });
        block28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 28;
                blockClick(positionHorizontal);
            }
        });
        block29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 29;
                blockClick(positionHorizontal);
            }
        });
        block30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 30;
                blockClick(positionHorizontal);
            }
        });
        block31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 31;
                blockClick(positionHorizontal);
            }
        });
        block32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 32;
                blockClick(positionHorizontal);
            }
        });
        block33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 33;
                blockClick(positionHorizontal);
            }
        });
        block34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 34;
                blockClick(positionHorizontal);
            }
        });
        block35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 35;
                blockClick(positionHorizontal);
            }
        });
        block36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 36;
                blockClick(positionHorizontal);
            }
        });
        block37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 37;
                blockClick(positionHorizontal);
            }
        });
        block38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 38;
                blockClick(positionHorizontal);
            }
        });
        block39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 39;
                blockClick(positionHorizontal);
            }
        });
        block40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 40;
                blockClick(positionHorizontal);
            }
        });
        block41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 41;
                blockClick(positionHorizontal);
            }
        });
        block42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 42;
                blockClick(positionHorizontal);
            }
        });
        block43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 43;
                blockClick(positionHorizontal);
            }
        });
        block44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 44;
                blockClick(positionHorizontal);
            }
        });
        block45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 45;
                blockClick(positionHorizontal);
            }
        });
        block46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 46;
                blockClick(positionHorizontal);
            }
        });
        block47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 47;
                blockClick(positionHorizontal);
            }
        });
        block48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 48;
                blockClick(positionHorizontal);
            }
        });
        block49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 49;
                blockClick(positionHorizontal);
            }
        });
        block50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 50;
                blockClick(positionHorizontal);
            }
        });
        block51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 51;
                blockClick(positionHorizontal);
            }
        });
        block52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 52;
                blockClick(positionHorizontal);
            }
        });
        block53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 53;
                blockClick(positionHorizontal);
            }
        });
        block54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 54;
                blockClick(positionHorizontal);
            }
        });
        block55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 55;
                blockClick(positionHorizontal);
            }
        });
        block56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 56;
                blockClick(positionHorizontal);
            }
        });
        block57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 57;
                blockClick(positionHorizontal);
            }
        });
        block58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 58;
                blockClick(positionHorizontal);
            }
        });
        block59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 59;
                blockClick(positionHorizontal);
            }
        });
        block60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 60;
                blockClick(positionHorizontal);
            }
        });
        block61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 61;
                blockClick(positionHorizontal);
            }
        });
        block62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 62;
                blockClick(positionHorizontal);
            }
        });
        block63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 63;
                blockClick(positionHorizontal);
            }
        });
        block64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 64;
                blockClick(positionHorizontal);
            }
        });
        block65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 65;
                blockClick(positionHorizontal);
            }
        });
        block66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 66;
                blockClick(positionHorizontal);
            }
        });
        block67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 67;
                blockClick(positionHorizontal);
            }
        });
        block68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 68;
                blockClick(positionHorizontal);
            }
        });
        block69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 69;
                blockClick(positionHorizontal);
            }
        });
        block70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 70;
                blockClick(positionHorizontal);
            }
        });
        block71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 71;
                blockClick(positionHorizontal);
            }
        });
        block72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 72;
                blockClick(positionHorizontal);
            }
        });
        block73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 73;
                blockClick(positionHorizontal);
            }
        });
        block74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 74;
                blockClick(positionHorizontal);
            }
        });
        block75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 75;
                blockClick(positionHorizontal);
            }
        });
        block76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 76;
                blockClick(positionHorizontal);
            }
        });
        block77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 77;
                blockClick(positionHorizontal);
            }
        });
        block78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 78;
                blockClick(positionHorizontal);
            }
        });
        block79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 79;
                blockClick(positionHorizontal);
            }
        });
        block80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 80;
                blockClick(positionHorizontal);
            }
        });
        block81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 81;
                blockClick(positionHorizontal);
            }
        });
        block82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 82;
                blockClick(positionHorizontal);
            }
        });
        block83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 83;
                blockClick(positionHorizontal);
            }
        });
        block84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 84;
                blockClick(positionHorizontal);
            }
        });
        block85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 85;
                blockClick(positionHorizontal);
            }
        });
        block86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 86;
                blockClick(positionHorizontal);
            }
        });
        block87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 87;
                blockClick(positionHorizontal);
            }
        });
        block88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 88;
                blockClick(positionHorizontal);
            }
        });
        block89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 89;
                blockClick(positionHorizontal);
            }
        });
        block90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 90;
                blockClick(positionHorizontal);
            }
        });
        block91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 91;
                blockClick(positionHorizontal);
            }
        });
        block92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 92;
                blockClick(positionHorizontal);
            }
        });
        block93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 93;
                blockClick(positionHorizontal);
            }
        });
        block94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 94;
                blockClick(positionHorizontal);
            }
        });
        block95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 95;
                blockClick(positionHorizontal);
            }
        });
        block96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 96;
                blockClick(positionHorizontal);
            }
        });
        block97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 97;
                blockClick(positionHorizontal);
            }
        });
        block98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 98;
                blockClick(positionHorizontal);
            }
        });
        block99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 99;
                blockClick(positionHorizontal);
            }
        });
        block100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 100;
                blockClick(positionHorizontal);
            }
        });
        block101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 101;
                blockClick(positionHorizontal);
            }
        });
        block102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 102;
                blockClick(positionHorizontal);
            }
        });
        block103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 103;
                blockClick(positionHorizontal);
            }
        });
        block104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 104;
                blockClick(positionHorizontal);
            }
        });
        block105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 105;
                blockClick(positionHorizontal);
            }
        });
        block106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 106;
                blockClick(positionHorizontal);
            }
        });
        block107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 107;
                blockClick(positionHorizontal);
            }
        });
        block108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 108;
                blockClick(positionHorizontal);
            }
        });
        block109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 109;
                blockClick(positionHorizontal);
            }
        });
        block110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 110;
                blockClick(positionHorizontal);
            }
        });
        block111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 111;
                blockClick(positionHorizontal);
            }
        });
        block112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 112;
                blockClick(positionHorizontal);
            }
        });
        block113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 113;
                blockClick(positionHorizontal);
            }
        });
        block114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 114;
                blockClick(positionHorizontal);
            }
        });
        block115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 115;
                blockClick(positionHorizontal);
            }
        });
        block116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 116;
                blockClick(positionHorizontal);
            }
        });
        block117.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 117;
                blockClick(positionHorizontal);
            }
        });
        block118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 118;
                blockClick(positionHorizontal);
            }
        });
        block119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 119;
                blockClick(positionHorizontal);
            }
        });
        block120.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 120;
                blockClick(positionHorizontal);
            }
        });
        block121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 121;
                blockClick(positionHorizontal);
            }
        });
        block122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 122;
                blockClick(positionHorizontal);
            }
        });
        block123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 123;
                blockClick(positionHorizontal);
            }
        });
        block124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 124;
                blockClick(positionHorizontal);
            }
        });
        block125.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 125;
                blockClick(positionHorizontal);
            }
        });
        block126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 126;
                blockClick(positionHorizontal);
            }
        });
        block127.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 127;
                blockClick(positionHorizontal);
            }
        });
        block128.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 128;
                blockClick(positionHorizontal);
            }
        });
        block129.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 129;
                blockClick(positionHorizontal);
            }
        });
        block130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 130;
                blockClick(positionHorizontal);
            }
        });
        block131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 131;
                blockClick(positionHorizontal);
            }
        });
        block132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 132;
                blockClick(positionHorizontal);
            }
        });
        block133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 133;
                blockClick(positionHorizontal);
            }
        });
        block134.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 134;
                blockClick(positionHorizontal);
            }
        });
        block135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 135;
                blockClick(positionHorizontal);
            }
        });
        block136.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 136;
                blockClick(positionHorizontal);
            }
        });
        block137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 137;
                blockClick(positionHorizontal);
            }
        });
        block138.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 138;
                blockClick(positionHorizontal);
            }
        });
        block139.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 139;
                blockClick(positionHorizontal);
            }
        });
        block140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 140;
                blockClick(positionHorizontal);
            }
        });
        block141.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 141;
                blockClick(positionHorizontal);
            }
        });
        block142.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 142;
                blockClick(positionHorizontal);
            }
        });
        block143.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 143;
                blockClick(positionHorizontal);
            }
        });
        block144.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 144;
                blockClick(positionHorizontal);
            }
        });
        block145.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 145;
                blockClick(positionHorizontal);
            }
        });
        block146.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 146;
                blockClick(positionHorizontal);
            }
        });
        block147.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 147;
                blockClick(positionHorizontal);
            }
        });
        block148.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 148;
                blockClick(positionHorizontal);
            }
        });
        block149.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 149;
                blockClick(positionHorizontal);
            }
        });
        block150.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionHorizontal = 150;
                blockClick(positionHorizontal);
            }
        });
    }//End main


private  void blockClick(int positionHorizontal){
        otherPositionArray.clear();

        //CHeacks if position hosizonatal is a bomb
    if (positionHorizontal == bomb_1 || positionHorizontal == bomb_2 || positionHorizontal == bomb_3 || positionHorizontal == bomb_4 || positionHorizontal == bomb_5 || positionHorizontal == bomb_6 || positionHorizontal == bomb_7 || positionHorizontal ==
            bomb_8 || positionHorizontal == bomb_9 || positionHorizontal == bomb_10 || positionHorizontal == bomb_11 || positionHorizontal == bomb_12 || positionHorizontal == bomb_13 || positionHorizontal == bomb_14 || positionHorizontal == bomb_15) {
        outputBox(positionHorizontal,-1);
        whenLose();
    }else {
        calculateAround(positionHorizontal);
    }
    int positionArraySise = otherPositionArray.size();
    Log.i(TAG, "Other position array size = "+positionArraySise);

    if (positionArraySise != 0) {

        boolean positionLoop = true;
        Log.i(TAG, "Other position array size = "+positionArraySise);

       while (positionLoop == true) {

            positionArraySise = otherPositionArray.size();
            int positionChange = positionArraySise;

            for (int a = 0; positionArraySise > a;a++) {

                calculateAround(otherPositionArray.get(0));
            }
            positionArraySise = otherPositionArray.size();


            if (0 == positionArraySise) {
                positionLoop = false;
            }
// for a temporary version
        winYet();







        }// end of positionLoop
    }
    }//End of Method


    public void calculateAround(int positionHorizontal){
        int bombOrNot = 0;
        int otherPosition1 =-1;
        int otherPosition2 = -1;
        int otherPosition3 = -1;
        int otherPosition4 = -1;
        int otherPosition6 = -1;
        int otherPosition7 = -1;
        int otherPosition8 = -1;
        int otherPosition9 = -1;


        //Cheack if the button you click equals a bomb
        bombOrNot = 0;




        //Cheack to see if teh 9 blocks aorund it are bombs

        //new code
        if (positionHorizontal == 2||positionHorizontal == 3||positionHorizontal == 4||positionHorizontal == 5||positionHorizontal == 6||positionHorizontal == 7||positionHorizontal == 8||positionHorizontal == 9){
            otherPosition4 = positionHorizontal - 1;
            otherPosition6 = positionHorizontal + 1;
            otherPosition7 = positionHorizontal+9;
            otherPosition8 = positionHorizontal +10;
            otherPosition9 = positionHorizontal+11;
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition4);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition6);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition7);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition8);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition9);
        }else if (positionHorizontal ==11||positionHorizontal ==21||positionHorizontal ==31||positionHorizontal ==41||positionHorizontal ==51||positionHorizontal ==61||positionHorizontal ==71||positionHorizontal ==81||positionHorizontal ==91
                ||positionHorizontal ==101||positionHorizontal ==111||positionHorizontal ==121||positionHorizontal ==131){
            otherPosition2 = positionHorizontal -10;
            otherPosition3 = positionHorizontal -9;
            otherPosition6 = positionHorizontal + 1;
            otherPosition8 = positionHorizontal +10;
            otherPosition9 = positionHorizontal+11;
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition2);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition3);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition6);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition8);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition9);
        }else if (positionHorizontal ==20||positionHorizontal ==30||positionHorizontal ==40||positionHorizontal ==50||positionHorizontal ==60||positionHorizontal ==70||positionHorizontal ==80
                ||positionHorizontal ==90||positionHorizontal ==100||positionHorizontal ==110||positionHorizontal ==120||positionHorizontal ==130||positionHorizontal ==140){
            otherPosition1 = positionHorizontal -11;
            otherPosition2 = positionHorizontal -10;
            otherPosition4 = positionHorizontal - 1;
            otherPosition7 = positionHorizontal+9;
            otherPosition8 = positionHorizontal +10;
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition1);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition2);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition4);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition7);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition8);
        }else if (positionHorizontal ==142||positionHorizontal ==143||positionHorizontal ==144||positionHorizontal ==145||positionHorizontal ==146||positionHorizontal ==147||positionHorizontal ==148||positionHorizontal ==149){
            otherPosition1 = positionHorizontal -11;
            otherPosition2 = positionHorizontal -10;
            otherPosition3 = positionHorizontal -9;
            otherPosition4 = positionHorizontal - 1;
            otherPosition6 = positionHorizontal + 1;
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition1);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition2);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition3);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition4);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition6);
        }else if (positionHorizontal ==1){
            otherPosition6 = positionHorizontal + 1;
            otherPosition8 = positionHorizontal +10;
            otherPosition9 = positionHorizontal+11;
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition6);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition8);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition9);
        }else if (positionHorizontal == 10){
            otherPosition4 = positionHorizontal - 1;
            otherPosition7 = positionHorizontal+9;
            otherPosition8 = positionHorizontal +10;
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition4);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition7);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition8);
        }else if (positionHorizontal == 141){
            otherPosition2 = positionHorizontal -10;
            otherPosition3 = positionHorizontal -9;
            otherPosition6 = positionHorizontal + 1;
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition2);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition3);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition6);
        }else if (positionHorizontal == 150){
            otherPosition1 = positionHorizontal -11;
            otherPosition2 = positionHorizontal -10;
            otherPosition4 = positionHorizontal - 1;
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition1);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition2);
            bombOrNot = bombOrNot +  positionEqualsBomb(otherPosition4);
        }else {
            otherPosition1 = positionHorizontal - 11;
            otherPosition2 = positionHorizontal - 10;
            otherPosition3 = positionHorizontal - 9;
            otherPosition4 = positionHorizontal - 1;
            otherPosition6 = positionHorizontal + 1;
            otherPosition7 = positionHorizontal + 9;
            otherPosition8 = positionHorizontal + 10;
            otherPosition9 = positionHorizontal + 11;

            bombOrNot = bombOrNot + positionEqualsBomb(otherPosition1);
            bombOrNot = bombOrNot + positionEqualsBomb(otherPosition2);
            bombOrNot = bombOrNot + positionEqualsBomb(otherPosition3);
            bombOrNot = bombOrNot + positionEqualsBomb(otherPosition4);
            bombOrNot = bombOrNot + positionEqualsBomb(otherPosition6);
            bombOrNot = bombOrNot + positionEqualsBomb(otherPosition7);
            bombOrNot = bombOrNot + positionEqualsBomb(otherPosition8);
            bombOrNot = bombOrNot + positionEqualsBomb(otherPosition9);
        }

        outputBox(positionHorizontal,bombOrNot);

        //If there are no bombs around
        if (bombOrNot == 0) {
            if (otherPosition1 != -1) otherPositionArray.add(otherPosition1);
            if (otherPosition2 != -1) otherPositionArray.add(otherPosition2);
            if (otherPosition3 != -1) otherPositionArray.add(otherPosition3);
            if (otherPosition4 != -1) otherPositionArray.add(otherPosition4);
            if (otherPosition6 != -1) otherPositionArray.add(otherPosition6);
            if (otherPosition7 != -1) otherPositionArray.add(otherPosition7);
            if (otherPosition8 != -1) otherPositionArray.add(otherPosition8);
            if (otherPosition9 != -1) otherPositionArray.add(otherPosition9);
        }
            int positionArraySise = otherPositionArray.size();
        if (positionArraySise !=0) {
            otherPositionArray.remove(0);
        }

//        Log.i(TAG, "position hosisontal = "+positionHorizontal);


    }

    public void outputBox(int positionHorizontal, int bombOrNot){
        switch (positionHorizontal){
            case 1:
                if (bombOrNot == -1) {
                    block1.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block1.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block1.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block1.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block1.setTextColor(Color.parseColor(playRed3));
                    else block1.setTextColor(Color.parseColor(playPurple4));
                    block1.setText(Integer.toString(bombOrNot)); }
                break;
            case 2:
                if (bombOrNot == -1) {
                    block2.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block2.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block2.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block2.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block2.setTextColor(Color.parseColor(playRed3));
                    else block2.setTextColor(Color.parseColor(playPurple4));
                    block2.setText(Integer.toString(bombOrNot)); }
                break;
            case 3:
                if (bombOrNot == -1) {
                    block3.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block3.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block3.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block3.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block3.setTextColor(Color.parseColor(playRed3));
                    else block3.setTextColor(Color.parseColor(playPurple4));
                    block3.setText(Integer.toString(bombOrNot)); }
                break;
            case 4:
                if (bombOrNot == -1) {
                    block4.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block4.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block4.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block4.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block4.setTextColor(Color.parseColor(playRed3));
                    else block4.setTextColor(Color.parseColor(playPurple4));
                    block4.setText(Integer.toString(bombOrNot)); }
                break;
            case 5:
                if (bombOrNot == -1) {
                    block5.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block5.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block5.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block5.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block5.setTextColor(Color.parseColor(playRed3));
                    else block5.setTextColor(Color.parseColor(playPurple4));
                    block5.setText(Integer.toString(bombOrNot)); }
                break;
            case 6:
                if (bombOrNot == -1) {
                    block6.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block6.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block6.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block6.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block6.setTextColor(Color.parseColor(playRed3));
                    else block6.setTextColor(Color.parseColor(playPurple4));
                    block6.setText(Integer.toString(bombOrNot)); }
                break;
            case 7:
                if (bombOrNot == -1) {
                    block7.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block7.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block7.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block7.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block7.setTextColor(Color.parseColor(playRed3));
                    else block7.setTextColor(Color.parseColor(playPurple4));
                    block7.setText(Integer.toString(bombOrNot)); }
                break;
            case 8:
                if (bombOrNot == -1) {
                    block8.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block8.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block8.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block8.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block8.setTextColor(Color.parseColor(playRed3));
                    else block8.setTextColor(Color.parseColor(playPurple4));
                    block8.setText(Integer.toString(bombOrNot)); }
                break;
            case 9:
                if (bombOrNot == -1) {
                    block9.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block9.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block9.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block9.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block9.setTextColor(Color.parseColor(playRed3));
                    else block9.setTextColor(Color.parseColor(playPurple4));
                    block9.setText(Integer.toString(bombOrNot)); }
                break;
            case 10:
                if (bombOrNot == -1) {
                    block10.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block10.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block10.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block10.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block10.setTextColor(Color.parseColor(playRed3));
                    else block10.setTextColor(Color.parseColor(playPurple4));
                    block10.setText(Integer.toString(bombOrNot)); }
                break;
            case 11:
                if (bombOrNot == -1) {
                    block11.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block11.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block11.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block11.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block11.setTextColor(Color.parseColor(playRed3));
                    else block11.setTextColor(Color.parseColor(playPurple4));
                    block11.setText(Integer.toString(bombOrNot)); }
                break;
            case 12:
                if (bombOrNot == -1) {
                    block12.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block12.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block12.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block12.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block12.setTextColor(Color.parseColor(playRed3));
                    else block12.setTextColor(Color.parseColor(playPurple4));
                    block12.setText(Integer.toString(bombOrNot)); }
                break;
            case 13:
                if (bombOrNot == -1) {
                    block13.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block13.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block13.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block13.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block13.setTextColor(Color.parseColor(playRed3));
                    else block13.setTextColor(Color.parseColor(playPurple4));
                    block13.setText(Integer.toString(bombOrNot)); }
                break;
            case 14:
                if (bombOrNot == -1) {
                    block14.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block14.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block14.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block14.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block14.setTextColor(Color.parseColor(playRed3));
                    else block14.setTextColor(Color.parseColor(playPurple4));
                    block14.setText(Integer.toString(bombOrNot)); }
                break;
            case 15:
                if (bombOrNot == -1) {
                    block15.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block15.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block15.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block15.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block15.setTextColor(Color.parseColor(playRed3));
                    else block15.setTextColor(Color.parseColor(playPurple4));
                    block15.setText(Integer.toString(bombOrNot)); }
                break;
            case 16:
                if (bombOrNot == -1) {
                    block16.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block16.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block16.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block16.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block16.setTextColor(Color.parseColor(playRed3));
                    else block16.setTextColor(Color.parseColor(playPurple4));
                    block16.setText(Integer.toString(bombOrNot)); }
                break;
            case 17:
                if (bombOrNot == -1) {
                    block17.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block17.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block17.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block17.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block17.setTextColor(Color.parseColor(playRed3));
                    else block17.setTextColor(Color.parseColor(playPurple4));
                    block17.setText(Integer.toString(bombOrNot)); }
                break;
            case 18:
                if (bombOrNot == -1) {
                    block18.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block18.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block18.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block18.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block18.setTextColor(Color.parseColor(playRed3));
                    else block18.setTextColor(Color.parseColor(playPurple4));
                    block18.setText(Integer.toString(bombOrNot)); }
                break;
            case 19:
                if (bombOrNot == -1) {
                    block19.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block19.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block19.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block19.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block19.setTextColor(Color.parseColor(playRed3));
                    else block19.setTextColor(Color.parseColor(playPurple4));
                    block19.setText(Integer.toString(bombOrNot)); }
                break;
            case 20:
                if (bombOrNot == -1) {
                    block20.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block20.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block20.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block20.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block20.setTextColor(Color.parseColor(playRed3));
                    else block20.setTextColor(Color.parseColor(playPurple4));
                    block20.setText(Integer.toString(bombOrNot)); }
                break;
            case 21:
                if (bombOrNot == -1) {
                    block21.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block21.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block21.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block21.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block21.setTextColor(Color.parseColor(playRed3));
                    else block21.setTextColor(Color.parseColor(playPurple4));
                    block21.setText(Integer.toString(bombOrNot)); }
                break;
            case 22:
                if (bombOrNot == -1) {
                    block22.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block22.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block22.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block22.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block22.setTextColor(Color.parseColor(playRed3));
                    else block22.setTextColor(Color.parseColor(playPurple4));
                    block22.setText(Integer.toString(bombOrNot)); }
                break;
            case 23:
                if (bombOrNot == -1) {
                    block23.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block23.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block23.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block23.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block23.setTextColor(Color.parseColor(playRed3));
                    else block23.setTextColor(Color.parseColor(playPurple4));
                    block23.setText(Integer.toString(bombOrNot)); }
                break;
            case 24:
                if (bombOrNot == -1) {
                    block24.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block24.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block24.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block24.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block24.setTextColor(Color.parseColor(playRed3));
                    else block24.setTextColor(Color.parseColor(playPurple4));
                    block24.setText(Integer.toString(bombOrNot)); }
                break;
            case 25:
                if (bombOrNot == -1) {
                    block25.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block25.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block25.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block25.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block25.setTextColor(Color.parseColor(playRed3));
                    else block25.setTextColor(Color.parseColor(playPurple4));
                    block25.setText(Integer.toString(bombOrNot)); }
                break;
            case 26:
                if (bombOrNot == -1) {
                    block26.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block26.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block26.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block26.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block26.setTextColor(Color.parseColor(playRed3));
                    else block26.setTextColor(Color.parseColor(playPurple4));
                    block26.setText(Integer.toString(bombOrNot)); }
                break;
            case 27:
                if (bombOrNot == -1) {
                    block27.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block27.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block27.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block27.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block27.setTextColor(Color.parseColor(playRed3));
                    else block27.setTextColor(Color.parseColor(playPurple4));
                    block27.setText(Integer.toString(bombOrNot)); }
                break;
            case 28:
                if (bombOrNot == -1) {
                    block28.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block28.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block28.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block28.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block28.setTextColor(Color.parseColor(playRed3));
                    else block28.setTextColor(Color.parseColor(playPurple4));
                    block28.setText(Integer.toString(bombOrNot)); }
                break;
            case 29:
                if (bombOrNot == -1) {
                    block29.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block29.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block29.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block29.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block29.setTextColor(Color.parseColor(playRed3));
                    else block29.setTextColor(Color.parseColor(playPurple4));
                    block29.setText(Integer.toString(bombOrNot)); }
                break;
            case 30:
                if (bombOrNot == -1) {
                    block30.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block30.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block30.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block30.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block30.setTextColor(Color.parseColor(playRed3));
                    else block30.setTextColor(Color.parseColor(playPurple4));
                    block30.setText(Integer.toString(bombOrNot)); }
                break;
            case 31:
                if (bombOrNot == -1) {
                    block31.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block31.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block31.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block31.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block31.setTextColor(Color.parseColor(playRed3));
                    else block31.setTextColor(Color.parseColor(playPurple4));
                    block31.setText(Integer.toString(bombOrNot)); }
                break;
            case 32:
                if (bombOrNot == -1) {
                    block32.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block32.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block32.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block32.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block32.setTextColor(Color.parseColor(playRed3));
                    else block32.setTextColor(Color.parseColor(playPurple4));
                    block32.setText(Integer.toString(bombOrNot)); }
                break;
            case 33:
                if (bombOrNot == -1) {
                    block33.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block33.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block33.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block33.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block33.setTextColor(Color.parseColor(playRed3));
                    else block33.setTextColor(Color.parseColor(playPurple4));
                    block33.setText(Integer.toString(bombOrNot)); }
                break;
            case 34:
                if (bombOrNot == -1) {
                    block34.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block34.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block34.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block34.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block34.setTextColor(Color.parseColor(playRed3));
                    else block34.setTextColor(Color.parseColor(playPurple4));
                    block34.setText(Integer.toString(bombOrNot)); }
                break;
            case 35:
                if (bombOrNot == -1) {
                    block35.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block35.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block35.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block35.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block35.setTextColor(Color.parseColor(playRed3));
                    else block35.setTextColor(Color.parseColor(playPurple4));
                    block35.setText(Integer.toString(bombOrNot)); }
                break;
            case 36:
                if (bombOrNot == -1) {
                    block36.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block36.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block36.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block36.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block36.setTextColor(Color.parseColor(playRed3));
                    else block36.setTextColor(Color.parseColor(playPurple4));
                    block36.setText(Integer.toString(bombOrNot)); }
                break;
            case 37:
                if (bombOrNot == -1) {
                    block37.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block37.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block37.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block37.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block37.setTextColor(Color.parseColor(playRed3));
                    else block37.setTextColor(Color.parseColor(playPurple4));
                    block37.setText(Integer.toString(bombOrNot)); }
                break;
            case 38:
                if (bombOrNot == -1) {
                    block38.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block38.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block38.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block38.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block38.setTextColor(Color.parseColor(playRed3));
                    else block38.setTextColor(Color.parseColor(playPurple4));
                    block38.setText(Integer.toString(bombOrNot)); }
                break;
            case 39:
                if (bombOrNot == -1) {
                    block39.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block39.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block39.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block39.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block39.setTextColor(Color.parseColor(playRed3));
                    else block39.setTextColor(Color.parseColor(playPurple4));
                    block39.setText(Integer.toString(bombOrNot)); }
                break;
            case 40:
                if (bombOrNot == -1) {
                    block40.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block40.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block40.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block40.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block40.setTextColor(Color.parseColor(playRed3));
                    else block40.setTextColor(Color.parseColor(playPurple4));
                    block40.setText(Integer.toString(bombOrNot)); }
                break;
            case 41:
                if (bombOrNot == -1) {
                    block41.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block41.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block41.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block41.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block41.setTextColor(Color.parseColor(playRed3));
                    else block41.setTextColor(Color.parseColor(playPurple4));
                    block41.setText(Integer.toString(bombOrNot)); }
                break;
            case 42:
                if (bombOrNot == -1) {
                    block42.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block42.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block42.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block42.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block42.setTextColor(Color.parseColor(playRed3));
                    else block42.setTextColor(Color.parseColor(playPurple4));
                    block42.setText(Integer.toString(bombOrNot)); }
                break;
            case 43:
                if (bombOrNot == -1) {
                    block43.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block43.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block43.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block43.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block43.setTextColor(Color.parseColor(playRed3));
                    else block43.setTextColor(Color.parseColor(playPurple4));
                    block43.setText(Integer.toString(bombOrNot)); }
                break;
            case 44:
                if (bombOrNot == -1) {
                    block44.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block44.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block44.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block44.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block44.setTextColor(Color.parseColor(playRed3));
                    else block44.setTextColor(Color.parseColor(playPurple4));
                    block44.setText(Integer.toString(bombOrNot)); }
                break;
            case 45:
                if (bombOrNot == -1) {
                    block45.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block45.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block45.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block45.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block45.setTextColor(Color.parseColor(playRed3));
                    else block45.setTextColor(Color.parseColor(playPurple4));
                    block45.setText(Integer.toString(bombOrNot)); }
                break;
            case 46:
                if (bombOrNot == -1) {
                    block46.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block46.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block46.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block46.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block46.setTextColor(Color.parseColor(playRed3));
                    else block46.setTextColor(Color.parseColor(playPurple4));
                    block46.setText(Integer.toString(bombOrNot)); }
                break;
            case 47:
                if (bombOrNot == -1) {
                    block47.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block47.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block47.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block47.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block47.setTextColor(Color.parseColor(playRed3));
                    else block47.setTextColor(Color.parseColor(playPurple4));
                    block47.setText(Integer.toString(bombOrNot)); }
                break;
            case 48:
                if (bombOrNot == -1) {
                    block48.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block48.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block48.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block48.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block48.setTextColor(Color.parseColor(playRed3));
                    else block48.setTextColor(Color.parseColor(playPurple4));
                    block48.setText(Integer.toString(bombOrNot)); }
                break;
            case 49:
                if (bombOrNot == -1) {
                    block49.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block49.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block49.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block49.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block49.setTextColor(Color.parseColor(playRed3));
                    else block49.setTextColor(Color.parseColor(playPurple4));
                    block49.setText(Integer.toString(bombOrNot)); }
                break;
            case 50:
                if (bombOrNot == -1) {
                    block50.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block50.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block50.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block50.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block50.setTextColor(Color.parseColor(playRed3));
                    else block50.setTextColor(Color.parseColor(playPurple4));
                    block50.setText(Integer.toString(bombOrNot)); }
                break;
            case 51:
                if (bombOrNot == -1) {
                    block51.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block51.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block51.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block51.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block51.setTextColor(Color.parseColor(playRed3));
                    else block51.setTextColor(Color.parseColor(playPurple4));
                    block51.setText(Integer.toString(bombOrNot)); }
                break;
            case 52:
                if (bombOrNot == -1) {
                    block52.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block52.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block52.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block52.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block52.setTextColor(Color.parseColor(playRed3));
                    else block52.setTextColor(Color.parseColor(playPurple4));
                    block52.setText(Integer.toString(bombOrNot)); }
                break;
            case 53:
                if (bombOrNot == -1) {
                    block53.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block53.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block53.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block53.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block53.setTextColor(Color.parseColor(playRed3));
                    else block53.setTextColor(Color.parseColor(playPurple4));
                    block53.setText(Integer.toString(bombOrNot)); }
                break;
            case 54:
                if (bombOrNot == -1) {
                    block54.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block54.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block54.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block54.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block54.setTextColor(Color.parseColor(playRed3));
                    else block54.setTextColor(Color.parseColor(playPurple4));
                    block54.setText(Integer.toString(bombOrNot)); }
                break;
            case 55:
                if (bombOrNot == -1) {
                    block55.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block55.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block55.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block55.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block55.setTextColor(Color.parseColor(playRed3));
                    else block55.setTextColor(Color.parseColor(playPurple4));
                    block55.setText(Integer.toString(bombOrNot)); }
                break;
            case 56:
                if (bombOrNot == -1) {
                    block56.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block56.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block56.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block56.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block56.setTextColor(Color.parseColor(playRed3));
                    else block56.setTextColor(Color.parseColor(playPurple4));
                    block56.setText(Integer.toString(bombOrNot)); }
                break;
            case 57:
                if (bombOrNot == -1) {
                    block57.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block57.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block57.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block57.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block57.setTextColor(Color.parseColor(playRed3));
                    else block57.setTextColor(Color.parseColor(playPurple4));
                    block57.setText(Integer.toString(bombOrNot)); }
                break;
            case 58:
                if (bombOrNot == -1) {
                    block58.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block58.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block58.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block58.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block58.setTextColor(Color.parseColor(playRed3));
                    else block58.setTextColor(Color.parseColor(playPurple4));
                    block58.setText(Integer.toString(bombOrNot)); }
                break;
            case 59:
                if (bombOrNot == -1) {
                    block59.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block59.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block59.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block59.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block59.setTextColor(Color.parseColor(playRed3));
                    else block59.setTextColor(Color.parseColor(playPurple4));
                    block59.setText(Integer.toString(bombOrNot)); }
                break;
            case 60:
                if (bombOrNot == -1) {
                    block60.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block60.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block60.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block60.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block60.setTextColor(Color.parseColor(playRed3));
                    else block60.setTextColor(Color.parseColor(playPurple4));
                    block60.setText(Integer.toString(bombOrNot)); }
                break;
            case 61:
                if (bombOrNot == -1) {
                    block61.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block61.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block61.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block61.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block61.setTextColor(Color.parseColor(playRed3));
                    else block61.setTextColor(Color.parseColor(playPurple4));
                    block61.setText(Integer.toString(bombOrNot)); }
                break;
            case 62:
                if (bombOrNot == -1) {
                    block62.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block62.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block62.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block62.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block62.setTextColor(Color.parseColor(playRed3));
                    else block62.setTextColor(Color.parseColor(playPurple4));
                    block62.setText(Integer.toString(bombOrNot)); }
                break;
            case 63:
                if (bombOrNot == -1) {
                    block63.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block63.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block63.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block63.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block63.setTextColor(Color.parseColor(playRed3));
                    else block63.setTextColor(Color.parseColor(playPurple4));
                    block63.setText(Integer.toString(bombOrNot)); }
                break;
            case 64:
                if (bombOrNot == -1) {
                    block64.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block64.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block64.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block64.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block64.setTextColor(Color.parseColor(playRed3));
                    else block64.setTextColor(Color.parseColor(playPurple4));
                    block64.setText(Integer.toString(bombOrNot)); }
                break;
            case 65:
                if (bombOrNot == -1) {
                    block65.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block65.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block65.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block65.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block65.setTextColor(Color.parseColor(playRed3));
                    else block65.setTextColor(Color.parseColor(playPurple4));
                    block65.setText(Integer.toString(bombOrNot)); }
                break;
            case 66:
                if (bombOrNot == -1) {
                    block66.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block66.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block66.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block66.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block66.setTextColor(Color.parseColor(playRed3));
                    else block66.setTextColor(Color.parseColor(playPurple4));
                    block66.setText(Integer.toString(bombOrNot)); }
                break;
            case 67:
                if (bombOrNot == -1) {
                    block67.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block67.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block67.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block67.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block67.setTextColor(Color.parseColor(playRed3));
                    else block67.setTextColor(Color.parseColor(playPurple4));
                    block67.setText(Integer.toString(bombOrNot)); }
                break;
            case 68:
                if (bombOrNot == -1) {
                    block68.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block68.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block68.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block68.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block68.setTextColor(Color.parseColor(playRed3));
                    else block68.setTextColor(Color.parseColor(playPurple4));
                    block68.setText(Integer.toString(bombOrNot)); }
                break;
            case 69:
                if (bombOrNot == -1) {
                    block69.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block69.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block69.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block69.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block69.setTextColor(Color.parseColor(playRed3));
                    else block69.setTextColor(Color.parseColor(playPurple4));
                    block69.setText(Integer.toString(bombOrNot)); }
                break;
            case 70:
                if (bombOrNot == -1) {
                    block70.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block70.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block70.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block70.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block70.setTextColor(Color.parseColor(playRed3));
                    else block70.setTextColor(Color.parseColor(playPurple4));
                    block70.setText(Integer.toString(bombOrNot)); }
                break;
            case 71:
                if (bombOrNot == -1) {
                    block71.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block71.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block71.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block71.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block71.setTextColor(Color.parseColor(playRed3));
                    else block71.setTextColor(Color.parseColor(playPurple4));
                    block71.setText(Integer.toString(bombOrNot)); }
                break;
            case 72:
                if (bombOrNot == -1) {
                    block72.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block72.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block72.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block72.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block72.setTextColor(Color.parseColor(playRed3));
                    else block72.setTextColor(Color.parseColor(playPurple4));
                    block72.setText(Integer.toString(bombOrNot)); }
                break;
            case 73:
                if (bombOrNot == -1) {
                    block73.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block73.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block73.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block73.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block73.setTextColor(Color.parseColor(playRed3));
                    else block73.setTextColor(Color.parseColor(playPurple4));
                    block73.setText(Integer.toString(bombOrNot)); }
                break;
            case 74:
                if (bombOrNot == -1) {
                    block74.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block74.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block74.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block74.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block74.setTextColor(Color.parseColor(playRed3));
                    else block74.setTextColor(Color.parseColor(playPurple4));
                    block74.setText(Integer.toString(bombOrNot)); }
                break;
            case 75:
                if (bombOrNot == -1) {
                    block75.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block75.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block75.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block75.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block75.setTextColor(Color.parseColor(playRed3));
                    else block75.setTextColor(Color.parseColor(playPurple4));
                    block75.setText(Integer.toString(bombOrNot)); }
                break;
            case 76:
                if (bombOrNot == -1) {
                    block76.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block76.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block76.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block76.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block76.setTextColor(Color.parseColor(playRed3));
                    else block76.setTextColor(Color.parseColor(playPurple4));
                    block76.setText(Integer.toString(bombOrNot)); }
                break;
            case 77:
                if (bombOrNot == -1) {
                    block77.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block77.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block77.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block77.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block77.setTextColor(Color.parseColor(playRed3));
                    else block77.setTextColor(Color.parseColor(playPurple4));
                    block77.setText(Integer.toString(bombOrNot)); }
                break;
            case 78:
                if (bombOrNot == -1) {
                    block78.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block78.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block78.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block78.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block78.setTextColor(Color.parseColor(playRed3));
                    else block78.setTextColor(Color.parseColor(playPurple4));
                    block78.setText(Integer.toString(bombOrNot)); }
                break;
            case 79:
                if (bombOrNot == -1) {
                    block79.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block79.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block79.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block79.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block79.setTextColor(Color.parseColor(playRed3));
                    else block79.setTextColor(Color.parseColor(playPurple4));
                    block79.setText(Integer.toString(bombOrNot)); }
                break;
            case 80:
                if (bombOrNot == -1) {
                    block80.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block80.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block80.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block80.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block80.setTextColor(Color.parseColor(playRed3));
                    else block80.setTextColor(Color.parseColor(playPurple4));
                    block80.setText(Integer.toString(bombOrNot)); }
                break;
            case 81:
                if (bombOrNot == -1) {
                    block81.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block81.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block81.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block81.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block81.setTextColor(Color.parseColor(playRed3));
                    else block81.setTextColor(Color.parseColor(playPurple4));
                    block81.setText(Integer.toString(bombOrNot)); }
                break;
            case 82:
                if (bombOrNot == -1) {
                    block82.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block82.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block82.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block82.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block82.setTextColor(Color.parseColor(playRed3));
                    else block82.setTextColor(Color.parseColor(playPurple4));
                    block82.setText(Integer.toString(bombOrNot)); }
                break;
            case 83:
                if (bombOrNot == -1) {
                    block83.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block83.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block83.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block83.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block83.setTextColor(Color.parseColor(playRed3));
                    else block83.setTextColor(Color.parseColor(playPurple4));
                    block83.setText(Integer.toString(bombOrNot)); }
                break;
            case 84:
                if (bombOrNot == -1) {
                    block84.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block84.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block84.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block84.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block84.setTextColor(Color.parseColor(playRed3));
                    else block84.setTextColor(Color.parseColor(playPurple4));
                    block84.setText(Integer.toString(bombOrNot)); }
                break;
            case 85:
                if (bombOrNot == -1) {
                    block85.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block85.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block85.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block85.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block85.setTextColor(Color.parseColor(playRed3));
                    else block85.setTextColor(Color.parseColor(playPurple4));
                    block85.setText(Integer.toString(bombOrNot)); }
                break;
            case 86:
                if (bombOrNot == -1) {
                    block86.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block86.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block86.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block86.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block86.setTextColor(Color.parseColor(playRed3));
                    else block86.setTextColor(Color.parseColor(playPurple4));
                    block86.setText(Integer.toString(bombOrNot)); }
                break;
            case 87:
                if (bombOrNot == -1) {
                    block87.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block87.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block87.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block87.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block87.setTextColor(Color.parseColor(playRed3));
                    else block87.setTextColor(Color.parseColor(playPurple4));
                    block87.setText(Integer.toString(bombOrNot)); }
                break;
            case 88:
                if (bombOrNot == -1) {
                    block88.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block88.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block88.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block88.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block88.setTextColor(Color.parseColor(playRed3));
                    else block88.setTextColor(Color.parseColor(playPurple4));
                    block88.setText(Integer.toString(bombOrNot)); }
                break;
            case 89:
                if (bombOrNot == -1) {
                    block89.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block89.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block89.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block89.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block89.setTextColor(Color.parseColor(playRed3));
                    else block89.setTextColor(Color.parseColor(playPurple4));
                    block89.setText(Integer.toString(bombOrNot)); }
                break;
            case 90:
                if (bombOrNot == -1) {
                    block90.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block90.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block90.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block90.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block90.setTextColor(Color.parseColor(playRed3));
                    else block90.setTextColor(Color.parseColor(playPurple4));
                    block90.setText(Integer.toString(bombOrNot)); }
                break;
            case 91:
                if (bombOrNot == -1) {
                    block91.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block91.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block91.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block91.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block91.setTextColor(Color.parseColor(playRed3));
                    else block91.setTextColor(Color.parseColor(playPurple4));
                    block91.setText(Integer.toString(bombOrNot)); }
                break;
            case 92:
                if (bombOrNot == -1) {
                    block92.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block92.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block92.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block92.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block92.setTextColor(Color.parseColor(playRed3));
                    else block92.setTextColor(Color.parseColor(playPurple4));
                    block92.setText(Integer.toString(bombOrNot)); }
                break;
            case 93:
                if (bombOrNot == -1) {
                    block93.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block93.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block93.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block93.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block93.setTextColor(Color.parseColor(playRed3));
                    else block93.setTextColor(Color.parseColor(playPurple4));
                    block93.setText(Integer.toString(bombOrNot)); }
                break;
            case 94:
                if (bombOrNot == -1) {
                    block94.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block94.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block94.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block94.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block94.setTextColor(Color.parseColor(playRed3));
                    else block94.setTextColor(Color.parseColor(playPurple4));
                    block94.setText(Integer.toString(bombOrNot)); }
                break;
            case 95:
                if (bombOrNot == -1) {
                    block95.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block95.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block95.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block95.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block95.setTextColor(Color.parseColor(playRed3));
                    else block95.setTextColor(Color.parseColor(playPurple4));
                    block95.setText(Integer.toString(bombOrNot)); }
                break;
            case 96:
                if (bombOrNot == -1) {
                    block96.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block96.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block96.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block96.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block96.setTextColor(Color.parseColor(playRed3));
                    else block96.setTextColor(Color.parseColor(playPurple4));
                    block96.setText(Integer.toString(bombOrNot)); }
                break;
            case 97:
                if (bombOrNot == -1) {
                    block97.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block97.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block97.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block97.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block97.setTextColor(Color.parseColor(playRed3));
                    else block97.setTextColor(Color.parseColor(playPurple4));
                    block97.setText(Integer.toString(bombOrNot)); }
                break;
            case 98:
                if (bombOrNot == -1) {
                    block98.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block98.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block98.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block98.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block98.setTextColor(Color.parseColor(playRed3));
                    else block98.setTextColor(Color.parseColor(playPurple4));
                    block98.setText(Integer.toString(bombOrNot)); }
                break;
            case 99:
                if (bombOrNot == -1) {
                    block99.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block99.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block99.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block99.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block99.setTextColor(Color.parseColor(playRed3));
                    else block99.setTextColor(Color.parseColor(playPurple4));
                    block99.setText(Integer.toString(bombOrNot)); }
                break;
            case 100:
                if (bombOrNot == -1) {
                    block100.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block100.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block100.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block100.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block100.setTextColor(Color.parseColor(playRed3));
                    else block100.setTextColor(Color.parseColor(playPurple4));
                    block100.setText(Integer.toString(bombOrNot)); }
                break;
            case 101:
                if (bombOrNot == -1) {
                    block101.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block101.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block101.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block101.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block101.setTextColor(Color.parseColor(playRed3));
                    else block101.setTextColor(Color.parseColor(playPurple4));
                    block101.setText(Integer.toString(bombOrNot)); }
                break;
            case 102:
                if (bombOrNot == -1) {
                    block102.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block102.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block102.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block102.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block102.setTextColor(Color.parseColor(playRed3));
                    else block102.setTextColor(Color.parseColor(playPurple4));
                    block102.setText(Integer.toString(bombOrNot)); }
                break;
            case 103:
                if (bombOrNot == -1) {
                    block103.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block103.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block103.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block103.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block103.setTextColor(Color.parseColor(playRed3));
                    else block103.setTextColor(Color.parseColor(playPurple4));
                    block103.setText(Integer.toString(bombOrNot)); }
                break;
            case 104:
                if (bombOrNot == -1) {
                    block104.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block104.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block104.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block104.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block104.setTextColor(Color.parseColor(playRed3));
                    else block104.setTextColor(Color.parseColor(playPurple4));
                    block104.setText(Integer.toString(bombOrNot)); }
                break;
            case 105:
                if (bombOrNot == -1) {
                    block105.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block105.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block105.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block105.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block105.setTextColor(Color.parseColor(playRed3));
                    else block105.setTextColor(Color.parseColor(playPurple4));
                    block105.setText(Integer.toString(bombOrNot)); }
                break;
            case 106:
                if (bombOrNot == -1) {
                    block106.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block106.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block106.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block106.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block106.setTextColor(Color.parseColor(playRed3));
                    else block106.setTextColor(Color.parseColor(playPurple4));
                    block106.setText(Integer.toString(bombOrNot)); }
                break;
            case 107:
                if (bombOrNot == -1) {
                    block107.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block107.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block107.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block107.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block107.setTextColor(Color.parseColor(playRed3));
                    else block107.setTextColor(Color.parseColor(playPurple4));
                    block107.setText(Integer.toString(bombOrNot)); }
                break;
            case 108:
                if (bombOrNot == -1) {
                    block108.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block108.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block108.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block108.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block108.setTextColor(Color.parseColor(playRed3));
                    else block108.setTextColor(Color.parseColor(playPurple4));
                    block108.setText(Integer.toString(bombOrNot)); }
                break;
            case 109:
                if (bombOrNot == -1) {
                    block109.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block109.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block109.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block109.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block109.setTextColor(Color.parseColor(playRed3));
                    else block109.setTextColor(Color.parseColor(playPurple4));
                    block109.setText(Integer.toString(bombOrNot)); }
                break;
            case 110:
                if (bombOrNot == -1) {
                    block110.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block110.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block110.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block110.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block110.setTextColor(Color.parseColor(playRed3));
                    else block110.setTextColor(Color.parseColor(playPurple4));
                    block110.setText(Integer.toString(bombOrNot)); }
                break;
            case 111:
                if (bombOrNot == -1) {
                    block111.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block111.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block111.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block111.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block111.setTextColor(Color.parseColor(playRed3));
                    else block111.setTextColor(Color.parseColor(playPurple4));
                    block111.setText(Integer.toString(bombOrNot)); }
                break;
            case 112:
                if (bombOrNot == -1) {
                    block112.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block112.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block112.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block112.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block112.setTextColor(Color.parseColor(playRed3));
                    else block112.setTextColor(Color.parseColor(playPurple4));
                    block112.setText(Integer.toString(bombOrNot)); }
                break;
            case 113:
                if (bombOrNot == -1) {
                    block113.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block113.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block113.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block113.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block113.setTextColor(Color.parseColor(playRed3));
                    else block113.setTextColor(Color.parseColor(playPurple4));
                    block113.setText(Integer.toString(bombOrNot)); }
                break;
            case 114:
                if (bombOrNot == -1) {
                    block114.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block114.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block114.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block114.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block114.setTextColor(Color.parseColor(playRed3));
                    else block114.setTextColor(Color.parseColor(playPurple4));
                    block114.setText(Integer.toString(bombOrNot)); }
                break;
            case 115:
                if (bombOrNot == -1) {
                    block115.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block115.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block115.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block115.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block115.setTextColor(Color.parseColor(playRed3));
                    else block115.setTextColor(Color.parseColor(playPurple4));
                    block115.setText(Integer.toString(bombOrNot)); }
                break;
            case 116:
                if (bombOrNot == -1) {
                    block116.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block116.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block116.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block116.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block116.setTextColor(Color.parseColor(playRed3));
                    else block116.setTextColor(Color.parseColor(playPurple4));
                    block116.setText(Integer.toString(bombOrNot)); }
                break;
            case 117:
                if (bombOrNot == -1) {
                    block117.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block117.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block117.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block117.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block117.setTextColor(Color.parseColor(playRed3));
                    else block117.setTextColor(Color.parseColor(playPurple4));
                    block117.setText(Integer.toString(bombOrNot)); }
                break;
            case 118:
                if (bombOrNot == -1) {
                    block118.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block118.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block118.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block118.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block118.setTextColor(Color.parseColor(playRed3));
                    else block118.setTextColor(Color.parseColor(playPurple4));
                    block118.setText(Integer.toString(bombOrNot)); }
                break;
            case 119:
                if (bombOrNot == -1) {
                    block119.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block119.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block119.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block119.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block119.setTextColor(Color.parseColor(playRed3));
                    else block119.setTextColor(Color.parseColor(playPurple4));
                    block119.setText(Integer.toString(bombOrNot)); }
                break;
            case 120:
                if (bombOrNot == -1) {
                    block120.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block120.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block120.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block120.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block120.setTextColor(Color.parseColor(playRed3));
                    else block120.setTextColor(Color.parseColor(playPurple4));
                    block120.setText(Integer.toString(bombOrNot)); }
                break;
            case 121:
                if (bombOrNot == -1) {
                    block121.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block121.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block121.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block121.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block121.setTextColor(Color.parseColor(playRed3));
                    else block121.setTextColor(Color.parseColor(playPurple4));
                    block121.setText(Integer.toString(bombOrNot)); }
                break;
            case 122:
                if (bombOrNot == -1) {
                    block122.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block122.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block122.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block122.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block122.setTextColor(Color.parseColor(playRed3));
                    else block122.setTextColor(Color.parseColor(playPurple4));
                    block122.setText(Integer.toString(bombOrNot)); }
                break;
            case 123:
                if (bombOrNot == -1) {
                    block123.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block123.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block123.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block123.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block123.setTextColor(Color.parseColor(playRed3));
                    else block123.setTextColor(Color.parseColor(playPurple4));
                    block123.setText(Integer.toString(bombOrNot)); }
                break;
            case 124:
                if (bombOrNot == -1) {
                    block124.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block124.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block124.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block124.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block124.setTextColor(Color.parseColor(playRed3));
                    else block124.setTextColor(Color.parseColor(playPurple4));
                    block124.setText(Integer.toString(bombOrNot)); }
                break;
            case 125:
                if (bombOrNot == -1) {
                    block125.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block125.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block125.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block125.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block125.setTextColor(Color.parseColor(playRed3));
                    else block125.setTextColor(Color.parseColor(playPurple4));
                    block125.setText(Integer.toString(bombOrNot)); }
                break;
            case 126:
                if (bombOrNot == -1) {
                    block126.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block126.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block126.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block126.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block126.setTextColor(Color.parseColor(playRed3));
                    else block126.setTextColor(Color.parseColor(playPurple4));
                    block126.setText(Integer.toString(bombOrNot)); }
                break;
            case 127:
                if (bombOrNot == -1) {
                    block127.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block127.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block127.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block127.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block127.setTextColor(Color.parseColor(playRed3));
                    else block127.setTextColor(Color.parseColor(playPurple4));
                    block127.setText(Integer.toString(bombOrNot)); }
                break;
            case 128:
                if (bombOrNot == -1) {
                    block128.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block128.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block128.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block128.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block128.setTextColor(Color.parseColor(playRed3));
                    else block128.setTextColor(Color.parseColor(playPurple4));
                    block128.setText(Integer.toString(bombOrNot)); }
                break;
            case 129:
                if (bombOrNot == -1) {
                    block129.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block129.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block129.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block129.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block129.setTextColor(Color.parseColor(playRed3));
                    else block129.setTextColor(Color.parseColor(playPurple4));
                    block129.setText(Integer.toString(bombOrNot)); }
                break;
            case 130:
                if (bombOrNot == -1) {
                    block130.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block130.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block130.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block130.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block130.setTextColor(Color.parseColor(playRed3));
                    else block130.setTextColor(Color.parseColor(playPurple4));
                    block130.setText(Integer.toString(bombOrNot)); }
                break;
            case 131:
                if (bombOrNot == -1) {
                    block131.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block131.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block131.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block131.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block131.setTextColor(Color.parseColor(playRed3));
                    else block131.setTextColor(Color.parseColor(playPurple4));
                    block131.setText(Integer.toString(bombOrNot)); }
                break;
            case 132:
                if (bombOrNot == -1) {
                    block132.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block132.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block132.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block132.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block132.setTextColor(Color.parseColor(playRed3));
                    else block132.setTextColor(Color.parseColor(playPurple4));
                    block132.setText(Integer.toString(bombOrNot)); }
                break;
            case 133:
                if (bombOrNot == -1) {
                    block133.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block133.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block133.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block133.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block133.setTextColor(Color.parseColor(playRed3));
                    else block133.setTextColor(Color.parseColor(playPurple4));
                    block133.setText(Integer.toString(bombOrNot)); }
                break;
            case 134:
                if (bombOrNot == -1) {
                    block134.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block134.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block134.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block134.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block134.setTextColor(Color.parseColor(playRed3));
                    else block134.setTextColor(Color.parseColor(playPurple4));
                    block134.setText(Integer.toString(bombOrNot)); }
                break;
            case 135:
                if (bombOrNot == -1) {
                    block135.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block135.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block135.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block135.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block135.setTextColor(Color.parseColor(playRed3));
                    else block135.setTextColor(Color.parseColor(playPurple4));
                    block135.setText(Integer.toString(bombOrNot)); }
                break;
            case 136:
                if (bombOrNot == -1) {
                    block136.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block136.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block136.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block136.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block136.setTextColor(Color.parseColor(playRed3));
                    else block136.setTextColor(Color.parseColor(playPurple4));
                    block136.setText(Integer.toString(bombOrNot)); }
                break;
            case 137:
                if (bombOrNot == -1) {
                    block137.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block137.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block137.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block137.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block137.setTextColor(Color.parseColor(playRed3));
                    else block137.setTextColor(Color.parseColor(playPurple4));
                    block137.setText(Integer.toString(bombOrNot)); }
                break;
            case 138:
                if (bombOrNot == -1) {
                    block138.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block138.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block138.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block138.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block138.setTextColor(Color.parseColor(playRed3));
                    else block138.setTextColor(Color.parseColor(playPurple4));
                    block138.setText(Integer.toString(bombOrNot)); }
                break;
            case 139:
                if (bombOrNot == -1) {
                    block139.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block139.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block139.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block139.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block139.setTextColor(Color.parseColor(playRed3));
                    else block139.setTextColor(Color.parseColor(playPurple4));
                    block139.setText(Integer.toString(bombOrNot)); }
                break;
            case 140:
                if (bombOrNot == -1) {
                    block140.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block140.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block140.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block140.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block140.setTextColor(Color.parseColor(playRed3));
                    else block140.setTextColor(Color.parseColor(playPurple4));
                    block140.setText(Integer.toString(bombOrNot)); }
                break;
            case 141:
                if (bombOrNot == -1) {
                    block141.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block141.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block141.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block141.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block141.setTextColor(Color.parseColor(playRed3));
                    else block141.setTextColor(Color.parseColor(playPurple4));
                    block141.setText(Integer.toString(bombOrNot)); }
                break;
            case 142:
                if (bombOrNot == -1) {
                    block142.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block142.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block142.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block142.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block142.setTextColor(Color.parseColor(playRed3));
                    else block142.setTextColor(Color.parseColor(playPurple4));
                    block142.setText(Integer.toString(bombOrNot)); }
                break;
            case 143:
                if (bombOrNot == -1) {
                    block143.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block143.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block143.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block143.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block143.setTextColor(Color.parseColor(playRed3));
                    else block143.setTextColor(Color.parseColor(playPurple4));
                    block143.setText(Integer.toString(bombOrNot)); }
                break;
            case 144:
                if (bombOrNot == -1) {
                    block144.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block144.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block144.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block144.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block144.setTextColor(Color.parseColor(playRed3));
                    else block144.setTextColor(Color.parseColor(playPurple4));
                    block144.setText(Integer.toString(bombOrNot)); }
                break;
            case 145:
                if (bombOrNot == -1) {
                    block145.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block145.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block145.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block145.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block145.setTextColor(Color.parseColor(playRed3));
                    else block145.setTextColor(Color.parseColor(playPurple4));
                    block145.setText(Integer.toString(bombOrNot)); }
                break;
            case 146:
                if (bombOrNot == -1) {
                    block146.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block146.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block146.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block146.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block146.setTextColor(Color.parseColor(playRed3));
                    else block146.setTextColor(Color.parseColor(playPurple4));
                    block146.setText(Integer.toString(bombOrNot)); }
                break;
            case 147:
                if (bombOrNot == -1) {
                    block147.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block147.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block147.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block147.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block147.setTextColor(Color.parseColor(playRed3));
                    else block147.setTextColor(Color.parseColor(playPurple4));
                    block147.setText(Integer.toString(bombOrNot)); }
                break;
            case 148:
                if (bombOrNot == -1) {
                    block148.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block148.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block148.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block148.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block148.setTextColor(Color.parseColor(playRed3));
                    else block148.setTextColor(Color.parseColor(playPurple4));
                    block148.setText(Integer.toString(bombOrNot)); }
                break;
            case 149:
                if (bombOrNot == -1) {
                    block149.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block149.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block149.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block149.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block149.setTextColor(Color.parseColor(playRed3));
                    else block149.setTextColor(Color.parseColor(playPurple4));
                    block149.setText(Integer.toString(bombOrNot)); }
                break;
            case 150:
                if (bombOrNot == -1) {
                    block150.setBackgroundResource(R.drawable.bomb_image);
                } else {
                    block150.setBackgroundColor(Color.parseColor(transparentColor));
                    if (bombOrNot == 1) block150.setTextColor(Color.parseColor(playBlue1));
                    else if (bombOrNot == 2) block150.setTextColor(Color.parseColor(playGreen2));
                    else if (bombOrNot == 3) block150.setTextColor(Color.parseColor(playRed3));
                    else block150.setTextColor(Color.parseColor(playPurple4));
                    block150.setText(Integer.toString(bombOrNot)); }
                break;
        }
    }



//New Mathod for checking if a psotion equals a bomb
    public int positionEqualsBomb(int positionHorizontal){
        int bombOrNot = 0;
        if(positionHorizontal == bomb_1||positionHorizontal == bomb_2||positionHorizontal == bomb_3||positionHorizontal == bomb_4||positionHorizontal == bomb_5||positionHorizontal == bomb_6||positionHorizontal == bomb_7
                ||positionHorizontal == bomb_8||positionHorizontal == bomb_9||positionHorizontal == bomb_10||positionHorizontal == bomb_11||positionHorizontal == bomb_12||positionHorizontal == bomb_13
                ||positionHorizontal == bomb_14||positionHorizontal == bomb_15){
            bombOrNot = 1;
        }else{
            //winTotal = winTotal +positionHorizontal;
            bombOrNot = 0;
        }
        return bombOrNot;

    }

    //
    private static int bombEqual(int originalBomb, int otherBomb1, int otherBomb2, int otherBomb3, int otherBomb4, int otherBomb5, int otherBomb6,
                                 int otherBomb7, int otherBomb8, int otherBomb9, int otherBomb10, int otherBomb11, int otherBomb12, int otherBomb13, int otherBomb14){
        int bombNumber;
        if(originalBomb == otherBomb1||originalBomb == otherBomb2||originalBomb == otherBomb3||originalBomb == otherBomb4||originalBomb == otherBomb5||originalBomb == otherBomb6||originalBomb == otherBomb7
                ||originalBomb == otherBomb8||originalBomb == otherBomb9||originalBomb == otherBomb10||originalBomb == otherBomb11||originalBomb == otherBomb12||originalBomb == otherBomb13||originalBomb == otherBomb14){
            bombNumber = 1;
        }else{
            bombNumber = 0;
        }
        return bombNumber;
    }


    public void whenLose(){
        bombOrNot = -1;
        outputBox(bomb_1,bombOrNot);outputBox(bomb_2,bombOrNot);outputBox(bomb_3,bombOrNot);outputBox(bomb_4,bombOrNot);outputBox(bomb_5,bombOrNot);outputBox(bomb_6,bombOrNot);outputBox(bomb_7,bombOrNot);outputBox(bomb_8,bombOrNot);
        outputBox(bomb_9,bombOrNot);outputBox(bomb_10,bombOrNot);outputBox(bomb_11,bombOrNot);outputBox(bomb_12,bombOrNot);outputBox(bomb_13,bombOrNot);outputBox(bomb_14,bombOrNot);outputBox(bomb_15,bombOrNot);


        //Insert code for loss here
        alertDialog = new AlertDialog.Builder(easyPlay.this);

        //Set up title
        alertDialog.setTitle(getResources().getString(R.string.alert_Title));
        //set messege
        alertDialog.setMessage("Would you like to try again?");

        //set cancelable

        alertDialog.setCancelable(false);
        //user can not cancel dialog

        //set buttons

        //possitive
        alertDialog.setPositiveButton(getResources().getString(R.string.yes),
                new DialogInterface.OnClickListener() {
                    @Override

                    public void onClick(DialogInterface dialog, int which) {
                        //ecit our window activity
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                });
        //set negitive

        alertDialog.setNegativeButton(getResources().getString(R.string.no), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                easyPlay.this.finish();
            }
        });

        //create actual dialog
        AlertDialog dialog = alertDialog.create();

        //show teh dialog
        dialog.show();
    }
private void winYet() {

    winOrNot = 0;
    ColorDrawable block1Drawable = (ColorDrawable) block1.getBackground();
    int block1Color = block1Drawable.getColor();
    if (block1Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block2Drawable = (ColorDrawable) block2.getBackground();
    int block2Color = block2Drawable.getColor();
    if (block2Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block3Drawable = (ColorDrawable) block3.getBackground();
    int block3Color = block3Drawable.getColor();
    if (block3Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block4Drawable = (ColorDrawable) block4.getBackground();
    int block4Color = block4Drawable.getColor();
    if (block4Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block5Drawable = (ColorDrawable) block5.getBackground();
    int block5Color = block5Drawable.getColor();
    if (block5Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block6Drawable = (ColorDrawable) block6.getBackground();
    int block6Color = block6Drawable.getColor();
    if (block6Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block7Drawable = (ColorDrawable) block7.getBackground();
    int block7Color = block7Drawable.getColor();
    if (block7Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block8Drawable = (ColorDrawable) block8.getBackground();
    int block8Color = block8Drawable.getColor();
    if (block8Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block9Drawable = (ColorDrawable) block9.getBackground();
    int block9Color = block9Drawable.getColor();
    if (block9Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block10Drawable = (ColorDrawable) block10.getBackground();
    int block10Color = block10Drawable.getColor();
    if (block10Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block11Drawable = (ColorDrawable) block11.getBackground();
    int block11Color = block11Drawable.getColor();
    if (block11Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block12Drawable = (ColorDrawable) block12.getBackground();
    int block12Color = block12Drawable.getColor();
    if (block12Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block13Drawable = (ColorDrawable) block13.getBackground();
    int block13Color = block13Drawable.getColor();
    if (block13Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block14Drawable = (ColorDrawable) block14.getBackground();
    int block14Color = block14Drawable.getColor();
    if (block14Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block15Drawable = (ColorDrawable) block15.getBackground();
    int block15Color = block15Drawable.getColor();
    if (block15Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block16Drawable = (ColorDrawable) block16.getBackground();
    int block16Color = block16Drawable.getColor();
    if (block16Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block17Drawable = (ColorDrawable) block17.getBackground();
    int block17Color = block17Drawable.getColor();
    if (block17Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block18Drawable = (ColorDrawable) block18.getBackground();
    int block18Color = block18Drawable.getColor();
    if (block18Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block19Drawable = (ColorDrawable) block19.getBackground();
    int block19Color = block19Drawable.getColor();
    if (block19Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block20Drawable = (ColorDrawable) block20.getBackground();
    int block20Color = block20Drawable.getColor();
    if (block20Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block21Drawable = (ColorDrawable) block21.getBackground();
    int block21Color = block21Drawable.getColor();
    if (block21Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block22Drawable = (ColorDrawable) block22.getBackground();
    int block22Color = block22Drawable.getColor();
    if (block22Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block23Drawable = (ColorDrawable) block23.getBackground();
    int block23Color = block23Drawable.getColor();
    if (block23Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block24Drawable = (ColorDrawable) block24.getBackground();
    int block24Color = block24Drawable.getColor();
    if (block24Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block25Drawable = (ColorDrawable) block25.getBackground();
    int block25Color = block25Drawable.getColor();
    if (block25Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block26Drawable = (ColorDrawable) block26.getBackground();
    int block26Color = block26Drawable.getColor();
    if (block26Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block27Drawable = (ColorDrawable) block27.getBackground();
    int block27Color = block27Drawable.getColor();
    if (block27Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block28Drawable = (ColorDrawable) block28.getBackground();
    int block28Color = block28Drawable.getColor();
    if (block28Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block29Drawable = (ColorDrawable) block29.getBackground();
    int block29Color = block29Drawable.getColor();
    if (block29Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block30Drawable = (ColorDrawable) block30.getBackground();
    int block30Color = block30Drawable.getColor();
    if (block30Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block31Drawable = (ColorDrawable) block31.getBackground();
    int block31Color = block31Drawable.getColor();
    if (block31Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block32Drawable = (ColorDrawable) block32.getBackground();
    int block32Color = block32Drawable.getColor();
    if (block32Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block33Drawable = (ColorDrawable) block33.getBackground();
    int block33Color = block33Drawable.getColor();
    if (block33Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block34Drawable = (ColorDrawable) block34.getBackground();
    int block34Color = block34Drawable.getColor();
    if (block34Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block35Drawable = (ColorDrawable) block35.getBackground();
    int block35Color = block35Drawable.getColor();
    if (block35Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block36Drawable = (ColorDrawable) block36.getBackground();
    int block36Color = block36Drawable.getColor();
    if (block36Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block37Drawable = (ColorDrawable) block37.getBackground();
    int block37Color = block37Drawable.getColor();
    if (block37Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block38Drawable = (ColorDrawable) block38.getBackground();
    int block38Color = block38Drawable.getColor();
    if (block38Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block39Drawable = (ColorDrawable) block39.getBackground();
    int block39Color = block39Drawable.getColor();
    if (block39Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block40Drawable = (ColorDrawable) block40.getBackground();
    int block40Color = block40Drawable.getColor();
    if (block40Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block41Drawable = (ColorDrawable) block41.getBackground();
    int block41Color = block41Drawable.getColor();
    if (block41Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block42Drawable = (ColorDrawable) block42.getBackground();
    int block42Color = block42Drawable.getColor();
    if (block42Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block43Drawable = (ColorDrawable) block43.getBackground();
    int block43Color = block43Drawable.getColor();
    if (block43Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block44Drawable = (ColorDrawable) block44.getBackground();
    int block44Color = block44Drawable.getColor();
    if (block44Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block45Drawable = (ColorDrawable) block45.getBackground();
    int block45Color = block45Drawable.getColor();
    if (block45Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block46Drawable = (ColorDrawable) block46.getBackground();
    int block46Color = block46Drawable.getColor();
    if (block46Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block47Drawable = (ColorDrawable) block47.getBackground();
    int block47Color = block47Drawable.getColor();
    if (block47Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block48Drawable = (ColorDrawable) block48.getBackground();
    int block48Color = block48Drawable.getColor();
    if (block48Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block49Drawable = (ColorDrawable) block49.getBackground();
    int block49Color = block49Drawable.getColor();
    if (block49Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block50Drawable = (ColorDrawable) block50.getBackground();
    int block50Color = block50Drawable.getColor();
    if (block50Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block51Drawable = (ColorDrawable) block51.getBackground();
    int block51Color = block51Drawable.getColor();
    if (block51Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block52Drawable = (ColorDrawable) block52.getBackground();
    int block52Color = block52Drawable.getColor();
    if (block52Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block53Drawable = (ColorDrawable) block53.getBackground();
    int block53Color = block53Drawable.getColor();
    if (block53Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block54Drawable = (ColorDrawable) block54.getBackground();
    int block54Color = block54Drawable.getColor();
    if (block54Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block55Drawable = (ColorDrawable) block55.getBackground();
    int block55Color = block55Drawable.getColor();
    if (block55Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block56Drawable = (ColorDrawable) block56.getBackground();
    int block56Color = block56Drawable.getColor();
    if (block56Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block57Drawable = (ColorDrawable) block57.getBackground();
    int block57Color = block57Drawable.getColor();
    if (block57Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block58Drawable = (ColorDrawable) block58.getBackground();
    int block58Color = block58Drawable.getColor();
    if (block58Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block59Drawable = (ColorDrawable) block59.getBackground();
    int block59Color = block59Drawable.getColor();
    if (block59Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block60Drawable = (ColorDrawable) block60.getBackground();
    int block60Color = block60Drawable.getColor();
    if (block60Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block61Drawable = (ColorDrawable) block61.getBackground();
    int block61Color = block61Drawable.getColor();
    if (block61Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block62Drawable = (ColorDrawable) block62.getBackground();
    int block62Color = block62Drawable.getColor();
    if (block62Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block63Drawable = (ColorDrawable) block63.getBackground();
    int block63Color = block63Drawable.getColor();
    if (block63Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block64Drawable = (ColorDrawable) block64.getBackground();
    int block64Color = block64Drawable.getColor();
    if (block64Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block65Drawable = (ColorDrawable) block65.getBackground();
    int block65Color = block65Drawable.getColor();
    if (block65Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block66Drawable = (ColorDrawable) block66.getBackground();
    int block66Color = block66Drawable.getColor();
    if (block66Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block67Drawable = (ColorDrawable) block67.getBackground();
    int block67Color = block67Drawable.getColor();
    if (block67Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block68Drawable = (ColorDrawable) block68.getBackground();
    int block68Color = block68Drawable.getColor();
    if (block68Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block69Drawable = (ColorDrawable) block69.getBackground();
    int block69Color = block69Drawable.getColor();
    if (block69Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block70Drawable = (ColorDrawable) block70.getBackground();
    int block70Color = block70Drawable.getColor();
    if (block70Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block71Drawable = (ColorDrawable) block71.getBackground();
    int block71Color = block71Drawable.getColor();
    if (block71Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block72Drawable = (ColorDrawable) block72.getBackground();
    int block72Color = block72Drawable.getColor();
    if (block72Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block73Drawable = (ColorDrawable) block73.getBackground();
    int block73Color = block73Drawable.getColor();
    if (block73Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block74Drawable = (ColorDrawable) block74.getBackground();
    int block74Color = block74Drawable.getColor();
    if (block74Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block75Drawable = (ColorDrawable) block75.getBackground();
    int block75Color = block75Drawable.getColor();
    if (block75Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block76Drawable = (ColorDrawable) block76.getBackground();
    int block76Color = block76Drawable.getColor();
    if (block76Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block77Drawable = (ColorDrawable) block77.getBackground();
    int block77Color = block77Drawable.getColor();
    if (block77Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block78Drawable = (ColorDrawable) block78.getBackground();
    int block78Color = block78Drawable.getColor();
    if (block78Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block79Drawable = (ColorDrawable) block79.getBackground();
    int block79Color = block79Drawable.getColor();
    if (block79Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block80Drawable = (ColorDrawable) block80.getBackground();
    int block80Color = block80Drawable.getColor();
    if (block80Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block81Drawable = (ColorDrawable) block81.getBackground();
    int block81Color = block81Drawable.getColor();
    if (block81Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block82Drawable = (ColorDrawable) block82.getBackground();
    int block82Color = block82Drawable.getColor();
    if (block82Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block83Drawable = (ColorDrawable) block83.getBackground();
    int block83Color = block83Drawable.getColor();
    if (block83Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block84Drawable = (ColorDrawable) block84.getBackground();
    int block84Color = block84Drawable.getColor();
    if (block84Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block85Drawable = (ColorDrawable) block85.getBackground();
    int block85Color = block85Drawable.getColor();
    if (block85Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block86Drawable = (ColorDrawable) block86.getBackground();
    int block86Color = block86Drawable.getColor();
    if (block86Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block87Drawable = (ColorDrawable) block87.getBackground();
    int block87Color = block87Drawable.getColor();
    if (block87Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block88Drawable = (ColorDrawable) block88.getBackground();
    int block88Color = block88Drawable.getColor();
    if (block88Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block89Drawable = (ColorDrawable) block89.getBackground();
    int block89Color = block89Drawable.getColor();
    if (block89Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block90Drawable = (ColorDrawable) block90.getBackground();
    int block90Color = block90Drawable.getColor();
    if (block90Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block91Drawable = (ColorDrawable) block91.getBackground();
    int block91Color = block91Drawable.getColor();
    if (block91Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block92Drawable = (ColorDrawable) block92.getBackground();
    int block92Color = block92Drawable.getColor();
    if (block92Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block93Drawable = (ColorDrawable) block93.getBackground();
    int block93Color = block93Drawable.getColor();
    if (block93Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block94Drawable = (ColorDrawable) block94.getBackground();
    int block94Color = block94Drawable.getColor();
    if (block94Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block95Drawable = (ColorDrawable) block95.getBackground();
    int block95Color = block95Drawable.getColor();
    if (block95Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block96Drawable = (ColorDrawable) block96.getBackground();
    int block96Color = block96Drawable.getColor();
    if (block96Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block97Drawable = (ColorDrawable) block97.getBackground();
    int block97Color = block97Drawable.getColor();
    if (block97Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block98Drawable = (ColorDrawable) block98.getBackground();
    int block98Color = block98Drawable.getColor();
    if (block98Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block99Drawable = (ColorDrawable) block99.getBackground();
    int block99Color = block99Drawable.getColor();
    if (block99Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block100Drawable = (ColorDrawable) block100.getBackground();
    int block100Color = block100Drawable.getColor();
    if (block100Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block101Drawable = (ColorDrawable) block101.getBackground();
    int block101Color = block101Drawable.getColor();
    if (block101Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block102Drawable = (ColorDrawable) block102.getBackground();
    int block102Color = block102Drawable.getColor();
    if (block102Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block103Drawable = (ColorDrawable) block103.getBackground();
    int block103Color = block103Drawable.getColor();
    if (block103Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block104Drawable = (ColorDrawable) block104.getBackground();
    int block104Color = block104Drawable.getColor();
    if (block104Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block105Drawable = (ColorDrawable) block105.getBackground();
    int block105Color = block105Drawable.getColor();
    if (block105Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block106Drawable = (ColorDrawable) block106.getBackground();
    int block106Color = block106Drawable.getColor();
    if (block106Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block107Drawable = (ColorDrawable) block107.getBackground();
    int block107Color = block107Drawable.getColor();
    if (block107Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block108Drawable = (ColorDrawable) block108.getBackground();
    int block108Color = block108Drawable.getColor();
    if (block108Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block109Drawable = (ColorDrawable) block109.getBackground();
    int block109Color = block109Drawable.getColor();
    if (block109Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block110Drawable = (ColorDrawable) block110.getBackground();
    int block110Color = block110Drawable.getColor();
    if (block110Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block111Drawable = (ColorDrawable) block111.getBackground();
    int block111Color = block111Drawable.getColor();
    if (block111Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block112Drawable = (ColorDrawable) block112.getBackground();
    int block112Color = block112Drawable.getColor();
    if (block112Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block113Drawable = (ColorDrawable) block113.getBackground();
    int block113Color = block113Drawable.getColor();
    if (block113Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block114Drawable = (ColorDrawable) block114.getBackground();
    int block114Color = block114Drawable.getColor();
    if (block114Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block115Drawable = (ColorDrawable) block115.getBackground();
    int block115Color = block115Drawable.getColor();
    if (block115Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block116Drawable = (ColorDrawable) block116.getBackground();
    int block116Color = block116Drawable.getColor();
    if (block116Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block117Drawable = (ColorDrawable) block117.getBackground();
    int block117Color = block117Drawable.getColor();
    if (block117Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block118Drawable = (ColorDrawable) block118.getBackground();
    int block118Color = block118Drawable.getColor();
    if (block118Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block119Drawable = (ColorDrawable) block119.getBackground();
    int block119Color = block119Drawable.getColor();
    if (block119Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block120Drawable = (ColorDrawable) block120.getBackground();
    int block120Color = block120Drawable.getColor();
    if (block120Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block121Drawable = (ColorDrawable) block121.getBackground();
    int block121Color = block121Drawable.getColor();
    if (block121Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block122Drawable = (ColorDrawable) block122.getBackground();
    int block122Color = block122Drawable.getColor();
    if (block122Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block123Drawable = (ColorDrawable) block123.getBackground();
    int block123Color = block123Drawable.getColor();
    if (block123Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block124Drawable = (ColorDrawable) block124.getBackground();
    int block124Color = block124Drawable.getColor();
    if (block124Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block125Drawable = (ColorDrawable) block125.getBackground();
    int block125Color = block125Drawable.getColor();
    if (block125Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block126Drawable = (ColorDrawable) block126.getBackground();
    int block126Color = block126Drawable.getColor();
    if (block126Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block127Drawable = (ColorDrawable) block127.getBackground();
    int block127Color = block127Drawable.getColor();
    if (block127Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block128Drawable = (ColorDrawable) block128.getBackground();
    int block128Color = block128Drawable.getColor();
    if (block128Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block129Drawable = (ColorDrawable) block129.getBackground();
    int block129Color = block129Drawable.getColor();
    if (block129Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block130Drawable = (ColorDrawable) block130.getBackground();
    int block130Color = block130Drawable.getColor();
    if (block130Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block131Drawable = (ColorDrawable) block131.getBackground();
    int block131Color = block131Drawable.getColor();
    if (block131Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block132Drawable = (ColorDrawable) block132.getBackground();
    int block132Color = block132Drawable.getColor();
    if (block132Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block133Drawable = (ColorDrawable) block133.getBackground();
    int block133Color = block133Drawable.getColor();
    if (block133Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block134Drawable = (ColorDrawable) block134.getBackground();
    int block134Color = block134Drawable.getColor();
    if (block134Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block135Drawable = (ColorDrawable) block135.getBackground();
    int block135Color = block135Drawable.getColor();
    if (block135Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block136Drawable = (ColorDrawable) block136.getBackground();
    int block136Color = block136Drawable.getColor();
    if (block136Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block137Drawable = (ColorDrawable) block137.getBackground();
    int block137Color = block137Drawable.getColor();
    if (block137Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block138Drawable = (ColorDrawable) block138.getBackground();
    int block138Color = block138Drawable.getColor();
    if (block138Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block139Drawable = (ColorDrawable) block139.getBackground();
    int block139Color = block139Drawable.getColor();
    if (block139Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block140Drawable = (ColorDrawable) block140.getBackground();
    int block140Color = block140Drawable.getColor();
    if (block140Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block141Drawable = (ColorDrawable) block141.getBackground();
    int block141Color = block141Drawable.getColor();
    if (block141Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block142Drawable = (ColorDrawable) block142.getBackground();
    int block142Color = block142Drawable.getColor();
    if (block142Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block143Drawable = (ColorDrawable) block143.getBackground();
    int block143Color = block143Drawable.getColor();
    if (block143Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block144Drawable = (ColorDrawable) block144.getBackground();
    int block144Color = block144Drawable.getColor();
    if (block144Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block145Drawable = (ColorDrawable) block145.getBackground();
    int block145Color = block145Drawable.getColor();
    if (block145Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block146Drawable = (ColorDrawable) block146.getBackground();
    int block146Color = block146Drawable.getColor();
    if (block146Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block147Drawable = (ColorDrawable) block147.getBackground();
    int block147Color = block147Drawable.getColor();
    if (block147Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block148Drawable = (ColorDrawable) block148.getBackground();
    int block148Color = block148Drawable.getColor();
    if (block148Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block149Drawable = (ColorDrawable) block149.getBackground();
    int block149Color = block149Drawable.getColor();
    if (block149Color == Color.parseColor(transparentColor)) winOrNot++;
    ColorDrawable block150Drawable = (ColorDrawable) block150.getBackground();
    int block150Color = block150Drawable.getColor();
    if (block150Color == Color.parseColor(transparentColor)) winOrNot++;


   // Log.i(TAG, "Win or not "+winOrNot);
    //The final cheack to see if you win
    Log.i(TAG,"Win or not"+winOrNot);
    if (winOrNot == 134){
        //Initate win sequence
        Log.i(TAG, "It worked");
        //Insert code for loss here
        alertDialog = new AlertDialog.Builder(easyPlay.this);

        //Set up title
        alertDialog.setTitle(getResources().getString(R.string.winTitle));
        //set messege
        alertDialog.setMessage(getResources().getString(R.string.winText));

        //set cancelable

        alertDialog.setCancelable(false);
        //user can not cancel dialog

        //set buttons

        //possitive
        alertDialog.setPositiveButton(getResources().getString(R.string.yes),
                new DialogInterface.OnClickListener() {
                    @Override

                    public void onClick(DialogInterface dialog, int which) {
                        //ecit our window activity
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                });
        //set negitive

        alertDialog.setNegativeButton(getResources().getString(R.string.no), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                easyPlay.this.finish();
            }
        });

        //create actual dialog
        AlertDialog dialog = alertDialog.create();

        //show teh dialog
        dialog.show();

    }
}
}
