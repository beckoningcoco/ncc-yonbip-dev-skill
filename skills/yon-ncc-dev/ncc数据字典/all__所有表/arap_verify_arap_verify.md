# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6595.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_verify | pk_verify | pk_verify | char(20) | √ |
| 2 | busidate | busidate | busidate | char(19) |
| 3 | busiflag | busiflag | busiflag | number(38, 0) |
| 4 | busino | busino | busino | varchar2(50) |
| 5 | global_money_cr | global_money_cr | global_money_cr | number(28, 8) |
| 6 | global_money_de | global_money_de | global_money_de | number(28, 8) |
| 7 | group_money_cr | group_money_cr | group_money_cr | number(28, 8) |
| 8 | group_money_de | group_money_de | group_money_de | number(28, 8) |
| 9 | local_money_cr | local_money_cr | local_money_cr | number(28, 8) |
| 10 | local_money_de | local_money_de | local_money_de | number(28, 8) |
| 11 | money_cr | money_cr | money_cr | number(28, 8) |
| 12 | money_de | money_de | money_de | number(28, 8) |
| 13 | pk_currtype_cr | pk_currtype_cr | pk_currtype_cr | varchar2(20) |
| 14 | pk_currtype_de | pk_currtype_de | pk_currtype_de | varchar2(20) |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | quantity_cr | quantity_cr | quantity_cr | number(20, 8) |
| 18 | quantity_de | quantity_de | quantity_de | number(20, 8) |
| 19 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 20 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) | √ |  | 0 |
| 21 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 22 | saga_status | saga_status | saga_status | number(38, 0) | √ |  | 0 |
| 23 | scomment | scomment | scomment | varchar2(300) |
| 24 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |