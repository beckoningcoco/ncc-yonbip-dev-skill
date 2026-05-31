# |<<

**BOM正向查询 (bd_querybom / nc.vo.bd.bom.query.BomQueryHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/947.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cquerybomid | BOM查询 | cquerybomid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 使用组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 使用组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | cquerystyle | 查询方式 | cquerystyle | varchar(50) |  | BOM查询方式 (enum) |  | first=单级正查; |