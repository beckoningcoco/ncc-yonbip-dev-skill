# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8885.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccyclerelyid | ccyclerelyid | ccyclerelyid | char(20) | √ |
| 2 | caccountperiod | caccountperiod | caccountperiod | varchar2(7) |
| 3 | cincalcrangeid | cincalcrangeid | cincalcrangeid | varchar2(20) |  |  | '~' |
| 4 | cincostregionid | cincostregionid | cincostregionid | varchar2(20) |  |  | '~' |
| 5 | cininventoryid | cininventoryid | cininventoryid | varchar2(20) |  |  | '~' |
| 6 | coutcalcrangeid | coutcalcrangeid | coutcalcrangeid | varchar2(20) |  |  | '~' |
| 7 | coutcostregionid | coutcostregionid | coutcostregionid | varchar2(20) |  |  | '~' |
| 8 | coutinventoryid | coutinventoryid | coutinventoryid | varchar2(20) |  |  | '~' |
| 9 | igroupcode | igroupcode | igroupcode | number(38, 0) |
| 10 | iinnerorder | iinnerorder | iinnerorder | number(38, 0) |
| 11 | noutprice | noutprice | noutprice | number(28, 8) |
| 12 | pk_book | pk_book | pk_book | varchar2(20) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_liacenter | pk_liacenter | pk_liacenter | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |