# |<<

**买赠子表 (so_buylargess_b / nc.vo.so.mbuylargess.entity.BuyLargessBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5391.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_buylargess_b | 买赠子表id | pk_buylargess_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 3 | pk_measdoc | 单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 4 | nnum | 赠送数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | nprice | 单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | nmny | 金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | ftoplimittype | 上限类型 | ftoplimittype | int |  | 上限类型 (ftoplimittype) |  | 0=数量; |