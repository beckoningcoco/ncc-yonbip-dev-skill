# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12228.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_predictionmodel | pk_predictionmodel | pk_predictionmodel | char(20) | √ |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1048) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | billmaketime | billmaketime | billmaketime | char(19) |
| 7 | busistatus | busistatus | busistatus | varchar2(50) |
| 8 | commiter | commiter | commiter | varchar2(20) |  |  | '~' |
| 9 | committime | committime | committime | char(19) |
| 10 | ispreset | ispreset | ispreset | char(1) |
| 11 | name | name | name | varchar2(200) |
| 12 | name2 | name2 | name2 | varchar2(200) |
| 13 | name3 | name3 | name3 | varchar2(200) |
| 14 | name4 | name4 | name4 | varchar2(200) |
| 15 | name5 | name5 | name5 | varchar2(200) |
| 16 | name6 | name6 | name6 | varchar2(200) |
| 17 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 18 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(50) |
| 19 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 23 | predspace | predspace | predspace | varchar2(50) |
| 24 | remark | remark | remark | varchar2(1024) |
| 25 | vbillno | vbillno | vbillno | varchar2(50) |
| 26 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 27 | workdate | workdate | workdate | char(19) |
| 28 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 29 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 30 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 31 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 32 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 33 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 34 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 35 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 36 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 37 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 38 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 39 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 40 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 41 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 42 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 43 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 44 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 45 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 46 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 47 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 48 | creationtime | creationtime | creationtime | char(19) |
| 49 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 50 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 51 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 52 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 53 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |