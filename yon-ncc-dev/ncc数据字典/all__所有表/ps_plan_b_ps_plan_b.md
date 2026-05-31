# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10849.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plan_b | pk_plan_b | pk_plan_b | char(20) | √ |
| 2 | advancemny | advancemny | advancemny | number(28, 8) |
| 3 | applymny | applymny | applymny | number(28, 8) |
| 4 | applysummny | applysummny | applysummny | number(28, 8) |
| 5 | approvemny | approvemny | approvemny | number(28, 8) |
| 6 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billname | billname | billname | varchar2(181) |
| 9 | commitdate | commitdate | commitdate | char(19) |
| 10 | commitor | commitor | commitor | varchar2(20) |  |  | '~' |
| 11 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 12 | dapprovetime | dapprovetime | dapprovetime | char(19) |
| 13 | olcadvancemny | olcadvancemny | olcadvancemny | number(28, 8) |
| 14 | olcapplymny | olcapplymny | olcapplymny | number(28, 8) |
| 15 | olcapplysummny | olcapplysummny | olcapplysummny | number(28, 8) |
| 16 | olcapprovemny | olcapprovemny | olcapprovemny | number(28, 8) |
| 17 | olcplanmny | olcplanmny | olcplanmny | number(28, 8) |
| 18 | olcpostponedmny | olcpostponedmny | olcpostponedmny | number(28, 8) |
| 19 | olcprepaymny | olcprepaymny | olcprepaymny | number(28, 8) |
| 20 | olcsanctionmny | olcsanctionmny | olcsanctionmny | number(28, 8) |
| 21 | olctotaladvancemny | olctotaladvancemny | olctotaladvancemny | number(28, 8) |
| 22 | olctotalpostponedmny | olctotalpostponedmny | olctotalpostponedmny | number(28, 8) |
| 23 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 24 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 25 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 26 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 27 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 28 | pk_org_sanction | pk_org_sanction | pk_org_sanction | varchar2(20) |  |  | '~' |
| 29 | pk_org_sanction_v | pk_org_sanction_v | pk_org_sanction_v | varchar2(20) |  |  | '~' |
| 30 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 31 | pk_plan | pk_plan | pk_plan | varchar2(20) |  |  | '~' |
| 32 | pk_planitem | pk_planitem | pk_planitem | varchar2(20) |  |  | '~' |
| 33 | pk_planperiod | pk_planperiod | pk_planperiod | varchar2(20) |  |  | '~' |
| 34 | pk_sanction_group | pk_sanction_group | pk_sanction_group | varchar2(20) |
| 35 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 36 | planmny | planmny | planmny | number(28, 8) |
| 37 | plantype | plantype | plantype | number(38, 0) |
| 38 | postponedmny | postponedmny | postponedmny | number(28, 8) |
| 39 | prepaymny | prepaymny | prepaymny | number(28, 8) |
| 40 | putdowndate | putdowndate | putdowndate | char(19) |
| 41 | putdownor | putdownor | putdownor | varchar2(20) |  |  | '~' |
| 42 | sancdapprovetime | sancdapprovetime | sancdapprovetime | char(19) |
| 43 | sanctiondate | sanctiondate | sanctiondate | char(19) |
| 44 | sanctionmny | sanctionmny | sanctionmny | number(28, 8) |
| 45 | sanctionor | sanctionor | sanctionor | varchar2(20) |  |  | '~' |
| 46 | superiorapprovedate | superiorapprovedate | superiorapprovedate | char(19) |
| 47 | superiorapproveid | superiorapproveid | superiorapproveid | varchar2(20) |  |  | '~' |
| 48 | superiorapprovenote | superiorapprovenote | superiorapprovenote | varchar2(300) |
| 49 | totaladvancemny | totaladvancemny | totaladvancemny | number(28, 8) |
| 50 | totalpostponedmny | totalpostponedmny | totalpostponedmny | number(28, 8) |
| 51 | vapprovenote | vapprovenote | vapprovenote | varchar2(300) |
| 52 | vbilldate | vbilldate | vbilldate | char(19) |
| 53 | vbillno | vbillno | vbillno | varchar2(50) |
| 54 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 55 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 56 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 57 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 58 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 59 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 60 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 61 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 62 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 63 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 64 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 65 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 66 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 67 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 68 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 69 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 70 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 71 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 72 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 73 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 74 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 75 | creationtime | creationtime | creationtime | char(19) |
| 76 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 77 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 78 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 79 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 80 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |