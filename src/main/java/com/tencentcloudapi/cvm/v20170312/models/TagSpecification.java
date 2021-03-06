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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagSpecification  extends AbstractModel{

    /**
    * 标签绑定的资源类型，当前支持类型："instance"和"host"
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 标签对列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * 获取标签绑定的资源类型，当前支持类型："instance"和"host"
     * @return ResourceType 标签绑定的资源类型，当前支持类型："instance"和"host"
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * 设置标签绑定的资源类型，当前支持类型："instance"和"host"
     * @param ResourceType 标签绑定的资源类型，当前支持类型："instance"和"host"
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * 获取标签对列表
     * @return Tags 标签对列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * 设置标签对列表
     * @param Tags 标签对列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

