# |<<

**制度上报 (scapto_systemreport / nc.vo.scapto.systemmanage.systemreport.SystemReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5189.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_systemreport | 制度上报主键 | pk_systemreport | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 企业名称 | pk_org | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 4 | pk_org_v | 企业名称版本 | pk_org_v | varchar(20) |  | 组织_业务单元_行政组织版本信息 (adminorg_v) |
| 5 | pk_dept | 经办部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_v | 经办部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | pk_psndoc | 经办人 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | vbillcode | 制度编码 | vbillcode | varchar(50) | √ | 字符串 (String) |
| 9 | vbillname | 制度名称 | vbillname | varchar(1024) |  | 字符串 (String) |
| 10 | pk_decisionsystemtype | 制度类型 | pk_decisionsystemtype | varchar(20) |  | 决策制度类型设置 (DecisionsystemTypeVO) |
| 11 | taudittime | 审批时间 | taudittime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | dvaliddate | 生效日期 | dvaliddate | char(19) |  | 日期 (UFDate) |
| 13 | dinvaliddate | 失效日期 | dinvaliddate | char(19) |  | 日期 (UFDate) |
| 14 | bislawverify | 是否经过法律审核 | bislawverify | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | pk_decidesubjecttype | 决策主体类型 | pk_decidesubjecttype | varchar(20) |  | 决策主体类型设置 (DecideSubjectTypeVO) |
| 16 | pk_decidemeettype | 决策会议类型 | pk_decidemeettype | varchar(20) |  | 决策会议类型设置 (DecideMeetTypeVO) |
| 17 | pk_enterprise | 所属集团企业 | pk_enterprise | varchar(20) |  | 企业信息管理 (EnterpriseVO) |
| 18 | corigcurrencyid | 原币币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 19 | ccurrencyid | 组织本位币币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 20 | cgroupcurrencyid | 集团本位币币种 | cgroupcurrencyid | varchar(20) |  | 币种 (currtype) |
| 21 | cglobalcurrencyid | 全局本位币币种 | cglobalcurrencyid | varchar(20) |  | 币种 (currtype) |
| 22 | nexchangerate | 组织本位币汇率 | nexchangerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | ngroupexchgrate | 集团本位币汇率 | ngroupexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nglobalexchgrate | 全局本位币汇率 | nglobalexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | vmemo | 备注 | vmemo | varchar(2000) |  | 备注 (Memo) |
| 26 | cbilltypecode | 单据类型 | cbilltypecode | varchar(20) |  | 字符串 (String) |
| 27 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |