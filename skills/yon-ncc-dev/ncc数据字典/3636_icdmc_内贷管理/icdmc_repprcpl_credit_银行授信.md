# |<<

**银行授信 (icdmc_repprcpl_credit / nc.vo.icdmc.icdmc.repayprcpl.RepayPrcplCreditVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3062.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repprcpl_credit_c | 主键 | pk_repprcpl_credit_c | char(20) | √ | 主键 (UFID) |
| 2 | pk_ccprotocol | 授信协议 | pk_ccprotocol | varchar(20) |  | 银行授信协议 (bankprotocol) |
| 3 | pk_creditbank | 授信银行 | pk_creditbank | varchar(20) |  | 银行档案 (bankdoc) |
| 4 | protocoltype | 授信类型 | protocoltype | varchar(50) |  | 授信类型 (AuthTypeEnum) |  | GROUP=集团授信; |