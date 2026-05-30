# |<<

**需求范围 (mm_demandscope / nc.vo.mmpps.calc.entity.demandscope.DemandScopeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3653.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cdemandscopeid | 需求范围主键 | cdemandscopeid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_demandorg | 需求库存组织最新版本 | pk_demandorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 6 | pk_demandorg_v | 需求库存组织 | pk_demandorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 7 | fdemandtype | 需求来源 | fdemandtype | int |  | 需求类型 (DemandType) |  | 0=销售订单; |