package com.example.rock_paper_scissors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.rock_paper_scissors.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    String n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.Rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.human.setImageResource(R.drawable.rock_hand);
                n1 = "Rock";
                display();
            }
        });

        binding.Paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.human.setImageResource(R.drawable.paper_hand);
                n1 = "Paper";
                display();
            }
        });

        binding.Scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.human.setImageResource(R.drawable.scissor_hand);
                n1 = "Scissor";
                display();
            }
        });
    }
    public void display(){
        Random rnd= new Random();
        int n= rnd.nextInt(3);
        if(n==0){
            binding.robot.setImageResource(R.drawable.rock_hand);
            binding.robot.setRotation(100);
        }
        else if(n==1){
            binding.robot.setImageResource(R.drawable.paper_hand);
            binding.robot.setRotation(100);
        }
        else if(n==2){
            binding.robot.setImageResource(R.drawable.scissor_hand);
            binding.robot.setRotation(100);
        }
    }
}