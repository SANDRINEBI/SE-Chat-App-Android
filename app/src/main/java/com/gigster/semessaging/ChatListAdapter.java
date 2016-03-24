package com.gigster.semessaging;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.makeramen.roundedimageview.RoundedTransformationBuilder;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

import java.util.List;

class ChatListAdapter extends ArrayAdapter<Chat> {
    public static final Transformation transformation = new RoundedTransformationBuilder()
    .borderColor(Color.BLACK)
    .borderWidthDp(0)
    .cornerRadiusDp(30)
    .oval(false)
    .build();
    public ChatListAdapter(Context context, int resource, List<Chat> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.list_row, parent, false);
        }

        Chat p = getItem(position);

        if (p != null) {
            ImageView dot = (ImageView) v.findViewById(R.id.dot);
            GradientDrawable dotDrawable = (GradientDrawable) dot.getDrawable();
            ImageView propic = (ImageView) v.findViewById(R.id.propic);
            TextView chatName = (TextView) v.findViewById(R.id.chatName);
            TextView lastMessage = (TextView) v.findViewById(R.id.lastMessage);
            TextView timeSinceMessage = (TextView) v.findViewById(R.id.timeSinceMessage);

            switch(p.getUrgency()) {
                case 0:
                    break;
                case 1:
                    dotDrawable.setColor(Color.BLUE);
                    break;
                case 2:
                    dotDrawable.setColor(Color.RED);
                    break;
                default:
                    break;
            }

            if (propic!=null){
                Picasso.with(this.getContext())
                        .load(p.getImageUri())
                        .fit()
                        .centerCrop()
                        .placeholder(R.mipmap.ic_launcher)
                        .transform(transformation)
                        .into(propic);
            }

            if (chatName!=null){
                chatName.setText(p.getChatName());
            }

            if (lastMessage!=null){
                lastMessage.setText(p.getMostRecentMsg());
            }

            if (timeSinceMessage!=null){
                timeSinceMessage.setText(p.getTimeSinceMessage());
            }
        }

        return v;
    }

}