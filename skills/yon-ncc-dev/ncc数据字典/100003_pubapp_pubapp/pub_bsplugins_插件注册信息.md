# |<<

**插件注册信息 (pub_bsplugins / nc.impl.pubapp.plugin.RegistryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4721.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plugin | 插件注册主键 | pk_plugin | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | classname | 插件类名 | classname | varchar(100) | √ | 字符串 (String) |
| 5 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 6 | pk_module | 插件所属模块 | pk_module | varchar(20) |  | 模块信息 (module) |
| 7 | pk_expoint | 扩展点接口名 | pk_expoint | varchar(20) | √ | 扩展点 (expoint) |
| 8 | enabled | 是否启用 | enabled | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | pos | 位置 | pos | varchar(50) |  | 插件执行位置 (pos) |  | -1=前; |