package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import com.google.common.truth.Truth;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class, false, true);

    @Test
    public void asyncRetrievesNonEmptyString() throws Exception {
        mActivityRule.getActivity().getJokeFromAsync();
        Thread.sleep(4000); // not an elegant solution, but accomplishes the task. Since we are testing an Async task, we need to wait for it to complete
        String joke = mActivityRule.getActivity().getJoke();
        assertNotEquals("", joke);
    }
}