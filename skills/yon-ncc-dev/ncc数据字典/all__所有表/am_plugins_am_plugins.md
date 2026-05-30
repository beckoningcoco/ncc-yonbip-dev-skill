# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6531.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plugin | pk_plugin | pk_plugin | char(20) | √ |
| 2 | extension_point | extension_point | extension_point | varchar2(80) |
| 3 | memo | memo | memo | varchar2(100) |
| 4 | modulename | modulename | modulename | varchar2(20) |
| 5 | pk_group | pk_group | pk_group | char(20) |
| 6 | pk_org | pk_org | pk_org | char(20) |
| 7 | plugin_class | plugin_class | plugin_class | varchar2(100) |
| 8 | plugin_code | plugin_code | plugin_code | varchar2(80) | √ |
| 9 | plugin_type | plugin_type | plugin_type | varchar2(80) |
| 10 | tag | tag | tag | varchar2(80) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |