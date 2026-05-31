# |<<

**开发者实体 (aam_developer / nc.vo.ncaam.developer.DeveloperVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_developer | 开发者主键 | pk_developer | char(20) | √ | 主键 (UFID) |
| 2 | developercode | 开发者编码 | developercode | varchar(50) | √ | 字符串 (String) |
| 3 | developername | 开发者名称 | developername | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | assetlayer | 所属层次 | assetlayer | varchar(50) | √ | 应用资产层次 (AppAssetLayerEnum) |  | -1=平台级; |