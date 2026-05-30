# |<<

**评分表 (ipmdm_scoresht / nc.vo.ipmdm.scoresht.ScoreShtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3252.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scoresht | 评分表主键 | pk_scoresht | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_dept | 记录部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_v | 记录部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | pk_psndoc | 记录人员(任务发起人) | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | pk_extrrecoder | 补录人 | pk_extrrecoder | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | pk_evaluator | 评估人 | pk_evaluator | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | evaluator | 评估人姓名 | evaluator | varchar(50) |  | 字符串 (String) |
| 11 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 12 | vbillname | 单据名称 | vbillname | varchar(200) |  | 多语文本 (MultiLangText) |
| 13 | pk_projectlib | 评估对象 | pk_projectlib | varchar(20) |  | 投资项目档案 (ProjectLibVO) |
| 14 | starttime | 开始时间 | starttime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | endtime | 截止时间 | endtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | cbilltypecode | 单据类型 | cbilltypecode | varchar(20) |  | 字符串 (String) |
| 17 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |