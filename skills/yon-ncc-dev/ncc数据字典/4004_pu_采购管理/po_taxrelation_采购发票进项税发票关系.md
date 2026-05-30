# |<<

**采购发票进项税发票关系 (po_taxrelation / nc.vo.pu.m25.entity.InvoiceVtaxRelationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4641.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ctaxrelationid | 采购发票进项税发票关系主实体 | ctaxrelationid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 收票组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | vbillcode | 采购发票单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 5 | dbilldate | 采购发票单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 6 | pk_invoice | 采购发票主实体 | pk_invoice | char(20) |  | 主键 (UFID) |
| 7 | pk_invoice_b | 采购发票子实体 | pk_invoice_b | char(20) |  | 主键 (UFID) |
| 8 | cinvmatchid | 进项税发票匹配关系实体 | cinvmatchid | char(20) |  | 主键 (UFID) |
| 9 | crelationid | 业务关系单据主实体 | crelationid | char(20) |  | 主键 (UFID) |
| 10 | crelationbid | 业务关系单据子实体 | crelationbid | char(20) |  | 主键 (UFID) |
| 11 | ntax | 进项税发票行税额 | ntax | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nmny | 进项税发票行无税金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | ntaxmny | 进项税发票行价税合计 | ntaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | cbillid | 进项税发票主实体 | cbillid | char(20) |  | 主键 (UFID) |
| 15 | cbill_bid | 进项税发票子实体 | cbill_bid | char(20) |  | 主键 (UFID) |