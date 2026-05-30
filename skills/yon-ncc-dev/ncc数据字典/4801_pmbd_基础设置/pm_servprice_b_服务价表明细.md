# |<<

**服务价表明细 (pm_servprice_b / nc.vo.pmbd.servprice.ServPriceBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4532.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_servprice_b | 价表明细主键 | pk_servprice_b | varchar(20) | √ | 字符串 (String) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | rowno | 行号 | rowno | varchar(20) |  | 字符串 (String) |
| 5 | pk_material | 物资编码 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | meomo | 备注 | meomo | varchar(300) |  | 字符串 (String) |
| 7 | price | 无税单价 | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | taxprice | 含税单价 | taxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | pk_taxcode | 税码 | pk_taxcode | varchar(20) |  | 增值税税码税率 (taxcode) |
| 10 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | taxtype | 扣税类别 | taxtype | int |  | 扣税类别 (taxtype) | 1 | 1=应税外加; |