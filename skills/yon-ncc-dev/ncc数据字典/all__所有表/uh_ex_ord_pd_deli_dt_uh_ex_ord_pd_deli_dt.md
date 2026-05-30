# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12604.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordpddtlist | pk_ordpddtlist | pk_ordpddtlist | char(20) | √ |
| 2 | amount | amount | amount | number(14, 2) |
| 3 | date_inv | date_inv | date_inv | char(19) |
| 4 | date_list | date_list | date_list | char(19) |
| 5 | eu_direct | eu_direct | eu_direct | number(38, 0) |
| 6 | factor_cb | factor_cb | factor_cb | varchar2(50) |
| 7 | flag_inv | flag_inv | flag_inv | char(1) |
| 8 | name_psn_list | name_psn_list | name_psn_list | varchar2(256) |
| 9 | note | note | note | varchar2(256) |
| 10 | pk_dept_list | pk_dept_list | pk_dept_list | varchar2(20) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_inv | pk_inv | pk_inv | varchar2(50) |
| 13 | pk_inv_dt | pk_inv_dt | pk_inv_dt | varchar2(50) |
| 14 | pk_ordpddt | pk_ordpddt | pk_ordpddt | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_org_list | pk_org_list | pk_org_list | varchar2(20) |  |  | '~' |
| 17 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 18 | pk_psn_list | pk_psn_list | pk_psn_list | varchar2(20) |  |  | '~' |
| 19 | price | price | price | number(14, 8) |
| 20 | quan_base | quan_base | quan_base | number(14, 2) |
| 21 | quan_cur | quan_cur | quan_cur | number(14, 2) |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |