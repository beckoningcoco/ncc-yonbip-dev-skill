# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10522.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_doc | pk_doc | pk_doc | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(50) |
| 7 | bill_status | bill_status | bill_status | number(38, 0) |
| 8 | bill_type | bill_type | bill_type | varchar2(4) |
| 9 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 10 | doc_name | doc_name | doc_name | varchar2(500) |
| 11 | filenum | filenum | filenum | number(38, 0) |
| 12 | pk_center | pk_center | pk_center | varchar2(50) |
| 13 | pk_center_list | pk_center_list | pk_center_list | varchar2(50) |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 17 | pk_setting_list | pk_setting_list | pk_setting_list | varchar2(50) |
| 18 | src_billtype | src_billtype | src_billtype | varchar2(50) |
| 19 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(50) |
| 20 | src_transitype | src_transitype | src_transitype | varchar2(50) |
| 21 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 22 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 23 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 24 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 25 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 26 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 27 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 28 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 29 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 30 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 31 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 32 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 33 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 34 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 35 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 36 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 37 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 38 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 39 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 40 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 41 | creationtime | creationtime | creationtime | char(19) |
| 42 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 43 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 44 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 45 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 46 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |