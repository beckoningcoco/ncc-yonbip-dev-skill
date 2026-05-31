# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12672.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdst | pk_pdst | pk_pdst | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | date_st | date_st | date_st | char(19) |
| 4 | direct | direct | direct | number(38, 0) |
| 5 | dt_sttype | dt_sttype | dt_sttype | varchar2(50) |
| 6 | eu_status | eu_status | eu_status | number(38, 0) |
| 7 | flag_pay | flag_pay | flag_pay | char(1) |
| 8 | incno | incno | incno | varchar2(50) |
| 9 | name | name | name | varchar2(50) |
| 10 | note | note | note | varchar2(50) |
| 11 | pk_dept_lk | pk_dept_lk | pk_dept_lk | varchar2(20) |  |  | '~' |
| 12 | pk_dept_st | pk_dept_st | pk_dept_st | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_org_lk | pk_org_lk | pk_org_lk | varchar2(20) |  |  | '~' |
| 16 | pk_pdadjust | pk_pdadjust | pk_pdadjust | char(20) |
| 17 | pk_pdpl | pk_pdpl | pk_pdpl | varchar2(20) |  |  | '~' |
| 18 | pk_pdpu | pk_pdpu | pk_pdpu | varchar2(20) |  |  | '~' |
| 19 | pk_psn_st | pk_psn_st | pk_psn_st | varchar2(20) |  |  | '~' |
| 20 | pk_stordoc_lk | pk_stordoc_lk | pk_stordoc_lk | varchar2(20) |  |  | '~' |
| 21 | pk_stordoc_st | pk_stordoc_st | pk_stordoc_st | varchar2(20) |  |  | '~' |
| 22 | pk_sttype | pk_sttype | pk_sttype | varchar2(50) |
| 23 | pk_sup | pk_sup | pk_sup | varchar2(20) |  |  | '~' |
| 24 | def1 | def1 | def1 | varchar2(50) |
| 25 | def2 | def2 | def2 | varchar2(50) |
| 26 | def3 | def3 | def3 | varchar2(50) |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |