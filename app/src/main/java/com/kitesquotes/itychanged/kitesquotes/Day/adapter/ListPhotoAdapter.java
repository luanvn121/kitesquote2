package com.kitesquotes.itychanged.kitesquotes.Day.adapter;

import android.content.Context;
import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;


import com.bumptech.glide.Glide;
import com.kitesquotes.itychanged.kitesquotes.Day.model.OPhoto;
import com.kitesquotes.itychanged.kitesquotes.R;


import java.util.List;


/**
 * Created by hha07 on 7/25/2016.
 * Spiderman
 */
public class ListPhotoAdapter extends RecyclerView.Adapter {

    private LayoutInflater inflater;
    private List<OPhoto> data;
    private ClickListener clickListener;
    private Context context;
    private int itemHeight;
    public ListPhotoAdapter(Context context, List<OPhoto> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
        this.context = context;
        /*itemHeight = getScreenWith(context)/4;*/
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_photo, parent, false);

        return new VHItem(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        OPhoto album = data.get(position);
        VHItem vhAlbumItem = (VHItem)holder;

        Glide.with(context)
                .load(album.getImage())
                .into(vhAlbumItem.imageView);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class VHItem extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageView;
        public VHItem(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) itemView.getLayoutParams();
            imageView= (ImageView) itemView.findViewById(R.id.btnPokemon);


        }

        @Override
        public void onClick(View v) {
            clickListener.itemClicked(v, getAdapterPosition());
        }
    }

    public interface ClickListener {
        void itemClicked(View view, int position);
    }

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }
    public static int getScreenWith(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        return width;
    }
}
