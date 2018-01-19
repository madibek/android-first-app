package malgara.kz.myfirsrtandroidapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by m.ayupov on 19.01.2018.
 */

public class DisplayMessageActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        String message = getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.editText2);
        textView.setText(message);

    }
}
