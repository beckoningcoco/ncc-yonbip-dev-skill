# |<<

**发票分类项目 (bd_uh_invcate_item / nc.vo.nhbd.nccinvcateitemsrv.NccInvcateitemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1046.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invcateitem | 主表主键 | pk_invcateitem | char(20) | √ | 主键 (UFID) |
| 2 | maketime | 制单时间 | maketime | char(19) | √ | 日期时间 (UFDateTime) |
| 3 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 4 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 7 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 8 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 9 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 10 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 11 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |