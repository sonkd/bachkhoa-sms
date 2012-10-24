package soict.hust.android.sms;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

@TargetApi(16)
public class SMS extends Activity {
	Button b_contacts,b_search,b_exit,b_setting,b_sms;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        b_contacts = (Button) findViewById(R.id.contacts);
        b_search = (Button) findViewById(R.id.search);
        b_exit = (Button) findViewById(R.id.exit);
        b_setting = (Button) findViewById(R.id.set);
        b_sms = (Button) findViewById(R.id.message);
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.layout.main, menu);
        return true;
    }
    
	public void bContactsClick(View v)
    {
    	//b_contacts.setBackground();
    }
}
