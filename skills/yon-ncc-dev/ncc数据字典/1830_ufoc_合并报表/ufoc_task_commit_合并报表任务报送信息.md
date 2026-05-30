# |<<

**合并报表任务报送信息 (ufoc_task_commit / nc.vo.hbbb.commit.UFOCTaskCommitVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5896.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskcommit | 任务报送主键 | pk_taskcommit | char(20) | √ | 主键 (UFID) |
| 2 | alone_id | alone_id | alone_id | char(32) |  | 字符串 (String) |
| 3 | pk_hbscheme | 合并方案 | pk_hbscheme | varchar(20) |  | 合并方案 (hbscheme) |
| 4 | commit_state | 报送状态 | commit_state | int |  | 报送状态 (CommitStateEnum) |  | 21=未上报; |