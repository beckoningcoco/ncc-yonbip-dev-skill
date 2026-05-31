# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6896.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrdg | pk_emrdg | pk_emrdg | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | code_std | code_std | code_std | varchar2(50) |
| 4 | date_create | date_create | date_create | char(19) |
| 5 | describe | describe | describe | varchar2(4000) |
| 6 | dt_emrdgtype | dt_emrdgtype | dt_emrdgtype | varchar2(50) |
| 7 | dt_emrtempright | dt_emrtempright | dt_emrtempright | varchar2(50) |
| 8 | eu_emrdgfmt | eu_emrdgfmt | eu_emrdgfmt | number(38, 0) |
| 9 | flag_active | flag_active | flag_active | char(1) |
| 10 | innercode | innercode | innercode | varchar2(200) |
| 11 | name | name | name | varchar2(50) |
| 12 | pk_dept_create | pk_dept_create | pk_dept_create | varchar2(20) |  |  | '~' |
| 13 | pk_emrdgtype | pk_emrdgtype | pk_emrdgtype | varchar2(20) |  |  | '~' |
| 14 | pk_emrtempright | pk_emrtempright | pk_emrtempright | varchar2(20) |  |  | '~' |
| 15 | pk_father | pk_father | pk_father | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_org_create | pk_org_create | pk_org_create | varchar2(20) |  |  | '~' |
| 19 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 20 | pk_psn_create | pk_psn_create | pk_psn_create | varchar2(20) |  |  | '~' |
| 21 | verno | verno | verno | varchar2(50) |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |