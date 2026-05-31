# |<<

**凭证明细 (gl_detail / nc.vo.gl.voucherdetail.VoucherDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2401.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | 分录标识 | pk_detail | char(20) | √ | 主键 (UFID) |
| 2 | detailindex | 分录号 | detailindex | int |  | 整数 (Integer) |
| 3 | approver | 审核人 | approver | char(20) |  | 主键 (UFID) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_unit | 业务单元 | pk_unit | varchar(20) |  | 组织 (org) |
| 7 | pk_accountingbook | 财务核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 8 | pk_vouchertype | 凭证类别 | pk_vouchertype | varchar(20) |  | 凭证类别 (vouchertype) |
| 9 | explanation | 摘要 | explanation | varchar(150) |  | 字符串 (String) |
| 10 | pk_accasoa | 科目 | pk_accasoa | varchar(20) |  | 会计科目基本信息 (account) |
| 11 | assid | 辅助核算 | assid | char(20) |  | 辅助项目 (辅助核算) |
| 12 | excrate1 | 汇率1 | excrate1 | decimal(15, 8) |  | 数值 (UFDouble) | 0 |
| 13 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 14 | yearv | 年度 | yearv | char(4) |  | 字符串 (String) |
| 15 | excrate2 | 汇率2 | excrate2 | decimal(15, 8) |  | 数值 (UFDouble) | 0 |
| 16 | excrate3 | 集团汇率 | excrate3 | decimal(15, 8) |  | 数值 (UFDouble) | 0 |
| 17 | periodv | 期间 | periodv | char(4) |  | 字符串 (String) |
| 18 | excrate4 | 全局汇率 | excrate4 | decimal(15, 8) |  | 数值 (UFDouble) | 0 |
| 19 | debitquantity | 借方数量 | debitquantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | creditquantity | 贷方数量 | creditquantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | debitamount | 原币借方金额 | debitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | creditamount | 原币贷方金额 | creditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | localdebitamount | 账簿本币借方金额 | localdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | localcreditamount | 账簿本币贷方金额 | localcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | groupdebitamount | 集团本币借方金额 | groupdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | groupcreditamount | 集团本币贷方金额 | groupcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | globaldebitamount | 全局本币借方金额 | globaldebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | globalcreditamount | 全局本币贷方金额 | globalcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | pk_liabilitycenter | 利润中心 | pk_liabilitycenter | varchar(20) |  | 利润中心 (profitcenter) |
| 30 | pk_voucher | 凭证主键 | pk_voucher | char(20) |  | 主键 (UFID) |
| 31 | verifydate | 核销日期 | verifydate | char(19) |  | 日期 (UFDate) |
| 32 | free1 | 预留字段1 | free1 | varchar(60) |  | 字符串 (String) |
| 33 | free2 | 预留字段2 | free2 | varchar(60) |  | 字符串 (String) |
| 34 | free3 | 预留字段3 | free3 | varchar(60) |  | 字符串 (String) |
| 35 | free4 | 预留字段4 | free4 | varchar(60) |  | 字符串 (String) |
| 36 | free5 | 预留字段5 | free5 | varchar(60) |  | 字符串 (String) |
| 37 | free6 | 预留字段6 | free6 | varchar(60) |  | 字符串 (String) |
| 38 | free7 | 预留字段7 | free7 | varchar(60) |  | 字符串 (String) |
| 39 | free8 | 预留字段8 | free8 | varchar(60) |  | 字符串 (String) |
| 40 | free9 | 预留字段9 | free9 | varchar(60) |  | 字符串 (String) |
| 41 | free10 | 预留字段10 | free10 | varchar(60) |  | 字符串 (String) |
| 42 | free11 | 预留字段11 | free11 | varchar(60) |  | 字符串 (String) |
| 43 | free12 | 预留字段12 | free12 | varchar(60) |  | 字符串 (String) |
| 44 | free13 | 预留字段13 | free13 | varchar(60) |  | 字符串 (String) |
| 45 | free14 | 预留字段14 | free14 | varchar(60) |  | 字符串 (String) |
| 46 | free15 | 预留字段15 | free15 | varchar(60) |  | 字符串 (String) |
| 47 | free16 | 预留字段16 | free16 | varchar(60) |  | 字符串 (String) |
| 48 | free17 | 预留字段17 | free17 | varchar(60) |  | 字符串 (String) |
| 49 | free18 | 预留字段18 | free18 | varchar(60) |  | 字符串 (String) |
| 50 | free19 | 预留字段19 | free19 | varchar(60) |  | 字符串 (String) |
| 51 | free20 | 预留字段20 | free20 | varchar(60) |  | 字符串 (String) |
| 52 | free21 | 预留字段21 | free21 | varchar(60) |  | 字符串 (String) |
| 53 | free22 | 预留字段22 | free22 | varchar(60) |  | 字符串 (String) |
| 54 | free23 | 预留字段23 | free23 | varchar(60) |  | 字符串 (String) |
| 55 | free24 | 预留字段24 | free24 | varchar(60) |  | 字符串 (String) |
| 56 | free25 | 预留字段25 | free25 | varchar(60) |  | 字符串 (String) |
| 57 | free26 | 预留字段26 | free26 | varchar(60) |  | 字符串 (String) |
| 58 | free27 | 预留字段27 | free27 | varchar(60) |  | 字符串 (String) |
| 59 | free28 | 预留字段28 | free28 | varchar(60) |  | 字符串 (String) |
| 60 | free29 | 预留字段29 | free29 | varchar(60) |  | 字符串 (String) |
| 61 | free30 | 预留字段30 | free30 | varchar(60) |  | 字符串 (String) |
| 62 | creator | 创建者 | creator | char(20) |  | 主键 (UFID) |