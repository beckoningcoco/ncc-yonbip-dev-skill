# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11975.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjustsign | pk_adjustsign | pk_adjustsign | char(20) | √ |
| 2 | applieddate | applieddate | applieddate | char(19) |
| 3 | applier | applier | applier | varchar2(20) |
| 4 | approvedata | approvedata | approvedata | number(31, 8) |
| 5 | approvenote | approvenote | approvenote | varchar2(300) |
| 6 | approver | approver | approver | varchar2(20) |
| 7 | approvetime | approvetime | approvetime | char(19) |
| 8 | billdate | billdate | billdate | char(19) |
| 9 | billmaker | billmaker | billmaker | varchar2(20) |
| 10 | billno | billno | billno | varchar2(30) | √ |
| 11 | billnote | billnote | billnote | varchar2(1024) |
| 12 | billstatus | billstatus | billstatus | number(38, 0) | √ |
| 13 | billtype | billtype | billtype | varchar2(50) | √ |
| 14 | busisystem | busisystem | busisystem | varchar2(20) |
| 15 | isadjusttemp | isadjusttemp | isadjusttemp | char(1) |
| 16 | pk_curr | pk_curr | pk_curr | varchar2(20) |
| 17 | pk_entity | pk_entity | pk_entity | varchar2(20) |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |
| 19 | pk_message | pk_message | pk_message | varchar2(20) |
| 20 | pk_month | pk_month | pk_month | varchar2(20) |
| 21 | pk_mvtype | pk_mvtype | pk_mvtype | varchar2(20) |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |
| 23 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 24 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 25 | pk_task | pk_task | pk_task | varchar2(20) |
| 26 | pk_taskdef | pk_taskdef | pk_taskdef | varchar2(20) |
| 27 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) | √ |
| 28 | pk_version | pk_version | pk_version | varchar2(20) |
| 29 | pk_year | pk_year | pk_year | varchar2(20) |
| 30 | transtype | transtype | transtype | varchar2(50) |
| 31 | def1 | def1 | def1 | varchar2(101) |
| 32 | def2 | def2 | def2 | varchar2(101) |
| 33 | def3 | def3 | def3 | varchar2(101) |
| 34 | def4 | def4 | def4 | varchar2(101) |
| 35 | def5 | def5 | def5 | varchar2(101) |
| 36 | def6 | def6 | def6 | varchar2(101) |
| 37 | def7 | def7 | def7 | varchar2(101) |
| 38 | def8 | def8 | def8 | varchar2(101) |
| 39 | def9 | def9 | def9 | varchar2(101) |
| 40 | def10 | def10 | def10 | varchar2(101) |
| 41 | def11 | def11 | def11 | varchar2(101) |
| 42 | def12 | def12 | def12 | varchar2(101) |
| 43 | def13 | def13 | def13 | varchar2(101) |
| 44 | def14 | def14 | def14 | varchar2(101) |
| 45 | def15 | def15 | def15 | varchar2(101) |
| 46 | def16 | def16 | def16 | varchar2(101) |
| 47 | def17 | def17 | def17 | varchar2(101) |
| 48 | def18 | def18 | def18 | varchar2(101) |
| 49 | def19 | def19 | def19 | varchar2(101) |
| 50 | def20 | def20 | def20 | varchar2(101) |
| 51 | creationtime | creationtime | creationtime | char(19) |
| 52 | creator | creator | creator | varchar2(20) |
| 53 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 54 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 55 | modifier | modifier | modifier | varchar2(20) |
| 56 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |