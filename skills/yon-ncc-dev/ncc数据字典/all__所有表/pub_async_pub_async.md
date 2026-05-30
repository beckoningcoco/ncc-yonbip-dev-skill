# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10873.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_async | pk_async | pk_async | char(20) | √ |
| 2 | addtime | addtime | addtime | char(19) |
| 3 | clusterid | clusterid | clusterid | varchar2(200) |
| 4 | content_type | content_type | content_type | varchar2(100) |
| 5 | count | count | count | number(38, 0) |
| 6 | enddate | enddate | enddate | char(19) |
| 7 | endtime | endtime | endtime | char(8) |
| 8 | justintime | justintime | justintime | char(1) | √ |
| 9 | notrans | notrans | notrans | char(1) |
| 10 | pk_group | pk_group | pk_group | char(20) |
| 11 | runnable | runnable | runnable | blob |
| 12 | server | server | server | varchar2(32) |
| 13 | status | status | status | number(38, 0) | √ |
| 14 | task_id | task_id | task_id | varchar2(100) |
| 15 | task_label | task_label | task_label | varchar2(200) |
| 16 | task_module | task_module | task_module | varchar2(20) |
| 17 | task_name | task_name | task_name | varchar2(128) |
| 18 | task_type | task_type | task_type | varchar2(32) |
| 19 | timeconfig | timeconfig | timeconfig | blob | √ |
| 20 | userid | userid | userid | varchar2(20) |
| 21 | def1 | def1 | def1 | varchar2(100) |
| 22 | def2 | def2 | def2 | varchar2(100) |
| 23 | def3 | def3 | def3 | varchar2(100) |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |