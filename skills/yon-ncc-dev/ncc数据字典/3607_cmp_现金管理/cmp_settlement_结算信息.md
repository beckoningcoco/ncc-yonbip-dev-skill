# |<<

**结算信息 (cmp_settlement / nc.vo.cmp.settlement.SettlementHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1582.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settlement | 结算信息主键 | pk_settlement | char(20) | √ | 主键 (UFID) |
| 2 | pk_operator | 录入人 | pk_operator | varchar(20) |  | 用户 (user) |
| 3 | pk_busibill | 业务单据主键 | pk_busibill | varchar(20) |  | 主键 (UFID) |
| 4 | systemcode | 归属系统 | systemcode | varchar(20) |  | 来源系统 (cmp_syscode) |
| 5 | pk_busitype | 业务类型 | pk_busitype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 6 | pk_tradetype | 业务单交易类型 | pk_tradetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | billcode | 业务单据编号 | billcode | varchar(30) |  | 字符串 (String) |
| 8 | pk_billoperator | 业务单据录入人 | pk_billoperator | varchar(20) |  | 用户 (user) |
| 9 | busi_billdate | 业务单据日期 | busi_billdate | char(19) |  | 日期 (UFDate) |
| 10 | busi_auditdate | 业务单据审核日期 | busi_auditdate | char(19) |  | 日期 (UFDate) |
| 11 | pk_auditor | 业务单据审核人 | pk_auditor | varchar(20) |  | 用户 (user) |
| 12 | isbusieffect | 业务单据是否已生效 | isbusieffect | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | signdate | 签字确认日期 | signdate | char(19) |  | 日期 (UFDate) |
| 14 | pk_signer | 签字确认人 | pk_signer | varchar(20) |  | 用户 (user) |
| 15 | settlenum | 结算号 | settlenum | varchar(30) |  | 字符串 (String) |
| 16 | settledate | 结算日期 | settledate | char(19) |  | 日期 (UFDate) |
| 17 | pk_executor | 结算人 | pk_executor | varchar(20) |  | 用户 (user) |
| 18 | busistatus | 业务单据状态 | busistatus | int |  | 单据状态 (busistatus) |  | -99=暂存; |