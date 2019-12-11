package com.necer.ncalendar.activity;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.necer.calendar.Miui10Calendar;
import com.necer.calendar.MonthCalendar;
import com.necer.ncalendar.R;
import com.necer.ncalendar.painter.TicketPainter;
import com.necer.painter.InnerPainter;

import org.joda.time.LocalDate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FileName: TestFHActivity
 * Author: jibinghao
 * Date: 2019-12-11 11:03
 * Email:heybinghao@gmail.com
 * Description:
 */

public class TestFHActivity extends BaseActivity {

    MonthCalendar monthCalendar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_fenghuo);
        monthCalendar = findViewById(R.id.monthCalendar);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                add();
            }
        });
    }

    int post = 1;

    public void add() {
        if (post == 1) {
            List<String> pointList = Arrays.asList("2019-12-29", "2019-11-29", "2019-11-20", "2020-01-29", "2019-02-01");
            InnerPainter innerPainter = (InnerPainter) monthCalendar.getCalendarPainter();
            innerPainter.addPointList(pointList);
        }else if (post==2){
            List<String> pointList = Arrays.asList("2019-12-02", "2019-11-13", "2019-11-23", "2020-01-23", "2019-02-01");
            InnerPainter innerPainter = (InnerPainter) monthCalendar.getCalendarPainter();
            innerPainter.addPointList(pointList);
        }
        post++;

    }

//    public void ticketPainter() {
//        TicketPainter ticketPainter = new TicketPainter(this, monthCalendar);
//
//        Map<LocalDate, String> priceMap = new HashMap<>();
//        ticketPainter.setPriceMap(priceMap);
//        monthCalendar.setCalendarPainter(ticketPainter);
//        List<String> pointList = Arrays.asList("2019-12-01", "2019-11-19", "2019-11-20", "2020-01-23", "2019-02-01");
//        TicketPainter innerPainter = (TicketPainter) monthCalendar.getCalendarPainter();
////        innerPainter.setPointList(pointList);
//    }
}
