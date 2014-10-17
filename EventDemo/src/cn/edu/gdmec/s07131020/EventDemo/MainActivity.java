package cn.edu.gdmec.s07131020.EventDemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
 TextView mytv;
 EditText myet;
 CheckBox mycb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytv =(TextView) findViewById(R.id.textView1);
        myet=(EditText) findViewById(R.id.editText1);
        mycb=(CheckBox) findViewById(R.id.checkBox1);
        myet.setOnKeyListener(new OnKeyListener(){
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
					// TODO Auto-generated method stub
					 int metaState = event.getMetaState();
		 	        int unicodeChar = event.getUnicodeChar();
		 	        String msg="";
		 	        msg +="��������:" + String.valueOf(event.getAction())+"\n";
		 	        msg +="��������:" + String.valueOf(keyCode)+"\n";
		 	        msg +="�����ַ�:" + (char)unicodeChar+"\n";
		 	        msg +="UNICODE:" + String.valueOf(unicodeChar)+"\n";
		 	        msg +="�ظ�����:" + String.valueOf(event.getRepeatCount())+"\n";
		 	        msg +="���ܼ�״̬:" + String.valueOf(metaState)+"\n";
		 	        msg +="Ӳ������:" + String.valueOf(event.getScanCode())+"\n";
		 	        msg +="������־:" + String.valueOf(event.getFlags())+"\n";
		 	        mytv.setText(msg);
		 	        if (mycb.isChecked()){
		 	            return true;
		 	        } else{
		 	            return false; 
		 	        }
			}

		
		}
       );
    	 }
        
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
