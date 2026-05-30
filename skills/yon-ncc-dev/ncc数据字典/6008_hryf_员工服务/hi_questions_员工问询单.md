# |<<

**员工问询单 (hi_questions / nccloud.dto.hryf.question.QuestionsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2601.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_questions | 主键 | pk_questions | char(20) | √ | 主键 (UFID) |
| 2 | bill_code | 单据编号 | bill_code | varchar(50) |  | 字符串 (String) |
| 3 | title | 问题标题 | title | varchar(500) | √ | 字符串 (String) |
| 4 | type | 问题分类 | type | varchar(20) | √ | 知识库分类(自定义档案) (Defdoc-HRGX0001_0xx) |
| 5 | is_hot | 是否热点 | is_hot | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | label | 标签 | label | varchar(50) |  | 字符串 (String) |
| 7 | answer | 回复 | answer | text(0) |  | BLOB (BLOB) |
| 8 | billmaker | 申请人 | billmaker | varchar(20) |  | 用户 (user) |
| 9 | dealer | 办理人 | dealer | varchar(20) |  | 用户 (user) |
| 10 | remark | 备注 | remark | varchar(50) |  | 字符串 (String) |
| 11 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 12 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 13 | apply_date | 申请日期 | apply_date | char(19) |  | 日期时间 (UFDateTime) |
| 14 | pk_billtype | 单据类型 | pk_billtype | varchar(50) | √ | 字符串 (String) |
| 15 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 16 | approve_time | 审批时间 | approve_time | char(19) |  | 日期时间 (UFDateTime) |
| 17 | approve_note | 审批批语 | approve_note | varchar(50) |  | 字符串 (String) |
| 18 | approve_state | 审批状态 | approve_state | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |