/*
 * Copyright (C) 2013 The Android Open Source Project
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

package com.example.bluetooth.le;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "0000ffe1-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    public static String WECHAT_SERVICE_UUID = "0000fee7-0000-1000-8000-00805f9b34fb";
    public static String WECHAT_SERVER_TX_UUID = "0000fec7-0000-1000-8000-00805f9b34fb";
    public static String WECHAT_SERVER_RX_UUID = "0000fec8-0000-1000-8000-00805f9b34fb";
    public static String WECHAT_SERVER_FLOW_UUID = "0000fec9-0000-1000-8000-00805f9b34fb";

    //public static String SPS_SERVICE_UUID = "0783b03e-8535-7140-a304d2495cb7";
   // public static String SPS_SERVER_TX_UUID = "0783b03e-8535-7140-a304d2495cb8";
   // public static String SPS_SERVER_RX_UUID = "0783b03e-8535-7140-a304d2495cba";
    //public static String SPS_SERVER_FLOW_UUID = "0783b03e-8535-7140-a304d2495cb9";

    static {
        // Sample Services.
        attributes.put("00001800-0000-1000-8000-00805f9b34fb", "Generic Access");
        attributes.put("00001801-0000-1000-8000-00805f9b34fb", "Generic Attribute");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        attributes.put("0000180f-0000-1000-8000-00805f9b34fb", "Battery Service");
        attributes.put("edfec62e-9910-0abc-5241-d8bda6932a2f", "用户服务");
        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");

        attributes.put(WECHAT_SERVICE_UUID,"微信服务");
        attributes.put(WECHAT_SERVER_TX_UUID,"微信发送");
        attributes.put(WECHAT_SERVER_RX_UUID,"微信接收");
        attributes.put(WECHAT_SERVER_FLOW_UUID,"MAC地址");

    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}