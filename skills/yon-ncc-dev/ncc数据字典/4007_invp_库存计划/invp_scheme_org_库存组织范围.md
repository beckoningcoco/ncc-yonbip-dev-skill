# |<<

**库存组织范围 (invp_scheme_org / nc.vo.invp.plan.entity.PlanSchemeOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3148.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scheme_org | 主键 | pk_scheme_org | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 主组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_org_v | 主组织编码 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_stockorg | 库存组织 | pk_stockorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 6 | pk_stockorg_v | 库存组织编码 | pk_stockorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |