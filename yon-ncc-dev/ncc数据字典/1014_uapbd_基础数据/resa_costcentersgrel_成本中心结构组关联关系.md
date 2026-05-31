# |<<

**成本中心结构组关联关系 (resa_costcentersgrel / nc.vo.resa.ccsgrelation.CostCenterSGRel)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4894.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relation | 关联关系标识 | pk_relation | char(20) | √ | 主键 (UFID) |
| 2 | pk_ccgroup | id_reference0 | pk_ccgroup | varchar(20) |  | 成本中心组 (costcentergroup) |