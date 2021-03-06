package com.github.vivchar.immutableadapter.items.header;

import android.support.annotation.NonNull;

import com.github.vivchar.rendererrecyclerviewadapter.ItemModel;

/**
 * Created by Vivchar Vitaly on 3/6/17.
 */
public
class HeaderModel
		implements ItemModel
{

	public static final int TYPE = 2;
	@NonNull
	private final String mName;

	public
	HeaderModel(@NonNull final String name) {
		mName = name;
	}

	@Override
	public
	int getType() {
		return TYPE;
	}

	@NonNull
	public
	String getName() {
		return mName;
	}
}
