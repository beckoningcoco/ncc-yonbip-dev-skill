# |<<

**会议纪要 (ipm_pb_meetresume / nc.vo.ipmpb.meetresume.MeetResumeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3197.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meetresume | 会议纪要主键 | pk_meetresume | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_dept | 记录部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_v | 记录部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | pk_psndoc | 记录人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 9 | vbillname | 单据名称 | vbillname | varchar(800) |  | 字符串 (String) |
| 10 | pk_projectlib | 项目编码 | pk_projectlib | varchar(20) |  | 投资项目档案 (ProjectLibVO) |
| 11 | projectname | 项目名称 | projectname | varchar(800) |  | 字符串 (String) |
| 12 | pk_meettype | 会议类型 | pk_meettype | varchar(20) |  | 会议类型 (MeetingTypeVO) |
| 13 | meetsubject | 会议主题 | meetsubject | varchar(800) |  | 字符串 (String) |
| 14 | dmeetdate | 会议日期 | dmeetdate | char(19) |  | 日期 (UFDate) |
| 15 | meetaddress | 会议地点 | meetaddress | varchar(800) |  | 字符串 (String) |
| 16 | meetpolicy | 会议决策 | meetpolicy | varchar(50) |  | 会议决策 (IPMMeetPolicy) |  | 1=通过; |