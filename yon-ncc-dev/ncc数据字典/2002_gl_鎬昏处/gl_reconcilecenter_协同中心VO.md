# |<<

**协同中心VO (gl_reconcilecenter / nc.vo.gl.reconcile.center.ReconcileCenterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2453.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reconcilecenter | 协同中心标识 | pk_reconcilecenter | char(20) | √ | 主键 (UFID) |
| 2 | bselect | 选择 | bselect | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | reconcileno | 协同号 | reconcileno | varchar(50) |  | 字符串 (String) |
| 4 | reconciledate | 协同日期 | reconciledate | char(19) |  | 日期 (UFDate) |
| 5 | reconciler | 协同人 | reconciler | char(20) |  | 主键 (UFID) |
| 6 | reconstat | 协同状态 | reconstat | int |  | 整数 (Integer) |
| 7 | opp_accountingbook | 对方主体账簿 | opp_accountingbook | char(20) |  | 主键 (UFID) |
| 8 | opp_explanation | 对方摘要 | opp_explanation | varchar(50) |  | 字符串 (String) |
| 9 | opp_vouchertype | 对方凭证类别 | opp_vouchertype | char(20) |  | 主键 (UFID) |
| 10 | opp_voucherno | 对方凭证号 | opp_voucherno | int |  | 整数 (Integer) |
| 11 | opp_preparer | 对方制单人 | opp_preparer | char(20) |  | 主键 (UFID) |
| 12 | opp_preparedate | 对方制单日期 | opp_preparedate | char(19) |  | 日期 (UFDate) |
| 13 | opp_debit | 对方借方 | opp_debit | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | opp_credit | 对方贷方 | opp_credit | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | self_accountingbook | 本方主体账簿 | self_accountingbook | char(20) |  | 主键 (UFID) |
| 16 | self_explanation | 本方摘要 | self_explanation | varchar(50) |  | 字符串 (String) |
| 17 | self_vouchertype | 本方凭证类别 | self_vouchertype | char(20) |  | 主键 (UFID) |
| 18 | self_voucherno | 本方凭证号 | self_voucherno | int |  | 整数 (Integer) |
| 19 | self_preparer | 本方制单人 | self_preparer | char(20) |  | 主键 (UFID) |
| 20 | self_debit | 本方借方 | self_debit | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | self_credit | 本方贷方 | self_credit | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | pk_reconcileoccur | 协同发生标识 | pk_reconcileoccur | char(20) |  | 主键 (UFID) |
| 23 | pk_reconoccursub | 协同发生明细标识 | pk_reconoccursub | char(20) |  | 主键 (UFID) |
| 24 | pk_recothertmp | 协同对方凭证标识 | pk_recothertmp | char(20) |  | 主键 (UFID) |
| 25 | pk_reconcilerule | 协同业务规则标识 | pk_reconcilerule | char(20) |  | 主键 (UFID) |
| 26 | reconcileinformation | 协同信息 | reconcileinformation | varchar(50) |  | 字符串 (String) |
| 27 | self_voucher | 本方凭证标识 | self_voucher | char(20) |  | 主键 (UFID) |
| 28 | opp_voucher | 对方凭证标识 | opp_voucher | char(20) |  | 主键 (UFID) |
| 29 | self_preparedate | 本方制单日期 | self_preparedate | char(19) |  | 日期 (UFDate) |
| 30 | self_detail | 本方分录标识 | self_detail | char(20) |  | 主键 (UFID) |