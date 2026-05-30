# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10092.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebankpayorderstatus_h | pk_ebankpayorderstatus_h | pk_ebankpayorderstatus_h | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(50) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | billbusitype | billbusitype | billbusitype | number(38, 0) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | billsummoney | billsummoney | billsummoney | number(28, 8) |
| 8 | busitype | busitype | busitype | varchar2(20) |  |  | '~' |
| 9 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |  |  | '~' |
| 10 | dbilldate | dbilldate | dbilldate | char(19) |
| 11 | fstatusflag | fstatusflag | fstatusflag | varchar2(50) |
| 12 | lastmaketime | lastmaketime | lastmaketime | char(19) |
| 13 | maketime | maketime | maketime | char(19) | √ |
| 14 | ordersenddate | ordersenddate | ordersenddate | char(19) |
| 15 | ordersender | ordersender | ordersender | varchar2(20) |  |  | '~' |
| 16 | payorderserilno | payorderserilno | payorderserilno | varchar2(50) |
| 17 | pk_bankdoc | pk_bankdoc | pk_bankdoc | varchar2(20) |  |  | '~' |
| 18 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 19 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 22 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 23 | srcgroup | srcgroup | srcgroup | varchar2(50) |
| 24 | srcorg | srcorg | srcorg | varchar2(50) |
| 25 | srcsys | srcsys | srcsys | varchar2(50) |
| 26 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 27 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(50) |
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
| 38 | creationtime | creationtime | creationtime | char(19) |
| 39 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 40 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 41 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 42 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 43 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |