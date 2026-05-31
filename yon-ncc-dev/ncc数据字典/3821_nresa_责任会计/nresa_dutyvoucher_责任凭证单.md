# |<<

**责任凭证单 (nresa_dutyvoucher / nc.vo.nresa.dutyvoucher.DutyVoucherVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3849.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_voucher | 责任凭证主键 | pk_voucher | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 责任组织 | pk_org | varchar(20) |  | 组织_业务单元_责任组织 (liabilitycenter) |
| 4 | pk_org_v | 责任组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_责任组织版本信息 (liabilitycenter_v) |
| 5 | pk_accountingbook | 责任核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_责任核算账簿 (liabilitybook) |
| 6 | pk_setofbook | 责任核算账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 7 | pk_vouchertype | 责任凭证类别 | pk_vouchertype | varchar(20) |  | 责任凭证类别 (vouchertype) |
| 8 | voucherno | 凭证号 | voucherno | varchar(50) |  | 字符串 (String) |
| 9 | billtype | 单据类型 | billtype | varchar(50) |  | 字符串 (String) |
| 10 | pk_transtype | 交易类型 | pk_transtype | varchar(20) |  | 交易类型 (transtype) |
| 11 | transtypecode | 交易类型编码 | transtypecode | varchar(50) |  | 字符串 (String) |
| 12 | businessdate | 业务日期 | businessdate | char(19) |  | 日期 (UFDate) |
| 13 | postdate | 过账日期 | postdate | char(19) |  | 日期 (UFDate) |
| 14 | ratedate | 汇率日期 | ratedate | char(19) |  | 日期 (UFDate) |
| 15 | accountingyear | 会计年度 | accountingyear | varchar(20) |  | 字符串 (String) |
| 16 | period | 会计月份 | period | varchar(20) |  | 字符串 (String) |
| 17 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 18 | billdate | 制单日期 | billdate | char(19) |  | 日期 (UFDate) |
| 19 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 20 | approvetime | 审批时间 | approvetime | char(19) |  | 日期时间 (UFDateTime) |
| 21 | vapprovenote | 审批批语 | vapprovenote | varchar(255) |  | 字符串 (String) |
| 22 | billstatus | 责任凭证状态 | billstatus | int |  | 责任凭证状态 (DutyVoucherBillStatus) |  | 1=暂存; |