# |<<

**内部账户明细删除表 (fts_account_deldetail / nc.vo.fts.account.AccDetailDelVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2296.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_account_detail | 标识 | pk_account_detail | char(20) | √ | 主键 (UFID) |
| 2 | pk_ownerorg | 本方组织 | pk_ownerorg | varchar(20) |  | 组织 (org) |
| 3 | pk_ownerorg_v | 本方组织版本 | pk_ownerorg_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 4 | pk_account | 本方账户 | pk_account | varchar(20) |  | 内部账户 (bd_accid) |
| 5 | sourcesystem | 来源系统 | sourcesystem | varchar(50) |  | 字符串 (String) |
| 6 | businesstype | 业务类型 | businesstype | varchar(50) |  | 字符串 (String) |
| 7 | billtype | 单据类型 | billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | vbillno | 单据编号 | vbillno | varchar(200) |  | 字符串 (String) |
| 9 | fbmbillno | 原始票据号 | fbmbillno | varchar(200) |  | 字符串 (String) |
| 10 | tallydate | 记账日期 | tallydate | char(19) |  | 日期 (UFDate) |
| 11 | tallyperson | 记账人 | tallyperson | varchar(20) |  | 用户 (user) |
| 12 | tallytime | 记账时间 | tallytime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | interestdate | 起息日期 | interestdate | char(19) |  | 日期 (UFDate) |
| 14 | tradeorgname | 支付单位名称 | tradeorgname | varchar(100) |  | 字符串 (String) |
| 15 | tradeaccount | 支付账号 | tradeaccount | varchar(100) |  | 字符串 (String) |
| 16 | oppunitname | 对方单位 | oppunitname | varchar(100) |  | 字符串 (String) |
| 17 | oppaccount | 对方账号 | oppaccount | varchar(100) |  | 字符串 (String) |
| 18 | inmoney | 收款金额 | inmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | gllcinmoney | 收款金额(全局本币) | gllcinmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | glcinmoney | 收款金额(集团本币) | glcinmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | olcinmoney | 收款金额(组织本币) | olcinmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | outmoney | 付款金额 | outmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | gllcoutmoney | 付款金额(全局本币) | gllcoutmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | glcoutmoney | 付款金额(集团本币) | glcoutmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | olcoutmoney | 付款金额(组织本币) | olcoutmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | useflag | 实时标志 | useflag | varchar(21) |  | 字符串 (String) |
| 27 | reverseflag | 核销标志 | reverseflag | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 29 | memo | 摘要 | memo | varchar(181) |  | 字符串 (String) |
| 30 | sfflag | 收支方向 | sfflag | int |  | 整数 (Integer) |
| 31 | pk_oppacc | 对方账户标识 | pk_oppacc | varchar(20) |  | 字符串 (String) |
| 32 | pk_sourcebill | 关联单据 | pk_sourcebill | varchar(20) |  | 字符串 (String) |
| 33 | gllcrate | 本币汇率(全局本币) | gllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 34 | glcrate | 本币汇率(集团本币) | glcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 35 | olcrate | 本币汇率(组织本币) | olcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 36 | deleteperson | 删除人 | deleteperson | varchar(20) |  | 字符串 (String) |
| 37 | deletedate | 删除日期 | deletedate | char(19) |  | 日期 (UFDate) |
| 38 | deletetime | 删除服务器时间 | deletetime | char(19) |  | 日期时间 (UFDateTime) |
| 39 | detailno | 入账流水号 | detailno | varchar(50) |  | 字符串 (String) |
| 40 | pk_sourcebill_b | 关联单据明细标识 | pk_sourcebill_b | varchar(20) |  | 字符串 (String) |
| 41 | pk_oppunit | 对方单位客商基本档案 | pk_oppunit | varchar(20) |  | 字符串 (String) |
| 42 | pk_opporg | 对方单位组织主键 | pk_opporg | varchar(20) |  | 字符串 (String) |
| 43 | isenabledztz | 是否能生成到账通知 | isenabledztz | char(1) |  | 布尔类型 (UFBoolean) |
| 44 | ischangeinaccdate | 是否自动调整入账日期 | ischangeinaccdate | char(1) |  | 布尔类型 (UFBoolean) |
| 45 | ischeckbalance | 是否校验可用余额 | ischeckbalance | char(1) |  | 布尔类型 (UFBoolean) |
| 46 | pk_org | 资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 47 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 48 | pk_org_v | 资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 49 | orgtallydate | 组织入账日期 | orgtallydate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 50 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |