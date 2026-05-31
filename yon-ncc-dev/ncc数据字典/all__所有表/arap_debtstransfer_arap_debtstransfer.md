# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6579.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_debtstransfer | pk_debtstransfer | pk_debtstransfer | char(20) | √ |
| 2 | billclass | billclass | billclass | varchar2(50) |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | billno | billno | billno | varchar2(40) |
| 5 | busidate | busidate | busidate | char(19) |
| 6 | busiflag | busiflag | busiflag | number(38, 0) |
| 7 | busino | busino | busino | varchar2(20) |
| 8 | busiperiod | busiperiod | busiperiod | char(2) |
| 9 | busiyear | busiyear | busiyear | char(4) |
| 10 | expiredate | expiredate | expiredate | char(19) |
| 11 | globalrate | globalrate | globalrate | number(15, 8) |
| 12 | global_money | global_money | global_money | number(28, 8) |
| 13 | grouprate | grouprate | grouprate | number(15, 8) |
| 14 | group_money | group_money | group_money | number(28, 8) |
| 15 | innerctldeferdays | innerctldeferdays | innerctldeferdays | char(19) |
| 16 | inobj | inobj | inobj | char(20) |
| 17 | inobjtype | inobjtype | inobjtype | number(38, 0) |
| 18 | local_money | local_money | local_money | number(28, 8) |
| 19 | money | money | money | number(28, 8) |
| 20 | ordercubasdoc | ordercubasdoc | ordercubasdoc | varchar2(20) |
| 21 | outobj | outobj | outobj | char(20) |
| 22 | outobjtype | outobjtype | outobjtype | number(38, 0) |
| 23 | pk_bill | pk_bill | pk_bill | char(20) |
| 24 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 25 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |
| 26 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 27 | pk_group | pk_group | pk_group | varchar2(20) |
| 28 | pk_hisdata | pk_hisdata | pk_hisdata | char(20) |
| 29 | pk_hisdata2 | pk_hisdata2 | pk_hisdata2 | char(20) |
| 30 | pk_item | pk_item | pk_item | char(20) |
| 31 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 32 | pk_termitem | pk_termitem | pk_termitem | char(20) |
| 33 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) |  |  | '~' |
| 34 | pk_transfer_h | pk_transfer_h | pk_transfer_h | char(20) |
| 35 | quantity | quantity | quantity | number(20, 8) |
| 36 | rate | rate | rate | number(15, 8) |
| 37 | scomment | scomment | scomment | varchar2(300) |
| 38 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 39 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |