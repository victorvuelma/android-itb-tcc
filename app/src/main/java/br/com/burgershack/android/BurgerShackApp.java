package br.com.burgershack.android;

import android.app.Activity;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import br.com.burgershack.android.data.local.LocalData;
import br.com.burgershack.android.data.web.WebData;

public class BurgerShackApp {

    public static final String DB_NAME = "BurgerShack";

    public static final String URL_PRINCIPAL = "http://192.168.1.31:51061/";
    public static final String URL_CADASTRO = URL_PRINCIPAL + "cadastro.cshtml";
    public static final String URL_API = URL_PRINCIPAL + "api.cshtml";

    public static Locale LOCALE = new Locale("pt", "BR");
    public static NumberFormat CURRENCY_FORMAT = NumberFormat.getCurrencyInstance(LOCALE);
    public static DateFormat DATE_FORMAT = SimpleDateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, LOCALE);

    public static LocalData DATA_LOCAL;
    public static WebData DATA_WEB;

    public static void init(Activity activity) {
        DATA_LOCAL = new LocalData(activity);
        DATA_WEB = new WebData();

        DATA_WEB.download(activity);
    }

}
