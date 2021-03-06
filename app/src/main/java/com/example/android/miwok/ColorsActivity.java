package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    MediaPlayer mediaFile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Red",   "Bomvu", R.drawable.color_red, R.raw.red));
        words.add(new Word("Yellow",   "Liphuzi", R.drawable.color_mustard_yellow, R.raw.yellow));
        words.add(new Word("Green", "Luhlaza", R.drawable.color_green, R.raw.green));
        words.add(new Word("White",  "Mhlophe", R.drawable.color_white, R.raw.father));
        words.add(new Word("Brown",  "Nsundu" ,R.drawable.color_brown, R.raw.brown));
        words.add(new Word("Black", "Mnyama", R.drawable.color_black, R.raw.black));
        words.add(new Word("Grey", "Mpunga", R.drawable.color_gray, R.raw.grey));
        words.add(new Word("Grey", "Orenji", R.drawable.color_dusty_yellow, R.raw.oranji));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);

                mediaFile = MediaPlayer.create(ColorsActivity.this, word.getAudioResourceId());
                mediaFile.start();
            }
        });

    }
}
