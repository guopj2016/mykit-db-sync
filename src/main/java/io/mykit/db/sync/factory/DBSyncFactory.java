/**
 * Copyright 2018-2118 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mykit.db.sync.factory;

import io.mykit.db.sync.constants.MykitDbSyncConstants;
import io.mykit.db.sync.sync.DBSync;
import io.mykit.db.sync.sync.impl.MySQLSync;
import io.mykit.db.sync.sync.impl.SQLServerSync;
import io.mykit.db.sync.utils.StringUtils;

/**
 * @author liuyazhuang
 * @date 2018/9/11 10:17
 * @description 创建同步对象的工厂类
 * @version 1.0.0
 */
public class DBSyncFactory {

    /**
     * 根据数据库的类型创建不同的同步数据库数据的对象
     * @param type:数据库类型
     * @return 同步数据库数据的对象
     */
    public static DBSync create(String type){
        if(StringUtils.isEmpty(type)) return null;
        switch (type) {
            case MykitDbSyncConstants.TYPE_DB_MYSQL:
                return new MySQLSync();
            case MykitDbSyncConstants.TYPE_DB_SQLSERVER:
                return new SQLServerSync();
            default:
                return null;
        }
    }
}
