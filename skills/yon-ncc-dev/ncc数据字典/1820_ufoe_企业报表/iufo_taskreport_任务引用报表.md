# |<<

**任务引用报表 (iufo_taskreport / nc.vo.iufo.task.TaskReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3523.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskreport | 主键 | pk_taskreport | char(20) | √ | 主键 (UFID) |
| 2 | pk_report | 报表 | pk_report | varchar(20) |  | 采集表信息 (reportinfo) |
| 3 | pk_task | 所属任务 | pk_task | varchar(20) |  | 任务 (task) |
| 4 | group_number | 计算分组组号 | group_number | int |  | 整数 (Integer) |
| 5 | group_position | 计算分组组内位置 | group_position | int |  | 整数 (Integer) |
| 6 | type_dir | 分类目录 | type_dir | varchar(50) |  | 字符串 (String) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | commitattr | 报送属性 | commitattr | int |  | 报表报送属性 (enum_commitstate) |  | 0=必报必录; |