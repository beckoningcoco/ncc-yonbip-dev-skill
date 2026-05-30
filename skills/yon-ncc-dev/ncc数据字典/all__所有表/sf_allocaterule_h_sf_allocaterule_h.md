# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11482.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allocaterule_h | pk_allocaterule_h | pk_allocaterule_h | char(20) | √ |
| 2 | allocatetype | allocatetype | allocatetype | number(38, 0) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | bankname_p | bankname_p | bankname_p | varchar2(20) |  |  | '~' |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | billsignature | billsignature | billsignature | varchar2(20) |
| 7 | billstatus | billstatus | billstatus | number(38, 0) |
| 8 | busitype | busitype | busitype | number(38, 0) |
| 9 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 10 | dapprovetime | dapprovetime | dapprovetime | char(19) |
| 11 | dbilldate | dbilldate | dbilldate | char(19) |
| 12 | dbilltime | dbilltime | dbilltime | char(19) |
| 13 | isenable | isenable | isenable | char(1) |
| 14 | memo | memo | memo | varchar2(272) |
| 15 | pk_bankacc_p | pk_bankacc_p | pk_bankacc_p | varchar2(20) |  |  | '~' |
| 16 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 17 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 18 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 22 | rulecode | rulecode | rulecode | varchar2(50) |
| 23 | rulename | rulename | rulename | varchar2(150) |
| 24 | vapprovenote | vapprovenote | vapprovenote | varchar2(50) |
| 25 | vbillno | vbillno | vbillno | varchar2(50) |
| 26 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 27 | creationtime | creationtime | creationtime | char(19) |
| 28 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 29 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 30 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 31 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 32 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |