# |<<

**回避人员 (ssc_exclusion / nc.vo.ssc.task.pool.ExclusionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5513.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exclusion | 主键 | pk_exclusion | char(20) | √ | 主键 (UFID) |
| 2 | pk_user | 回避人员 | pk_user | varchar(20) |  | 用户 (user) |
| 3 | pk_post | 岗位 | pk_post | varchar(20) |  | 人力资源管理_岗位 (post) |
| 4 | pk_ssctask | 任务 | pk_ssctask | varchar(20) |  | 任务 (ssctask) |
| 5 | pk_posttask | 岗位池 | pk_posttask | varchar(20) |  | 岗位池 (posttask) |
| 6 | pk_busiactivity | 业务活动 | pk_busiactivity | varchar(20) |  | 业务活动 (busiactivity) |
| 7 | pk_activetask | 活动任务 | pk_activetask | varchar(20) |  | 活动任务池 (activetask) |
| 8 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |