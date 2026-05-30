# |<<

**物料仓库信息 (bd_materialwarh / nc.vo.bd.material.stock.MaterialWarhVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/910.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialwarh | 物料仓库信息主键 | pk_materialwarh | char(20) | √ | 主键 (UFID) |
| 2 | pk_materialstock | 物料库存信息主键 | pk_materialstock | char(20) | √ | 物料库存信息 (materialstock) |
| 3 | pk_material | 物料基本信息主键 | pk_material | char(20) | √ | 物料基本信息（多版本） (material) |
| 4 | pk_org | 所属库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 5 | pk_stordoc | 所属仓库 | pk_stordoc | char(20) | √ | 仓库 (stordoc) |
| 6 | safetystocknum | 安全库存 | safetystocknum | decimal(20, 8) |  | 数值 (UFDouble) |
| 7 | reorderpoint | 再订货点 | reorderpoint | decimal(20, 8) |  | 数值 (UFDouble) |
| 8 | maxstornum | 最高库存 | maxstornum | decimal(20, 8) |  | 数值 (UFDouble) |
| 9 | lowstocknum | 最低库存 | lowstocknum | decimal(20, 8) |  | 数值 (UFDouble) |
| 10 | economicbatch | 经济批量 | economicbatch | decimal(20, 8) |  | 数值 (UFDouble) |
| 11 | primnessnum | 最大周转天数 | primnessnum | int |  | 整数 (Integer) |
| 12 | countperiod | 盘点周期 | countperiod | int |  | 整数 (Integer) |
| 13 | lastcounttime | 上次周期盘点时间 | lastcounttime | char(19) |  | 日期 (UFDate) |
| 14 | dataoriginflag | 分布式 | dataoriginflag | smallint |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |