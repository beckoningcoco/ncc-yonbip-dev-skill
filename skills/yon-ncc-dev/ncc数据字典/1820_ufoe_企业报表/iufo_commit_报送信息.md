# |<<

**报送信息 (iufo_commit / nc.vo.iufo.commit.CommitVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3403.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_commit | 主键 | pk_commit | char(20) | √ | 主键 (UFID) |
| 2 | alone_id | alone_id | alone_id | char(32) |  | 字符串 (String) |
| 3 | pk_task | 任务主键 | pk_task | varchar(20) |  | 任务 (task) |
| 4 | affirm_times | 确认次数 | affirm_times | int |  | 整数 (Integer) |
| 5 | cnlcmmt_person | 取消上报人 | cnlcmmt_person | varchar(20) |  | 用户 (user) |
| 6 | cnlcmmt_time | 取消上报时间 | cnlcmmt_time | char(19) |  | 日期时间 (UFDateTime) |
| 7 | cnlcmmt_times | 取消上报次数 | cnlcmmt_times | int |  | 整数 (Integer) |
| 8 | cnlaffm_person | 取消确认人 | cnlaffm_person | varchar(20) |  | 用户 (user) |
| 9 | cnlaffm_time | 取消确认时间 | cnlaffm_time | char(19) |  | 日期时间 (UFDateTime) |
| 10 | cnlaffm_times | 取消确认次数 | cnlaffm_times | int |  | 整数 (Integer) |
| 11 | last_action | 最后操作 | last_action | int |  | 报送动作 (CommitActionEnum) |  | 22=上报; |