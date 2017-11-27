package com.lyxsh.multiprogress;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 2017/11/27.
 */

public class Multiprogress{
    public void start(Context context){
        //注释会更新上去吗?????怎么不更新
        context.startActivity(new Intent(context,Multiprogress.class));
    }
}
