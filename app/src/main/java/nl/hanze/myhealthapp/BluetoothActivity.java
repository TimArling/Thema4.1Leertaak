package nl.hanze.myhealthapp;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class BluetoothActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);

        Intent intent = getIntent();
        BluetoothDevice btDevice = intent.getExtras().getParcelable(MainActivity.EXTRA_MESSAGE);

        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText("Device Name: " + btDevice.getName() + " \n Device Address: " + btDevice.getAddress());
    }
}
