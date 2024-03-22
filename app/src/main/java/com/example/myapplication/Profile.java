package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Ánh xạ các thành phần trong layout
        ImageView profileImage = findViewById(R.id.profile_image);
        TextView profileName = findViewById(R.id.profile_name);
        TextView textId = findViewById(R.id.text_id);
        TextView textUsername = findViewById(R.id.text_username);
        TextView textEmail = findViewById(R.id.text_email);
        TextView textGender = findViewById(R.id.text_gender);
        Button btnLogout = findViewById(R.id.btn_logout);

        // Thiết lập thông tin người dùng
        profileImage.setImageResource(R.drawable.ic_launcher_background); // Đặt ảnh đại diện
        profileName.setText("Tên người dùng"); // Đặt tên người dùng
        textId.setText("2"); // Đặt ID
        textUsername.setText("trung2"); // Đặt tên đăng nhập
        textEmail.setText("trung2@gmail.com"); // Đặt email
        textGender.setText("Nam"); // Đặt giới tính

        // Xử lý sự kiện khi nhấn nút Logout
        btnLogout.setOnClickListener(view -> {
            // Xử lý đăng xuất ở đây
            // Ví dụ: chuyển về màn hình đăng nhập
        });
    }
}
