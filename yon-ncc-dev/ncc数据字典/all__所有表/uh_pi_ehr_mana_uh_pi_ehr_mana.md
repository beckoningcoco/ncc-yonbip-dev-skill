# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12701.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_piehrmana | pk_piehrmana | pk_piehrmana | char(20) | √ |
| 2 | checked | checked | checked | char(19) |
| 3 | date_create | date_create | date_create | char(19) |
| 4 | eu_status_ehr | eu_status_ehr | eu_status_ehr | number(38, 0) |
| 5 | finished | finished | finished | number(14, 2) |
| 6 | name_dept_mana | name_dept_mana | name_dept_mana | varchar2(50) |
| 7 | name_org_create | name_org_create | name_org_create | varchar2(50) |
| 8 | name_org_mana | name_org_mana | name_org_mana | varchar2(50) |
| 9 | name_psn_create | name_psn_create | name_psn_create | varchar2(50) |
| 10 | name_psn_phy | name_psn_phy | name_psn_phy | varchar2(50) |
| 11 | note | note | note | varchar2(256) |
| 12 | pk_dept_mana | pk_dept_mana | pk_dept_mana | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_org_create | pk_org_create | pk_org_create | varchar2(20) |  |  | '~' |
| 16 | pk_org_mana | pk_org_mana | pk_org_mana | varchar2(20) |  |  | '~' |
| 17 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 18 | pk_piehr | pk_piehr | pk_piehr | varchar2(20) |  |  | '~' |
| 19 | pk_psn_create | pk_psn_create | pk_psn_create | varchar2(20) |  |  | '~' |
| 20 | pk_psn_phy | pk_psn_phy | pk_psn_phy | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |