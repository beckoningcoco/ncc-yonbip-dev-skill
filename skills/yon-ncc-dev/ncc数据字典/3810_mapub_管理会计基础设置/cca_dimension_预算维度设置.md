# |<<

**预算维度设置 (cca_dimension / nc.vo.mapub.dimension.DimensionHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1276.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dimension | 维度设置 | pk_dimension | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | product | 产品 | product | varchar(50) |  | 维度设置产品枚举 (DimProductEnum) |  | 1=系统维护; |