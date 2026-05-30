# |<<

**应付运费发票交易类型属性 (dm_m4812trantype / nc.vo.dm.m4812trantype.entity.M4812TranTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1733.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trantype | 应付运费发票交易类型属性 | pk_trantype | char(20) | √ | 主键 (UFID) |
| 2 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | bcostflag | 影响采购成本 | bcostflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | ctrantypeid | 交易类型 | ctrantypeid | varchar(20) | √ | 单据类型 (BilltypeVO) |