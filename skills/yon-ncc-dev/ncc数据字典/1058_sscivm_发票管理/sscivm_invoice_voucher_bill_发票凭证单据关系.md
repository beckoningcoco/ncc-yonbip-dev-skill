# |<<

**发票凭证单据关系 (sscivm_invoice_voucher_bill / nc.vo.sscivm.invoice.IVMInvoiceVoucherBillVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5552.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice_voucher_bill | 主键 | pk_invoice_voucher_bill | char(20) | √ | 主键 (UFID) |
| 2 | pk_invoice | 发票主键 | pk_invoice | varchar(20) |  | 字符串 (String) |
| 3 | billid | 单据主键 | billid | varchar(20) |  | 字符串 (String) |
| 4 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 5 | pk_tradetype | 交易类型 | pk_tradetype | varchar(20) |  | 交易类型 (transtype) |
| 6 | voucherno | 凭证号 | voucherno | varchar(50) |  | 字符串 (String) |
| 7 | voucherid | 凭证主键 | voucherid | varchar(20) |  | 字符串 (String) |
| 8 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |