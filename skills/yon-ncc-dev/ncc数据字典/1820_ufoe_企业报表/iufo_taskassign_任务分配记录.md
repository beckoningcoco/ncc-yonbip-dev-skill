# |<<

**任务分配记录 (iufo_taskassign / nc.vo.iufo.task.TaskAssignVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3518.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskassign | 分配记录主键 | pk_taskassign | char(20) | √ | 主键 (UFID) |
| 2 | pk_task | 任务主键 | pk_task | varchar(20) |  | 任务 (task) |
| 3 | assign_note | 分配说明 | assign_note | varchar(1024) |  | 字符串 (String) |
| 4 | pk_assignorg | 分配组织 | pk_assignorg | varchar(20) |  | 组织 (org) |
| 5 | pk_receiveorg | 接收组织 | pk_receiveorg | varchar(20) |  | 组织 (org) |
| 6 | pk_createorg | 创建组织 | pk_createorg | varchar(20) |  | 组织 (org) |
| 7 | flag_reassign | 再分配 | flag_reassign | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | flag_privfml | 个性化公式 | flag_privfml | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | flag_privprint | 个性化打印 | flag_privprint | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | pk_org | 上级分配主键 | pk_org | varchar(50) |  | 字符串 (String) |
| 11 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 12 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 13 | pk_groupcorp | 集团公司 | pk_groupcorp | varchar(50) |  | 字符串 (String) |
| 14 | receiveorg_code | 接收组织编码 | receiveorg_code | varchar(50) |  | 字符串 (String) |
| 15 | receiveorg_name | 接收组织名称 | receiveorg_name | varchar(50) |  | 字符串 (String) |
| 16 | dataorigin | 数据来源 | dataorigin | varchar(50) |  | 字符串 (String) |