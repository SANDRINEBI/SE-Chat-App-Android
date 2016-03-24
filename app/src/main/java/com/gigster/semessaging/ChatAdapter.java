package com.gigster.semessaging;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.List;

class ChatAdapter extends ArrayAdapter<ChatMessage> {

    public ChatAdapter(Context context, int resource, List<ChatMessage> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ChatMessage p = getItem(position);

        if (p != null) {

            View v = convertView;

            if (v == null) {
                LayoutInflater vi;
                vi = LayoutInflater.from(getContext());
                if(p.isMine())
                    v = vi.inflate(R.layout.own_chat_row, parent, false);
                else
                    v = vi.inflate(R.layout.chatting_with_row, parent, false);
            }

            TextView message = (TextView) v.findViewById(R.id.message);
            TextView datetime = (TextView) v.findViewById(R.id.datetime);

            if (message!=null){
                message.setText(p.getText());
            }

            if (datetime!=null){
                DateFormat format = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT);
                datetime.setText(format.format(p.getDate()));
            }

            return v;
        }
        return convertView;
    }

}
