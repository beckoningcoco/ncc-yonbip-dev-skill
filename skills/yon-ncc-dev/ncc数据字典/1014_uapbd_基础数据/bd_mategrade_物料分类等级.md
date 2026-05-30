# |<<

**物料分类等级 (bd_mategrade / nc.vo.bd.supplier.supplyabilityset.MaterialgradeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/886.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mategrade | 子表主键 | pk_mategrade | char(20) | √ | 主键 (UFID) |
| 2 | pk_material | 物料分类编码 | pk_material | varchar(20) |  | 物料基本分类 (marbasclass) |
| 3 | pk_supgadesys | 物料分类等级 | pk_supgadesys | varchar(20) |  | 等级信息 (supplier_grade) |
| 4 | modifiedtype | 变更来源 | modifiedtype | varchar(50) |  | 变更来源 (enum) |  | 1=评估报告; |