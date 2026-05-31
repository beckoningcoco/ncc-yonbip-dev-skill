# |<<

**审批活动选择报表状态 (iufo_approveactselrep / nc.vo.iufo.approve.ApproveActionSelRepVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3393.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repstate | 主键 | pk_repstate | char(20) | √ | 主键 (UFID) |
| 2 | repcode | 报表编码 | repcode | varchar(50) |  | 字符串 (String) |
| 3 | repname | 报表名称 | repname | varchar(50) |  | 字符串 (String) |
| 4 | class_name | 业务分类 | class_name | varchar(50) |  | 字符串 (String) |
| 5 | approveflowtype | 审批流类型 | approveflowtype | int |  | 审批流类型 (审批流类型) |  | 0=上报; |