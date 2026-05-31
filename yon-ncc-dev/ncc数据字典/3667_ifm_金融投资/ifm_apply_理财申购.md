# |<<

**理财申购 (ifm_apply / nc.vo.ifm.apply.InvestApplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3112.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apply | 主键 | pk_apply | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 申购编号 | vbillno | varchar(40) |  | 字符串 (String) |
| 3 | vbillstatus | 审批状态 | vbillstatus | varchar(50) |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |