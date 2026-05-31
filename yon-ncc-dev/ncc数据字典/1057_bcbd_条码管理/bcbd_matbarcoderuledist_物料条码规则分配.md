# |<<

**物料条码规则分配 (bcbd_matbarcoderuledist / nc.vo.bcbd.barcoderuledist.MatBCRuleDistributionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/267.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_matruledist | 物料条码规则分配主键 | pk_matruledist | char(20) | √ | 主键 (UFID) |
| 2 | pk_matbasclass | 物料基本分类主键 | pk_matbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 3 | cmaterialvid | 物料(多版本) | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 4 | cmaterialoid | 物料 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | matbarcoderule | 物料条码规则(多版本) | matbarcoderule | varchar(20) |  | 条码规则(多版本) (barcoderule) |
| 6 | matbarcoderule_v | 物料条码规则 | matbarcoderule_v | varchar(20) | √ | 条码规则 (barcoderule_v) |
| 7 | isdefault | 默认 | isdefault | char(1) | √ | 布尔类型 (UFBoolean) | N |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 10 | dataoriginflag | 分布式 | dataoriginflag | varchar(50) |  | 数据来源 (dataorigin) |  | 0=本级产生; |