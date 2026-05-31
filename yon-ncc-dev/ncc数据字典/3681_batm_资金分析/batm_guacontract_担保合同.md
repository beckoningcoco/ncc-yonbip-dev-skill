# |<<

**担保合同 (batm_guacontract / nc.vo.batm.fbmvo.GuacontractVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/228.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_guacontract | 主键 | pk_guacontract | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(50) |  | 字符串 (String) |
| 3 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 5 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_org_v | 财务组织版本 | pk_org_v | varchar(50) |  | 字符串 (String) |
| 7 | contracttype | 合同类型 | contracttype | varchar(50) |  | 字符串 (String) |
| 8 | contractno | 担保合同号 | contractno | varchar(50) |  | 字符串 (String) |
| 9 | vbillno | 合同编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 10 | guarantor | 担保人 | guarantor | varchar(50) |  | 字符串 (String) |
| 11 | contractnodate | 担保合同签订日期 | contractnodate | char(19) |  | 日期 (UFDate) |
| 12 | warrantortype | 反担保人类型 | warrantortype | varchar(50) |  | 字符串 (String) |
| 13 | warrantorin | 反担保人(内部单位) | warrantorin | varchar(50) |  | 字符串 (String) |
| 14 | warrantorou | 反担保人(外部客商) | warrantorou | varchar(50) |  | 字符串 (String) |
| 15 | warrantorname | 反担保人名称 | warrantorname | varchar(200) |  | 多语文本 (MultiLangText) |
| 16 | creditortype | 债权人类型 | creditortype | varchar(50) |  | 字符串 (String) |
| 17 | creditorba | 债权人(银行) | creditorba | varchar(50) |  | 字符串 (String) |
| 18 | creditorou | 债权人(外部客商) | creditorou | varchar(50) |  | 字符串 (String) |
| 19 | creditorname | 债权人名称 | creditorname | varchar(200) |  | 多语文本 (MultiLangText) |
| 20 | guatype | 担保方式 | guatype | varchar(50) |  | 字符串 (String) |
| 21 | guarange | 担保范围 | guarange | varchar(50) |  | 字符串 (String) |
| 22 | guastartdate | 担保起始日期 | guastartdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 23 | guaenddate | 担保终止日期 | guaenddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 24 | pk_guacurrtype | 担保币种 | pk_guacurrtype | varchar(20) |  | 币种 (currtype) |
| 25 | guaamount | 担保总金额 | guaamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | gualcamount | 担保本币总金额 | gualcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | guaglcamount | 担保集团本币总金额 | guaglcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | guagllcamount | 担保全局本币总金额 | guagllcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | guafee | 担保费用 | guafee | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | vbillstatus | 审批状态 | vbillstatus | varchar(50) |  | 字符串 (String) |
| 31 | initflag | 期初标识 | initflag | char(1) |  | 布尔类型 (UFBoolean) |
| 32 | debtnote | 债务描述 | debtnote | varchar(50) |  | 字符串 (String) |
| 33 | guaamountdivcapital | 担保金额占净资产比例 | guaamountdivcapital | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | guaamountflag | 担保金额标志位 | guaamountflag | int |  | 整数 (Integer) |
| 35 | timelimit | 担保期限 | timelimit | varchar(50) |  | 字符串 (String) |
| 36 | guacontractdays | 担保期限标志位 | guacontractdays | int |  | 整数 (Integer) |
| 37 | billmakedate | 制单日期 | billmakedate | char(19) |  | 日期 (UFDate) |
| 38 | usedamount | 已用担保总金额 | usedamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 39 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |