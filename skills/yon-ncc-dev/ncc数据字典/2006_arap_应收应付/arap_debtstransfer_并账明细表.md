# |<<

**并账明细表 (arap_debtstransfer / nc.vo.arap.debttransfer.DebtTransferVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/170.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_debtstransfer | 并帐明细表标识 | pk_debtstransfer | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(0) |  | 组织_集团 (group) |
| 3 | pk_org | 主组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | scomment | 摘要 | scomment | varchar(300) |  | 字符串 (String) |
| 5 | busidate | 处理日期 | busidate | char(19) |  | 日期 (UFDate) |
| 6 | busiyear | 处理年度 | busiyear | char(4) |  | 主键 (UFID) |
| 7 | busiperiod | 处理期间 | busiperiod | char(2) |  | 主键 (UFID) |
| 8 | billmaker | 处理人 | billmaker | varchar(20) |  | 用户 (user) |
| 9 | pk_bill | 主表ID | pk_bill | char(20) |  | 主键 (UFID) |
| 10 | pk_item | 单据辅表ID | pk_item | char(20) |  | 主键 (UFID) |
| 11 | pk_termitem | 单据付款协议表ID | pk_termitem | char(20) |  | 主键 (UFID) |
| 12 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 13 | billno | 单据编号 | billno | varchar(40) |  | 字符串 (String) |
| 14 | billclass | 单据大类 | billclass | varchar(50) |  | 单据大类 (billclass) |  | ys=应收单; |