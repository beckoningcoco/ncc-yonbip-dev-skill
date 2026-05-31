# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11800.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_point_item | pk_point_item | pk_point_item | char(20) | √ |
| 2 | billtypecode | billtypecode | billtypecode | varchar2(50) | √ |  | '~' |
| 3 | group_code | group_code | group_code | varchar2(50) |
| 4 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |  | '~' |
| 5 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 6 | pk_point | pk_point | pk_point | char(20) | √ |
| 7 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) |  |  | '~' |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |