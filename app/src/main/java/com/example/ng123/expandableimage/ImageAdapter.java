

package com.example.ng123.expandableimage;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.graphics.Color.BLUE;

/**
 * Created by ng123 on 10/16/2015.
 */
public class ImageAdapter extends BaseAdapter {
    //private Context mContext;
    //Context context;
    int layoutResourceId;
   // ArrayList<ClipData.Item> data = new ArrayList<ClipData.Item>();
    private Context mContext;
    private final String[] web;
    private final int[] Imageid;

    public ImageAdapter(Context c,String[] web,int[] Imageid ) {
        mContext = c;
        this.Imageid = Imageid;
        this.web = web;
    }

//    public ImageAdapter(Context context, int layoutResourceId, ArrayList<ClipData.Item> data) {
//
//        super(context, layoutResourceId, data);
//        this.layoutResourceId = layoutResourceId;
//        this.context = context;
//        this.data = data;
//    }

    public int getCount() {
        return web.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    // TODO Auto-generated method stub
    View grid;
    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.grid_single, null);
            TextView textView = (TextView) grid.findViewById(R.id.grid_text);
            ImageView imageView = (ImageView)grid.findViewById(R.id.grid_image);
            textView.setText(web[position]);
            imageView.setImageResource(Imageid[position]);
            if(position== 0){
                imageView.setBackgroundColor(Color.parseColor("#9EE4B5"));
            }
            else if(position== 1){
                imageView.setBackgroundColor(Color.parseColor("#F6BF77"));
            }
            else if(position== 2){
                imageView.setBackgroundColor(Color.parseColor("#8DC3F9"));
            }
            else if(position== 3){
                imageView.setBackgroundColor(Color.parseColor("#EFB9B9"));
            }
            else if(position== 4){
                imageView.setBackgroundColor(Color.parseColor("#E9EF8F"));
            }
            else if(position== 5){
                imageView.setBackgroundColor(Color.parseColor("#B6EFFF"));
            }
            else if(position== 6){
                imageView.setBackgroundColor(Color.parseColor("#E9AFE0"));
            }
            else if(position== 7){
                imageView.setBackgroundColor(Color.parseColor("#BAB371"));
            }
            else if(position== 8){
                imageView.setBackgroundColor(Color.parseColor("#D0CACA"));
            }
            } else {
            grid = (View) convertView;
        }
        return grid;
    }


//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        View row = convertView;
//        RecordHolder holder = null;
//        if (row == null) {
//            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
//            row = inflater.inflate(layoutResourceId, parent, false);
//            holder = new RecordHolder();
//            holder.txtTitle = (TextView) row.findViewById(R.id.grid_text);
//            holder.imageItem = (ImageView) row.findViewById(R.id.grid_image);
//            row.setTag(holder);
//        } else {
//            holder = (RecordHolder) row.getTag();
//        }
//        ClipData.Item item = data.get(position);
//        holder.txtTitle.setText(item.getTitle());
//        holder.imageItem.setImageBitmap(item.getImage());
//        return row;
//    }
//    static class RecordHolder {
//        TextView txtTitle;
//        ImageView imageItem;
//    }
//}

    // create a new ImageView for each item referenced by the Adapter
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ImageView imageView;
//        if (convertView == null) {
//            // if it's not recycled, initialize some attributes
//            imageView = new ImageView(mContext);
//            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
//            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            imageView.setPadding(8, 8, 8, 8);
//        } else {
//            imageView = (ImageView) convertView;
//        }
//
//        imageView.setImageResource(mThumbIds[position]);
//        return imageView;
//    }
//
//    // references to our images
//    private Integer[] mThumbIds = {
//            R.drawable.sample_2, R.drawable.sample_3,
//            R.drawable.sample_4, R.drawable.sample_5,
//            R.drawable.sample_6, R.drawable.sample_7,
//            R.drawable.sample_0, R.drawable.sample_1,
//            R.drawable.sample_2, R.drawable.sample_3,
//            R.drawable.sample_4, R.drawable.sample_5,
//            R.drawable.sample_6, R.drawable.sample_7,
//            R.drawable.sample_0, R.drawable.sample_1,
//            R.drawable.sample_2, R.drawable.sample_3,
//            R.drawable.sample_4, R.drawable.sample_5,
//            R.drawable.sample_6, R.drawable.sample_7
//    };
}
