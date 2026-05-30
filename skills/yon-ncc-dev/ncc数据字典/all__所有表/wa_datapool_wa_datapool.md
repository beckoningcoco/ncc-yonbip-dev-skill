# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12867.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_datapool | pk_wa_datapool | pk_wa_datapool | char(20) | √ |
| 2 | billmaker | billmaker | billmaker | char(20) |
| 3 | cperiod | cperiod | cperiod | char(2) | √ |
| 4 | currid | currid | currid | char(20) |
| 5 | cyear | cyear | cyear | char(4) | √ |
| 6 | pk_billtype | pk_billtype | pk_billtype | char(20) |
| 7 | pk_group | pk_group | pk_group | char(20) |
| 8 | pk_wa_amotype | pk_wa_amotype | pk_wa_amotype | char(20) | √ |
| 9 | pk_wa_class | pk_wa_class | pk_wa_class | char(20) | √ |
| 10 | saga_btxid | saga_btxid | saga_btxid | char(64) |
| 11 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 12 | saga_gtxid | saga_gtxid | saga_gtxid | char(64) |
| 13 | saga_status | saga_status | saga_status | number(38, 0) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |