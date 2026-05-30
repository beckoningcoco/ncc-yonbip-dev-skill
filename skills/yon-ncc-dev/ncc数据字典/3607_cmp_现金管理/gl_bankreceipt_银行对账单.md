# |<<

**银行对账单 (gl_bankreceipt / nc.vo.cmp.cb.BankReceiptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2352.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bankreceipt | 银行对账单Oid | pk_bankreceipt | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 4 | pk_contrastaccount | 对帐账户Oid | pk_contrastaccount | varchar(20) |  | 对账账户实体 (contrastaccount) |
| 5 | explanation | 摘要 | explanation | varchar(181) |  | 字符串 (String) |
| 6 | checkstyle | 结算方式 | checkstyle | varchar(50) |  | 字符串 (String) |
| 7 | pk_check | 结算号 | pk_check | varchar(30) |  | 字符串 (String) |
| 8 | checkdate | 票据日期 | checkdate | char(19) |  | 日期 (UFDate) |
| 9 | debitamount | 原币借发生额 | debitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | creditamount | 原币贷发生额 | creditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | years | 年度 | years | varchar(20) |  | 字符串 (String) |
| 12 | period | 会计期间 | period | varchar(20) |  | 字符串 (String) |
| 13 | pk_corp | 公司编码 | pk_corp | varchar(50) |  | 字符串 (String) |
| 14 | pk_subject | 科目Oid | pk_subject | varchar(50) |  | 字符串 (String) |
| 15 | pk_bank | 银行账户Oid | pk_bank | varchar(50) |  | 字符串 (String) |
| 16 | pk_ass | 辅助核算Oid | pk_ass | varchar(20) |  | 字符串 (String) |
| 17 | memo | 备注 | memo | varchar(181) |  | 字符串 (String) |
| 18 | balance | 余额 | balance | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | pk_vouchertype | 凭证类别 | pk_vouchertype | varchar(20) |  | 字符串 (String) |
| 20 | pk_jszx | 结算中心 | pk_jszx | varchar(20) |  | 字符串 (String) |
| 21 | pk_jszxaccount | 结算中心帐号 | pk_jszxaccount | varchar(20) |  | 字符串 (String) |
| 22 | pk_jszxdetail | 控制结算中心重复 | pk_jszxdetail | varchar(20) |  | 字符串 (String) |
| 23 | styleflag | 状态标志 | styleflag | varchar(50) |  | 字符串 (String) |
| 24 | netbanknumber | 网银标识号 | netbanknumber | varchar(30) |  | 字符串 (String) |
| 25 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 26 | oppunitname | 对方单位 | oppunitname | varchar(300) |  | 字符串 (String) |
| 27 | nusage | 用途 | nusage | varchar(200) |  | 字符串 (String) |
| 28 | transerial | 交易流水号 | transerial | varchar(50) |  | 字符串 (String) |