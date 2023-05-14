package com.example.rock_paper_scissors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.rock_paper_scissors.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    String n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
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