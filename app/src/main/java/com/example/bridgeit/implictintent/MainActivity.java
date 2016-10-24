package com.example.bridgeit.implictintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText mUrl;
    private Button mSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSearch = (Button)findViewById(R.id.button_browser);
        mUrl = (EditText)findViewById(R.id.edit_data);

        mSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = mUrl.getText().toString();
                if(url != null) {
                    url = url.replace("http://","");
                    url = url.replace("www.","");
                    url = url.replace(".com","");
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www."+url+".com"));
                    startActivity(intent);
                }


            }
        });
    }
}
