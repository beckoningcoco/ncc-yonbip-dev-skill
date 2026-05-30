# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6774.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbomid | cbomid | cbomid | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | bkititem | bkititem | bkititem | char(1) |
| 5 | fbillstatus | fbillstatus | fbillstatus | number(38, 0) |
| 6 | fbomtype | fbomtype | fbomtype | number(38, 0) | √ |  | 1 |
| 7 | hbconvolution | hbconvolution | hbconvolution | char(1) |
| 8 | hbcustomized | hbcustomized | hbcustomized | char(1) |
| 9 | hbdefault | hbdefault | hbdefault | char(1) |
| 10 | hbisfeature | hbisfeature | hbisfeature | char(1) |
| 11 | hboutsource | hboutsource | hboutsource | char(1) |
| 12 | hcassmeasureid | hcassmeasureid | hcassmeasureid | varchar2(20) |  |  | '~' |
| 13 | hcecnid | hcecnid | hcecnid | varchar2(20) |
| 14 | hcfeatureclassid | hcfeatureclassid | hcfeatureclassid | varchar2(20) |  |  | '~' |
| 15 | hcfeaturecode | hcfeaturecode | hcfeaturecode | varchar2(20) |  |  | '~' |
| 16 | hcmaterialid | hcmaterialid | hcmaterialid | varchar2(20) |  |  | '~' |
| 17 | hcmaterialvid | hcmaterialvid | hcmaterialvid | varchar2(20) |  |  | '~' |
| 18 | hcmeasureid | hcmeasureid | hcmeasureid | varchar2(20) |  |  | '~' |
| 19 | hcprojectid | hcprojectid | hcprojectid | varchar2(20) |  |  | '~' |
| 20 | hfbomcategory | hfbomcategory | hfbomcategory | number(38, 0) | √ |  | 1 |
| 21 | hfbomsource | hfbomsource | hfbomsource | number(38, 0) |
| 22 | hfversiontype | hfversiontype | hfversiontype | number(38, 0) | √ |  | 1 |
| 23 | hnassparentnum | hnassparentnum | hnassparentnum | number(28, 8) |
| 24 | hnparentnum | hnparentnum | hnparentnum | number(28, 8) |
| 25 | hrtversion | hrtversion | hrtversion | varchar2(20) |  |  | '~' |
| 26 | hsrcid | hsrcid | hsrcid | varchar2(50) |
| 27 | hvchangerate | hvchangerate | hvchangerate | varchar2(60) |
| 28 | hvecnbillcode | hvecnbillcode | hvecnbillcode | varchar2(20) |
| 29 | hversion | hversion | hversion | varchar2(10) |
| 30 | hvnote | hvnote | hvnote | varchar2(181) |
| 31 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 32 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 33 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 34 | taudittime | taudittime | taudittime | char(19) |
| 35 | tmaketime | tmaketime | tmaketime | char(19) |
| 36 | vaprrovebillcode | vaprrovebillcode | vaprrovebillcode | varchar2(50) |
| 37 | vbillcode | vbillcode | vbillcode | varchar2(181) |
| 38 | vbilltype | vbilltype | vbilltype | varchar2(50) |  |  | '19B1' |
| 39 | vsobillcode | vsobillcode | vsobillcode | varchar2(181) |
| 40 | vsobillno | vsobillno | vsobillno | varchar2(181) |
| 41 | hvdef1 | hvdef1 | hvdef1 | varchar2(101) |
| 42 | hvdef2 | hvdef2 | hvdef2 | varchar2(101) |
| 43 | hvdef3 | hvdef3 | hvdef3 | varchar2(101) |
| 44 | hvdef4 | hvdef4 | hvdef4 | varchar2(101) |
| 45 | hvdef5 | hvdef5 | hvdef5 | varchar2(101) |
| 46 | hvdef6 | hvdef6 | hvdef6 | varchar2(101) |
| 47 | hvdef7 | hvdef7 | hvdef7 | varchar2(101) |
| 48 | hvdef8 | hvdef8 | hvdef8 | varchar2(101) |
| 49 | hvdef9 | hvdef9 | hvdef9 | varchar2(101) |
| 50 | hvdef10 | hvdef10 | hvdef10 | varchar2(101) |
| 51 | hvdef11 | hvdef11 | hvdef11 | varchar2(101) |
| 52 | hvdef12 | hvdef12 | hvdef12 | varchar2(101) |
| 53 | hvdef13 | hvdef13 | hvdef13 | varchar2(101) |
| 54 | hvdef14 | hvdef14 | hvdef14 | varchar2(101) |
| 55 | hvdef15 | hvdef15 | hvdef15 | varchar2(101) |
| 56 | hvdef16 | hvdef16 | hvdef16 | varchar2(101) |
| 57 | hvdef17 | hvdef17 | hvdef17 | varchar2(101) |
| 58 | hvdef18 | hvdef18 | hvdef18 | varchar2(101) |
| 59 | hvdef19 | hvdef19 | hvdef19 | varchar2(101) |
| 60 | hvdef20 | hvdef20 | hvdef20 | varchar2(101) |
| 61 | creationtime | creationtime | creationtime | char(19) |
| 62 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 63 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 64 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 65 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 66 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |