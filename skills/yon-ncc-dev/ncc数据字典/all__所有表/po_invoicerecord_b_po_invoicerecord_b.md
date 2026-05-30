# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10757.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoicerecord_b | pk_invoicerecord_b | pk_invoicerecord_b | char(20) | √ |
| 2 | castunitid | castunitid | castunitid | varchar2(20) |  |  | '~' |
| 3 | crowno | crowno | crowno | varchar2(50) |
| 4 | cunitid | cunitid | cunitid | varchar2(20) |  |  | '~' |
| 5 | id | id | id | char(20) |
| 6 | ncollectnum | ncollectnum | ncollectnum | number(28, 8) |
| 7 | norigtaxmny | norigtaxmny | norigtaxmny | number(28, 8) |
| 8 | nqtorigprice | nqtorigprice | nqtorigprice | number(28, 8) |
| 9 | nqtorigtaxprice | nqtorigtaxprice | nqtorigtaxprice | number(28, 8) |
| 10 | nrecordnastnum | nrecordnastnum | nrecordnastnum | number(28, 8) |
| 11 | nrecordnum | nrecordnum | nrecordnum | number(28, 8) |
| 12 | pk_invoicerecord | pk_invoicerecord | pk_invoicerecord | varchar2(20) | √ |
| 13 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 14 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 15 | vchangerate | vchangerate | vchangerate | varchar2(50) |
| 16 | vfirstbillbid | vfirstbillbid | vfirstbillbid | varchar2(20) |
| 17 | vfirstbillid | vfirstbillid | vfirstbillid | varchar2(20) |
| 18 | vfirstbilltype | vfirstbilltype | vfirstbilltype | varchar2(20) |
| 19 | vsrcbid | vsrcbid | vsrcbid | varchar2(20) |
| 20 | vsrcbillcode | vsrcbillcode | vsrcbillcode | varchar2(50) |
| 21 | vsrcid | vsrcid | vsrcid | varchar2(20) |
| 22 | vsrcrowno | vsrcrowno | vsrcrowno | varchar2(50) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |