# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11491.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deliveryrule_h | pk_deliveryrule_h | pk_deliveryrule_h | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | bankacccode_r | bankacccode_r | bankacccode_r | varchar2(40) |
| 4 | bankaccname_r | bankaccname_r | bankaccname_r | varchar2(200) |
| 5 | bankname_r | bankname_r | bankname_r | varchar2(20) |  |  | '~' |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | billsignature | billsignature | billsignature | varchar2(20) |
| 8 | billstatus | billstatus | billstatus | number(38, 0) |
| 9 | busitype | busitype | busitype | number(38, 0) |
| 10 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 11 | dapprovetime | dapprovetime | dapprovetime | char(19) |
| 12 | dbilldate | dbilldate | dbilldate | char(19) |
| 13 | dbilltime | dbilltime | dbilltime | char(19) |
| 14 | deliverytype | deliverytype | deliverytype | number(38, 0) |
| 15 | isenable | isenable | isenable | char(1) |
| 16 | memo | memo | memo | varchar2(272) |
| 17 | pk_bankacc_r | pk_bankacc_r | pk_bankacc_r | varchar2(20) |  |  | '~' |
| 18 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 19 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 20 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 24 | rulecode | rulecode | rulecode | varchar2(50) |
| 25 | rulename | rulename | rulename | varchar2(150) |
| 26 | vapprovenote | vapprovenote | vapprovenote | varchar2(50) |
| 27 | vbillno | vbillno | vbillno | varchar2(50) |
| 28 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 29 | creationtime | creationtime | creationtime | char(19) |
| 30 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 31 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 32 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 33 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 34 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |