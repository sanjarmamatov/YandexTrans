/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

/**
 * Fragment that displays "Monday".
 */
public class MondayFragment extends Fragment {
        Button b;
        TextView tv;
    //Toolbar toolbar;






        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

           /* b = (Button)container.findViewById(R.id.button);
            tv = (TextView)container.findViewById(R.id.tv);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tv.setText("kek");
                }
            });*/
           View view = inflater.inflate(R.layout.fragment_monday, container, false);

       /*     toolbar=(Toolbar)view.findViewById(R.id.toolbar);
*/

           /* tv = (TextView)view.findViewById(R.id.tv);

            b = (Button)view.findViewById(R.id.button);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tv.setText("kek");
                }
            });
*/
          return view;
    }
}
