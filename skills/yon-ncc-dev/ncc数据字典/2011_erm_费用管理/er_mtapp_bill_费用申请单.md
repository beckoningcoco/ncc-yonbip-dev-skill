# |<<

**费用申请单 (er_mtapp_bill / nc.vo.erm.matterapp.MatterAppVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1906.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtapp_bill | 主键 | pk_mtapp_bill | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 3 | pk_tradetype | 交易类型编码 | pk_tradetype | varchar(50) |  | 字符串 (String) |
| 4 | billno | 单据编号 | billno | varchar(50) |  | 字符串 (String) |
| 5 | billmaker | 申请人 | billmaker | varchar(20) |  | 人员基本信息 (psndoc) |
| 6 | billdate | 制单日期 | billdate | char(19) |  | 日期 (UFDate) |
| 7 | billstatus | 单据状态 | billstatus | int |  | 单据状态 (mtappapprstatus) |  | 0=暂存; |