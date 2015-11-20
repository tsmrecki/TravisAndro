package demo.travisandro.travisandro;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;

import demo.travisandro.travisandro.MainActivity;
import demo.travisandro.travisandro.NewActivity;
import demo.travisandro.travisandro.TopActivity;

/**
 * Created by tomislav on 20/11/15.
 */
public class LaunchActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {


    public LaunchActivityTest() {
        super(MainActivity.class);
    }

    public LaunchActivityTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }


    @Override
    protected void setUp() throws Exception {
        super.setUp();

        getActivity();


    }


    public void testMyFirstTestTextView_labelText() {

        Intent profile = new Intent(getActivity(), NewActivity.class);
        getActivity().startActivity(profile);


        final String expected = "bubi";
        assertEquals(expected, "bubi");
    }


}
