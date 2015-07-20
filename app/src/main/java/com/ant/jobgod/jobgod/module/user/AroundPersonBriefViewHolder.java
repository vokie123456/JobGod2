package com.ant.jobgod.jobgod.module.user;

import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ant.jobgod.jobgod.R;
import com.ant.jobgod.jobgod.model.bean.AroundPersonBrief;
import com.balysv.materialripple.MaterialRippleLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Mr.Jude on 2015/7/19.
 */
public class AroundPersonBriefViewHolder extends BaseViewHolder<AroundPersonBrief> {
    @InjectView(R.id.imgFace)
    SimpleDraweeView imgFace;
    @InjectView(R.id.tvName)
    TextView tvName;
    @InjectView(R.id.tvSignature)
    TextView tvSignature;
    @InjectView(R.id.ripple)
    MaterialRippleLayout ripple;

    /**
     * 重载构造方法
     *
     * @param parent
     */
    public AroundPersonBriefViewHolder(ViewGroup parent) {
        super(parent, R.layout.user_item_person);
        ButterKnife.inject(this, itemView);
    }

    @Override
    public void setData(AroundPersonBrief data) {
        imgFace.setImageURI(Uri.parse(data.getFace()));
        tvName.setText(data.getName());
        tvSignature.setText(data.getSign());
        ripple.setOnClickListener(v -> itemView.getContext().startActivity(new Intent(itemView.getContext(), UserDetailActivity.class)));
    }
}