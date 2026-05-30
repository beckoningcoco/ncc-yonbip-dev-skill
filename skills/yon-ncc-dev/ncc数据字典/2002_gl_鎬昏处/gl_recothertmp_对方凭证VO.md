# |<<

**对方凭证VO (gl_recothertmp / nc.vo.gl.reconcile.othertmp.RecOtherTmpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2465.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_recothertmp | 对方凭证标识 | pk_recothertmp | char(20) | √ | 主键 (UFID) |
| 2 | pk_reconcileoccur | 协同发生pk | pk_reconcileoccur | char(20) |  | 主键 (UFID) |
| 3 | pk_voucher | 本方凭证主键 | pk_voucher | char(20) |  | 主键 (UFID) |
| 4 | pk_selfcorp | 本方单位 | pk_selfcorp | char(20) |  | 主键 (UFID) |
| 5 | pk_othercorp | 对方单位 | pk_othercorp | char(20) |  | 主键 (UFID) |
| 6 | pk_vouchertype | 对方凭证类别主键 | pk_vouchertype | char(20) |  | 主键 (UFID) |
| 7 | voucherno | 对方凭证号 | voucherno | int |  | 整数 (Integer) |
| 8 | prepareddate | 对方制单日期 | prepareddate | char(19) |  | 日期 (UFDate) |
| 9 | pk_prepared | 对方制单人 | pk_prepared | char(20) |  | 主键 (UFID) |
| 10 | totaldebit | 对方借方合计 | totaldebit | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | totalcredit | 对方贷方合计 | totalcredit | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | explanation | 对方摘要 | explanation | varchar(200) |  | 字符串 (String) |
| 13 | pk_recvoucher | 对方凭证PK | pk_recvoucher | char(20) |  | 主键 (UFID) |
| 14 | pk_selfglbook | 本方帐簿 | pk_selfglbook | char(20) |  | 主键 (UFID) |
| 15 | pk_selfglorg | 本方主体 | pk_selfglorg | char(20) |  | 主键 (UFID) |
| 16 | pk_otherglbook | 对方帐簿 | pk_otherglbook | char(20) |  | 主键 (UFID) |
| 17 | pk_otherglorg | 对方主体 | pk_otherglorg | char(20) |  | 主键 (UFID) |
| 18 | pk_otherglorgbook | 对方主体帐簿 | pk_otherglorgbook | char(20) |  | 主键 (UFID) |
| 19 | pk_selfglorgbook | 本方主体帐簿 | pk_selfglorgbook | char(20) |  | 主键 (UFID) |
| 20 | pk_group | 集团标识 | pk_group | char(20) |  | 主键 (UFID) |