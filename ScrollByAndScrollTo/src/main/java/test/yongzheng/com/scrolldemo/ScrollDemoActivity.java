package test.yongzheng.com.scrolldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ScrollDemoActivity extends AppCompatActivity {

    private TextView text;
    private EditText editX, editY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_demo);
        text = (TextView) findViewById(R.id.text);
        editX = (EditText) findViewById(R.id.edit_x);
        editY = (EditText) findViewById(R.id.edit_y);
    }

    public void scrollTo(View view){
        int x = Integer.valueOf(editX.getText().toString());
        int y = Integer.valueOf(editY.getText().toString());
        text.scrollTo(x,y);
    }

    public void scrollByAdd(View view){
        text.scrollBy(0,10);
    }

    public void scrollByDel(View view){
        text.scrollBy(0,-10);
    }

}
