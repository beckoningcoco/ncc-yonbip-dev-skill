# |<<

**作业计算结果 (cca_jobcalculate / nc.vo.cca.jobcalculate.JobCalculateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1283.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_jobcalculate | 作业计算结果主键 | pk_jobcalculate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_costcenter | 成本中心 | pk_costcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 6 | pk_accbook | 核算账簿 | pk_accbook | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 7 | pk_activity | 作业 | pk_activity | varchar(20) |  | 作业档案 (bd_activity) |
| 8 | pricetype | 价格类型 | pricetype | int |  | 作业价格类型 (ActPriceTypeEnum) |  | 1=计划价; |