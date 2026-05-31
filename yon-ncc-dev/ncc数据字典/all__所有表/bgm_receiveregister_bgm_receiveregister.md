# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7285.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receiveregister | pk_receiveregister | pk_receiveregister | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1536) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | begindate | begindate | begindate | char(19) |
| 6 | billmakedate | billmakedate | billmakedate | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | busicontractamount | busicontractamount | busicontractamount | number(28, 8) |
| 9 | busicontractno | busicontractno | busicontractno | varchar2(50) |
| 10 | busidepartment | busidepartment | busidepartment | varchar2(20) |  |  | '~' |
| 11 | busidesc | busidesc | busidesc | varchar2(272) |
| 12 | busipersonnel | busipersonnel | busipersonnel | varchar2(20) |  |  | '~' |
| 13 | busistatus | busistatus | busistatus | number(38, 0) |
| 14 | closedate | closedate | closedate | char(19) |
| 15 | closeoperator | closeoperator | closeoperator | varchar2(20) |  |  | '~' |
| 16 | closereason | closereason | closereason | number(38, 0) |
| 17 | commitdate | commitdate | commitdate | char(19) |
| 18 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 19 | enddate | enddate | enddate | char(19) |
| 20 | glno | glno | glno | varchar2(50) |
| 21 | glstatus | glstatus | glstatus | number(38, 0) |
| 22 | guaranteeamount | guaranteeamount | guaranteeamount | number(28, 8) |
| 23 | guaranteeglcamount | guaranteeglcamount | guaranteeglcamount | number(28, 8) |
| 24 | guaranteeglcrate | guaranteeglcrate | guaranteeglcrate | number(28, 8) |
| 25 | guaranteegllamount | guaranteegllamount | guaranteegllamount | number(28, 8) |
| 26 | guaranteegllrate | guaranteegllrate | guaranteegllrate | number(28, 8) |
| 27 | guaranteeolcamount | guaranteeolcamount | guaranteeolcamount | number(28, 8) |
| 28 | guaranteeolcrate | guaranteeolcrate | guaranteeolcrate | number(28, 8) |
| 29 | initflag | initflag | initflag | char(1) |
| 30 | itemname | itemname | itemname | varchar2(75) |
| 31 | pk_beneficiary | pk_beneficiary | pk_beneficiary | varchar2(20) |  |  | '~' |
| 32 | pk_beneficiary_v | pk_beneficiary_v | pk_beneficiary_v | varchar2(20) |  |  | '~' |
| 33 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 34 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 35 | pk_busicontractcurr | pk_busicontractcurr | pk_busicontractcurr | varchar2(20) |  |  | '~' |
| 36 | pk_gltype | pk_gltype | pk_gltype | varchar2(20) |  |  | '~' |
| 37 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 38 | pk_guaranteebank | pk_guaranteebank | pk_guaranteebank | varchar2(20) |  |  | '~' |
| 39 | pk_guaranteecurrtype | pk_guaranteecurrtype | pk_guaranteecurrtype | varchar2(20) |  |  | '~' |
| 40 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 41 | pk_org_unit | pk_org_unit | pk_org_unit | varchar2(20) |  |  | '~' |
| 42 | pk_org_unit_v | pk_org_unit_v | pk_org_unit_v | varchar2(20) |  |  | '~' |
| 43 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 44 | pk_principalorg | pk_principalorg | pk_principalorg | varchar2(20) |  |  | '~' |
| 45 | principalorgname | principalorgname | principalorgname | varchar2(300) |
| 46 | restricttype | restricttype | restricttype | number(38, 0) |
| 47 | vbillno | vbillno | vbillno | varchar2(40) |
| 48 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 49 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 50 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 51 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 52 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 53 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 54 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 55 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 56 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 57 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 58 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 59 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 60 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 61 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 62 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 63 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 64 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 65 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 66 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 67 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 68 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 69 | creationtime | creationtime | creationtime | char(19) |
| 70 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 71 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 72 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 73 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 74 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |