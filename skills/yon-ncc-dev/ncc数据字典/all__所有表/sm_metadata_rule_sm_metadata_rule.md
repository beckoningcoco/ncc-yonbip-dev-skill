# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11579.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_metadata_rule | pk_metadata_rule | pk_metadata_rule | char(20) | √ |
| 2 | permissionruleid | permissionruleid | permissionruleid | varchar2(20) |  |  | '~' |
| 3 | rule_script | rule_script | rule_script | blob |
| 4 | sql_script | sql_script | sql_script | blob |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |