# |<<

**基金管理-工商登记 (ipmfund_commercial_reg / nc.vo.ipmfund.commercialregister.CommercialRegisterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3291.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_commercial | 工商登记主键 | pk_commercial | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | name | 名称 | name | varchar(500) |  | 字符串 (String) |
| 7 | managepartner | 执行事务合伙人 | managepartner | varchar(400) |  | 字符串 (String) |
| 8 | legal_behalf | 法人代表 | legal_behalf | varchar(50) |  | 字符串 (String) |
| 9 | legal_pid | 法人身份证号码 | legal_pid | varchar(50) |  | 字符串 (String) |
| 10 | norigregistcapitalmny | 注册资本(元) | norigregistcapitalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nbaseregistcapitalmny | 注册资本组织本币(元) | nbaseregistcapitalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | ngpregistcapitalmny | 注册资本集团本币(元) | ngpregistcapitalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nallregistcapitalmny | 注册资本全局本币(元) | nallregistcapitalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | norigpaidcapitalmny | 实缴资本(元) | norigpaidcapitalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nbasepaidcapitalmny | 实缴资本组织本币(元) | nbasepaidcapitalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | ngppaidcapitalmny | 实缴资本集团本币(元) | ngppaidcapitalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nallpaidcapitalmny | 实缴资本全局本币(元) | nallpaidcapitalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | social_credit_code | 统一社会信用代码 | social_credit_code | varchar(50) |  | 字符串 (String) |
| 19 | org_institut_code | 组织机构代码 | org_institut_code | varchar(50) |  | 字符串 (String) |
| 20 | regist_code | 注册号 | regist_code | varchar(50) |  | 字符串 (String) |
| 21 | industry | 所属行业 | industry | varchar(20) |  | 经济行业(自定义档案) (Defdoc-SYS005_0xx) |
| 22 | economic_type | 经济类型 | economic_type | varchar(20) |  | 经济类型(自定义档案) (Defdoc-SYS004_0xx) |
| 23 | busi_start_date | 营业开始日期 | busi_start_date | char(19) |  | 日期 (UFDate) |
| 24 | busi_end_date | 营业终止日期 | busi_end_date | char(19) |  | 日期 (UFDate) |
| 25 | regist_date | 注册日期 | regist_date | char(19) |  | 日期 (UFDate) |
| 26 | regist_addr | 注册地点 | regist_addr | varchar(500) |  | 字符串 (String) |
| 27 | scope_business | 经营范围 | scope_business | varchar(2048) |  | 备注 (Memo) |
| 28 | corigcurrencyid | 原币币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 29 | ccurrencyid | 组织本位币币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 30 | cgroupcurrencyid | 集团本位币币种 | cgroupcurrencyid | varchar(20) |  | 币种 (currtype) |
| 31 | cglobalcurrencyid | 全局本位币币种 | cglobalcurrencyid | varchar(20) |  | 币种 (currtype) |
| 32 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |