# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7016.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_opmrtemp | pk_opmrtemp | pk_opmrtemp | char(20) | √ |
| 2 | allergy | allergy | allergy | varchar2(1000) |
| 3 | code | code | code | varchar2(50) |  |  | '~' |
| 4 | date_create | date_create | date_create | char(19) |
| 5 | eu_emrtempright | eu_emrtempright | eu_emrtempright | varchar2(1) |
| 6 | exam_aux | exam_aux | exam_aux | varchar2(1000) |
| 7 | exam_phy | exam_phy | exam_phy | varchar2(1000) |
| 8 | flag_active | flag_active | flag_active | char(1) |  |  | 'Y' |
| 9 | history | history | history | varchar2(1000) |
| 10 | mnecode | mnecode | mnecode | varchar2(50) |  |  | '~' |
| 11 | name | name | name | varchar2(50) |  |  | '~' |
| 12 | note | note | note | varchar2(1000) |
| 13 | pk_dept_create | pk_dept_create | pk_dept_create | varchar2(20) |  |  | '~' |
| 14 | pk_dept_use | pk_dept_use | pk_dept_use | varchar2(20) |  |  | '~' |
| 15 | pk_diag | pk_diag | pk_diag | varchar2(50) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_org_create | pk_org_create | pk_org_create | varchar2(20) |  |  | '~' |
| 19 | pk_psn_create | pk_psn_create | pk_psn_create | varchar2(20) |  |  | '~' |
| 20 | pk_psn_use | pk_psn_use | pk_psn_use | varchar2(20) |  |  | '~' |
| 21 | pk_tempcate | pk_tempcate | pk_tempcate | char(20) |
| 22 | present | present | present | varchar2(1000) |
| 23 | problem | problem | problem | varchar2(1000) |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |