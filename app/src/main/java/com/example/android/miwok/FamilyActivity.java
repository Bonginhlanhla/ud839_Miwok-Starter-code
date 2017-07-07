package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    MediaPlayer mediaFile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Father",     "UBaba", R.drawable.family_father, R.raw.father));
        words.add(new Word("Mother",            "UMama", R.drawable.family_mother, R.raw.mother));
        words.add(new Word("Sister",            "USisi", R.drawable.family_younger_sister, R.raw.sister));
        words.add(new Word("Brother",    "UBhuti", R.drawable.family_younger_brother, R.raw.brother));
        words.add(new Word("Older sister",      "Sis'omdala", R.drawable.family_older_sister, R.raw.mother));
        words.add(new Word("Older brother",     "Bhuti'omncane", R.drawable.family_older_brother, R.raw.mother));
        words.add(new Word("Son", "ndondana", R.drawable.family_son, R.raw.son));
        words.add(new Word("Grandfather",   "UMkhulu", R.drawable.family_father, R.raw.grandfather));
        words.add(new Word("Grandmother",   "UGogo", R.drawable.family_grandmother, R.raw.grandmother));


//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);

                mediaFile = MediaPlayer.create(FamilyActivity.this, word.getAudioResourceId());
                mediaFile.start();
            }
        });
    }
}
