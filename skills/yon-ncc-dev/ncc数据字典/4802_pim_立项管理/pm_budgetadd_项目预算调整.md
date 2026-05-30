# |<<

**项目预算调整 (pm_budgetadd / nc.vo.pbm.budgetadd.BudgetAddHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4407.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_budgetadd | 成本预算追加标识 | pk_budgetadd | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | busi_type | 业务流程 | busi_type | varchar(20) |  | 业务流程 (BusitypeVO) |
| 6 | bill_status | 单据状态 | bill_status | int |  | 项目管理单据状态 (pmbillstatus) |  | -1=自由态; |