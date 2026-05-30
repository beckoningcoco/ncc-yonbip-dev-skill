# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7821.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_confirmpay_h | pk_confirmpay_h | pk_confirmpay_h | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1024) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvetime | approvetime | approvetime | char(19) |
| 6 | billdate | billdate | billdate | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billstate | billstate | billstate | varchar2(20) |  |  | '~' |
| 9 | commitdate | commitdate | commitdate | char(19) |
| 10 | commitor | commitor | commitor | varchar2(20) |  |  | '~' |
| 11 | committime | committime | committime | char(19) |
| 12 | confirmstate | confirmstate | confirmstate | varchar2(50) |
| 13 | confirmtime | confirmtime | confirmtime | char(19) |
| 14 | dbtracc | dbtracc | dbtracc | varchar2(50) |
| 15 | dbtraccname | dbtraccname | dbtraccname | varchar2(100) |
| 16 | dbtrbank | dbtrbank | dbtrbank | varchar2(100) |
| 17 | encryptkey | encryptkey | encryptkey | varchar2(1000) |
| 18 | note | note | note | varchar2(200) |
| 19 | paylogpk | paylogpk | paylogpk | varchar2(20) |
| 20 | pk_bankaccbas | pk_bankaccbas | pk_bankaccbas | varchar2(20) |  |  | '~' |
| 21 | pk_bankaccsub | pk_bankaccsub | pk_bankaccsub | varchar2(20) |  |  | '~' |
| 22 | pk_banktype | pk_banktype | pk_banktype | varchar2(20) |  |  | '~' |
| 23 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 24 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 27 | reconciliationcode | reconciliationcode | reconciliationcode | varchar2(50) |
| 28 | sourcebillno | sourcebillno | sourcebillno | varchar2(60) |
| 29 | sourcebillpk | sourcebillpk | sourcebillpk | varchar2(36) |
| 30 | sourcebilltype | sourcebilltype | sourcebilltype | varchar2(50) |
| 31 | sourcefuncode | sourcefuncode | sourcefuncode | varchar2(50) |
| 32 | sourcesys | sourcesys | sourcesys | varchar2(50) |
| 33 | vbillno | vbillno | vbillno | varchar2(60) |
| 34 | yurref | yurref | yurref | varchar2(100) |
| 35 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 36 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 37 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 38 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 39 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 40 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 41 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 42 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 43 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 44 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 45 | creationtime | creationtime | creationtime | char(19) |
| 46 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 47 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 48 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 49 | modifier | modifier | modifier | varchar2(50) |
| 50 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |