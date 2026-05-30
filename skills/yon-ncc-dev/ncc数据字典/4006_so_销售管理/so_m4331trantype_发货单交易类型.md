# |<<

**发货单交易类型 (so_m4331trantype / nc.vo.so.m4331trantype.entity.M4331trantypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5420.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trantype | 发货单交易类型 | pk_trantype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 4 | bonceoutflag | 只一次出库 | bonceoutflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | ctrantypeid | 交易类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |