package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    MediaPlayer mediaFile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("How are you feeling?",  "Uzizwa unjani?", R.raw.how_are_you));
        words.add(new Word("What is your name?",    "Ubani igama lakho?", R.raw.what_is_your_name));
        words.add(new Word("How old are you?",      "Uneminyaka emingaki?", R.raw.how_old_are_you));
        words.add(new Word("Where do you stay?",    "Uhlalaphi?", R.raw.where_do_you_stay));
        words.add(new Word("I'm feeling good",    "Ngizizwa ngiphilile", R.raw.im_feeling_good));
        words.add(new Word("Are you coming?",   "Uyeza?", R.raw.are_you_coming));
        words.add(new Word("My surname is Zulu", "Ngingo wakwa Zulu", R.raw.surname));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);

                mediaFile = MediaPlayer.create(PhrasesActivity.this, word.getAudioResourceId());
                mediaFile.start();
            }
        });
    }
}
