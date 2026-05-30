# |<<

**理财赎回 (ifm_redeem / nc.vo.ifm.redeem.InvestRedeemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3115.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_redeem | 主键 | pk_redeem | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 赎回编号 | vbillno | varchar(40) |  | 字符串 (String) |
| 3 | vbillstatus | 审批状态 | vbillstatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |