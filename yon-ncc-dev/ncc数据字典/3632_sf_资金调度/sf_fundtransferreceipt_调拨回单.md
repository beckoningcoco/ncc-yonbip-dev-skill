# |<<

**调拨回单 (sf_fundtransferreceipt / nc.vo.sf.fundtransferreceipt.FundtransferReceiptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5271.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundtransferreceipt | 调拨回单标识 | pk_fundtransferreceipt | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_billtype | 单据类型编码 | pk_billtype | varchar(20) |  | 字符串 (String) |
| 6 | pk_billtypeid | 单据类型 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | vbillno | 调拨回单号 | vbillno | varchar(50) |  | 字符串 (String) |
| 8 | busitype | 交易类型 | busitype | int |  | 交易类型 (busitype) |  | 1=集团调拨; |