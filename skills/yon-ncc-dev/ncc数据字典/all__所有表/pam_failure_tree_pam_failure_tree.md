# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10386.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_failure_tree | pk_failure_tree | pk_failure_tree | char(20) | √ |
| 2 | code | code | code | varchar2(40) |
| 3 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 4 | innercode | innercode | innercode | varchar2(200) |
| 5 | name | name | name | varchar2(400) |
| 6 | name2 | name2 | name2 | varchar2(400) |
| 7 | name3 | name3 | name3 | varchar2(400) |
| 8 | name4 | name4 | name4 | varchar2(400) |
| 9 | name5 | name5 | name5 | varchar2(400) |
| 10 | name6 | name6 | name6 | varchar2(400) |
| 11 | pk_failure_reason | pk_failure_reason | pk_failure_reason | varchar2(20) |  |  | '~' |
| 12 | pk_failure_symptom | pk_failure_symptom | pk_failure_symptom | varchar2(20) |  |  | '~' |
| 13 | pk_failure_type | pk_failure_type | pk_failure_type | varchar2(20) |  |  | '~' |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_parent | pk_parent | pk_parent | varchar2(20) |  |  | '~' |
| 17 | pk_sealer | pk_sealer | pk_sealer | varchar2(20) |  |  | '~' |
| 18 | pk_service_step | pk_service_step | pk_service_step | varchar2(20) |  |  | '~' |
| 19 | pk_std_job | pk_std_job | pk_std_job | varchar2(20) |  |  | '~' |
| 20 | seal_time | seal_time | seal_time | char(19) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |