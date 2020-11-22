package com.zahinahmed.listapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_ITEMS = "com.zahinahmed.listapplication.extra.ITEMS";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        }

    public void selectItem(View view) {
        Intent return_items_intent = new Intent();

        switch (view.getId()){
            case R.id.Cheese:
                return_items_intent.putExtra(EXTRA_ITEMS, "Cheese"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.Apple:
                return_items_intent.putExtra(EXTRA_ITEMS, "Apple"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.Strawberry:
                return_items_intent.putExtra(EXTRA_ITEMS, "Strawberry"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.Tomato:
                return_items_intent.putExtra(EXTRA_ITEMS, "Tomato"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.Bread:
                return_items_intent.putExtra(EXTRA_ITEMS, "Bread"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.Chicken:
                return_items_intent.putExtra(EXTRA_ITEMS, "Chicken"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.Juice:
                return_items_intent.putExtra(EXTRA_ITEMS, "Juice"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.Beef:
                return_items_intent.putExtra(EXTRA_ITEMS, "Beef"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.Mutton:
                return_items_intent.putExtra(EXTRA_ITEMS, "Mutton"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.Carrot:
                return_items_intent.putExtra(EXTRA_ITEMS, "Carrot"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.Butter:
                return_items_intent.putExtra(EXTRA_ITEMS, "Butter"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.Jam:
                return_items_intent.putExtra(EXTRA_ITEMS, "Jam"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.Potato:
                return_items_intent.putExtra(EXTRA_ITEMS, "Potato"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            case R.id.Wheat:
                return_items_intent.putExtra(EXTRA_ITEMS, "Wheat"); setResult(RESULT_OK, return_items_intent); finish();
                break;
            default:
                Toast.makeText(SecondActivity.this, "There was an error", Toast.LENGTH_LONG).show();
                break;
        }

    }
}