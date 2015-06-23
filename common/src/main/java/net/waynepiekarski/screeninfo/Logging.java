// ---------------------------------------------------------------------
// Copyright 2015 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
// ---------------------------------------------------------------------

package net.waynepiekarski.screeninfo;

import android.util.Log;

public class Logging {

    private static final String TAG = "ScreenInfo";

    public static void debug (String str) {
        Log.d (TAG, str);
    }

    public static void fatal (String str) {
        Log.e (TAG, "FATAL ERROR: " + str);
        RuntimeException re = new RuntimeException();
        re.printStackTrace();
        Log.e (TAG, "Exiting with error code 1");
        System.exit(1);
    }

}
