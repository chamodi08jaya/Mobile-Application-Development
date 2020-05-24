package com.chamojaya.thirdapp;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TestFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TestFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TestFragment() {
        Log.d("17020387","Simple Fragment()");
        // Required empty public constructor
    }



    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TestFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TestFragment newInstance(String param1, String param2) {
        TestFragment fragment = new TestFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        Log.d("17020387","OnActivityCreated Called");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("17020387","OnCreate called()");
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("17020387","OnCreateView(...)");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test, container, false);
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        Log.d("17020387","OnAttach Called");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("17020387","OnDestroy Called");
        // Inflate the layout for this fragment

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("17020387","OnDestroyView Called");
        // Inflate the layout for this fragment

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("17020387","OnDetach Called");
        // Inflate the layout for this fragment

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("17020387","OnPause Called");
        // Inflate the layout for this fragment

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("17020387","OnResume Called");
        // Inflate the layout for this fragment

    }


    @Override
    public void onStart() {
        super.onStart();
        Log.d("17020387","OnStart Called");
        // Inflate the layout for this fragment

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("17020387","OnStop Called");
        // Inflate the layout for this fragment

    }






}
