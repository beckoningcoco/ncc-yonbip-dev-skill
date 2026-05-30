# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8751.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_replacecalendar | pk_replacecalendar | pk_replacecalendar | char(20) | √ |
| 2 | applydate | applydate | applydate | char(19) |
| 3 | applytype | applytype | applytype | number(38, 0) |
| 4 | approvenote | approvenote | approvenote | varchar2(600) |
| 5 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 6 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 7 | approvetime | approvetime | approvetime | char(19) |
| 8 | billno | billno | billno | varchar2(50) |
| 9 | billtype | billtype | billtype | varchar2(50) |
| 10 | dr_flag | dr_flag | dr_flag | number(38, 0) |
| 11 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 15 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) |  |  | '~' |
| 16 | pk_replace_add_shift | pk_replace_add_shift | pk_replace_add_shift | varchar2(50) |
| 17 | pk_replace_dept | pk_replace_dept | pk_replace_dept | varchar2(50) |
| 18 | pk_replace_org | pk_replace_org | pk_replace_org | varchar2(50) |
| 19 | pk_replace_psndoc | pk_replace_psndoc | pk_replace_psndoc | varchar2(50) |
| 20 | pk_replace_shift | pk_replace_shift | pk_replace_shift | varchar2(50) |
| 21 | pk_replace_shift_show | pk_replace_shift_show | pk_replace_shift_show | varchar2(50) |
| 22 | pk_shift | pk_shift | pk_shift | varchar2(50) |
| 23 | pk_shift_show | pk_shift_show | pk_shift_show | varchar2(50) |
| 24 | remark | remark | remark | varchar2(600) |
| 25 | replacedate | replacedate | replacedate | char(19) |
| 26 | type | type | type | number(38, 0) |
| 27 | creationtime | creationtime | creationtime | char(19) |
| 28 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 29 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 30 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 31 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 32 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |