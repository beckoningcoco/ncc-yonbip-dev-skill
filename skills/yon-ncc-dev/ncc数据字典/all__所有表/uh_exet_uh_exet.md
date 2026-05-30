# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12559.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exet | pk_exet | pk_exet | char(20) | √ |
| 2 | code_et | code_et | code_et | varchar2(30) |
| 3 | date_et | date_et | date_et | char(19) |
| 4 | dt_exettype | dt_exettype | dt_exettype | varchar2(50) |
| 5 | name_ex | name_ex | name_ex | varchar2(50) |
| 6 | name_psn_et | name_psn_et | name_psn_et | varchar2(50) |
| 7 | note | note | note | varchar2(256) |
| 8 | pk_dept_et | pk_dept_et | pk_dept_et | varchar2(20) |  |  | '~' |
| 9 | pk_exettype | pk_exettype | pk_exettype | varchar2(20) |  |  | '~' |
| 10 | pk_ex_dept_medtech | pk_ex_dept_medtech | pk_ex_dept_medtech | varchar2(20) |  |  | '~' |
| 11 | pk_ex_dept_mt | pk_ex_dept_mt | pk_ex_dept_mt | varchar2(20) |  |  | '~' |
| 12 | pk_ex_dept_pd | pk_ex_dept_pd | pk_ex_dept_pd | varchar2(20) |  |  | '~' |
| 13 | pk_ex_dept_pdap | pk_ex_dept_pdap | pk_ex_dept_pdap | varchar2(20) |  |  | '~' |
| 14 | pk_ex_ord_medtech | pk_ex_ord_medtech | pk_ex_ord_medtech | varchar2(20) |  |  | '~' |
| 15 | pk_ex_ord_mt | pk_ex_ord_mt | pk_ex_ord_mt | varchar2(20) |  |  | '~' |
| 16 | pk_ex_ord_pd | pk_ex_ord_pd | pk_ex_ord_pd | varchar2(20) |  |  | '~' |
| 17 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | pk_org_et | pk_org_et | pk_org_et | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | pk_psn_et | pk_psn_et | pk_psn_et | varchar2(20) |  |  | '~' |
| 22 | status_dept_medtech | status_dept_medtech | status_dept_medtech | number(38, 0) |
| 23 | status_dept_mt | status_dept_mt | status_dept_mt | number(38, 0) |
| 24 | status_dept_pd | status_dept_pd | status_dept_pd | number(38, 0) |
| 25 | status_dept_pdap | status_dept_pdap | status_dept_pdap | number(38, 0) |
| 26 | status_ord_medtech | status_ord_medtech | status_ord_medtech | number(38, 0) |
| 27 | status_ord_mt | status_ord_mt | status_ord_mt | number(38, 0) |
| 28 | status_ord_pd | status_ord_pd | status_ord_pd | number(38, 0) |
| 29 | creationtime | creationtime | creationtime | char(19) |
| 30 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 31 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 32 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 33 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 34 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |