# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10862.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sequence | pk_sequence | pk_sequence | char(40) | √ |
| 2 | execution_time | execution_time | execution_time | char(19) |
| 3 | pk_registry | pk_registry | pk_registry | char(20) |
| 4 | serverinstanceid | serverinstanceid | serverinstanceid | varchar2(64) |
| 5 | servername | servername | servername | varchar2(64) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |