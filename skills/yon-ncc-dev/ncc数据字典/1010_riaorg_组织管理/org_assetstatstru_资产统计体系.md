# |<<

**资产统计体系 (org_assetstatstru / nc.vo.corg.AssetStatStruVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3997.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assetstatstru | 资产统计体系主键 | pk_assetstatstru | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | shortname | 简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 6 | orgattr | 组织属性 | orgattr | int | √ | 资产统计体系组织属性 (assorgattr) |  | 0=货主管理组织; |