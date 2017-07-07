package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    MediaPlayer mediaFile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("One",   "Kunye", R.drawable.number_one, R.raw.number_one));
        words.add(new Word("Two",   "Kubile", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("Three", "Kuthathu", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("Four",  "Kune", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("Five",  "Kuhlanu", R.drawable.number_five ,R.raw.number_five));
        words.add(new Word("Six",   "Kuyis'thupha", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("Seven", "Kuyis'khombisa", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("Eight", "Kuyis'shagalombili", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("Nine",  "Kuyis'shagalolunye", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("Ten",   "Kuyishumi", R.drawable.number_ten, R.raw.number_ten));

        WordAdapter adapter = new WordAdapter(this,words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);

                mediaFile = MediaPlayer.create(NumbersActivity.this, word.getAudioResourceId());
                mediaFile.start();
            }
        });


    }
}
