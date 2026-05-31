# |<<

**任务状态 (ssc_taskstate / nc.vo.ssc.task.base.SSCTaskStateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5526.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskstate | 实体标识 | pk_taskstate | char(20) | √ | 主键 (UFID) |
| 2 | statecode | 状态标识码 | statecode | varchar(50) |  | 字符串 (String) |
| 3 | displayname | 显示名称 | displayname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | datatable | 数据所在表 | datatable | varchar(50) |  | 字符串 (String) |
| 5 | isend | 是否完成态标志 | isend | char(1) |  | 布尔类型 (UFBoolean) |