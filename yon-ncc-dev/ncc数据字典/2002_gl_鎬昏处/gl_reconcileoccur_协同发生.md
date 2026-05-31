# |<<

**协同发生 (gl_reconcileoccur / nc.vo.gl.reconcile.occur.ReconcileOccurVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2456.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reconcileoccur | 协同发生标识 | pk_reconcileoccur | char(20) | √ | 主键 (UFID) |
| 2 | code | 协同号 | code | varchar(15) |  | 字符串 (String) |
| 3 | occurdate | 协同日期 | occurdate | char(19) |  | 日期 (UFDate) |
| 4 | reconciler | 协同人 | reconciler | char(20) |  | 主键 (UFID) |
| 5 | pk_voucherself | 本方凭证标识 | pk_voucherself | char(20) |  | 主键 (UFID) |
| 6 | isreconcile | 是否协同业务 | isreconcile | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | isdetailrecon | 是否分录协同 | isdetailrecon | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_accountingbook | 财务核算账簿 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 9 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 10 | creattime | 创建时间 | creattime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 12 | pk_book | 核算账簿类型 | pk_book | char(20) |  | 主键 (UFID) |
| 13 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |
| 14 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 15 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |