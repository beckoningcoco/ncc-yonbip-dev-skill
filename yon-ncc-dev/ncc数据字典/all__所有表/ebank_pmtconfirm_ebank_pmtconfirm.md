# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7845.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_id | pk_id | pk_id | char(20) | √ |
| 2 | acceptstate | acceptstate | acceptstate | varchar2(10) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | billdate | billdate | billdate | char(19) |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | billstate | billstate | billstate | varchar2(10) |
| 7 | commitdate | commitdate | commitdate | char(19) |
| 8 | commitor | commitor | commitor | varchar2(20) |  |  | '~' |
| 9 | committime | committime | committime | char(19) |
| 10 | confirmstate | confirmstate | confirmstate | varchar2(10) |
| 11 | confirmtime | confirmtime | confirmtime | char(19) |
| 12 | crtacc | crtacc | crtacc | varchar2(50) |
| 13 | crtbank | crtbank | crtbank | varchar2(100) |
| 14 | crtname | crtname | crtname | varchar2(100) |
| 15 | curr | curr | curr | varchar2(20) |  |  | '~' |
| 16 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 17 | dapprovetime | dapprovetime | dapprovetime | char(19) |
| 18 | dbtacc | dbtacc | dbtacc | varchar2(50) |
| 19 | dbtbank | dbtbank | dbtbank | varchar2(100) |
| 20 | dbtname | dbtname | dbtname | varchar2(100) |
| 21 | dealway | dealway | dealway | number(38, 0) |
| 22 | errmsg | errmsg | errmsg | varchar2(300) |
| 23 | memo | memo | memo | varchar2(100) |
| 24 | packageid | packageid | packageid | varchar2(100) |
| 25 | paystate | paystate | paystate | varchar2(10) |
| 26 | pk_bankaccbas | pk_bankaccbas | pk_bankaccbas | varchar2(20) |  |  | '~' |
| 27 | pk_bankaccsub | pk_bankaccsub | pk_bankaccsub | varchar2(20) |  |  | '~' |
| 28 | pk_billtype | pk_billtype | pk_billtype | varchar2(30) |
| 29 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(30) |
| 30 | pk_ebank_paylog | pk_ebank_paylog | pk_ebank_paylog | varchar2(20) |  |  | '~' |
| 31 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 32 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 33 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 34 | remark | remark | remark | varchar2(200) |
| 35 | srcbillcode | srcbillcode | srcbillcode | varchar2(60) |
| 36 | srcbilltype | srcbilltype | srcbilltype | varchar2(10) |
| 37 | srcnodecode | srcnodecode | srcnodecode | varchar2(30) |
| 38 | srcpkid | srcpkid | srcpkid | varchar2(20) |  |  | '~' |
| 39 | srcsystem | srcsystem | srcsystem | varchar2(8) |
| 40 | trsamt | trsamt | trsamt | number(28, 8) |
| 41 | vapprovenote | vapprovenote | vapprovenote | varchar2(100) |
| 42 | vbillno | vbillno | vbillno | varchar2(60) |
| 43 | vbillstatus | vbillstatus | vbillstatus | varchar2(10) |
| 44 | vbusicode | vbusicode | vbusicode | varchar2(10) |
| 45 | vlastbillid | vlastbillid | vlastbillid | varchar2(20) |  |  | '~' |
| 46 | vlastbillrowid | vlastbillrowid | vlastbillrowid | varchar2(30) |
| 47 | vlastbilltype | vlastbilltype | vlastbilltype | varchar2(10) |
| 48 | vsourcebillid | vsourcebillid | vsourcebillid | varchar2(20) |  |  | '~' |
| 49 | vsourcebillrowid | vsourcebillrowid | vsourcebillrowid | varchar2(30) |
| 50 | vsourcebilltype | vsourcebilltype | vsourcebilltype | varchar2(10) |
| 51 | yurref | yurref | yurref | varchar2(100) |
| 52 | obmdef1 | obmdef1 | obmdef1 | varchar2(101) |
| 53 | obmdef2 | obmdef2 | obmdef2 | varchar2(101) |
| 54 | obmdef3 | obmdef3 | obmdef3 | varchar2(101) |
| 55 | obmdef4 | obmdef4 | obmdef4 | varchar2(101) |
| 56 | obmdef5 | obmdef5 | obmdef5 | varchar2(101) |
| 57 | obmdef6 | obmdef6 | obmdef6 | varchar2(101) |
| 58 | obmdef7 | obmdef7 | obmdef7 | varchar2(101) |
| 59 | obmdef8 | obmdef8 | obmdef8 | varchar2(101) |
| 60 | obmdef9 | obmdef9 | obmdef9 | varchar2(101) |
| 61 | obmdef10 | obmdef10 | obmdef10 | varchar2(101) |
| 62 | creationtime | creationtime | creationtime | char(19) |
| 63 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 64 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 65 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 66 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 67 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |