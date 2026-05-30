# |<<

**银行授信 (cdmc_repprcpl_credit / nc.vo.cdmc.cdm.repayprcpl.RepayPrcplCreditVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1401.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repprcpl_credit | 主键 | pk_repprcpl_credit | char(20) | √ | 主键 (UFID) |
| 2 | pk_repayprcpl | 还本主表主键 | pk_repayprcpl | char(20) |  | 主键 (UFID) |
| 3 | pk_financepay_b | 放款编号 | pk_financepay_b | varchar(20) |  | 贷款放款 (FinancepayVO) |
| 4 | pk_ccprotocol | 授信协议 | pk_ccprotocol | varchar(20) |  | 银行授信协议 (bankprotocol) |
| 5 | pk_creditbank | 授信银行 | pk_creditbank | varchar(20) |  | 银行档案 (bankdoc) |
| 6 | protocoltype | 授信类型 | protocoltype | varchar(50) |  | 授信类型 (AuthTypeEnum) |  | GROUP=集团授信; |