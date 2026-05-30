# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12441.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lis | pk_lis | pk_lis | char(20) | √ |
| 2 | amount | amount | amount | varchar2(20) |
| 3 | code_lis | code_lis | code_lis | varchar2(20) |
| 4 | dt_colltype | dt_colltype | dt_colltype | varchar2(30) |
| 5 | dt_contype | dt_contype | dt_contype | varchar2(20) |
| 6 | dt_samptype | dt_samptype | dt_samptype | varchar2(20) |
| 7 | name_lis | name_lis | name_lis | varchar2(256) |
| 8 | note | note | note | varchar2(256) |
| 9 | pk_dept_coll | pk_dept_coll | pk_dept_coll | varchar2(20) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 11 | pk_item | pk_item | pk_item | varchar2(20) | √ |
| 12 | pk_org | pk_org | pk_org | char(20) | √ |
| 13 | purpose_lis | purpose_lis | purpose_lis | varchar2(256) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |