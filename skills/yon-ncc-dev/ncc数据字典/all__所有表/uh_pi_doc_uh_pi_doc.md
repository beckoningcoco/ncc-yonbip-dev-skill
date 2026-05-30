# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12698.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patidoc | pk_patidoc | pk_patidoc | char(20) | √ |
| 2 | addr_patidoc | addr_patidoc | addr_patidoc | varchar2(256) |
| 3 | code_patidoc | code_patidoc | code_patidoc | varchar2(30) |
| 4 | date_ceate | date_ceate | date_ceate | char(19) |
| 5 | dt_patidoctype | dt_patidoctype | dt_patidoctype | varchar2(20) |
| 6 | name_psn_create | name_psn_create | name_psn_create | varchar2(50) |
| 7 | pk_dept_create | pk_dept_create | pk_dept_create | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_org_create | pk_org_create | pk_org_create | varchar2(20) |  |  | '~' |
| 11 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 12 | pk_patidoctype | pk_patidoctype | pk_patidoctype | varchar2(20) |  |  | '~' |
| 13 | pk_psn_create | pk_psn_create | pk_psn_create | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |