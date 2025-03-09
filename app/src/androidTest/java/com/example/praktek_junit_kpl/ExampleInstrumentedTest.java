package com.example.praktek_junit_kpl;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);

    /*
     * Test Case 1: Pengujian Konteks Aplikasi
     * Test ini memverifikasi bahwa kita bisa mendapatkan konteks aplikasi
     * dengan benar. Ini adalah pengujian dasar untuk memastikan bahwa
     * instrumentasi aplikasi berjalan dengan baik dan nama paket
     * aplikasi dapat diakses dengan benar.
     */
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.praktek_junit_kpl", appContext.getPackageName());
    }

    /*
     * Test Case 2: Pengujian Interaksi UI
     * Test ini memeriksa apakah tombol di MainActivity dapat diklik
     * dan setelah diklik, TextView akan menampilkan teks yang diharapkan.
     * Pengujian ini menggunakan Espresso untuk mensimulasikan interaksi
     * pengguna dan memeriksa respons UI.
     */
    @Test
    public void testButtonClickChangesText() {
        // Klik tombol dengan ID btnTest
        Espresso.onView(ViewMatchers.withId(R.id.btnTest))
                .perform(ViewActions.click());

        // Periksa apakah TextView dengan ID tvResult menampilkan teks "Tombol Diklik!"
        Espresso.onView(ViewMatchers.withId(R.id.tvResult))
                .check(ViewAssertions.matches(ViewMatchers.withText("Tombol Diklik!")));
    }
}