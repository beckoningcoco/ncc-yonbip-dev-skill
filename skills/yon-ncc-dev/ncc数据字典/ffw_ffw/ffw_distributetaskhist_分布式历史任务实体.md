# |<<

**分布式历史任务实体 (ffw_distributetaskhist / nc.vo.ffw.history.DistributetaskHistoryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2192.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_distributetaskhist | 主键 | pk_distributetaskhist | char(20) | √ | 主键 (UFID) |
| 2 | pk_tasktype | 任务分类 | pk_tasktype | varchar(20) | √ | 分布式任务类型 (distributetasktype) |
| 3 | taskname | 任务名称 | taskname | varchar(2000) |  | 字符串 (String) |
| 4 | ownmodule | 所属模块 | ownmodule | varchar(50) |  | 字符串 (String) |
| 5 | variableobj | 参数对象 | variableobj | image |  | BLOB (BLOB) |
| 6 | callbackobj | 回调对象 | callbackobj | image |  | BLOB (BLOB) |
| 7 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 8 | pk_creator | 创建人 | pk_creator | varchar(20) | √ | 用户 (user) |
| 9 | taskstatus | 任务状态 | taskstatus | int |  | 任务状态 (taskstatus) |  | 1=待执行; |