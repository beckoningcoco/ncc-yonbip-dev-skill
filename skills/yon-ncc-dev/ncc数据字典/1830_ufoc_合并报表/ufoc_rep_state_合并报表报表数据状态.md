# |<<

**合并报表报表数据状态 (ufoc_rep_state / nc.vo.hbbb.commit.UFOCRepDataStateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5891.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_state | 主键ID | pk_state | char(20) | √ | 主键 (UFID) |
| 2 | alone_id | alone_id | alone_id | char(32) |  | 字符串 (String) |
| 3 | pk_report | 报表pk | pk_report | varchar(20) |  | 采集表信息 (reportinfo) |
| 4 | commit_state | 报送状态 | commit_state | int |  | 报送状态 (CommitStateEnum) |  | 21=未上报; |