package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Log;
import android.util.Pair;

/**
 * Created by Administrator on 11/3/2016.
 */

public class EmptyTest extends AndroidTestCase{

    public void test() {
        Log.v("Empty Test", "Running Empty String test");
        String result = null;

        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(new Pair<Context, String>(getContext(), null));
        try {
            result = endpointsAsyncTask.get();
            Log.d("Empty Test", "Successfull Test: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}
