# |<<

**结算费用分摊明细 (po_settle_feeallot / nc.vo.pu.m27.entity.SettleFeeAllotDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4633.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settle_feeallot | 费用分摊明细 | pk_settle_feeallot | char(20) | √ | 主键 (UFID) |
| 2 | pk_settlebill | 结算单头 | pk_settlebill | char(20) |  | 主键 (UFID) |
| 3 | pk_srcmaterial | 费用物料 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | pk_material | 费用物料版本 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | vallotbilltype | 费用分摊依据的单据类型 | vallotbilltype | varchar(4) |  | 字符串 (String) |
| 6 | pk_allotbillid | 分摊的单据 | pk_allotbillid | varchar(20) |  | 主键 (UFID) |
| 7 | pk_allotbillbid | 分摊的单据行 | pk_allotbillbid | varchar(20) |  | 主键 (UFID) |
| 8 | nallotbillnum | 分摊的依据数量 | nallotbillnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nallotbillmny | 分摊的依据金额 | nallotbillmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nallotmoney | 费用分摊金额 | nallotmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | norigmny | 费用分摊原币金额 | norigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nnosubmny | 费用分摊不可抵扣金额 | nnosubmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | pk_origcurrid | 原币币种 | pk_origcurrid | varchar(20) |  | 币种 (currtype) |
| 14 | bestfirstsettle | 是否暂估费用物料的第一次结算 | bestfirstsettle | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | ntimesafterfirst | 第一次结算的后续累计费用结算次数 | ntimesafterfirst | int |  | 整数 (Integer) |
| 16 | pk_oppofee_b | 相应的费用所在的结算行 | pk_oppofee_b | char(20) |  | 主键 (UFID) |
| 17 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 主键 (UFID) |