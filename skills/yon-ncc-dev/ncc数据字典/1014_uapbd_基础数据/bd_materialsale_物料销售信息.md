# |<<

**物料销售信息 (bd_materialsale / nc.vo.bd.material.sale.MaterialSaleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/906.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialsale | 物料销售信息主键 | pk_materialsale | char(20) | √ | 主键 (UFID) |
| 2 | pk_material | 物料基本信息主键 | pk_material | char(20) | √ | 物料基本信息（多版本） (material) |
| 3 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 所属销售组织 | pk_org | char(20) | √ | 组织_业务单元_销售组织 (salesorg) |
| 5 | pk_marsaleclass | 销售分类 | pk_marsaleclass | varchar(20) |  | 物料销售分类 (marsaleclass) |
| 6 | isappendant | 附属品 | isappendant | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | minprice | 最低售价 | minprice | decimal(20, 10) |  | 数值 (UFDouble) |
| 8 | resaleprice | 参考售价 | resaleprice | decimal(20, 8) |  | 数值 (UFDouble) |
| 9 | dataoriginflag | 分布式 | dataoriginflag | smallint |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |