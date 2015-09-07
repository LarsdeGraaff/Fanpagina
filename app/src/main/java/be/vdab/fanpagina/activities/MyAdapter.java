package be.vdab.fanpagina.activities;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import be.vdab.fanpagina.R;
import be.vdab.fanpagina.Speler;

/**
 * Created by jeansmits on 4/09/15.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Speler> spelerList;
    Context context;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public TextView pTextView;
        public ImageView imageView;
        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView) v.findViewById(R.id.textViewID);
            pTextView = (TextView) v.findViewById(R.id.textViewPositie);
            imageView = (ImageView) v.findViewById(R.id.imageViewSpelers);

        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(List <Speler> myDataset, Context context) {
        spelerList = myDataset;
        context= context;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.myrow, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mTextView.setText(spelerList.get(position).getName());
        holder.pTextView.setText(spelerList.get(position).getPosition());
        Picasso.with(context).load(spelerList.get(position).getFoto()).into(holder.imageView);


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return spelerList.size();
    }

}

