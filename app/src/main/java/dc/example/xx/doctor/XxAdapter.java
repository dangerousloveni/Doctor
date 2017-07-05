package dc.example.xx.doctor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by daier on 2017/3/9.
 */

public class XxAdapter extends ArrayAdapter<Xx> {
    private int resourceId;

    public XxAdapter(Context context, int textViewResourceID, List<Xx> object) {
        super(context, textViewResourceID, object);
        resourceId = textViewResourceID;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Xx xx = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);

        TextView xxNum = (TextView) view.findViewById(R.id.room_num);
        TextView xxAll = (TextView) view.findViewById(R.id.all_num);
        TextView xxRest = (TextView) view.findViewById(R.id.rest_num);
        ImageView xximage = (ImageView) view.findViewById(R.id.ss_image);


        xxNum.setText(xx.getNum());
        xxAll.setText(xx.getAll() + "ml");
        xxRest.setText(xx.getRest() + "ml");
        xximage.setImageResource(xx.getImageID());
        return view;

    }

}
