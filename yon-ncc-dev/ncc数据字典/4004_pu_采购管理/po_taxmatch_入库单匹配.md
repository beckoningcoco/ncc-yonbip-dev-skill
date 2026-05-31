# |<<

**入库单匹配 (po_taxmatch / nccloud.vo.pu.taxinvoice.match.entity.TaxMatchVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4640.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taxmatch | 主键 | pk_taxmatch | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 收票组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_taxinvoice | 进项发票主键 | pk_taxinvoice | varchar(20) |  | 字符串 (String) |
| 5 | pk_taxinvoice_b | 进项发票子表主键 | pk_taxinvoice_b | varchar(20) |  | 字符串 (String) |
| 6 | vinvcode | 发票代码 | vinvcode | varchar(20) |  | 字符串 (String) |
| 7 | vinvnum | 发票号码 | vinvnum | varchar(20) |  | 字符串 (String) |
| 8 | cgenerallid | 采购入库单主键 | cgenerallid | varchar(20) |  | 字符串 (String) |
| 9 | cgeneralbid | 采购入库单子表主键 | cgeneralbid | varchar(20) |  | 字符串 (String) |
| 10 | vstockbillcode | 采购入库单单据号 | vstockbillcode | varchar(40) |  | 字符串 (String) |
| 11 | pk_invoice | 采购发票主键 | pk_invoice | varchar(20) |  | 字符串 (String) |
| 12 | pk_invoice_b | 采购发票主表主键 | pk_invoice_b | varchar(20) |  | 字符串 (String) |
| 13 | vinvoicebillcode | 采购发票单据号 | vinvoicebillcode | varchar(40) |  | 字符串 (String) |
| 14 | nmatchnum | 本次匹配数量 | nmatchnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nprice | 无税单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nmatchmny | 本次匹配金额 | nmatchmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nreasonwastenum | 合理损耗数量 | nreasonwastenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 19 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) | 0 |
| 20 | saga_gtxid | 全局事务id | saga_gtxid | varchar(64) |  | 字符串 (String) |
| 21 | saga_btxid | 子事务id | saga_btxid | varchar(64) |  | 字符串 (String) |
| 22 | saga_status | 事务状态 | saga_status | int |  | 整数 (Integer) | 0 |