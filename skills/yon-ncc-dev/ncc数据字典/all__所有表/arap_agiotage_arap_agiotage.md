# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6557.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_agiotage | pk_agiotage | pk_agiotage | char(20) | √ |
| 2 | billmaker | billmaker | billmaker | varchar2(20) |
| 3 | busidate | busidate | busidate | char(19) |
| 4 | currtype | currtype | currtype | varchar2(20) |  |  | '~' |
| 5 | dealflag | dealflag | dealflag | number(38, 0) |
| 6 | dealno | dealno | dealno | varchar2(50) |
| 7 | global_money_cr | global_money_cr | global_money_cr | number(28, 8) |
| 8 | global_money_de | global_money_de | global_money_de | number(28, 8) |
| 9 | group_money_cr | group_money_cr | group_money_cr | number(28, 8) |
| 10 | group_money_de | group_money_de | group_money_de | number(28, 8) |
| 11 | local_money_cr | local_money_cr | local_money_cr | number(28, 8) |
| 12 | local_money_de | local_money_de | local_money_de | number(28, 8) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 16 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) | √ |  | 0 |
| 17 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 18 | saga_status | saga_status | saga_status | number(38, 0) | √ |  | 0 |
| 19 | systemcode | systemcode | systemcode | number(38, 0) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |