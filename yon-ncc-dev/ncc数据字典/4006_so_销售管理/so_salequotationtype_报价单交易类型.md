# |<<

**报价单交易类型 (so_salequotationtype / nc.vo.so.m4310trantype.entity.M4310TranTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5439.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trantype | 主键 | pk_trantype | char(20) | √ | 主键 (UFID) |
| 2 | ctrantypeid | 报价单交易类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 3 | vtrantype | 报价单交易类型编码 | vtrantype | varchar(50) |  | 字符串 (String) |
| 4 | fsourceflag | 报价数据来源 | fsourceflag | varchar(50) | √ | 报价数据来源 (SalequoDataSource) |  | 0=不取价; |