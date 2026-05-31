# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12577.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptpdexdt | pk_deptpdexdt | pk_deptpdexdt | char(20) | √ |
| 2 | date_exec | date_exec | date_exec | char(19) |
| 3 | flag_de | flag_de | flag_de | char(1) |
| 4 | flag_prt | flag_prt | flag_prt | char(1) |
| 5 | pk_deptpdapdt | pk_deptpdapdt | pk_deptpdapdt | varchar2(20) |  |  | '~' |
| 6 | pk_deptpddedt | pk_deptpddedt | pk_deptpddedt | varchar2(20) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_measdoc_cur | pk_measdoc_cur | pk_measdoc_cur | varchar2(20) |  |  | '~' |
| 9 | pk_measdoc_med | pk_measdoc_med | pk_measdoc_med | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_pdpivas | pk_pdpivas | pk_pdpivas | char(20) |
| 12 | quan_cur | quan_cur | quan_cur | number(14, 2) |
| 13 | quan_md | quan_md | quan_md | number(14, 2) |
| 14 | quan_med | quan_med | quan_med | number(38, 0) |
| 15 | quan_round | quan_round | quan_round | number(38, 0) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |