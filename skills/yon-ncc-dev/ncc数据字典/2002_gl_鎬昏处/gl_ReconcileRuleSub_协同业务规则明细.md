# |<<

**协同业务规则明细 (gl_ReconcileRuleSub / nc.vo.gl.reconcile.rule.ReconcileRuleSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2458.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reconcilerulesub | 协同业务规则明细标识 | pk_reconcilerulesub | char(20) | √ | 主键 (UFID) |
| 2 | pk_reconcilerule | 协同业务规则标识 | pk_reconcilerule | char(20) |  | 主键 (UFID) |
| 3 | selfsubjcode | 本方科目编码 | selfsubjcode | varchar(40) |  | 字符串 (String) |
| 4 | oppsubjcode | 对方科目编码 | oppsubjcode | varchar(40) |  | 字符串 (String) |
| 5 | selfaccasoa | 本方科目主键 | selfaccasoa | varchar(20) |  | 会计科目 (accasoa) |
| 6 | oppaccasoa | 对方科目主键 | oppaccasoa | varchar(20) |  | 会计科目 (accasoa) |
| 7 | selfassid | 本方辅助核算 | selfassid | varchar(200) |  | 字符串 (String) |
| 8 | oppassid | 对方辅助核算 | oppassid | varchar(200) |  | 字符串 (String) |
| 9 | isreconcile | 是否协同主分录 | isreconcile | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | pk_customer | 客商档案 | pk_customer | varchar(20) |  | 客商 (custsupplier) |
| 11 | assf1 | 档案值1 | assf1 | char(20) |  | 主键 (UFID) |
| 12 | assf2 | 档案值2 | assf2 | char(20) |  | 主键 (UFID) |
| 13 | assf3 | 档案值3 | assf3 | char(20) |  | 主键 (UFID) |
| 14 | assf4 | 档案值4 | assf4 | char(20) |  | 主键 (UFID) |
| 15 | assf5 | 档案值5 | assf5 | char(20) |  | 主键 (UFID) |
| 16 | assf6 | 档案值6 | assf6 | char(20) |  | 主键 (UFID) |
| 17 | assf7 | 档案值7 | assf7 | char(20) |  | 主键 (UFID) |
| 18 | assf8 | 档案值8 | assf8 | char(20) |  | 主键 (UFID) |
| 19 | opporg | 接收方组织 | opporg | varchar(20) |  | 组织 (org) |
| 20 | startdate | 启用日期 | startdate | char(19) |  | 日期 (UFDate) |
| 21 | rowno | 序号 | rowno | int |  | 整数 (Integer) |
| 22 | reconcilebook | 账簿属性 | reconcilebook | varchar(20) |  | 总账账簿属性(自定义档案) (Defdoc-ORG003_0xx) |