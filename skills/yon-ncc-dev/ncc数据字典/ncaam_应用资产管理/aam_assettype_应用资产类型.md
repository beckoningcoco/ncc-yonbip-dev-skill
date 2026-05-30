# |<<

**应用资产类型 (aam_assettype / nc.vo.ncaam.appassettype.AppAssetTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assettype | 类型主键 | pk_assettype | char(20) | √ | 主键 (UFID) |
| 2 | assettypecode | 类型编码 | assettypecode | varchar(50) | √ | 字符串 (String) |
| 3 | assettypename | 类型名称 | assettypename | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | assettypedesc | 类型备注 | assettypedesc | varchar(1024) |  | 备注 (Memo) |
| 5 | processorclass | 类型处理类 | processorclass | varchar(512) | √ | 字符串 (String) |
| 6 | datakind | 数据种类 | datakind | varchar(50) |  | 数据种类 (DataKindEnum) |  | 1=元数据; |