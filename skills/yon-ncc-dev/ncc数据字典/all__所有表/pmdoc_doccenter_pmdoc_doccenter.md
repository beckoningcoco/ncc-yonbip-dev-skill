# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10520.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_center | pk_center | pk_center | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(50) |
| 7 | bill_status | bill_status | bill_status | varchar2(50) |
| 8 | bill_type | bill_type | bill_type | varchar2(50) |
| 9 | center_name | center_name | center_name | varchar2(50) |
| 10 | center_status | center_status | center_status | number(38, 0) |
| 11 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 12 | end_date | end_date | end_date | char(19) |
| 13 | last_time | last_time | last_time | char(19) |
| 14 | last_v_flag | last_v_flag | last_v_flag | char(1) |
| 15 | metaid | metaid | metaid | varchar2(50) |
| 16 | metavalue | metavalue | metavalue | varchar2(50) |
| 17 | pk_doctype | pk_doctype | pk_doctype | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 22 | start_date | start_date | start_date | char(19) |
| 23 | transi_type | transi_type | transi_type | varchar2(50) |
| 24 | version | version | version | number(38, 0) |
| 25 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 26 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 27 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 28 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 29 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 30 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 31 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 32 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 33 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 34 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 35 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 36 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 37 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 38 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 39 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 40 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 41 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 42 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 43 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 44 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 45 | creationtime | creationtime | creationtime | char(19) |
| 46 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 47 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 48 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 49 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 50 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |