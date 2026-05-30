# |<<

**资产评估项目核准申请 (ipmrm_projapproval / nc.vo.ipmrm.projapproval.ProjApprovalVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3378.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_projapproval | 项目核准申请主键 | pk_projapproval | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 申请编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | veval_proj_name | 评估项目名称 | veval_proj_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | asset_possessor | 资产占有单位 | asset_possessor | varchar(400) |  | 字符串 (String) |
| 8 | venterprise_level | 企业管理级次 | venterprise_level | varchar(50) |  | 企业级次 (EnterpriseLevel) |  | 1=一级; |