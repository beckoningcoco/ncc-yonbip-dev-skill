# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8746.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_attendance | pk_attendance | pk_attendance | char(20) | √ |
| 2 | approvenote | approvenote | approvenote | varchar2(600) |
| 3 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 4 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 5 | approvetime | approvetime | approvetime | char(19) |
| 6 | billno | billno | billno | varchar2(50) |
| 7 | billtype | billtype | billtype | varchar2(50) |
| 8 | fill_date | fill_date | fill_date | char(19) |
| 9 | fill_reason | fill_reason | fill_reason | varchar2(600) |
| 10 | fill_time | fill_time | fill_time | varchar2(50) |
| 11 | fill_type_id | fill_type_id | fill_type_id | varchar2(36) |  |  | '~' |
| 12 | original_fill_date | original_fill_date | original_fill_date | char(19) |
| 13 | original_sign_status | original_sign_status | original_sign_status | varchar2(50) |
| 14 | original_sign_time | original_sign_time | original_sign_time | char(8) |
| 15 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 19 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) |  |  | '~' |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |