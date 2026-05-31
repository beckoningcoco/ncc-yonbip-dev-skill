# |<<

**下拨单回单 (sf_allocatereceipt / nc.vo.sf.allocatereceipt.AllocateReceiptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5255.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allocatereceipt | 下拨单回单标识 | pk_allocatereceipt | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtype | 单据类型编码 | pk_billtype | varchar(20) |  | 字符串 (String) |
| 3 | pk_billtypeid | 单据类型 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 4 | vbillno | 下拨回单号 | vbillno | varchar(50) |  | 字符串 (String) |
| 5 | busitype | 交易类型 | busitype | int |  | 交易类型 (busitype) |  | 1=集团下拨; |