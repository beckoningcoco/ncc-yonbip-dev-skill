# |<<

**任务发布 (ewm_planning_task / nc.vo.ewm.planningtask.PlanningTaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1949.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_planningtask | 任务发布主键 | pk_planningtask | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 维修组织 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 4 | pk_org_v | 维修组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 5 | taskcode | 任务编码 | taskcode | varchar(50) |  | 字符串 (String) |
| 6 | taskname | 任务名称 | taskname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | pk_morgstru | 维修组织体系 | pk_morgstru | varchar(20) |  | 组织结构_维修组织体系 (maintainorgstru) |
| 8 | pk_morgstru_v | 维修组织体系版本 | pk_morgstru_v | varchar(20) |  | 组织结构_维修组织体系版本 (maintainorgstru_v) |
| 9 | taskstatus | 任务状态 | taskstatus | int |  | 任务状态 (enum) |  | 0=已创建; |