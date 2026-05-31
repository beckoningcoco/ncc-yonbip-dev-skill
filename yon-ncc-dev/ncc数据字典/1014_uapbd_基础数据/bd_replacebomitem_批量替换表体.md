# |<<

**批量替换表体 (bd_replacebomitem / nc.vo.bd.bom.bom0212.entity.BomReplaceItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/958.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 批量替换表体 | id | char(20) | √ | 主键 (UFID) |
| 2 | cbomid | 物料清单 | cbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 3 | cbombid | 物料清单子项 | cbombid | varchar(20) |  | 物料清单明细 (bd_bom_b) |