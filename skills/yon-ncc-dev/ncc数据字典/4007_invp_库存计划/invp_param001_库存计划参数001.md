# |<<

**库存计划参数001 (invp_param001 / nc.vo.invp.pub.Entity.Invp001VO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3140.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invp001 | 参数主键 | pk_invp001 | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | fcycle | 时格 | fcycle | int |  | 计划周期 (PlanPriod) |  | 1=日; |