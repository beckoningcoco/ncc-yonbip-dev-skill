# |<<

**资产组子表 (fa_assetgroup_b / nc.vo.fa.assetgroup.AssetGroupBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1991.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assetgroup_b | 资产组子表主键 | pk_assetgroup_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织编码 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | rate | 比例分摊% | rate | decimal(16, 6) |  | 数值 (UFDouble) |