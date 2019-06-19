package com.mohamedboltia.cargo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Custom_Adapter_Two extends BaseAdapter {

    Context context;
    List<Row_Item_Two> rowItems;

    Custom_Adapter_Two(Context context, List<Row_Item_Two> rowItems) {
        this.context = context;
        this.rowItems = rowItems;
    }

    @Override
    public int getCount() {
        return rowItems.size();
    }

    @Override
    public Object getItem(int position) {
        return rowItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return rowItems.indexOf(getItem(position));
    }

    /* private view holder class */
    private class ViewHolder {
        ImageView profile_pic;
        TextView member_name;
        TextView status;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Custom_Adapter_Two.ViewHolder holder = null;

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.notification_import, null);
            holder = new Custom_Adapter_Two.ViewHolder();

            holder.member_name = (TextView) convertView.findViewById(R.id.transportCompanyName);
            holder.profile_pic = (ImageView) convertView.findViewById(R.id.circleImageView8);
            holder.status = (TextView) convertView.findViewById(R.id.Accept);


            Row_Item_Two row_pos = rowItems.get(position);

            holder.profile_pic.setImageResource(row_pos.getProfile_pic_id());
            holder.member_name.setText(row_pos.getMember_name());
            holder.status.setText(row_pos.getStatus());


            convertView.setTag(holder);
        } else {
            holder = (Custom_Adapter_Two.ViewHolder) convertView.getTag();
        }

        return convertView;
    }
}
