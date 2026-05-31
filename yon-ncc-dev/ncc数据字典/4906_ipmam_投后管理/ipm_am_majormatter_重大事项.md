# |<<

**重大事项 (ipm_am_majormatter / nc.vo.ipmam.majormatter.MajorMatterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3157.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_majormatter | 重大事项主键 | pk_majormatter | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_dept | 记录部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_v | 记录部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | pk_psndoc | 记录人 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 9 | vbillname | 单据名称 | vbillname | varchar(800) |  | 字符串 (String) |
| 10 | pk_projectlib | 项目编码 | pk_projectlib | varchar(20) |  | 投资项目档案 (ProjectLibVO) |
| 11 | projectname | 项目名称 | projectname | varchar(800) |  | 字符串 (String) |
| 12 | pk_enterprise | 投资企业 | pk_enterprise | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 13 | vtheme | 重大事项主题 | vtheme | varchar(400) |  | 字符串 (String) |
| 14 | pk_mattertype | 重大事项类型 | pk_mattertype | varchar(20) |  | 重大事项类型 (MatterTypeVO) |
| 15 | dhappendate | 发生日期 | dhappendate | char(19) |  | 日期 (UFDate) |
| 16 | vaddress | 发生地点 | vaddress | varchar(400) |  | 字符串 (String) |
| 17 | vcontent | 事项内容 | vcontent | varchar(2048) |  | 备注 (Memo) |
| 18 | vmeasure | 处理措施 | vmeasure | varchar(2048) |  | 备注 (Memo) |
| 19 | vmemo | 备注 | vmemo | varchar(2048) |  | 备注 (Memo) |
| 20 | cbilltypecode | 单据类型 | cbilltypecode | varchar(20) |  | 字符串 (String) |
| 21 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |