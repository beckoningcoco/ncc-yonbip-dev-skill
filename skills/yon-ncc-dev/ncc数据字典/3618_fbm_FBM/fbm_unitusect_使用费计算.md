# |<<

**使用费计算 (fbm_unitusect / nc.vo.pfbm.unitusect.UnitusectVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2161.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_unitusect | 使用费计算主键 | pk_unitusect | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | charge | 是否计费 | charge | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | pk_register | 票据编号 | pk_register | varchar(20) |  | 票据登记 (fbm_register) |
| 7 | pk_openregister | 信用证号 | pk_openregister | varchar(20) |  | 开证登记 (lcm_openregister) |
| 8 | pk_billcurr | 票据币种 | pk_billcurr | varchar(20) |  | 币种 (currtype) |
| 9 | pk_credcurr | 信用证币种 | pk_credcurr | varchar(20) |  | 币种 (currtype) |
| 10 | billmoney | 票据金额 | billmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | credmoney | 信用证金额 | credmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | openbill_date | 开票日期 | openbill_date | char(19) |  | 日期 (UFDate) |
| 13 | issuedate | 开证日期 | issuedate | char(19) |  | 日期 (UFDate) |
| 14 | pk_usectmanage | 费率编码 | pk_usectmanage | varchar(20) |  | 使用费管理 (fbm_usectmanage) |
| 15 | currchargedate | 当前结费日 | currchargedate | char(19) |  | 日期 (UFDate) |
| 16 | isoccunitpleamount | 占用单位质押额度 | isoccunitpleamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | isoccsharepleamount | 占用共享质押额度 | isoccsharepleamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | previchargedate | 上一结费日 | previchargedate | char(19) |  | 日期 (UFDate) |
| 19 | pk_srcbilltype | 来源单据类型 | pk_srcbilltype | varchar(20) |  | 字符串 (String) |
| 20 | pk_srcbill | 来源单据主键 | pk_srcbill | varchar(20) |  | 字符串 (String) |
| 21 | enddate | 到期日期 | enddate | char(19) |  | 日期 (UFDate) |
| 22 | saga_status | saga事务状态 | saga_status | int |  | 整数 (Integer) |
| 23 | saga_btxid | 本地事务id | saga_btxid | varchar(64) |  | 字符串 (String) |
| 24 | saga_gtxid | 全局事务id | saga_gtxid | varchar(64) |  | 字符串 (String) |
| 25 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) |
| 26 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 46 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 47 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 48 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 49 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |