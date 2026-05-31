# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7349.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bm_datapool | pk_bm_datapool | pk_bm_datapool | char(20) | √ |
| 2 | billtypecode | billtypecode | billtypecode | varchar2(50) |
| 3 | cperiod | cperiod | cperiod | varchar2(50) |
| 4 | currid | currid | currid | char(20) |
| 5 | cyear | cyear | cyear | varchar2(50) |
| 6 | pk_bm_class | pk_bm_class | pk_bm_class | char(20) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 9 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 10 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 11 | saga_status | saga_status | saga_status | number(38, 0) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |