# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10091.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebankpayorderstatus_b | pk_ebankpayorderstatus_b | pk_ebankpayorderstatus_b | char(20) | √ |
| 2 | bankorderstatus | bankorderstatus | bankorderstatus | number(38, 0) |
| 3 | banktime | banktime | banktime | char(19) |
| 4 | billnum | billnum | billnum | varchar2(50) |
| 5 | billoriginmoney | billoriginmoney | billoriginmoney | number(28, 8) |
| 6 | crowno | crowno | crowno | varchar2(50) |
| 7 | edtztype | edtztype | edtztype | varchar2(50) |
| 8 | expectdate | expectdate | expectdate | char(19) |
| 9 | expectdatetime | expectdatetime | expectdatetime | char(19) |
| 10 | orderinfo | orderinfo | orderinfo | varchar2(500) |
| 11 | orderstatus | orderstatus | orderstatus | number(38, 0) |
| 12 | ordersubmitdate | ordersubmitdate | ordersubmitdate | char(19) |
| 13 | payordersonserial | payordersonserial | payordersonserial | varchar2(50) |
| 14 | payordertype | payordertype | payordertype | number(38, 0) |
| 15 | pk_bankdoc | pk_bankdoc | pk_bankdoc | varchar2(20) |  |  | '~' |
| 16 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 17 | pk_ebankpaystatus_h | pk_ebankpaystatus_h | pk_ebankpaystatus_h | char(20) | √ |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | recognitioncode | recognitioncode | recognitioncode | varchar2(50) |
| 20 | srcbillbid | srcbillbid | srcbillbid | char(20) |
| 21 | srcbillhid | srcbillhid | srcbillhid | char(20) |
| 22 | summary | summary | summary | varchar2(50) |
| 23 | transdate | transdate | transdate | char(19) |
| 24 | transinfo | transinfo | transinfo | varchar2(50) |
| 25 | transstatuscode | transstatuscode | transstatuscode | varchar2(50) |
| 26 | transstatusinfo | transstatusinfo | transstatusinfo | varchar2(50) |
| 27 | usage | usage | usage | varchar2(50) |
| 28 | def1 | def1 | def1 | varchar2(101) |
| 29 | def2 | def2 | def2 | varchar2(101) |
| 30 | def3 | def3 | def3 | varchar2(101) |
| 31 | def4 | def4 | def4 | varchar2(101) |
| 32 | def5 | def5 | def5 | varchar2(101) |
| 33 | def6 | def6 | def6 | varchar2(101) |
| 34 | def7 | def7 | def7 | varchar2(101) |
| 35 | def8 | def8 | def8 | varchar2(101) |
| 36 | def9 | def9 | def9 | varchar2(101) |
| 37 | def10 | def10 | def10 | varchar2(101) |
| 38 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 39 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |