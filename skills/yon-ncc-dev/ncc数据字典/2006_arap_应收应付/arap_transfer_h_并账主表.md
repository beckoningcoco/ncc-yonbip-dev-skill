# |<<

**并账主表 (arap_transfer_h / nc.vo.arap.debttransfer.DebtTransferMainVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/200.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transfer_h | 并帐主表标志 | pk_transfer_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 主组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | scomment | 摘要 | scomment | varchar(300) |  | 字符串 (String) |
| 6 | busidate | 处理日期 | busidate | char(19) |  | 日期 (UFDate) |
| 7 | busiyear | 处理年度 | busiyear | char(4) |  | 主键 (UFID) |
| 8 | busiperiod | 处理期间 | busiperiod | char(2) |  | 主键 (UFID) |
| 9 | billmaker | 处理人 | billmaker | varchar(20) |  | 用户 (user) |
| 10 | money | 处理原币金额 | money | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | local_money | 处理本币金额 | local_money | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | quantity | 处理数量 | quantity | decimal(20, 8) |  | 数值 (UFDouble) |
| 13 | global_money | 处理全局本币金额 | global_money | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | group_money | 处理集团本币金额 | group_money | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | inobjtype | 转入对象类型 | inobjtype | int |  | 对象类型 (enum) |  | 0=客户; |