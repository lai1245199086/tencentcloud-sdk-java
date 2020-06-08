/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CacheTagKey extends AbstractModel{

    /**
    * 是否使用CacheTag作为CacheKey的一部分
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 自定义CacheTag的值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 是否使用CacheTag作为CacheKey的一部分 
     * @return Switch 是否使用CacheTag作为CacheKey的一部分
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 是否使用CacheTag作为CacheKey的一部分
     * @param Switch 是否使用CacheTag作为CacheKey的一部分
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 自定义CacheTag的值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 自定义CacheTag的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 自定义CacheTag的值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 自定义CacheTag的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

