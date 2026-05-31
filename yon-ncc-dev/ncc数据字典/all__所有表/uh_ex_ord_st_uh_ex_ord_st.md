# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12609.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_strec | pk_strec | pk_strec | char(20) | √ |
| 2 | batch_number | batch_number | batch_number | varchar2(30) |
| 3 | date_st | date_st | date_st | char(19) |
| 4 | desc_ord | desc_ord | desc_ord | varchar2(4000) |
| 5 | eu_result | eu_result | eu_result | number(38, 0) |
| 6 | flag_chk | flag_chk | flag_chk | char(1) |
| 7 | name_psn_st | name_psn_st | name_psn_st | varchar2(50) |
| 8 | note | note | note | varchar2(256) |
| 9 | pk_dept_st | pk_dept_st | pk_dept_st | varchar2(20) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_ord | pk_ord | pk_ord | varchar2(50) |  |  | '~' |
| 12 | pk_ordmt | pk_ordmt | pk_ordmt | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_org_st | pk_org_st | pk_org_st | varchar2(20) |  |  | '~' |
| 15 | pk_psn_st | pk_psn_st | pk_psn_st | varchar2(20) |  |  | '~' |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |