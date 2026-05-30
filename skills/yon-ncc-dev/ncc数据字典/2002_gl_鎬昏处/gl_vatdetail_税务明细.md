# |<<

**税务明细 (gl_vatdetail / nc.vo.gl.vatdetail.VatDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2497.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vatdetail | 税务明细标识 | pk_vatdetail | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 5 | pk_unit | 业务单元 | pk_unit | varchar(20) |  | 组织 (org) |
| 6 | pk_voucher | 凭证主键 | pk_voucher | varchar(20) |  | 字符串 (String) |
| 7 | pk_detail | 分录主键 | pk_detail | varchar(20) |  | 字符串 (String) |
| 8 | voucherkind | 凭证类型 | voucherkind | varchar(1) |  | 凭证类型 (voucherkindenum) |  | 1=临时凭证; |