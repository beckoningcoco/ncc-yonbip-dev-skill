# |<<

**报表数据报送记录 (iufo_rep_cmmtrec / nc.vo.iufo.commit.RepDataCommitRecordVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3489.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_record | 主键 | pk_record | char(20) | √ | 主键 (UFID) |
| 2 | alone_id | alone_id | alone_id | varchar(50) |  | 字符串 (String) |
| 3 | pk_report | 报表pk | pk_report | varchar(20) |  | 采集表信息 (reportinfo) |
| 4 | operator | 操作人 | operator | varchar(20) |  | 用户 (user) |
| 5 | operate_time | 操作时间 | operate_time | char(19) |  | 日期时间 (UFDateTime) |
| 6 | action | 动作 | action | int |  | 报送动作 (CommitActionEnum) |  | 22=上报; |