# |<<

**开票登记明细 (pm_providereg_b / nc.vo.pcm.provideregister.ProvideRegisterBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4520.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_providereg_b | 开票登记子表主键 | pk_providereg_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织版本信息 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | taxable | 应税项 | taxable | varchar(101) |  | 字符串 (String) |
| 7 | src_pk_bill | 收款申请 | src_pk_bill | varchar(20) |  | 收款申请 (income_plan) |
| 8 | src_bill_code | 来源单据号 | src_bill_code | varchar(50) |  | 字符串 (String) |
| 9 | src_bill_type | 来源单据类型 | src_bill_type | varchar(50) |  | 字符串 (String) |
| 10 | src_transi_type | 来源交易类型 | src_transi_type | varchar(50) |  | 字符串 (String) |
| 11 | src_bill_typeid | 来源单据类型id | src_bill_typeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 12 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 13 | mny | 发票金额 | mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 14 | mny_group | 发票金额(集团币) | mny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 15 | mny_global | 发票金额(全局币) | mny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 16 | taxcode | 税码 | taxcode | varchar(20) |  | 增值税税码税率 (taxcode) |
| 17 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 18 | tax | 发票税额 | tax | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 19 | taxmny | 发票价税合计 | taxmny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 20 | taxmny_group | 发票价税合计(集团币) | taxmny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 21 | taxmny_global | 发票价税合计(全局币) | taxmny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 22 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 23 | prepaid_mny | 预收款本期冲销 | prepaid_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | qual_taxmny | 质保金 | qual_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |