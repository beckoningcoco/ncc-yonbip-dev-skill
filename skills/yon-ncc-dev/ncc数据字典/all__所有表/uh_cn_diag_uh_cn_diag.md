# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12460.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cndiag | pk_cndiag | pk_cndiag | char(20) | √ |
| 2 | code_pvtype | code_pvtype | code_pvtype | varchar2(50) |
| 3 | date_diag | date_diag | date_diag | char(19) |
| 4 | desc_diags | desc_diags | desc_diags | varchar2(256) |
| 5 | dt_diagtype | dt_diagtype | dt_diagtype | varchar2(50) |
| 6 | name_psn_phy | name_psn_phy | name_psn_phy | varchar2(20) |  |  | '~' |
| 7 | note | note | note | varchar2(256) |
| 8 | pk_cnet | pk_cnet | pk_cnet | varchar2(20) |  |  | '~' |
| 9 | pk_diagtype | pk_diagtype | pk_diagtype | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | pk_pati | pk_pati | pk_pati | varchar2(20) |  |  | '~' |
| 14 | pk_psn_dept | pk_psn_dept | pk_psn_dept | varchar2(20) |  |  | '~' |
| 15 | pk_psn_org | pk_psn_org | pk_psn_org | varchar2(20) |  |  | '~' |
| 16 | pk_psn_phy | pk_psn_phy | pk_psn_phy | varchar2(20) |  |  | '~' |
| 17 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 18 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(20) |  |  | '~' |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |