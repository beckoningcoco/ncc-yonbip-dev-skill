# |<<

**凭证单 (gl_sscvoucher / nc.vo.gl.voucherbill.GLVoucherVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2479.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_voucher | 凭证主键 | pk_voucher | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 6 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 7 | pk_vouchertype | 凭证类别 | pk_vouchertype | varchar(20) |  | 凭证类别 (vouchertype) |
| 8 | year | 会计年度 | year | varchar(4) |  | 字符串 (String) |
| 9 | period | 会计期间 | period | varchar(2) |  | 字符串 (String) |
| 10 | prepareddate | 制单日期 | prepareddate | char(19) |  | 日期 (UFDate) |
| 11 | pk_prepared | 制单人 | pk_prepared | varchar(20) |  | 用户 (user) |
| 12 | billdate | 单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 13 | billno | 单据号 | billno | varchar(20) |  | 字符串 (String) |
| 14 | billstatus | 单据状态 | billstatus | int |  | 凭证单单据状态 (VoucherBillStatusEnum) |  | 1=保存; |