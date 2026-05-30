# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10669.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_projectbudctrl | pk_projectbudctrl | pk_projectbudctrl | char(20) | √ |
| 2 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 3 | billmaketime | billmaketime | billmaketime | char(19) |
| 4 | bill_code | bill_code | bill_code | varchar2(50) |
| 5 | bill_date | bill_date | bill_date | char(19) |
| 6 | control_point | control_point | control_point | number(38, 0) |
| 7 | control_prop | control_prop | control_prop | number(28, 8) |
| 8 | control_rule | control_rule | control_rule | number(38, 0) |
| 9 | memo | memo | memo | varchar2(200) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 14 | pk_transactor | pk_transactor | pk_transactor | varchar2(20) |  |  | '~' |
| 15 | pk_transact_dept | pk_transact_dept | pk_transact_dept | varchar2(20) |  |  | '~' |
| 16 | pk_transact_dept_v | pk_transact_dept_v | pk_transact_dept_v | varchar2(20) |  |  | '~' |
| 17 | warning_prop | warning_prop | warning_prop | number(28, 8) |
| 18 | def1 | def1 | def1 | varchar2(101) |
| 19 | def2 | def2 | def2 | varchar2(101) |
| 20 | def3 | def3 | def3 | varchar2(101) |
| 21 | def4 | def4 | def4 | varchar2(101) |
| 22 | def5 | def5 | def5 | varchar2(101) |
| 23 | def6 | def6 | def6 | varchar2(101) |
| 24 | def7 | def7 | def7 | varchar2(101) |
| 25 | def8 | def8 | def8 | varchar2(101) |
| 26 | def9 | def9 | def9 | varchar2(101) |
| 27 | def10 | def10 | def10 | varchar2(101) |
| 28 | def11 | def11 | def11 | varchar2(101) |
| 29 | def12 | def12 | def12 | varchar2(101) |
| 30 | def13 | def13 | def13 | varchar2(101) |
| 31 | def14 | def14 | def14 | varchar2(101) |
| 32 | def15 | def15 | def15 | varchar2(101) |
| 33 | def16 | def16 | def16 | varchar2(101) |
| 34 | def17 | def17 | def17 | varchar2(101) |
| 35 | def18 | def18 | def18 | varchar2(101) |
| 36 | def19 | def19 | def19 | varchar2(101) |
| 37 | def20 | def20 | def20 | varchar2(101) |
| 38 | creationtime | creationtime | creationtime | char(19) |
| 39 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 40 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 41 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 42 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 43 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |