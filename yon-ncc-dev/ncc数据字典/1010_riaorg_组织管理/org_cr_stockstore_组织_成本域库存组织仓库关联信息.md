# |<<

**组织_成本域库存组织仓库关联信息 (org_cr_stockstore / nc.vo.corg.CostRegionStockStoreVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4034.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rel | 关联信息 | pk_rel | char(20) | √ | 主键 (UFID) |
| 2 | pk_stockorg | 库存组织仓库层级库存组织 | pk_stockorg | char(20) | √ | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_storage | 库存组织仓库层级仓库 | pk_storage | char(20) | √ | 仓库 (stordoc) |
| 4 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |