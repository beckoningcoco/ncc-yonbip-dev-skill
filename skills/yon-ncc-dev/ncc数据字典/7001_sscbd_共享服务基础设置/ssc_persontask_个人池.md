# |<<

**个人池 (ssc_persontask / nc.vo.ssc.task.pool.PersonTaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5522.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_persontask | 实体标识 | pk_persontask | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_ssctask | 任务 | pk_ssctask | varchar(20) |  | 任务 (ssctask) |
| 5 | pk_activetask | 活动任务 | pk_activetask | varchar(20) |  | 活动任务池 (activetask) |
| 6 | pk_busiactivity | 业务活动 | pk_busiactivity | varchar(20) |  | 业务活动 (busiactivity) |
| 7 | pk_post | 岗位 | pk_post | varchar(20) |  | 人力资源管理_岗位 (post) |
| 8 | pk_user | 作业人员 | pk_user | varchar(20) |  | 用户 (user) |
| 9 | appointtime | 派工时间 | appointtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | isappointed | 强制分配任务 | isappointed | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | istimewarning | 超时预警标志 | istimewarning | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | orderfield | 排序依据 | orderfield | varchar(50) |  | 字符串 (String) |
| 13 | userdef1 | 特殊描述1 | userdef1 | varchar(200) |  | 字符串 (String) |
| 14 | userdef2 | 特殊描述2 | userdef2 | varchar(200) |  | 字符串 (String) |
| 15 | userdef3 | 特殊描述3 | userdef3 | varchar(200) |  | 字符串 (String) |
| 16 | userdef4 | 特殊描述4 | userdef4 | varchar(200) |  | 字符串 (String) |
| 17 | userdef5 | 特殊描述5 | userdef5 | varchar(200) |  | 字符串 (String) |
| 18 | userdef6 | 特殊描述6 | userdef6 | varchar(200) |  | 字符串 (String) |
| 19 | userdef7 | 特殊描述7 | userdef7 | varchar(200) |  | 字符串 (String) |
| 20 | userdef8 | 特殊描述8 | userdef8 | varchar(200) |  | 字符串 (String) |
| 21 | userdef9 | 特殊描述9 | userdef9 | varchar(200) |  | 字符串 (String) |
| 22 | userdef10 | 特殊描述10 | userdef10 | varchar(200) |  | 字符串 (String) |
| 23 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |