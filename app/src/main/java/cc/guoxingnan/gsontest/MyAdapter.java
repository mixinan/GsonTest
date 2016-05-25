package cc.guoxingnan.gsontest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mixinan on 2016/5/25.
 */
public class MyAdapter extends BaseAdapter {
    private Context context;
    private List<Result> data;

    public MyAdapter(Context context, List<Result> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    class ViewHolder {
        TextView tvTime;
        TextView tvTitle;
        TextView tvContent;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
            holder.tvTime = (TextView) convertView.findViewById(R.id.tv_time);
            holder.tvTitle = (TextView) convertView.findViewById(R.id.tv_title);
            holder.tvContent = (TextView) convertView.findViewById(R.id.tv_content);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Result result = data.get(position);

        holder.tvTime.setText(result.getPublishedAt());
        holder.tvTitle.setText(result.getDesc());
        holder.tvContent.setText(result.getUrl());

        return convertView;
    }
}
