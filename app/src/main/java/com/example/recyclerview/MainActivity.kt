package com.example.recyclerview

import android.icu.lang.UCharacter.VerticalOrientation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var SongList: RecyclerView
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        SongList = binding.songList
//        SongList = findViewById(R.id.songList)

        val songsObjects = mutableListOf<Song>()
        songsObjects.add(Song("Hello", "Just the description"))
        songsObjects.add(Song("Abc", "Just the description 1"))
        songsObjects.add(Song("Dhruvi", "Just the description 2"))
        songsObjects.add(Song("Hello", "Just the description 3"))
        songsObjects.add(Song("Good morning", "Just the description 4"))
        songsObjects.add(Song("All Good", "Just the description 5"))
        songsObjects.add(Song("Hello", "Just the description 6"))
        songsObjects.add(Song("Hi", "Just the description 7"))
        songsObjects.add(Song("Good Luck", "Just the description 8"))
        songsObjects.add(Song("Hie", "Just the description 9"))
        songsObjects.add(Song("Good", "Just the description 10"))
        songsObjects.add(Song("Bad", "Just the description 11"))
        songsObjects.add(Song("Happy", "Just the description 12"))
        songsObjects.add(Song("Hello", "Just the description 13"))



        SongList.adapter = MyAdapter(songsObjects)
        SongList.layoutManager = StaggeredGridLayoutManager(3,
            StaggeredGridLayoutManager.VERTICAL)


    }
}