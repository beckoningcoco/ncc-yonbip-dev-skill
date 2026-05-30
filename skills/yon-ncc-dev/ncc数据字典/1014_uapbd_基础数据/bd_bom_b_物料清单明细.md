# |<<

**物料清单明细 (bd_bom_b / nc.vo.bd.bom.bom0202.entity.BomItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/371.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbom_bid | 物料清单明细 | cbom_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | vrowno | 行号 | vrowno | varchar(50) |  | 字符串 (String) |
| 6 | fitemtype | 子项类型 | fitemtype | int |  | 子项类型 (itemtype) |  | 1=普通; |