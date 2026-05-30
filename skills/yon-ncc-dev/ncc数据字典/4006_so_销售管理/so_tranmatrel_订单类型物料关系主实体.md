# |<<

**订单类型物料关系主实体 (so_tranmatrel / nc.vo.so.tranmatrel.entity.TranMatRelHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5449.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tranmatrel | 主实体主键 | pk_tranmatrel | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 3 | pk_org_v | 销售组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_销售组织版本信息 (salesorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | allowsale | 允许销售 | allowsale | int |  | 允许销售 (allowsale) |  | 1=允许销售; |