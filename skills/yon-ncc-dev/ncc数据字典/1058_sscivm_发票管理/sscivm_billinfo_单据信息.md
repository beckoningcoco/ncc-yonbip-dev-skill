# |<<

**单据信息 (sscivm_billinfo / nc.vo.sscivm.invoice.IVMBillInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5538.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bill | 主键 | pk_bill | char(20) | √ | 主键 (UFID) |
| 2 | billno | 单据号 | billno | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_tradetype | 交易类型 | pk_tradetype | varchar(20) |  | 交易类型 (transtype) |
| 5 | billdate | 单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 6 | amount | 金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 8 | system | 系统 | system | varchar(20) |  | 字符串 (String) |
| 9 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 10 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |