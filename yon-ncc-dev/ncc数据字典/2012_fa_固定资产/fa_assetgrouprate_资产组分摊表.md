# |<<

**资产组分摊表 (fa_assetgrouprate / nc.vo.fa.assetgroup.AssetGroupRateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1992.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assetgrouprate | 资产组分摊主键 | pk_assetgrouprate | char(20) | √ | 主键 (UFID) |
| 2 | pk_assetgroup | 资产组主键 | pk_assetgroup | varchar(50) |  | 字符串 (String) |
| 3 | rate | 资产组比例 | rate | decimal(16, 6) |  | 数值 (UFDouble) |
| 4 | group_name | 资产组名称 | group_name | varchar(80) |  | 字符串 (String) |