# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6558.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_agiotage_d | pk_agiotage_d | pk_agiotage_d | char(20) | √ |
| 2 | billno | billno | billno | varchar2(40) |
| 3 | busidate | busidate | busidate | char(19) |
| 4 | busiperiod | busiperiod | busiperiod | char(2) |
| 5 | busiyear | busiyear | busiyear | char(4) |
| 6 | currtype | currtype | currtype | varchar2(20) |  |  | '~' |
| 7 | customer | customer | customer | varchar2(20) |
| 8 | expiredate | expiredate | expiredate | char(19) |
| 9 | globalrate | globalrate | globalrate | number(28, 8) |
| 10 | global_money_bal | global_money_bal | global_money_bal | number(28, 8) |
| 11 | global_money_cr | global_money_cr | global_money_cr | number(28, 8) |
| 12 | global_money_de | global_money_de | global_money_de | number(28, 8) |
| 13 | grouprate | grouprate | grouprate | number(28, 8) |
| 14 | group_money_bal | group_money_bal | group_money_bal | number(28, 8) |
| 15 | group_money_cr | group_money_cr | group_money_cr | number(28, 8) |
| 16 | group_money_de | group_money_de | group_money_de | number(28, 8) |
| 17 | innerctldeferdays | innerctldeferdays | innerctldeferdays | char(19) |
| 18 | local_money_bal | local_money_bal | local_money_bal | number(28, 8) |
| 19 | local_money_cr | local_money_cr | local_money_cr | number(28, 8) |
| 20 | local_money_de | local_money_de | local_money_de | number(28, 8) |
| 21 | money_bal | money_bal | money_bal | number(28, 8) |
| 22 | ordercubasdoc | ordercubasdoc | ordercubasdoc | varchar2(20) |
| 23 | pk_agiotage | pk_agiotage | pk_agiotage | char(20) |
| 24 | pk_bill | pk_bill | pk_bill | varchar2(30) |
| 25 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 26 | pk_busidata | pk_busidata | pk_busidata | varchar2(20) |
| 27 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 28 | pk_item | pk_item | pk_item | varchar2(30) |
| 29 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 30 | pk_termitem | pk_termitem | pk_termitem | char(20) |
| 31 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(50) |
| 32 | rate | rate | rate | number(15, 8) |
| 33 | redflag | redflag | redflag | number(38, 0) |
| 34 | scomment | scomment | scomment | varchar2(300) |
| 35 | supplier | supplier | supplier | varchar2(20) |
| 36 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 37 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |