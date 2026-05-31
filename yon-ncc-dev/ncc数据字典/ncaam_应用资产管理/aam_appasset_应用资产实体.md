# |<<

**应用资产实体 (aam_appasset / nc.vo.ncaam.appasset.AppAssetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_asset | 资产主键 | pk_asset | char(20) | √ | 主键 (UFID) |
| 2 | assetcode | 资产编码 | assetcode | varchar(50) | √ | 字符串 (String) |
| 3 | assetname | 资产名称 | assetname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | assetdesc | 资产描述 | assetdesc | varchar(1024) |  | 备注 (Memo) |
| 5 | pk_assettype | 资产类型 | pk_assettype | char(20) | √ | 应用资产类型 (assettype) |
| 6 | dataid | 对应资产 | dataid | varchar(50) | √ | 字符串 (String) |
| 7 | dataidname | 对应资产名称 | dataidname | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | assetlayer | 资产层次 | assetlayer | varchar(50) | √ | 应用资产层次 (AppAssetLayerEnum) |  | -1=平台级; |