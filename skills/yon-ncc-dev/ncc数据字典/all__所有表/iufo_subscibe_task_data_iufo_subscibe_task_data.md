# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9697.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_task_data | pk_task_data | pk_task_data | char(20) | √ |
| 2 | data_file_name | data_file_name | data_file_name | varchar2(50) |
| 3 | data_table_name | data_table_name | data_table_name | varchar2(50) |
| 4 | pk_data_instance | pk_data_instance | pk_data_instance | varchar2(20) |
| 5 | pk_group | pk_group | pk_group | char(20) |
| 6 | pk_org | pk_org | pk_org | char(20) |
| 7 | pk_subscibe_task | pk_subscibe_task | pk_subscibe_task | varchar2(20) |
| 8 | subsistence_policy | subsistence_policy | subsistence_policy | number(38, 0) |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | char(20) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | modifier | modifier | modifier | char(20) |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |