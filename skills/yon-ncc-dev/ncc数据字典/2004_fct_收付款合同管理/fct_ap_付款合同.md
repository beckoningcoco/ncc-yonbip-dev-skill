# |<<

**付款合同 (fct_ap / nc.vo.fct.ap.entity.CtApVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2164.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fct_ap | 付款合同主键 | pk_fct_ap | char(20) | √ | 主键 (UFID) |
| 2 | ctname | 合同名称 | ctname | varchar(60) |  | 多语文本 (MultiLangText) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | blatest | 是否最新版本 | blatest | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | cbilltypecode | 单据类型 | cbilltypecode | varchar(20) |  | 字符串 (String) |
| 6 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 7 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 8 | vbillcode | 合同编码 | vbillcode | varchar(40) |  | 字符串 (String) |
| 9 | vtrantypecode | 合同类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 10 | version | 版本号 | version | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | pk_origct | 原始主键 | pk_origct | varchar(20) |  | 主键 (UFID) |
| 12 | subscribedate | 签字盖章日期 | subscribedate | char(19) |  | 日期 (UFDate) |
| 13 | valdate | 计划生效日期 | valdate | char(19) |  | 日期 (UFDate) |
| 14 | invallidate | 计划终止日期 | invallidate | char(19) |  | 日期 (UFDate) |
| 15 | actualvalidate | 实际生效日期 | actualvalidate | char(19) |  | 日期 (UFDate) |
| 16 | actualinvalidate | 实际终止日期 | actualinvalidate | char(19) |  | 日期 (UFDate) |
| 17 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 18 | custunit | 对方单位说明 | custunit | varchar(30) |  | 字符串 (String) |
| 19 | personnelid | 承办人员 | personnelid | varchar(20) |  | 人员基本信息 (psndoc) |
| 20 | depid | 承办部门 | depid | varchar(20) |  | 组织_部门 (dept) |
| 21 | deliaddr | 交货地点 | deliaddr | varchar(20) |  | 地点档案 (addressdoc) |
| 22 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 23 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 24 | nexchangerate | 折本汇率 | nexchangerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | pk_payterm | 付款协议 | pk_payterm | varchar(20) |  | 付款协议 (payment) |
| 26 | noriprepaymny | 预付款 | noriprepaymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | noriprepaylimitmny | 预付款限额 | noriprepaylimitmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | nprepaylimitmny | 本币预付款限额 | nprepaylimitmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | nprepaymny | 本币预付款 | nprepaymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | fstatusflag | 合同状态 | fstatusflag | int |  | 单据状态 (enum) |  | 0=自由; |