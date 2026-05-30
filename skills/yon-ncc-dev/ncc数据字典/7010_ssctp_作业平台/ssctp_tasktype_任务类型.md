# |<<

**任务类型 (ssctp_tasktype / nc.vo.ssctp.sscbd.tasktype.TaskTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5667.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tasktype | 主键 | pk_tasktype | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | metaid | 关联元数据ID | metaid | varchar(50) |  | 字符串 (String) |
| 5 | isext | 扩展任务标识 | isext | char(1) |  | 布尔类型 (UFBoolean) | N |
| 6 | ispublish | 发布状态标识 | ispublish | char(1) |  | 布尔类型 (UFBoolean) | N |
| 7 | appcode | 小应用编码 | appcode | varchar(50) |  | 字符串 (String) |
| 8 | menucode | 菜单编码 | menucode | varchar(50) |  | 字符串 (String) |
| 9 | remark | 备注 | remark | varchar(200) |  | 字符串 (String) |