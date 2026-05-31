# |<<

**IUFO计划 (iufo_schedule / nc.vo.iufo.schedule.IUfoScheduleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3504.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_schedule | 计划主键 | pk_schedule | char(20) | √ | 主键 (UFID) |
| 2 | pk_schedulesort | 所属分类 | pk_schedulesort | varchar(20) |  | IUFO计划目录 (IUFO计划目录) |
| 3 | name | 计划名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | offsettype | 偏移类型 | offsettype | int |  | 整数 (Integer) |
| 5 | offsetvalue | 偏移量 | offsetvalue | int |  | 整数 (Integer) |
| 6 | note | 计划说明 | note | varchar(1024) |  | 备注 (Memo) |
| 7 | busi_prop | 业务属性 | busi_prop | varchar(50) |  | 字符串 (String) |
| 8 | pk_org | 报表组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | pk_operator | 计划执行人 | pk_operator | varchar(20) |  | 用户 (user) |
| 11 | showtimingsetting | 界面显示时间设置 | showtimingsetting | image |  | BLOB (BLOB) |
| 12 | enablestate | 启用状态 | enablestate | int |  | 整数 (Integer) |
| 13 | isfromncc | 是否是ncc创建任务 | isfromncc | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | creator | 创建者 | creator | varchar(20) |  | 用户 (user) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 17 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |