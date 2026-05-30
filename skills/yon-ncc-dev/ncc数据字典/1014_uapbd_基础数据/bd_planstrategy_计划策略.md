# |<<

**计划策略 (bd_planstrategy / nc.vo.mmbd.pst.entity.PlanStrategyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/925.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pst | 主键 | pk_pst | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | code | 计划策略编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 计划策略名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | fplanpurpose | 计划目的 | fplanpurpose | varchar(50) |  | 计划目的 (PlanPurposeEnum) |  | 0=生产; |