# |<<

**评估任务 (ipmdm_task / nc.vo.ipmdm.task.TaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3260.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_task | 评估任务主键 | pk_task | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | starttime | 开始时间 | starttime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | endtime | 截止时间 | endtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | pk_project_org | 项目单位 | pk_project_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 10 | pk_project_org_v | 项目单位版本 | pk_project_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 11 | pk_projectlib | 评估对象 | pk_projectlib | varchar(20) |  | 投资项目档案 (ProjectLibVO) |
| 12 | pk_evaluation | 评估方案 | pk_evaluation | varchar(20) |  | 评估方案 (EvaluationVO) |
| 13 | pk_dept | 任务发起部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 14 | pk_dept_v | 任务发起部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 15 | pk_psndoc | 任务发起人 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 16 | evaluation_phase | 评估阶段 | evaluation_phase | varchar(50) |  | 评估阶段 (EvaluationPhase) |  | 1=待发布; |