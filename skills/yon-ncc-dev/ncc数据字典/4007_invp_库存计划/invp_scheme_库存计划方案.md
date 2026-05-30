# |<<

**库存计划方案 (invp_scheme / nc.vo.invp.plan.entity.PlanSchemeMainVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3146.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scheme | 方案主键 | pk_scheme | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | vcode | 库存计划方案编码 | vcode | varchar(50) |  | 字符串 (String) |
| 6 | vname | 库存计划方案名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | fmethod | 库存计划方法 | fmethod | int |  | 库存计划方法 (PlanMethodEnum) |  | 1=再订货点; |