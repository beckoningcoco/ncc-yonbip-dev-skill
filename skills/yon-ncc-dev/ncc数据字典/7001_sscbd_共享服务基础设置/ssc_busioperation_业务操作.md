# |<<

**业务操作 (ssc_busioperation / nc.vo.ssc.task.base.SSCBusiOpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5511.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busioperation | 实体标识 | pk_busioperation | char(20) | √ | 主键 (UFID) |
| 2 | opcode | 操作码 | opcode | varchar(50) |  | 字符串 (String) |
| 3 | displayname | 显示名称 | displayname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | beginstate | 初始任务状态 | beginstate | varchar(20) |  | 任务状态 (taskstate) |
| 5 | endstate | 结束任务状态 | endstate | varchar(20) |  | 任务状态 (taskstate) |
| 6 | opclassname | 操作类 | opclassname | varchar(200) |  | 字符串 (String) |