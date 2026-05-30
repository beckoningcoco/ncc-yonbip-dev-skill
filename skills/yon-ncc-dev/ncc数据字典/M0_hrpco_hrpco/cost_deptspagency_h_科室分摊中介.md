# |<<

**科室分摊中介 (cost_deptspagency_h / nc.vo.hrpco.deptspagency.DeptspagencyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1613.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptspagency_h | 主键 | pk_deptspagency_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_codept | 科室编码 | pk_codept | varchar(20) |  | 科室档案 (CodepartVO) |
| 6 | vmemo | 备注 | vmemo | varchar(50) |  | 字符串 (String) |
| 7 | code | code | code | varchar(50) |  | 字符串 (String) |
| 8 | name | name | name | varchar(50) |  | 字符串 (String) |
| 9 | maketime | 制单时间 | maketime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | billid | 单据ID | billid | varchar(50) |  | 字符串 (String) |
| 12 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 13 | pkorg | 所属组织 | pkorg | varchar(50) |  | 字符串 (String) |
| 14 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 15 | billmaker | 制单人 | billmaker | varchar(50) |  | 字符串 (String) |
| 16 | approver | 审批人 | approver | varchar(50) |  | 字符串 (String) |
| 17 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |