# |<<

**distrilist (iufo_distri_list / nc.vo.iufo.distribute.DistributeListVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3417.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dis_list | 分布式主键 | pk_dis_list | char(20) | √ | 主键 (UFID) |
| 2 | org | 所属组织 | org | varchar(50) |  | 字符串 (String) |
| 3 | task | 任务 | task | varchar(50) |  | 字符串 (String) |
| 4 | taskname | 任务名称 | taskname | varchar(50) |  | 字符串 (String) |
| 5 | datasource | 目标数据源 | datasource | varchar(50) |  | 字符串 (String) |
| 6 | synchrotime | 同步时间 | synchrotime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | pk_org | 所属组织1 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | creator | 创建人 | creator | varchar(50) |  | 字符串 (String) |
| 10 | creationtime | 创建时间 | creationtime | varchar(50) |  | 字符串 (String) |
| 11 | modifier | 最后修改人 | modifier | varchar(50) |  | 字符串 (String) |
| 12 | modifiedtime | 最后修改时间 | modifiedtime | varchar(50) |  | 字符串 (String) |