# |<<

**凭证主体权限 (gl_voucher / nc.vogl.voucherPerm.voucherPerm)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2505.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_voucher | 凭证主键 | pk_voucher | char(50) | √ | 字符串 (String) |
| 2 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(0) |  | 账簿_财务核算账簿 (accountingbook) |
| 3 | pk_vouchertype | 凭证类别 | pk_vouchertype | varchar(20) |  | 凭证类别 (vouchertype) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |