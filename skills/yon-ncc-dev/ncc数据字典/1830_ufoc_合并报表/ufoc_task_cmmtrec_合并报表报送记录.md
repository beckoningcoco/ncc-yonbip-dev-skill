# |<<

**合并报表报送记录 (ufoc_task_cmmtrec / nc.vo.hbbb.commit.UFOCTaskCommitRecordVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5895.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_record | 报送记录主键 | pk_record | char(20) | √ | 主键 (UFID) |
| 2 | alone_id | alone_id | alone_id | char(32) |  | 字符串 (String) |
| 3 | pk_hbscheme | 合并方案 | pk_hbscheme | varchar(20) |  | 合并方案 (hbscheme) |
| 4 | operator | 操作人 | operator | varchar(20) |  | 用户 (user) |
| 5 | operate_time | 操作时间 | operate_time | char(19) |  | 日期时间 (UFDateTime) |
| 6 | action | 动作 | action | int |  | 报送动作 (CommitActionEnum) |  | 22=上报; |