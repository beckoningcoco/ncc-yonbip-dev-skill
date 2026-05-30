# |<<

**单位编制 (hrp_orgbudget / nc.vo.hrp.psnorgbudget.OrgBudgetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2742.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_org_budget | 组织编制主键 | pk_org_budget | char(20) | √ | 主键 (UFID) |
| 2 | pk_hrorg | 所属HR组织 | pk_hrorg | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 3 | pk_fatherhrorg | 上级HR组织 | pk_fatherhrorg | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 4 | budget_year | 年度 | budget_year | char(4) |  | 字符串 (String) |
| 5 | pk_group | 集团主键 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 业务单元主键 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | budget_includesub | 含下级业务单元计划编制 | budget_includesub | int |  | 整数 (Integer) |
| 8 | budget_self | 本业务单元计划编制 | budget_self | int |  | 整数 (Integer) |
| 9 | budget_includeact | 含下级业务单元实际编制 | budget_includeact | int |  | 整数 (Integer) |
| 10 | budget_actual | 本业务单元实际编制 | budget_actual | int |  | 整数 (Integer) |
| 11 | budget_leftover | 本业务单元超（缺）编人数 | budget_leftover | int |  | 整数 (Integer) |
| 12 | budget_includefte | 含下级FTE | budget_includefte | decimal(16, 2) |  | 数值 (UFDouble) | 0.00 | [0 , ] |
| 13 | budget_fte | 计划FTE | budget_fte | decimal(16, 2) |  | 数值 (UFDouble) | 0.00 | [0 , ] |
| 14 | crictrl_flag | 是否严格控制 | crictrl_flag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 15 | pk_dimension | 分类方式 | pk_dimension | varchar(20) |  | 编制维度 (Dimension) |
| 16 | publish_state | 发布状态 | publish_state | int |  | 发布状态 (PublishState) | 0 | 0=未发布; |