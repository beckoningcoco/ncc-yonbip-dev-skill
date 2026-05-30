# |<<

**议题申报 (scapto_topicapply / nc.vo.scapto.premeetingmanage.topicapply.TopicApplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5193.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_topicapply | 议题申报主键 | pk_topicapply | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属企业 | pk_org | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 4 | pk_org_v | 所属企业版本 | pk_org_v | varchar(20) |  | 组织_业务单元_行政组织版本信息 (adminorg_v) |
| 5 | pk_dept | 提交(主办)部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_v | 提交(主办)部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | pk_psndoc | 提交人 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | vbillcode | 单据流水号 | vbillcode | varchar(50) | √ | 字符串 (String) |
| 9 | dcreatetime | 提交时间 | dcreatetime | char(19) |  | 日期(开始) (UFDateBegin) |
| 10 | vbillname | 议题名称 | vbillname | varchar(1024) |  | 字符串 (String) |
| 11 | vtopicdescription | 议题简要描述 | vtopicdescription | varchar(1024) |  | 字符串 (String) |
| 12 | pk_decidemeettype | 议题类型 | pk_decidemeettype | varchar(20) |  | 决策主体类型设置 (DecideSubjectTypeVO) |
| 13 | bisneedassist | 是否需要协办 | bisneedassist | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | vsourcesystem | 对接系统名称或编号 | vsourcesystem | varchar(100) |  | 字符串 (String) |
| 15 | vsourcebillname | 对接单据名称 | vsourcebillname | varchar(100) |  | 字符串 (String) |
| 16 | vsourcebillcode | 对接单据编码 | vsourcebillcode | varchar(100) |  | 字符串 (String) |
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
| 28 | fstatusflag | 议题申报审核状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |