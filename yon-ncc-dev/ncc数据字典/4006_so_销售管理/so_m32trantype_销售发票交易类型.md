# |<<

**销售发票交易类型 (so_m32trantype / nc.vo.so.m32trantype.entity.M32TranTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5417.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trantype | 发票交易类型主键 | pk_trantype | char(20) | √ | 主键 (UFID) |
| 2 | ctrantypeid | 交易类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 5 | fadjuster | 调整金额时影响折扣还是单价 | fadjuster | int | √ | 调整项 (Adjuster) | 0 | 0=调整折扣; |