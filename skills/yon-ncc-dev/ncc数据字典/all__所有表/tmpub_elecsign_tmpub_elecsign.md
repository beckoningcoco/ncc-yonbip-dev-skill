# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12157.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_elecsign | pk_elecsign | pk_elecsign | char(20) | √ |
| 2 | ca_id | ca_id | ca_id | varchar2(200) |
| 3 | operatedate | operatedate | operatedate | char(19) |
| 4 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 5 | pk_source | pk_source | pk_source | varchar2(20) |
| 6 | sourcestr | sourcestr | sourcestr | blob |
| 7 | value | value | value | varchar2(500) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |