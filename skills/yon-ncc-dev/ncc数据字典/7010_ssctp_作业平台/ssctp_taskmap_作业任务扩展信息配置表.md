# |<<

**作业任务扩展信息配置表 (ssctp_taskmap / nc.vo.ssctp.sscbd.TaskMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5666.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billitemmap | 主键 | pk_billitemmap | char(20) | √ | 主键 (UFID) |
| 2 | tasktype | 任务类型 | tasktype | varchar(20) |  | 任务类型 (tasktype) |
| 3 | name | 字段名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | sscitem | 共享字段 | sscitem | varchar(50) |  | 字符串 (String) |
| 5 | maptype | 映射类型 | maptype | varchar(50) |  | 字符串 (String) |
| 6 | billitem | 来源字段 | billitem | varchar(50) |  | 字符串 (String) |
| 7 | billitemname | 来源字段名称 | billitemname | varchar(50) |  | 字符串 (String) |
| 8 | convertor | 转换处理类 | convertor | varchar(200) |  | 字符串 (String) |
| 9 | remark | 备注 | remark | varchar(200) |  | 字符串 (String) |