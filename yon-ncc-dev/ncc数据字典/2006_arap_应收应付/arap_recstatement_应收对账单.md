# |<<

**应收对账单 (arap_recstatement / nc.vo.arap.tally.RecStatementVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/194.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_recstatement | 应收对账单主键 | pk_recstatement | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_qryobj | 查询对象主键 | pk_qryobj | varchar(20) |  | 主键 (UFID) |
| 5 | qryobj | 查询对象 | qryobj | varchar(50) |  | 字符串 (String) |
| 6 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 7 | bal_qua | 数量余额 | bal_qua | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | bal_ori | 原币余额 | bal_ori | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | bal_loc | 本币余额 | bal_loc | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | gr_bal_loc | 集团本币余额 | gr_bal_loc | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | gl_bal_loc | 全局本币余额 | gl_bal_loc | decimal(28, 8) |  | 数值 (UFDouble) |