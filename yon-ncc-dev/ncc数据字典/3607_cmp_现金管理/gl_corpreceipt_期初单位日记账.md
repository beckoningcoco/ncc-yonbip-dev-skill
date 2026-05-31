# |<<

**期初单位日记账 (gl_corpreceipt / nc.vo.cmp.corpreceipt.corpreceipt)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2394.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_corpreceipt | 单位期初日记账Oid | pk_corpreceipt | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 4 | pk_contrastaccount | 对帐账户Oid | pk_contrastaccount | varchar(20) |  | 对账账户实体 (contrastaccount) |
| 5 | pk_vouchertype | 凭证类别 | pk_vouchertype | varchar(20) |  | 字符串 (String) |
| 6 | vouchno | 凭证编码 | vouchno | varchar(30) |  | 字符串 (String) |
| 7 | prepareddate | 制单日期 | prepareddate | char(19) |  | 日期 (UFDate) |
| 8 | explanation | 摘要内容 | explanation | varchar(181) |  | 字符串 (String) |
| 9 | debitamount | 原币借发生额 | debitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | creditamount | 原币贷发生额 | creditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | checkstyle | 结算方式 | checkstyle | varchar(50) |  | 字符串 (String) |
| 12 | checkno | 结算编号 | checkno | varchar(30) |  | 字符串 (String) |
| 13 | checkdate | 票据日期 | checkdate | char(19) |  | 日期 (UFDate) |
| 14 | years | 年度 | years | varchar(20) |  | 字符串 (String) |
| 15 | pk_corp | 单位 | pk_corp | varchar(20) |  | 字符串 (String) |
| 16 | pk_subject | 科目 | pk_subject | varchar(20) |  | 字符串 (String) |
| 17 | pk_bank | 银行账户 | pk_bank | varchar(20) |  | 字符串 (String) |
| 18 | pk_ass | 辅助核算 | pk_ass | varchar(20) |  | 字符串 (String) |
| 19 | memo | 备注 | memo | varchar(181) |  | 主键 (UFID) |
| 20 | balance | 余额 | balance | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | netbanknumber | 网银标识号 | netbanknumber | varchar(30) |  | 字符串 (String) |
| 22 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 23 | tradername | 对方单位 | tradername | varchar(50) |  | 字符串 (String) |
| 24 | transerial | 交易流水号 | transerial | varchar(50) |  | 字符串 (String) |