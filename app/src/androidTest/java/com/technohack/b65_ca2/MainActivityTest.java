package com.technohack.b65_ca2;

import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


public class MainActivityTest {

    @Rule
    ActivityTestRule<MainActivity> activityActivityTestRule=new ActivityTestRule<>(MainActivity.class);
    MainActivity mainActivity=null;

    @Before
    public void setUp() throws Exception {

        mainActivity=activityActivityTestRule.getActivity();

    }

    @Test
    public void testLaunch(){

    }
    @After
    public void tearDown() throws Exception {

        mainActivity=null;

    }
}