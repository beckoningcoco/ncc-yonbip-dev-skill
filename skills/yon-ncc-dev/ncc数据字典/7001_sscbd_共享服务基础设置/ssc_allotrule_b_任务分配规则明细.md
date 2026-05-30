# |<<

**任务分配规则明细 (ssc_allotrule_b / nc.vo.ssc.task.allotrule.SSCAllotRuleBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5501.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allotrule_b | 主键 | pk_allotrule_b | char(20) | √ | 主键 (UFID) |
| 2 | serialnum | 序号 | serialnum | int |  | 整数 (Integer) |
| 3 | pk_org | 单据所属组织（PK保存用） | pk_org | text(0) |  | 字符串 (String) |
| 4 | orgname | 单据所属组织（界面显示用） | orgname | varchar(20) |  | 组织 (org) |
| 5 | iscontainslower | 是否包含下级 | iscontainslower | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | advancedcon | 高级条件 | advancedcon | text(0) |  | 字符串 (String) |
| 7 | advanceconxml | 高级条件（XML） | advanceconxml | text(0) |  | 字符串 (String) |
| 8 | advanceconsql | 高级条件（SQL） | advanceconsql | text(0) |  | 字符串 (String) |
| 9 | pk_post1 | 岗位1 | pk_post1 | varchar(20) |  | 人力资源管理_岗位 (post) |
| 10 | pk_post2 | 岗位2 | pk_post2 | varchar(20) |  | 人力资源管理_岗位 (post) |
| 11 | pk_allotrule | 业务分配规则主键 | pk_allotrule | varchar(50) |  | 字符串 (String) |
| 12 | pk_post3 | 岗位3 | pk_post3 | varchar(20) |  | 人力资源管理_岗位 (post) |
| 13 | pk_post4 | 岗位4 | pk_post4 | varchar(20) |  | 人力资源管理_岗位 (post) |
| 14 | pk_post5 | 岗位5 | pk_post5 | varchar(20) |  | 人力资源管理_岗位 (post) |
| 15 | pk_post6 | 岗位6 | pk_post6 | varchar(20) |  | 人力资源管理_岗位 (post) |
| 16 | pk_post7 | 岗位7 | pk_post7 | varchar(20) |  | 人力资源管理_岗位 (post) |
| 17 | pk_post8 | 岗位8 | pk_post8 | varchar(20) |  | 人力资源管理_岗位 (post) |
| 18 | pk_post9 | 岗位9 | pk_post9 | varchar(20) |  | 人力资源管理_岗位 (post) |
| 19 | pk_post10 | 岗位10 | pk_post10 | varchar(20) |  | 人力资源管理_岗位 (post) |
| 20 | pk_post11 | 岗位11 | pk_post11 | varchar(20) |  | 人力资源管理_岗位 (post) |
| 21 | pk_post12 | 岗位12 | pk_post12 | varchar(20) |  | 人力资源管理_岗位 (post) |
| 22 | pk_post13 | 岗位13 | pk_post13 | varchar(20) |  | 人力资源管理_岗位 (post) |
| 23 | pk_post14 | 岗位14 | pk_post14 | varchar(20) |  | 人力资源管理_岗位 (post) |
| 24 | pk_post15 | 岗位15 | pk_post15 | varchar(20) |  | 人力资源管理_岗位 (post) |
| 25 | pk_post16 | 岗位16 | pk_post16 | varchar(20) |  | 人力资源管理_岗位 (post) |
| 26 | pk_post17 | 岗位17 | pk_post17 | varchar(20) |  | 人力资源管理_岗位 (post) |
| 27 | pk_post18 | 岗位18 | pk_post18 | varchar(20) |  | 人力资源管理_岗位 (post) |
| 28 | pk_post19 | 岗位19 | pk_post19 | varchar(20) |  | 人力资源管理_岗位 (post) |
| 29 | pk_post20 | 岗位20 | pk_post20 | varchar(20) |  | 人力资源管理_岗位 (post) |
| 30 | formula | 公式 | formula | text(0) |  | 字符串 (String) |
| 31 | exclusionformula | 回避人员公式 | exclusionformula | text(0) |  | 字符串 (String) |
| 32 | ladeformula | 提取条件 | ladeformula | text(0) |  | 字符串 (String) |
| 33 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 34 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 35 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 36 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |