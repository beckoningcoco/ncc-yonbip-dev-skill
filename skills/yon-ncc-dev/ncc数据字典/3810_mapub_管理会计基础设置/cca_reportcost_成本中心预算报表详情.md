# |<<

**成本中心预算报表详情 (cca_reportcost / nc.vo.mapub.budgetmanage.CostBudgetReportDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1295.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportdetail | 成本中心预算报表详情主键 | pk_reportdetail | char(50) | √ | 主键 (UFID) |
| 2 | pk_dimension | 维度设置主键 | pk_dimension | varchar(20) |  | 预算维度设置 (mapub_dimension) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | souresystem | 来源系统 | souresystem | int |  | 维度设置来源系统枚举 (SourceSysEnum) |  | 2=全面预算; |