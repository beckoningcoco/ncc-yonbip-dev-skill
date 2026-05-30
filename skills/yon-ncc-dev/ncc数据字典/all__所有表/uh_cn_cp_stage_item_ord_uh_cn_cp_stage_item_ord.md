# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12454.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ord | pk_ord | pk_ord | varchar2(20) | √ |
| 2 | cate_ord | cate_ord | cate_ord | varchar2(20) | √ |
| 3 | code_ord | code_ord | code_ord | varchar2(20) |
| 4 | code_srvtype | code_srvtype | code_srvtype | varchar2(50) |
| 5 | desc_ord | desc_ord | desc_ord | varchar2(4000) |
| 6 | dose_units | dose_units | dose_units | varchar2(32) |
| 7 | drip_speed | drip_speed | drip_speed | number(38, 0) |
| 8 | drug_int | drug_int | drug_int | number(38, 0) |
| 9 | dt_fac | dt_fac | dt_fac | varchar2(80) |
| 10 | dt_usage | dt_usage | dt_usage | varchar2(32) |
| 11 | dt_usagenote | dt_usagenote | dt_usagenote | varchar2(20) |
| 12 | groupmark | groupmark | groupmark | number(38, 0) |
| 13 | name_ord | name_ord | name_ord | varchar2(256) |
| 14 | norms | norms | norms | varchar2(32) |
| 15 | note | note | note | varchar2(256) |
| 16 | ord_group_no | ord_group_no | ord_group_no | number(38, 0) |
| 17 | pk_dept_exec | pk_dept_exec | pk_dept_exec | varchar2(20) |
| 18 | pk_freq | pk_freq | pk_freq | varchar2(32) |
| 19 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 20 | pk_item | pk_item | pk_item | char(20) | √ |
| 21 | pk_ord_dit | pk_ord_dit | pk_ord_dit | varchar2(50) |
| 22 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 23 | pk_org_exec | pk_org_exec | pk_org_exec | varchar2(20) |
| 24 | sortno | sortno | sortno | number(38, 0) |
| 25 | type_ord | type_ord | type_ord | varchar2(50) |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |