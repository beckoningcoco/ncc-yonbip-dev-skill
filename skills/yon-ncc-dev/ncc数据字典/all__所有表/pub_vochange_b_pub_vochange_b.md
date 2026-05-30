# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11004.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vochange_b | pk_vochange_b | pk_vochange_b | char(20) | √ |
| 2 | dest_attr | dest_attr | dest_attr | varchar2(256) |
| 3 | pk_vochange | pk_vochange | pk_vochange | char(20) | √ |
| 4 | ruledata | ruledata | ruledata | varchar2(512) |
| 5 | ruletype | ruletype | ruletype | number(38, 0) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |