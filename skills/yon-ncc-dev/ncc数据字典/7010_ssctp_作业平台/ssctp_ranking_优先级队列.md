# |<<

**优先级队列 (ssctp_ranking / nc.vo.ssctp.sscbd.SSCRankingVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5661.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ranking | 唯一标识 | pk_ranking | varchar(50) | √ | 字符串 (String) |
| 2 | pk_sscunit | 所属共享中心 | pk_sscunit | varchar(20) |  | 共享服务中心 (sscunit) |
| 3 | pk_workinggroup | 所属作业组 | pk_workinggroup | varchar(50) |  | 字符串 (String) |
| 4 | pk_ssctask | 作业任务 | pk_ssctask | varchar(50) |  | 字符串 (String) |
| 5 | pk_priority | 所属优先级 | pk_priority | varchar(50) |  | 字符串 (String) |
| 6 | sequence | 组内顺序 | sequence | varchar(50) |  | 字符串 (String) |
| 7 | upgradetime | 晋级时间 | upgradetime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | istop | 是否置顶 | istop | char(1) |  | 布尔类型 (UFBoolean) | N |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |