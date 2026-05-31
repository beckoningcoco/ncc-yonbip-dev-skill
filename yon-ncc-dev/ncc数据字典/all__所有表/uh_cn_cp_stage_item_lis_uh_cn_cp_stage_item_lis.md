# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12450.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lis | pk_lis | pk_lis | char(20) | √ |
| 2 | amount | amount | amount | varchar2(20) |
| 3 | cate_ord | cate_ord | cate_ord | varchar2(50) |
| 4 | code_lis | code_lis | code_lis | varchar2(20) |
| 5 | dt_colltype | dt_colltype | dt_colltype | varchar2(30) |
| 6 | dt_contype | dt_contype | dt_contype | varchar2(20) |
| 7 | dt_samptype | dt_samptype | dt_samptype | varchar2(20) |
| 8 | name_lis | name_lis | name_lis | varchar2(256) |
| 9 | note | note | note | varchar2(256) |
| 10 | pk_dept_coll | pk_dept_coll | pk_dept_coll | varchar2(20) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 12 | pk_item | pk_item | pk_item | varchar2(20) | √ |
| 13 | pk_lis_dit | pk_lis_dit | pk_lis_dit | varchar2(50) |
| 14 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 15 | pk_srvtype | pk_srvtype | pk_srvtype | varchar2(50) |
| 16 | purpose_lis | purpose_lis | purpose_lis | varchar2(256) |
| 17 | sortno | sortno | sortno | varchar2(50) |
| 18 | srvtype_name | srvtype_name | srvtype_name | varchar2(50) |
| 19 | type_ord | type_ord | type_ord | varchar2(50) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |