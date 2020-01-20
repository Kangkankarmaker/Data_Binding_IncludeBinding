package kangkan.developer.includebinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kangkan.developer.includebinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);


        Student student=new Student("Kangkan",22);
        student.addcourse("Android");
        student.addcourse("ios");
        student.addcourse("web");

        binding.setStudent(student);


    }
}
