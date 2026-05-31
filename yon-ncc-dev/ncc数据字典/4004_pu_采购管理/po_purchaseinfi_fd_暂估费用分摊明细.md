# |<<

**暂估费用分摊明细 (po_purchaseinfi_fd / nc.vo.pu.m4201.entity.PurchaseinFIFDVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4628.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stockps_fd | 暂估费用分摊明细 | pk_stockps_fd | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtype | 分摊依据单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 3 | pk_distbybill | 分摊依据单据 | pk_distbybill | varchar(20) |  | 主键 (UFID) |
| 4 | pk_distbybill_b | 分摊依据单据行 | pk_distbybill_b | varchar(20) |  | 主键 (UFID) |
| 5 | ndistbynum | 分摊依据数量 | ndistbynum | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | ndistbymny | 分摊依据金额 | ndistbymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | ndistmny | 分摊金额 | ndistmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | pk_iasrc_b | 传成本标识 | pk_iasrc_b | varchar(20) |  | 主键 (UFID) |