# |<<

**凭证归档子表 (fiarc_archive_b / nc.vo.archive.voucherarchive.ArchiveBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2210.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_archivelog | 归档子表主键 | pk_archivelog | char(20) | √ | 主键 (UFID) |
| 2 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) | √ | 账簿_财务核算账簿 (accountingbook) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | pk_voucher | 凭证主键 | pk_voucher | varchar(20) | √ | 凭证 (gl_voucher) |
| 6 | vouchernum | 凭证号 | vouchernum | int |  | 整数 (Integer) |
| 7 | pk_vouchertype | 凭证类型 | pk_vouchertype | varchar(20) |  | 凭证类别 (vouchertype) |
| 8 | year | 会计年 | year | char(4) | √ | 主键 (UFID) |
| 9 | period | 会计期间 | period | char(2) | √ | 主键 (UFID) |
| 10 | state | 归档状态 | state | varchar(50) |  | 归档状态 (enum) |  | 0=未归档; |