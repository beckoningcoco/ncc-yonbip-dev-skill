# |<<

**组织分类编制 (hrp_orgbudget_sub / nc.vo.hrp.psnorgbudget.OrgBudgetSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2743.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_org_budget_sub | 组织分类编制主健 | pk_org_budget_sub | char(20) | √ | 主键 (UFID) |
| 2 | pk_org_budget | 组织编制主键 | pk_org_budget | char(20) |  | 主键 (UFID) |
| 3 | pk_dimensiondef | 分类方式 | pk_dimensiondef | varchar(20) |  | 编制维度子表 (DimensionDef) |
| 4 | budget_includesub | 含下级业务单元计划编制 | budget_includesub | int |  | 整数 (Integer) |
| 5 | budget_self | 本业务单元计划编制 | budget_self | int |  | 整数 (Integer) |
| 6 | budget_includeact | 含下级业务单元实际编制 | budget_includeact | int |  | 整数 (Integer) |
| 7 | budget_actual | 本业务单元实际编制 | budget_actual | int |  | 整数 (Integer) |
| 8 | budget_leftover | 本业务单元超（缺）编人数 | budget_leftover | int |  | 整数 (Integer) |
| 9 | crictrl_flag | 是否严格控制 | crictrl_flag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 10 | pk_add_org | 增加编织分类的组织 | pk_add_org | varchar(20) |  | 组织 (org) |
| 11 | remark | 备注 | remark | varchar(512) |  | 字符串 (String) |