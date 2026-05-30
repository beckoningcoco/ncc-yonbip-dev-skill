# |<<

**元数据模块实体 (md_module / nc.vohrrpt.mdmodule.mdModule)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3600.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | versiontype | 版本类型 | versiontype | int | √ | 整数 (Integer) |
| 2 | displayname | 中文显示名称 | displayname | varchar(128) |  | 字符串 (String) |
| 3 | id | 模块编码 | id | char(20) | √ | 元数据模块实体 (mdModule) |
| 4 | isactive | 是否启用 | isactive | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | name | 英文缩写名称 | name | varchar(128) |  | 字符串 (String) |
| 6 | parentmoduleid | 父模块编码 | parentmoduleid | varchar(50) |  | 字符串 (String) |
| 7 | description | 描述 | description | varchar(128) |  | 字符串 (String) |