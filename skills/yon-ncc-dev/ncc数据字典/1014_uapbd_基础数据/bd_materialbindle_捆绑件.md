# |<<

**捆绑件 (bd_materialbindle / nc.vo.bd.material.sale.MaterialBindleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/891.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialbindle | 捆绑件主键 | pk_materialbindle | char(20) | √ | 主键 (UFID) |
| 2 | pk_materialsale | 物料销售信息主键 | pk_materialsale | char(20) | √ | 物料销售信息 (materialsale) |
| 3 | pk_org | 所属销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 4 | pk_bindle | 捆绑物料 | pk_bindle | char(20) | √ | 物料基本信息（多版本） (material) |
| 5 | bindlenum | 捆绑数量 | bindlenum | int | √ | 整数 (Integer) |  | [1 , ] |
| 6 | pricetype | 计价方式 | pricetype | smallint | √ | 计价方式 (pricetype) |  | 0=使用捆绑价; |