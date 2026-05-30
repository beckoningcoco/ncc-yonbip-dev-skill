# |<<

**计划作业量 (cca_planworkload / nc.vo.cca.planworkload.PlanWorkloadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1292.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_planworkload | 计划作业量主键 | pk_planworkload | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 业务单元版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_wk | 工作中心 | pk_wk | varchar(20) |  | 工作中心 (bd_wk) |
| 6 | pk_dept | 部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 7 | pk_material | 产品 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | pk_costcenter | 成本中心 | pk_costcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 9 | pk_activity | 作业 | pk_activity | varchar(20) |  | 作业档案 (bd_activity) |
| 10 | workload | 作业量 | workload | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | realworkload | 实际作业量 | realworkload | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | pk_accperiod | 会计期间 | pk_accperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 13 | source | 来源 | source | int |  | 来源类型 (SourceTypeEnum) |  | 1=手工录入; |