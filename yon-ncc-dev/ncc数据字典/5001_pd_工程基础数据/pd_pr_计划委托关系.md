# |<<

**计划委托关系 (pd_pr / nc.vo.pd.planrelation.entity.PlanRelationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4369.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pr | 计划委托关系 | pk_pr | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划中心最新版本 | pk_org | varchar(20) |  | 组织_业务单元_计划中心 (plancenter) |
| 4 | pk_org_v | 计划中心 | pk_org_v | varchar(20) |  | 组织_业务单元_计划中心版本信息 (plancenter_v) |
| 5 | relationtype | 委托关系类型 | relationtype | int |  | 委托关系类型 (RelationTypeEnum) |  | 1=计划委托关系; |