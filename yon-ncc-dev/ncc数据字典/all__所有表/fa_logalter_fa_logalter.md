# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8143.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_logalter | pk_logalter | pk_logalter | char(20) | √ |
| 2 | alter_date | alter_date | alter_date | char(19) |
| 3 | alter_reason | alter_reason | alter_reason | varchar2(20) |  |  | '~' |
| 4 | alter_type | alter_type | alter_type | varchar2(80) |
| 5 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | item_code | item_code | item_code | varchar2(20) |
| 8 | new_value | new_value | new_value | varchar2(80) |
| 9 | old_value | old_value | old_value | varchar2(80) |
| 10 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 11 | pk_card | pk_card | pk_card | char(20) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |