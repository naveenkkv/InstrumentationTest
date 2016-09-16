package com.example.naveenkumark.instrumentationtest;

import android.app.Application;
import android.test.ApplicationTestCase;

import com.google.firebase.FirebaseApp;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
        FirebaseApp.getInstance();

    }
}