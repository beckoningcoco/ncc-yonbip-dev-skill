# |<<

**调整明细子表 (rlm_balancepay_adjust / nc.vo.rlm.balancepay.BalancePayAdjustVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4921.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balancepay_adjust | 调整明细子表主键 | pk_balancepay_adjust | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 承租组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 承租组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_contract_v | 合同编码 | pk_contract_v | varchar(20) |  | 周转材租入合同 (ContractHeadVO) |
| 7 | pk_contract_base | 租入合同原版主键 | pk_contract_base | varchar(20) |  | 周转材租入合同 (ContractHeadVO) |
| 8 | src_bill_code | 调整单号 | src_bill_code | varchar(40) |  | 字符串 (String) |
| 9 | pk_marbaseclass | 物料分类 | pk_marbaseclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 10 | pk_material_v | 物料 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 11 | pk_material | 物料最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 12 | pk_rent_unit | 报价单位 | pk_rent_unit | varchar(20) |  | 计量单位 (measdoc) |
| 13 | adjust_num | 调整报价数量 | adjust_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | pk_currency_origin | 原币 | pk_currency_origin | varchar(20) |  | 币种 (currtype) |
| 15 | origin_rate | 汇率 | origin_rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | adjust_price | 调整单价(原币) | adjust_price | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | adjustmoney | 调整金额(原币) | adjustmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | adjustmoney_org | 调整金额(本币) | adjustmoney_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | adjustmoney_group | 调整金额(集团) | adjustmoney_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | adjustmoney_global | 调整金额(全局) | adjustmoney_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 22 | src_pk_bill | 来源单据主键 | src_pk_bill | varchar(20) |  | 字符串 (String) |
| 23 | src_bill_type | 来源单据类型 | src_bill_type | varchar(20) |  | 字符串 (String) |
| 24 | src_transi_type | 来源单据交易类型 | src_transi_type | varchar(20) |  | 字符串 (String) |
| 25 | src_pk_bill_b | 来源单据表体主键 | src_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 26 | src_body_rowno | 来源单据表体行号 | src_body_rowno | varchar(30) |  | 字符串 (String) |
| 27 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |