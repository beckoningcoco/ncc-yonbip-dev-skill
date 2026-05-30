# |<<

**调入申请交易类型 (to_m5atrantype / nc.vo.to.m5atrantype.entity.M5aTranTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5798.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trantype | 调入申请交易类型 | pk_trantype | char(20) | √ | 主键 (UFID) |
| 2 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | baskpriceflag | 是否询价 | baskpriceflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | bdisposeflag | 是否只能处理一次 | bdisposeflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | bdirectflag | 是否直运 | bdirectflag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | ctrantypeid | 交易类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |