# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8485.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_diff | pk_diff | pk_diff | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | assid | assid | assid | varchar2(50) |
| 4 | defcol | defcol | defcol | varchar2(20) |  |  | '~' |
| 5 | detailno | detailno | detailno | number(38, 0) |
| 6 | direct | direct | direct | varchar2(50) |
| 7 | globalcreditamount | globalcreditamount | globalcreditamount | number(28, 8) |
| 8 | globaldebitamount | globaldebitamount | globaldebitamount | number(28, 8) |
| 9 | groupcreditamount | groupcreditamount | groupcreditamount | number(28, 8) |
| 10 | groupdebitamount | groupdebitamount | groupdebitamount | number(28, 8) |
| 11 | localamount | localamount | localamount | varchar2(50) |
| 12 | localcreditamount | localcreditamount | localcreditamount | number(28, 8) |
| 13 | localdebitamount | localdebitamount | localdebitamount | number(28, 8) |
| 14 | occamount | occamount | occamount | number(28, 8) |
| 15 | pk_accasoa | pk_accasoa | pk_accasoa | varchar2(20) |  |  | '~' |
| 16 | pk_accountbook | pk_accountbook | pk_accountbook | varchar2(50) |
| 17 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 18 | pk_detail | pk_detail | pk_detail | varchar2(50) |
| 19 | pk_org | pk_org | pk_org | varchar2(50) |
| 20 | pk_voucher | pk_voucher | pk_voucher | varchar2(50) |
| 21 | subitem | subitem | subitem | varchar2(50) |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |