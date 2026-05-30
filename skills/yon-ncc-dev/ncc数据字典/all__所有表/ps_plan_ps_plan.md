# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10846.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plan | pk_plan | pk_plan | char(20) | √ |
| 2 | advancemny | advancemny | advancemny | number(28, 8) |
| 3 | applymny | applymny | applymny | number(28, 8) |
| 4 | approvemny | approvemny | approvemny | number(28, 8) |
| 5 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | billname | billname | billname | varchar2(181) |
| 8 | commitdate | commitdate | commitdate | char(19) |
| 9 | commitor | commitor | commitor | varchar2(20) |  |  | '~' |
| 10 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 11 | dapprovetime | dapprovetime | dapprovetime | char(19) |
| 12 | iscurrperiod | iscurrperiod | iscurrperiod | char(1) |
| 13 | olcadvancemny | olcadvancemny | olcadvancemny | number(28, 8) |
| 14 | olcapplymny | olcapplymny | olcapplymny | number(28, 8) |
| 15 | olcapprovemny | olcapprovemny | olcapprovemny | number(28, 8) |
| 16 | olcplanmny | olcplanmny | olcplanmny | number(28, 8) |
| 17 | olcpostponedmny | olcpostponedmny | olcpostponedmny | number(28, 8) |
| 18 | olcprepaymny | olcprepaymny | olcprepaymny | number(28, 8) |
| 19 | olcsanctionmny | olcsanctionmny | olcsanctionmny | number(28, 8) |
| 20 | olctotaladvancemny | olctotaladvancemny | olctotaladvancemny | number(28, 8) |
| 21 | olctotalpostponedmny | olctotalpostponedmny | olctotalpostponedmny | number(28, 8) |
| 22 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 23 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 24 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 25 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 26 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 27 | pk_org_sanction | pk_org_sanction | pk_org_sanction | varchar2(20) |  |  | '~' |
| 28 | pk_org_sanction_v | pk_org_sanction_v | pk_org_sanction_v | varchar2(20) |  |  | '~' |
| 29 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 30 | pk_planperiod | pk_planperiod | pk_planperiod | varchar2(20) |  |  | '~' |
| 31 | planmny | planmny | planmny | number(28, 8) |
| 32 | postponedmny | postponedmny | postponedmny | number(28, 8) |
| 33 | prepaymny | prepaymny | prepaymny | number(28, 8) |
| 34 | putdowndate | putdowndate | putdowndate | char(19) |
| 35 | putdownor | putdownor | putdownor | varchar2(20) |  |  | '~' |
| 36 | sanctiondate | sanctiondate | sanctiondate | char(19) |
| 37 | sanctionmny | sanctionmny | sanctionmny | number(28, 8) |
| 38 | sanctionor | sanctionor | sanctionor | varchar2(20) |  |  | '~' |
| 39 | superiorapprovedate | superiorapprovedate | superiorapprovedate | char(19) |
| 40 | superiorapproveid | superiorapproveid | superiorapproveid | varchar2(20) |  |  | '~' |
| 41 | superiorapprovenote | superiorapprovenote | superiorapprovenote | varchar2(300) |
| 42 | totaladvancemny | totaladvancemny | totaladvancemny | number(28, 8) |
| 43 | totalpostponedmny | totalpostponedmny | totalpostponedmny | number(28, 8) |
| 44 | vapprovenote | vapprovenote | vapprovenote | varchar2(300) |
| 45 | vbilldate | vbilldate | vbilldate | char(19) |
| 46 | vbillno | vbillno | vbillno | varchar2(50) |
| 47 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 48 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 49 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 50 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 51 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 52 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 53 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 54 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 55 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 56 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 57 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 58 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 59 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 60 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 61 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 62 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 63 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 64 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 65 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 66 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 67 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 68 | creationtime | creationtime | creationtime | char(19) |
| 69 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 70 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 71 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 72 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 73 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |