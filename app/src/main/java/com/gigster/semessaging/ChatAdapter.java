package com.gigster.semessaging;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

class ChatAdapter extends BaseAdapter {
    private final int TYPE_LEFT = 0;
    private final int TYPE_RIGHT = 1;
    private final int TYPE_MAX_COUNT = 2;
    private ArrayList<ChatMessage> chat = new ArrayList<>();
    private LayoutInflater vi;

    public ChatAdapter(Context context){
        vi = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    public ChatAdapter(Context context, ArrayList<ChatMessage> c){
        vi = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        chat = c;
    }
//    public ChatAdapter(Context context, int resource, List<ChatMessage> items) {
//        super(context, resource, items);
//    }
    public void add(ChatMessage c){
        chat.add(c);
        notifyDataSetChanged();
    }


    @Override
    public int getViewTypeCount(){
        return TYPE_MAX_COUNT;
    }

    @Override
    public int getItemViewType(int position){
        ChatMessage p = getItem(position);
        return p.isMine() ? TYPE_RIGHT : TYPE_LEFT;
    }

    @Override
     public long getItemId(int position) {
        return position;
    }

    @Override
    public ChatMessage getItem(int position){
        return chat.get(position);
    }

    @Override
    public int getCount() {
        return chat.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        int type = getItemViewType(position);
        switch (type){
            case TYPE_LEFT:
                v = vi.inflate(R.layout.chatting_with_row,null);
                break;
            case TYPE_RIGHT:
                v = vi.inflate(R.layout.own_chat_row, null);
                break;
            default:
                v = vi.inflate(R.layout.own_chat_row, null);
        }

        ChatMessage p = getItem(position);

        if (p != null) {


            TextView message = (TextView) v.findViewById(R.id.message);
            TextView datetime = (TextView) v.findViewById(R.id.datetime);
            if (message != null) {
                message.setText(p.getText());
            }

            if (datetime != null) {
                DateFormat format = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT);
                datetime.setText(format.format(p.getDate()));
            }
        }

        return v;
    }

}
