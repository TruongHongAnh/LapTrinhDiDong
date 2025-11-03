package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SelectListener {

    RecyclerView recyclerView;
    List<Person> personList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        personList = new ArrayList<>();
        personList.add(new Person("Nguyễn Đình Văn", "23115053122204"));
        personList.add(new Person("Phan Hà Minh Phúc", "23115053122204"));
        personList.add(new Person("Trương Hồng Anh", "23115053122204"));
        personList.add(new Person("Võ Đức Tống", "23115053122204"));
        personList.add(new Person("Tô Đông Cẩn", "23115053122204"));

        PersonAdapter adapter = new PersonAdapter(this, personList, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClicked(Person person) {
        showDetailDialog(person);
    }

    private void showDetailDialog(Person person) {
        String detailMessage =
                "Tên: " + person.getName() +
                        "\n\nMã số sinh viên: " + person.getMsv() +
                        "\n\nEmail: " + person.getEmail() +
                        "\n\nChức vụ/Vai trò: " + person.getJobTitle();

        new AlertDialog.Builder(this)
                .setTitle("Thông tin thành viên")
                .setMessage(detailMessage)
                .setIcon(R.drawable.ic_launcher_foreground)
                .setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }
}
