package com.example.test2.fragment;

import android.content.Context;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import com.example.test2.ListAdapter;
import com.example.test2.Modell;
import com.example.test2.OnFragmentManager;
import com.example.test2.R;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstFragment extends ListFragment {

    int[] imagesHotel = {R.drawable.restaurant_dish,R.drawable.restaurant_dish,R.drawable.restaurant_dish,R.drawable.restaurant_dish,R.drawable.restaurant_dish};
    public String[] arraysTitleHotel = {"Hải Phòng 1","Nha Trang 1","Cần Thơ 1","Hồ Chú Minh 1","Vũng Tàu 1"};
    public String[] arraysNameHotel = {"Tên khách sạn Hải Phòng 1","Tên khách sạn Nha Trang 1","Tên khách sạn Cần Thơ 1","Tên khách sạn Hồ Chú Minh 1","Tên khách sạn Vũng Tàu 1"};

    ArrayList<Modell> List = new ArrayList<Modell>();
    ListAdapter listAdapter;
    ListView listView;

    private ISendDataListener mISendDataListener;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first,container,false);
        listView = view.findViewById(R.id.list1);
        fillArray();
        listAdapter = new ListAdapter(getContext(),List);
        listView.setAdapter(listAdapter);
        listAdapter.notifyDataSetChanged();
        return view;
    }
    private void fillArray(){
        // Map
        HashMap<String, String> map = new HashMap<String, String>();
        //Fill
        for(int i = 0; i < arraysTitleHotel.length; i++){
            Modell modell = new Modell();
            modell.setImage(imagesHotel[i]);
            modell.setName(arraysNameHotel[i]);
            modell.setTitle(arraysTitleHotel[i]);
            List.add(modell);
        }
    }

    public interface  ISendDataListener{
        void sendData(String title);
    }

    @Override
    public void onStart() {
        super.onStart();

        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),list , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
