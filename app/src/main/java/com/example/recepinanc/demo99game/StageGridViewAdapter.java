package com.example.recepinanc.demo99game;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Recepinanc on 03.10.2015.
 */
public class StageGridViewAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Stage> mStages;

    public StageGridViewAdapter(Context context, ArrayList<Stage> stages) {
        mContext = context;
        mStages = stages;
    }

    @Override
    public int getCount() {
        return mStages.size();
    }

    @Override
    public Object getItem(int position) {
        return mStages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.stage_grid_item_layout, parent, false);

            TextView stageNumber = (TextView) convertView.findViewById(R.id.stageNumber_textView);
            ImageView firstStar = (ImageView) convertView.findViewById(R.id.firstStar_imageView);
            ImageView secondStar = (ImageView) convertView.findViewById(R.id.secondStar_imageView);
            ImageView thirdStar = (ImageView) convertView.findViewById(R.id.thirdStar_imageView);

            Stage mStage = mStages.get(position);
            stageNumber.setText(mStage.getStageNumber());

            for (int i = 0; i < 3; i++) {
                switch (i) {
                    case 0:
                        setStar(mStage, i, firstStar);
                        break;
                    case 1:
                        setStar(mStage, i, secondStar);
                        break;
                    case 2:
                        setStar(mStage, i, thirdStar);
                        break;
                    default:
                        break;
                }
            }
        }

        return convertView;
    }

    public void setStar(Stage stage, int starOrder, ImageView view) {
        int resourceid;

        boolean[] checks = stage.getIsStars();

        if (checks[starOrder]) {
            resourceid = R.drawable.star_yellow;
        } else {
            resourceid = R.drawable.star_white;
        }

        view.setImageResource(resourceid);
    }


}
