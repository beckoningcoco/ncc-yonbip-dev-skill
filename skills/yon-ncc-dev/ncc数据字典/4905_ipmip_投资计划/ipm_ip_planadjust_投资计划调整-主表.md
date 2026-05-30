# |<<

**投资计划调整-主表 (ipm_ip_planadjust / nc.vo.ipmip.planadjust.PlanAdjustHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3183.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_planadjust | 投资计划调整主键 | pk_planadjust | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 计划调整编码 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | plan_name | 计划名称 | plan_name | varchar(255) |  | 字符串 (String) |
| 7 | vyear | 年度 | vyear | varchar(20) |  | 字符串 (String) |
| 8 | vquarter | 季度 | vquarter | varchar(50) |  | 季度 (ipmQuarter) |  | 1=一季度; |