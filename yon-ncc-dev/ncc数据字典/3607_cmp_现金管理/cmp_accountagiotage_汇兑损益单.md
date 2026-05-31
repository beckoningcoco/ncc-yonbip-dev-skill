# |<<

**汇兑损益单 (cmp_accountagiotage / nc.vo.cmp.accountagiotage.AccountAgiotageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1521.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accountagiotage | 汇兑损益单号 | pk_accountagiotage | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_curr | 币种 | pk_curr | varchar(20) |  | 币种 (currtype) |
| 6 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 7 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 8 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | billtypecode | 单据类型编码 | billtypecode | varchar(50) |  | 字符串 (String) |
| 10 | pk_bankaccount | 银行账户 | pk_bankaccount | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 11 | pk_cashaccount | 现金账户 | pk_cashaccount | varchar(20) |  | 现金账户 (cashaccount) |
| 12 | accountname | 账户名称 | accountname | varchar(300) |  | 字符串 (String) |
| 13 | localrate | 本币汇率 | localrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | receipt_localmoney | 汇兑收益 | receipt_localmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | pay_localmoney | 汇兑损失 | pay_localmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | memo | 摘要 | memo | varchar(181) |  | 字符串 (String) |
| 17 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 18 | doperatedate | 制单日期 | doperatedate | char(19) |  | 日期 (UFDate) |
| 19 | doperatetime | 制单时间 | doperatetime | char(19) |  | 日期时间 (UFDateTime) |
| 20 | m_vouchid | 汇兑损益记录ID | m_vouchid | varchar(50) |  | 字符串 (String) |
| 21 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) |
| 22 | saga_gtxid | 全局事务id | saga_gtxid | varchar(64) |  | 字符串 (String) |
| 23 | saga_btxid | 本地事务id | saga_btxid | varchar(64) |  | 字符串 (String) |
| 24 | saga_status | 事务状态 | saga_status | int |  | 整数 (Integer) |
| 25 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 26 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 27 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 28 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |