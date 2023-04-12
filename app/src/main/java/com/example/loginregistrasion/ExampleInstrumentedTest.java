package com.example.loginregistrasion;


import android.content.Context;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.sqlite_tp1", appContext.getPackageName());
    }
}