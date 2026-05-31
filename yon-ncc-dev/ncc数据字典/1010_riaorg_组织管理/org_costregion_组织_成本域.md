# |<<

**组织_成本域 (org_costregion / nc.vo.corg.CostRegionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4032.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costregion | 成本域主键 | pk_costregion | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 3 | code | 编码 | code | varchar(40) | √ | 字符串 (String) |
| 4 | shortname | 简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 6 | layertype | 对应层级 | layertype | int | √ | 层级 (level) | 0 | 0=财务组织; |