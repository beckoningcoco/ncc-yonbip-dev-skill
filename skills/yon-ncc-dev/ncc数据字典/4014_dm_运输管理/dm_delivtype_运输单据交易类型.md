# |<<

**运输单据交易类型 (dm_delivtype / nc.vo.dm.m4804trantype.entity.M4804TranTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1722.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trantype | 运输类型主键 | pk_trantype | char(20) | √ | 主键 (UFID) |
| 2 | vtrantypecode | 运输类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 3 | bcanselfmadeflag | 支持自制 | bcanselfmadeflag | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | bcalculateapfeeflag | 进行应付运费计算 | bcalculateapfeeflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | barfeeflag | 应收运费 | barfeeflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | bcalculatearfeeflag | 进行应收运费计算 | bcalculatearfeeflag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | fallocatescopeflag | 运费分摊目标 | fallocatescopeflag | smallint |  | 运费分摊目标 (FAllocateScopeFlag) | 0 | 0=货物行; |