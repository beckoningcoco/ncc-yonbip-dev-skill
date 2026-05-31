# |<<

**在岗状态记录 (ssctp_dutystatelog / nccloud.vo.ssctp.intellidispatch.dutystatesetting.DutyStateLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5644.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dutystatelog | 主键 | pk_dutystatelog | char(20) | √ | 主键 (UFID) |
| 2 | pk_user | 作业人员 | pk_user | varchar(20) |  | 用户 (user) |
| 3 | starttime | 上岗时间 | starttime | char(19) |  | 日期时间 (UFDateTime) |
| 4 | endtime | 离岗时间 | endtime | char(19) |  | 日期时间 (UFDateTime) |
| 5 | iseffective | 有效标识 | iseffective | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | pk_tasktype | 任务类型 | pk_tasktype | varchar(20) |  | 任务类型 (tasktype) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |