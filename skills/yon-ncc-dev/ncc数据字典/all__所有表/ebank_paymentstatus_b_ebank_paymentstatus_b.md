# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7842.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebankpaymentstatus_b | pk_ebankpaymentstatus_b | pk_ebankpaymentstatus_b | char(20) | √ |
| 2 | abstra | abstra | abstra | varchar2(500) |
| 3 | autocode | autocode | autocode | varchar2(50) |
| 4 | bankinfo | bankinfo | bankinfo | varchar2(500) |
| 5 | billnum | billnum | billnum | varchar2(50) |
| 6 | billoriginmoney | billoriginmoney | billoriginmoney | number(28, 8) |
| 7 | confirmer | confirmer | confirmer | varchar2(20) |  |  | '~' |
| 8 | confirmreason | confirmreason | confirmreason | varchar2(50) |
| 9 | confirmstatus | confirmstatus | confirmstatus | varchar2(50) |
| 10 | confirmtime | confirmtime | confirmtime | char(19) |
| 11 | dppaymenttype | dppaymenttype | dppaymenttype | number(38, 0) |
| 12 | expectdate | expectdate | expectdate | char(19) |
| 13 | expecttime | expecttime | expecttime | char(19) |
| 14 | headbusiuniqueno | headbusiuniqueno | headbusiuniqueno | varchar2(50) |
| 15 | nusage | nusage | nusage | varchar2(500) |
| 16 | orderstatus | orderstatus | orderstatus | number(38, 0) |
| 17 | paymentsubmitdate | paymentsubmitdate | paymentsubmitdate | char(19) |
| 18 | payordersonserial | payordersonserial | payordersonserial | varchar2(50) |
| 19 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 20 | pk_ebankpaymentstatus_h | pk_ebankpaymentstatus_h | pk_ebankpaymentstatus_h | char(20) | √ |
| 21 | pk_srcbillbid | pk_srcbillbid | pk_srcbillbid | varchar2(50) |
| 22 | pk_srcbillid | pk_srcbillid | pk_srcbillid | varchar2(50) |
| 23 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 24 | tradeinfo | tradeinfo | tradeinfo | varchar2(500) |
| 25 | tradestatuscode | tradestatuscode | tradestatuscode | varchar2(50) |
| 26 | tradetiem | tradetiem | tradetiem | char(19) |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |