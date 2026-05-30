# |<<

**凭证用户 (gl_voucheruser / nc.vo.gl.voucher.VoucherUserVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2511.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_voucheruser | 表pk | pk_voucheruser | char(20) | √ | 主键 (UFID) |
| 2 | userid | 用户PK | userid | char(20) |  | 主键 (UFID) |
| 3 | type | 用户类型 | type | int |  | 整数 (Integer) |
| 4 | pk_accountingbook | 核算账簿 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 5 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 6 | pk_org | 财务组织 | pk_org | varchar(50) |  | 字符串 (String) |