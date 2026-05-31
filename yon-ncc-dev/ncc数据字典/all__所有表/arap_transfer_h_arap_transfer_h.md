# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6594.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transfer_h | pk_transfer_h | pk_transfer_h | char(20) | √ |
| 2 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 3 | busidate | busidate | busidate | char(19) |
| 4 | busiflag | busiflag | busiflag | number(38, 0) |
| 5 | busino | busino | busino | varchar2(20) |
| 6 | busiperiod | busiperiod | busiperiod | char(2) |
| 7 | busiyear | busiyear | busiyear | char(4) |
| 8 | global_money | global_money | global_money | number(28, 8) |
| 9 | group_money | group_money | group_money | number(28, 8) |
| 10 | inobj | inobj | inobj | char(20) |
| 11 | inobjtype | inobjtype | inobjtype | number(38, 0) |
| 12 | isar29 | isar29 | isar29 | char(1) |
| 13 | local_money | local_money | local_money | number(28, 8) |
| 14 | money | money | money | number(28, 8) |
| 15 | outobj | outobj | outobj | char(20) |
| 16 | outobjtype | outobjtype | outobjtype | number(38, 0) |
| 17 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | quantity | quantity | quantity | number(20, 8) |
| 21 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 22 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) | √ |  | 0 |
| 23 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 24 | saga_status | saga_status | saga_status | number(38, 0) | √ |  | 0 |
| 25 | scomment | scomment | scomment | varchar2(300) |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |