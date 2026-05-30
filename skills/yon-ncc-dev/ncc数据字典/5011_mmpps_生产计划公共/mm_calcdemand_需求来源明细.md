# |<<

**需求来源明细 (mm_calcdemand / nc.vo.mmpps.calc.entity.calculate.DemandVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3641.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cppsdemandid | 需求来源明细 | cppsdemandid | varchar(36) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | fdemandtype | 需求类型 | fdemandtype | int |  | 需求类型 (DemandType) |  | 0=销售订单; |