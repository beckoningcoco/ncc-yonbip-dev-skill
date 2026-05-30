# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6906.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrqatype | pk_emrqatype | pk_emrqatype | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | emr_temp_code | emr_temp_code | emr_temp_code | varchar2(50) |
| 4 | flag_custome | flag_custome | flag_custome | char(1) |
| 5 | name | name | name | varchar2(50) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_parentqatype | pk_parentqatype | pk_parentqatype | varchar2(20) |  |  | '~' |
| 9 | score | score | score | number(28, 8) |
| 10 | sortno | sortno | sortno | number(38, 0) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |