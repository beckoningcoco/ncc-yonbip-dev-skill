# |<<

**会议上报 (scapto_meetingreport / nc.vo.scapto.meetingreport.MeetingReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5161.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meetingreport | 会议上报主键 | pk_meetingreport | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 决策企业 | pk_org | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 4 | pk_org_v | 决策企业版本 | pk_org_v | varchar(20) |  | 组织_业务单元_行政组织版本信息 (adminorg_v) |
| 5 | pk_dept | 经办部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_v | 经办部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | pk_psndoc | 经办人 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | pk_decidemeettype | 决策会议类型 | pk_decidemeettype | varchar(20) |  | 决策会议类型设置 (DecideMeetTypeVO) |
| 9 | vbillcode | 单据编号 | vbillcode | varchar(50) | √ | 字符串 (String) |
| 10 | vmeetingcode | 会议编码 | vmeetingcode | varchar(64) |  | 字符串 (String) |
| 11 | vbillname | 会议名称 | vbillname | varchar(1024) |  | 字符串 (String) |
| 12 | pk_decidesubjecttype | 决策主体 | pk_decidesubjecttype | varchar(20) |  | 决策主体类型设置 (DecideSubjectTypeVO) |
| 13 | pk_decidemeetingform | 会议形式 | pk_decidemeetingform | varchar(20) |  | 决策会议形式设置 (DecideMeetingFormVO) |
| 14 | dmeetingdate | 会议时间 | dmeetingdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 15 | pk_anchor | 主持人 | pk_anchor | varchar(20) |  | 领导班子成员信息 (EnterpriseLeaderVO) |
| 16 | dmeetsummarydate | 会议纪要印发时间 | dmeetsummarydate | char(19) |  | 日期(开始) (UFDateBegin) |
| 17 | taudittime | 审批时间 | taudittime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | pk_enterprise | 所属集团企业 | pk_enterprise | varchar(20) |  | 企业信息管理 (EnterpriseVO) |
| 19 | corigcurrencyid | 原币币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 20 | ccurrencyid | 组织本位币币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 21 | cgroupcurrencyid | 集团本位币币种 | cgroupcurrencyid | varchar(20) |  | 币种 (currtype) |
| 22 | cglobalcurrencyid | 全局本位币币种 | cglobalcurrencyid | varchar(20) |  | 币种 (currtype) |
| 23 | nexchangerate | 组织本位币汇率 | nexchangerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | ngroupexchgrate | 集团本位币汇率 | ngroupexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | nglobalexchgrate | 全局本位币汇率 | nglobalexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | vmemo | 备注 | vmemo | varchar(2000) |  | 备注 (Memo) |
| 27 | cbilltypecode | 单据类型 | cbilltypecode | varchar(20) |  | 字符串 (String) |
| 28 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |