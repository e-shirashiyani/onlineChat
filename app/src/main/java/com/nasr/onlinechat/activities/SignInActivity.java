package com.nasr.onlinechat.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.nasr.onlinechat.AppConfiguration;
import com.nasr.onlinechat.databinding.ActivitySignInBinding;
import com.nasr.onlinechat.firebase.MessagingService;


public class SignInActivity extends AppCompatActivity {
FirebaseMessagingService firebaseMessagingService;
    private static final String TAG = "SignInActivity";
    private ActivitySignInBinding binding;
    private String encodedImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //MessagingService.getToken(Context);
        MessagingService.getToken(this);
        FirebaseApp.initializeApp(AppConfiguration.getContext());
//        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener<String>() {
//            @Override
//            public void onComplete(@NonNull Task<String> task) {
//                if (task.isSuccessful()) {
//                    Toast.makeText(SignInActivity.this, task.getResult(), Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(SignInActivity.this, "failur", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
        setListener();
    }



    private void setListener() {
        binding.txtCreateNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SignUpActivity.class));
            }
        });

        binding.btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    private void showToast(String message){
        Toast.makeText(getApplicationContext(), "message", Toast.LENGTH_SHORT).show();
    }

    private void signUp(){

    }

//    private Boolean isValidSignUpDetails(){
//        if(encodedImage==null){
//            showToast("select profile image");
//            return false;
//        }else if(binding.in)
//    }


}