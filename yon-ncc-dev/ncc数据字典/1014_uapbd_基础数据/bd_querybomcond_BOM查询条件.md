# |<<

**BOM查询条件 (bd_querybomcond / nc.vo.bd.bom.bom1204.BomQueryCondVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/949.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 2 | pk_org | 使用组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_org_v | 使用组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 4 | cquerystyle | 查询方式 | cquerystyle | varchar(50) |  | BOM查询方式 (enum) | first | first=单级正查; |