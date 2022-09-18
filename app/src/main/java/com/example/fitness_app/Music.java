package com.example.fitness_app;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.concurrent.TimeUnit;

public class Music extends AppCompatActivity {

    Button playBtn, btRew, btFf;
    SeekBar positionBar, volumeBar;
    TextView elapsedTimeLabel, remainingTimeLabel;
    MediaPlayer mp;
    int totalTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        //toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Music");
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        playBtn = findViewById(R.id.playBtn);
        elapsedTimeLabel = findViewById(R.id.elapsedTimeLabel);
        remainingTimeLabel = findViewById(R.id.remainingTimeLabel);
        btRew = findViewById(R.id.bt_rew);
        btFf = findViewById(R.id.bt_ff);

        // Media Player
        mp = MediaPlayer.create(this, R.raw.music1);
        mp.setLooping(true);
        mp.seekTo(0);
        mp.setVolume(0.5f, 0.5f);
        totalTime = mp.getDuration();

        // Position Bar
        positionBar = findViewById(R.id.positionBar);
        positionBar.setMax(totalTime);
        positionBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        if (fromUser) {
                            mp.seekTo(progress);
                            positionBar.setProgress(progress);
                        }
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                }
        );


        // Volume Bar
        volumeBar = findViewById(R.id.volumeBar);
        volumeBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        float volumeNum = progress / 100f;
                        mp.setVolume(volumeNum, volumeNum);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                }
        );

        // Thread (Update positionBar & timeLabel)
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mp != null) {
                    try {
                        Message msg = new Message();
                        msg.what = mp.getCurrentPosition();
                        handler.sendMessage(msg);
                        Thread.sleep(1000);
                    } catch (InterruptedException ignored) {}
                }
            }
        }).start();

    }

    private Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            int currentPosition = msg.what;
            // Update positionBar.
            positionBar.setProgress(currentPosition);

            // Update Labels.
            String elapsedTime = createTimeLabel(currentPosition);
            elapsedTimeLabel.setText(elapsedTime);

            String remainingTime = "- " + createTimeLabel(totalTime - currentPosition);
            remainingTimeLabel.setText(remainingTime);

            return true;
        }
    });

    public String createTimeLabel(int time) {
        String timeLabel = "";
        int min = time / 1000 / 60;
        int sec = time / 1000 % 60;

        timeLabel = min + ":";
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;

        return timeLabel;
    }

    public void playBtnClick(View view) {

        if (!mp.isPlaying()) {
            // Stopping
            mp.start();
            playBtn.setBackgroundResource(R.drawable.stop);

        } else {
            // Playing
            mp.pause();
            playBtn.setBackgroundResource(R.drawable.play);
        }
        btFf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get current position of media player
                int currentPosition = mp.getCurrentPosition();
                //Get the duration of the media player
                int duration = mp.getDuration();
                //Check Condition
                if(mp.isPlaying() && duration != currentPosition)
                {
                    currentPosition =currentPosition + 5000;
                    elapsedTimeLabel.setText(convertFormat(currentPosition));
                    mp.seekTo(currentPosition);
                }
            }
        });
        btRew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentPosition = mp.getCurrentPosition();
                if(mp.isPlaying() &&  currentPosition > 5000)
                {
                    currentPosition =currentPosition - 5000;
                    elapsedTimeLabel.setText(convertFormat(currentPosition));
                    mp.seekTo(currentPosition);
                }
            }
        });

    }
    @SuppressLint("Default Local")
    private String convertFormat(int duration)
    {
        return String.format("%02d:02d",
                TimeUnit.MILLISECONDS.toMinutes(duration),
                TimeUnit.MILLISECONDS.toSeconds(duration) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration)));
    }

}