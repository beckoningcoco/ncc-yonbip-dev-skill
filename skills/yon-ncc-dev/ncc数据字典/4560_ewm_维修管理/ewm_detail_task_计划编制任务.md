# |<<

**计划编制任务 (ewm_detail_task / nc.vo.ewm.detailtask.DetailTaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1923.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detailtask | 计划编制任务主键 | pk_detailtask | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 维修组织 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 4 | pk_org_v | 维修组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 5 | code | 任务编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 任务名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | detailtasktype | 任务类型 | detailtasktype | int |  | 任务类型 (DetailTaskType) |  | 0=编制任务; |