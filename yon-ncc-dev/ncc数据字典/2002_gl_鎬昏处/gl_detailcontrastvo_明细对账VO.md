# |<<

**明细对账VO (gl_detailcontrastvo / nc.vo.gl.contrast.DetailContrastVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2404.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrastdetail | 明细对账分录标识 | pk_contrastdetail | char(20) | √ | 主键 (UFID) |
| 2 | no | 序号 | no | int |  | 整数 (Integer) |
| 3 | amountequal | 金额两清 | amountequal | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | quantityequal | 数量两清 | quantityequal | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | voucherdate | 制单日期 | voucherdate | char(19) |  | 日期 (UFDate) |
| 6 | explanation | 摘要 | explanation | varchar(50) |  | 字符串 (String) |
| 7 | vouchertype | 凭证类型 | vouchertype | varchar(50) |  | 字符串 (String) |
| 8 | voucherno | 凭证号 | voucherno | varchar(50) |  | 字符串 (String) |
| 9 | subjcode | 科目编码 | subjcode | varchar(50) |  | 字符串 (String) |
| 10 | subjname | 科目名称 | subjname | varchar(50) |  | 字符串 (String) |
| 11 | currtype | 币种 | currtype | varchar(50) |  | 字符串 (String) |
| 12 | debitquantity | 借方数量 | debitquantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | debitamount | 借方原币 | debitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | debitorgamount | 借方账簿本币 | debitorgamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | debitgroupamount | 借方集团本币 | debitgroupamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | debitglobalamount | 借方全局本币 | debitglobalamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | creditquantity | 贷方数量 | creditquantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | creditamount | 贷方原币 | creditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | creditorgamount | 贷方账簿本币 | creditorgamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | creditgroupamount | 贷方集团本币 | creditgroupamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | creditglobalamount | 贷方全局本币 | creditglobalamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | batchno | 批次号 | batchno | varchar(50) |  | 字符串 (String) |
| 23 | contrastperiod | 对账期间 | contrastperiod | varchar(50) |  | 字符串 (String) |
| 24 | pk_contrast | 对账标识 | pk_contrast | char(20) |  | 主键 (UFID) |
| 25 | checkno | 结算号 | checkno | varchar(50) |  | 字符串 (String) |
| 26 | checkstyle | 结算方式 | checkstyle | varchar(20) |  | 结算方式 (balatype) |
| 27 | checkdate | 结算日期 | checkdate | varchar(50) |  | 字符串 (String) |
| 28 | isinit | 是否期初 | isinit | char(1) |  | 布尔类型 (UFBoolean) |
| 29 | pk_accasoa | 科目主键 | pk_accasoa | char(20) |  | 主键 (UFID) |
| 30 | pk_assid | 辅助核算ID | pk_assid | char(20) |  | 主键 (UFID) |
| 31 | assshowname | 辅助核算显示名称 | assshowname | varchar(50) |  | 字符串 (String) |
| 32 | bself | 是否本方 | bself | char(1) |  | 布尔类型 (UFBoolean) |
| 33 | typevalue | 档案类型值 | typevalue | varchar(50) |  | 字符串 (String) |
| 34 | innerbusno | 内部交易协同号 | innerbusno | varchar(50) |  | 字符串 (String) |