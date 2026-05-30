# |<<

**任务实例关系表 (iufo_subscibe_task_data / nc.vo.report.subscibe.TaskDataVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3512.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_task_data | 任务实例主键 | pk_task_data | char(20) | √ | 主键 (UFID) |
| 2 | pk_subscibe_task | 订阅任务PK | pk_subscibe_task | varchar(20) |  | 字符串 (String) |
| 3 | pk_data_instance | 数据实例PK | pk_data_instance | varchar(20) |  | 字符串 (String) |
| 4 | data_table_name | 数据实例表名 | data_table_name | varchar(50) |  | 字符串 (String) |
| 5 | data_file_name | 数据实例文件名 | data_file_name | varchar(50) |  | 字符串 (String) |
| 6 | subsistence_policy | 留存策略 | subsistence_policy | int |  | 留存策略 (SubsistencePolicyEnum) |  | 1=文件; |