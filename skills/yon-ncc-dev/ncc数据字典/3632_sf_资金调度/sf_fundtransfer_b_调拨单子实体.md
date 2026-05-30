# |<<

**调拨单子实体 (sf_fundtransfer_b / nc.vo.sf.fundtransfer.FundTransferBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5267.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundtransfer_b | 调拨单子实体标识 | pk_fundtransfer_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_srcbill_b | 来源单据表体主键 | pk_srcbill_b | varchar(50) |  | 字符串 (String) |
| 3 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 4 | fundtype | 货币形态 | fundtype | varchar(20) |  | 资金类型(自定义档案) (Defdoc-BD005_0xx) |
| 5 | pk_org_p | 付款单位 | pk_org_p | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_org_p_v | 付款单位版本 | pk_org_p_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | pk_accid_p | 付款单位内部账户 | pk_accid_p | varchar(20) |  | 内部账户 (bd_accid) |
| 8 | pk_bankacc_p | 付款银行账户 | pk_bankacc_p | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 9 | bankname_p | 付款银行 | bankname_p | varchar(20) |  | 银行档案 (bankdoc) |
| 10 | isnetpay | 网银支付 | isnetpay | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | paytype | 汇款速度 | paytype | varchar(50) |  | 汇款速度 (pay_type) |  | 0=普通; |