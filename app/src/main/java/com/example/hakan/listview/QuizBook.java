package com.example.hakan.listview;

/**
 * Created by hakan on 4/15/2017.
 */

public class QuizBook {
    public static String[] questions = new String[]{
            "Türkçe - Lehçe : Yarasa =  Nietoperz",
            "Türkçe - Lehçe : Kemik =  Kość",
            "Türkçe - Lehçe : Araba = świeca",
            "Türkçe - Lehçe : Tatlı = Słodycze",
            "Türkçe - Lehçe : Köpek = Kot",
            "Türkçe - Lehçe : Kıyafet = Sukienka",
            "Türkçe - Lehçe : Şapka = Kapelusz",
            "Türkçe - Lehçe : Lamba = Lampa",
            "Türkçe - Lehçe : Kuş = Sowa",
            "Türkçe - Lehçe : Balkabağı = Dynia"
    };

    public static int[] images = new int[] {
            R.drawable.bat, R.drawable.bone, R.drawable.candle, R.drawable.candy, R.drawable.cat, R.drawable.dress, R.drawable.hat,
            R.drawable.lamb, R.drawable.owl, R.drawable.pumpkin
    };

    public static boolean[] answers = new boolean[]{
            true, true, false, false, false, true, true, true, false, true
    };

}
