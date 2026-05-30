# |<<

**医嘱流向模式分类 (bd_uh_wfcate / nc.vo.nhbd.nccwfcate.NccWfCateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1144.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wfcate | 医嘱流向模式分类主键 | pk_wfcate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 7 | maketime | 制单时间 | maketime | char(19) | √ | 日期时间 (UFDateTime) |
| 8 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 10 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 11 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 12 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 13 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |