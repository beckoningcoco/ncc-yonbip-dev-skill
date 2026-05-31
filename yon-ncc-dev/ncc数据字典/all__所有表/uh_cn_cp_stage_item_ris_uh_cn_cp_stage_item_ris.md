# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12456.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ris | pk_ris | pk_ris | char(20) | √ |
| 2 | amount | amount | amount | varchar2(20) |
| 3 | cate_ord | cate_ord | cate_ord | varchar2(50) |
| 4 | code_body | code_body | code_body | varchar2(1000) |
| 5 | code_ris | code_ris | code_ris | varchar2(20) |
| 6 | exampurp | exampurp | exampurp | varchar2(4000) |
| 7 | name_body | name_body | name_body | varchar2(256) |
| 8 | name_ris | name_ris | name_ris | varchar2(256) |
| 9 | note | note | note | varchar2(256) |
| 10 | pk_dept_exec | pk_dept_exec | pk_dept_exec | varchar2(50) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 12 | pk_item | pk_item | pk_item | varchar2(20) | √ |
| 13 | pk_org | pk_org | pk_org | char(20) | √ |
| 14 | pk_org_exec | pk_org_exec | pk_org_exec | varchar2(20) |
| 15 | pk_ris_dit | pk_ris_dit | pk_ris_dit | varchar2(50) |
| 16 | pk_srvtype | pk_srvtype | pk_srvtype | varchar2(20) |
| 17 | sortno | sortno | sortno | varchar2(50) |
| 18 | srvtype_name | srvtype_name | srvtype_name | varchar2(50) |
| 19 | type_ord | type_ord | type_ord | varchar2(50) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |