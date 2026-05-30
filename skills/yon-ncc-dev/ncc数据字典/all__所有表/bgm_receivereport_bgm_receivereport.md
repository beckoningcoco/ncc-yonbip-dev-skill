# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7286.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receivereport | pk_receivereport | pk_receivereport | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1024) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | begindate | begindate | begindate | char(19) |
| 6 | billmakedate | billmakedate | billmakedate | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | busicontractamount | busicontractamount | busicontractamount | number(28, 8) |
| 9 | busicontractno | busicontractno | busicontractno | varchar2(50) |
| 10 | busidepartment | busidepartment | busidepartment | varchar2(20) |  |  | '~' |
| 11 | busidesc | busidesc | busidesc | varchar2(272) |
| 12 | busipersonnel | busipersonnel | busipersonnel | varchar2(20) |  |  | '~' |
| 13 | closedate | closedate | closedate | char(19) |
| 14 | closeoperator | closeoperator | closeoperator | varchar2(20) |  |  | '~' |
| 15 | closereason | closereason | closereason | number(38, 0) |
| 16 | commitdate | commitdate | commitdate | char(19) |
| 17 | committor | committor | committor | varchar2(20) |  |  | '~' |
| 18 | enddate | enddate | enddate | char(19) |
| 19 | glno | glno | glno | varchar2(50) |
| 20 | glstatus | glstatus | glstatus | number(38, 0) |
| 21 | guaranteeamount | guaranteeamount | guaranteeamount | number(28, 8) |
| 22 | guaranteeglcamount | guaranteeglcamount | guaranteeglcamount | number(28, 8) |
| 23 | guaranteeglcrate | guaranteeglcrate | guaranteeglcrate | number(28, 8) |
| 24 | guaranteegllamount | guaranteegllamount | guaranteegllamount | number(28, 8) |
| 25 | guaranteegllrate | guaranteegllrate | guaranteegllrate | number(28, 8) |
| 26 | guaranteeolcamount | guaranteeolcamount | guaranteeolcamount | number(28, 8) |
| 27 | guaranteeolcrate | guaranteeolcrate | guaranteeolcrate | number(28, 8) |
| 28 | initflag | initflag | initflag | char(1) |
| 29 | itemname | itemname | itemname | varchar2(75) |
| 30 | modifytimes | modifytimes | modifytimes | number(38, 0) |
| 31 | pk_beneficiary | pk_beneficiary | pk_beneficiary | varchar2(20) |  |  | '~' |
| 32 | pk_beneficiary_v | pk_beneficiary_v | pk_beneficiary_v | varchar2(20) |  |  | '~' |
| 33 | pk_busicontractcurr | pk_busicontractcurr | pk_busicontractcurr | varchar2(20) |  |  | '~' |
| 34 | pk_category | pk_category | pk_category | varchar2(20) |  |  | '~' |
| 35 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 36 | pk_guaranteebank | pk_guaranteebank | pk_guaranteebank | varchar2(20) |  |  | '~' |
| 37 | pk_guaranteecurrtype | pk_guaranteecurrtype | pk_guaranteecurrtype | varchar2(20) |  |  | '~' |
| 38 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 39 | pk_org_unit | pk_org_unit | pk_org_unit | varchar2(20) |  |  | '~' |
| 40 | pk_org_unit_v | pk_org_unit_v | pk_org_unit_v | varchar2(20) |  |  | '~' |
| 41 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 42 | pk_principalorg | pk_principalorg | pk_principalorg | varchar2(20) |  |  | '~' |
| 43 | pk_receiveregister | pk_receiveregister | pk_receiveregister | varchar2(20) |
| 44 | principalorgname | principalorgname | principalorgname | varchar2(300) |
| 45 | restricttype | restricttype | restricttype | number(38, 0) |
| 46 | submitdate | submitdate | submitdate | char(19) |
| 47 | submiter | submiter | submiter | varchar2(20) |  |  | '~' |
| 48 | vbillno | vbillno | vbillno | varchar2(40) |
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
| 69 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 70 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 71 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 72 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |