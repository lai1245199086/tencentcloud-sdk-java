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

public class QueryStringKey extends AbstractModel{

    /**
    * on | off CacheKey是否由QueryString组成
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 是否重新排序
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reorder")
    @Expose
    private String Reorder;

    /**
    * includeAll | excludeAll | includeCustom | excludeAll 使用/排除部分url参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 使用/排除的url参数名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get on | off CacheKey是否由QueryString组成
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch on | off CacheKey是否由QueryString组成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set on | off CacheKey是否由QueryString组成
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch on | off CacheKey是否由QueryString组成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 是否重新排序
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reorder 是否重新排序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReorder() {
        return this.Reorder;
    }

    /**
     * Set 是否重新排序
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reorder 是否重新排序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReorder(String Reorder) {
        this.Reorder = Reorder;
    }

    /**
     * Get includeAll | excludeAll | includeCustom | excludeAll 使用/排除部分url参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action includeAll | excludeAll | includeCustom | excludeAll 使用/排除部分url参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set includeAll | excludeAll | includeCustom | excludeAll 使用/排除部分url参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action includeAll | excludeAll | includeCustom | excludeAll 使用/排除部分url参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 使用/排除的url参数名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 使用/排除的url参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 使用/排除的url参数名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 使用/排除的url参数名
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
        this.setParamSimple(map, prefix + "Reorder", this.Reorder);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

