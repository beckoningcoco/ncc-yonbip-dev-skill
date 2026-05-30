# |<<

**成本分摊中介 (cost_cospagency_h / nc.vo.hrpco.cospagency.CospagencyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1606.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cospagency_h | 主键 | pk_cospagency_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_coproject | 成本项目编码 | pk_coproject | varchar(20) |  | 成本项目-成本组织 (CostProOrgVO) |
| 6 | pk_codept | 科室编码 | pk_codept | varchar(20) |  | 科室档案 (CodepartVO) |
| 7 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 8 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 9 | maketime | 制单时间 | maketime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | vmemo | 备注 | vmemo | varchar(50) |  | 字符串 (String) |
| 12 | billtime | 单据日期 | billtime | char(19) |  | 日期 (UFDate) |
| 13 | billid | 单据ID | billid | varchar(50) |  | 字符串 (String) |
| 14 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 15 | pkorg | 所属组织 | pkorg | varchar(50) |  | 字符串 (String) |
| 16 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 17 | billmaker | 制单人 | billmaker | varchar(50) |  | 字符串 (String) |
| 18 | approver | 审批人 | approver | varchar(50) |  | 字符串 (String) |
| 19 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |