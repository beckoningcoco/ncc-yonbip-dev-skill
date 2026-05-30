# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6596.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_verifydetail | pk_verifydetail | pk_verifydetail | char(20) | √ |
| 2 | billclass | billclass | billclass | varchar2(50) |
| 3 | billclass2 | billclass2 | billclass2 | varchar2(50) |
| 4 | billno | billno | billno | varchar2(40) |
| 5 | billno2 | billno2 | billno2 | varchar2(40) |
| 6 | busidate | busidate | busidate | char(19) |
| 7 | busiflag | busiflag | busiflag | number(38, 0) |
| 8 | busino | busino | busino | varchar2(28) |
| 9 | busiperiod | busiperiod | busiperiod | varchar2(2) |
| 10 | busiyear | busiyear | busiyear | varchar2(4) |
| 11 | customer | customer | customer | varchar2(20) |  |  | '~' |
| 12 | expiredate | expiredate | expiredate | char(19) |
| 13 | globalrate | globalrate | globalrate | number(15, 8) |
| 14 | global_money_cr | global_money_cr | global_money_cr | number(28, 8) |
| 15 | global_money_de | global_money_de | global_money_de | number(28, 8) |
| 16 | grouprate | grouprate | grouprate | number(15, 8) |
| 17 | group_money_cr | group_money_cr | group_money_cr | number(28, 8) |
| 18 | group_money_de | group_money_de | group_money_de | number(28, 8) |
| 19 | innerctldeferdays | innerctldeferdays | innerctldeferdays | char(19) |
| 20 | isauto | isauto | isauto | char(1) |
| 21 | isreserve | isreserve | isreserve | number(38, 0) |
| 22 | local_money_cr | local_money_cr | local_money_cr | number(28, 8) |
| 23 | local_money_de | local_money_de | local_money_de | number(28, 8) |
| 24 | material | material | material | varchar2(20) |  |  | '~' |
| 25 | money_cr | money_cr | money_cr | number(28, 8) |
| 26 | money_de | money_de | money_de | number(28, 8) |
| 27 | ordercubasdoc | ordercubasdoc | ordercubasdoc | varchar2(20) |  |  | '~' |
| 28 | pk_bill | pk_bill | pk_bill | char(20) |
| 29 | pk_bill2 | pk_bill2 | pk_bill2 | char(20) |
| 30 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 31 | pk_billtype2 | pk_billtype2 | pk_billtype2 | varchar2(20) |  |  | '~' |
| 32 | pk_busidata | pk_busidata | pk_busidata | varchar2(20) |
| 33 | pk_busidata2 | pk_busidata2 | pk_busidata2 | varchar2(20) |
| 34 | pk_costsubj | pk_costsubj | pk_costsubj | varchar2(50) |
| 35 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 36 | pk_deptid | pk_deptid | pk_deptid | varchar2(20) |  |  | '~' |
| 37 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 38 | pk_item | pk_item | pk_item | char(20) |
| 39 | pk_item2 | pk_item2 | pk_item2 | char(20) |
| 40 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 41 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 42 | pk_termitem | pk_termitem | pk_termitem | char(20) |
| 43 | pk_termitem2 | pk_termitem2 | pk_termitem2 | char(20) |
| 44 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) |  |  | '~' |
| 45 | pk_tradetype2 | pk_tradetype2 | pk_tradetype2 | varchar2(20) |  |  | '~' |
| 46 | pk_verify | pk_verify | pk_verify | char(20) | √ |
| 47 | quantity_cr | quantity_cr | quantity_cr | number(20, 8) |
| 48 | quantity_de | quantity_de | quantity_de | number(20, 8) |
| 49 | rate | rate | rate | number(15, 8) |
| 50 | redflag | redflag | redflag | number(38, 0) |
| 51 | rowno | rowno | rowno | number(38, 0) |
| 52 | scomment | scomment | scomment | varchar2(300) |
| 53 | src_org | src_org | src_org | varchar2(20) |
| 54 | supplier | supplier | supplier | varchar2(20) |  |  | '~' |
| 55 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 56 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 57 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |