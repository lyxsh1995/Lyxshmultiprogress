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
        //连Activity的名字都能写错...
        context.startActivity(new Intent(context,MainActivity.class));
    }
}
