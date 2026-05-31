# |<<

**盘点单明细 (fa_inventory_b / nc.vo.fa.inventory.InventoryBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2031.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inventory_b | 盘点单明细表主键 | pk_inventory_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_card | 资产卡片 | pk_card | varchar(20) |  | 资产卡片 (asset) |
| 6 | card_code | 卡片编号 | card_code | varchar(40) |  | 字符串 (String) |
| 7 | asset_code | 资产编码 | asset_code | varchar(40) |  | 字符串 (String) |
| 8 | asset_name | 资产名称 | asset_name | varchar(400) |  | 字符串 (String) |
| 9 | pk_category | 资产类别 | pk_category | varchar(20) |  | 资产类别 (assetcategory) |
| 10 | bar_code | 条形码 | bar_code | varchar(80) |  | 字符串 (String) |
| 11 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 12 | model | 型号 | model | varchar(400) |  | 字符串 (String) |
| 13 | check_result | 盘点结果 | check_result | int |  | 盘点结果 (check_result) |  | 0=相符; |