# |<<

**分录 (gl_sscdetail / nc.vo.gl.voucherbill.VoucherDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2478.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | 分录主键 | pk_detail | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 6 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 7 | pk_unit | 业务单元 | pk_unit | varchar(20) |  | 组织 (org) |
| 8 | pk_unit_v | 业务单元版本 | pk_unit_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 9 | pk_accasoa | 会计科目 | pk_accasoa | varchar(20) |  | 会计科目 (accasoa) |
| 10 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 11 | detailindex | 分录号 | detailindex | int |  | 整数 (Integer) |
| 12 | assid | 辅助核算 | assid | varchar(20) |  | 辅助项目 (辅助核算) |
| 13 | explanation | 摘要内容 | explanation | varchar(400) |  | 字符串 (String) |
| 14 | price | 单价 | price | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | excrate1 | 组织汇率 | excrate1 | decimal(15, 8) |  | 数值 (UFDouble) |
| 16 | excrate2 | 集团汇率 | excrate2 | decimal(15, 8) |  | 数值 (UFDouble) |
| 17 | excrate3 | 全局汇率 | excrate3 | decimal(15, 8) |  | 数值 (UFDouble) |
| 18 | debitquantity | 借方数量 | debitquantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | debitamount | 原币借发生额 | debitamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | localdebitamount | 账簿本币借发生额 | localdebitamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | groupdebitamount | 集团本币借发生额 | groupdebitamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | globaldebitamount | 全局本币借发生额 | globaldebitamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | creditquantity | 贷方数量 | creditquantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | creditamount | 原币贷发生额 | creditamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | localcreditamount | 账簿本币贷发生额 | localcreditamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | groupcreditamount | 集团本币贷发生额 | groupcreditamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | globalcreditamount | 全局本币贷发生额 | globalcreditamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | direction | 发生额方向 | direction | varchar(1) |  | 字符串 (String) |
| 29 | pk_liabilitycenter | 利润中心 | pk_liabilitycenter | varchar(20) |  | 利润中心 (profitcenter) |
| 30 | pk_liabilitycenter_v | 利润中心版本 | pk_liabilitycenter_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 31 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |