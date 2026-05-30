# |<<

**参数修改申请单主表 (uap_VBillParam / nc.vo.uap.paramsys.VBillParamVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5850.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sysconfig_id | 单据表信息 | pk_sysconfig_id | char(20) | √ | 主键 (UFID) |
| 2 | billparamno | 单据号 | billparamno | varchar(50) |  | 字符串 (String) |
| 3 | approver | 单据审核人 | approver | varchar(20) |  | 用户 (user) |
| 4 | approvedate | 单据审核时间 | approvedate | char(19) |  | 日期时间 (UFDateTime) |
| 5 | approvenote | 审批语 | approvenote | image |  | BLOB (BLOB) |
| 6 | approvestatus | 单据状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |